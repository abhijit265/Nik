package in.robo.common.util;

import in.robo.common.admin.UserData;
import in.robo.framework.models.Audit;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class FiinfraUtility {
	private static final Logger logger = Logger.getLogger(FiinfraUtility.class);
	private static String restURL;

	private static Integer logoHeight;
	private static Integer logoWidth;

	private static SimpleDateFormat sdfDateAndTime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
	private static SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm:ss.SSS");


	public static Integer getLogoHeight() {
		return logoHeight;
	}

	public static void setLogoHeight(Integer logoHeight) {
		FiinfraUtility.logoHeight = logoHeight;
	}

	public static Integer getLogoWidth() {
		return logoWidth;
	}

	public static void setLogoWidth(Integer logoWidth) {
		FiinfraUtility.logoWidth = logoWidth;
	}

	public static String getURLWithParams(UriComponentsBuilder uriCB) {
		UriComponents uc = uriCB.build();
		try {
			return uc.encode().toUri().toURL().toString();
		} catch (MalformedURLException e) {
		}
		return null;

	}

	public static Object postRequest(UriComponentsBuilder uriCB, Class<?> class1, RestTemplate restTemplate) {
		String response = "";
		String prefix = "";
		Object object = null;
		try {
			prefix = FiinfraUtility.getRestDBURL();
			UriComponents uc = uriCB.build();
			URI uri = uc.encode().toUri();
			object = restTemplate.getForObject(uri, class1);
		} catch (Exception e) {
		}
		return object;
	}

	public static String getRestDBURL() {
		if (restURL == null) {
			restURL = AppPropertyReader.getInstance().getProperty("restdburl");
		}
		return restURL;
	}

	public static File ensureFolder(File parent, String name) {
		File file = new File(parent, name);
		if (!file.exists()) {
			file.mkdir();
		}
		return file;
	}

	public static String generateThumbnail(File f, File root, String path) throws Exception {

		String fileName = f.getName().substring(0, f.getName().lastIndexOf("."));
		String fileType = f.getName().substring(f.getName().lastIndexOf(".") + 1);

		String[] subFolderStrs = path.split("/");
		File basePath = root;
		for (String sf : subFolderStrs) {
			basePath = ensureFolder(basePath, sf);
		}

		File thumbNail = new File(basePath, fileName + "." + "png");

		try {
			if ("PDF".equalsIgnoreCase(fileType)) {
				generatePDFThumbNail(f, thumbNail, 200, 200);
			} else if (isImageType(fileType)) {
				generateImageThumbNail(f, thumbNail, 200, 200);
			} else {
				return null;
			}
		} catch (Exception ex) {
			LogFactory.getLog(FiinfraUtility.class).error("Unable to Generate Thumbnail ", ex);
			return null;
		}

		return path + "/" + thumbNail.getName();

	}

	public static String getDefaultThumbnail(String type) {
		if ("pdf".equalsIgnoreCase(type)) {
			return "pdf_icon.png";
		} else if ("doc".equalsIgnoreCase(type) || "docx".equalsIgnoreCase(type)) {
			return "word_icon.png";
		} else if ("xls".equalsIgnoreCase(type) || "xlsx".equalsIgnoreCase(type)) {
			return "excel_icon.png";
		} else if ("txt".equalsIgnoreCase(type)) {
			return "text_icon.png";
		} else if ("txt".equalsIgnoreCase(type)) {
			return "text_icon.png";
		} else if ("txt".equalsIgnoreCase(type)) {
			return "text_icon.png";
		}
		return "text_icon.png";
	}

	public static File saveDocument(File root, String path, MultipartFile multiPartFile) {
		long currentTime = System.currentTimeMillis();

		String fileName = multiPartFile.getOriginalFilename().substring(0,
				multiPartFile.getOriginalFilename().lastIndexOf("."));
		String extension = multiPartFile.getOriginalFilename()
				.substring(multiPartFile.getOriginalFilename().lastIndexOf(".") + 1);

		String[] subFolderStrs = path.split("/");
		File basePath = root;
		for (String sf : subFolderStrs) {
			basePath = ensureFolder(basePath, sf);
		}

		File file = new File(basePath, fileName + "_" + currentTime + "." + extension);
		try {
			multiPartFile.transferTo(file);
		} catch (Exception ex) {
			LogFactory.getLog(FiinfraUtility.class).error("Fail to Save Image", ex);
			return null;
		}

		return file;
	}

	public static File saveLogo(File root, String path, MultipartFile multiPartFile, int width, int height)
			throws Exception {
		return saveLogo(root, path, multiPartFile.getInputStream(), multiPartFile.getName(), width, height);
	}

	public static File saveLogo(File root, String path, InputStream in, String fullFileName, int width, int height) {
		long currentTime = System.currentTimeMillis();
		String fileName = StringUtils.substringBeforeLast(fullFileName, ".");

		if (!root.exists()) {
			root.mkdir();
		}
		String[] subFolderStrs = path.split("/");
		File basePath = root;
		for (String sf : subFolderStrs) {
			basePath = ensureFolder(basePath, sf);
		}

		File file = new File(basePath, fileName + "_" + currentTime + "." + "png");
		try {
			BufferedImage image = ImageIO.read(in);
			if (image == null) {
				return null;
			}
			int type = image.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : image.getType();

			double orignalHeight = image.getHeight();
			double orignalWidth = image.getWidth();

			double xRatio = orignalWidth / width;
			double yRatio = orignalHeight / height;

			int newWidth = width;
			int newHeight = height;

			if (xRatio > 1 || yRatio > 1) {
				if (xRatio > yRatio) {
					newHeight = (int) (orignalHeight / xRatio);
				} else {
					newWidth = (int) (orignalWidth / yRatio);

				}

			}

			ImageIO.write(image, "png", file);
			setLogoHeight(newHeight);
			setLogoWidth(newWidth);

		} catch (Exception ex) {
			LogFactory.getLog(FiinfraUtility.class).error("Fail to Save Image", ex);
			return null;
		}

		return file;
	}

	public static File saveImage(File root, String path, MultipartFile multiPartFile, int width, int height)
			throws Exception {
		return saveImage(root, path, multiPartFile.getInputStream(), multiPartFile.getName(), width, height);
	}

	public static File saveImage(File root, String path, InputStream in, String fullFileName, int width, int height) {
		long currentTime = System.currentTimeMillis();
		String fileName = StringUtils.substringBeforeLast(fullFileName, ".");

		if (!root.exists()) {
			root.mkdir();
		}
		String[] subFolderStrs = path.split("/");
		File basePath = root;
		for (String sf : subFolderStrs) {
			basePath = ensureFolder(basePath, sf);
		}

		File file = new File(basePath, fileName + "_" + currentTime + "." + "png");
		try {
			BufferedImage image = ImageIO.read(in);
			if (image == null) {
				return null;
			}
			int type = image.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : image.getType();

			double orignalHeight = image.getHeight();
			double orignalWidth = image.getWidth();

			double xRatio = orignalWidth / width;
			double yRatio = orignalHeight / height;

			int newWidth = width;
			int newHeight = height;

			if (xRatio > 1 || yRatio > 1) {
				if (xRatio > yRatio) {
					newHeight = (int) (orignalHeight / xRatio);
				} else {
					newWidth = (int) (orignalWidth / yRatio);

				}
				BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, type);
				Graphics2D g = resizedImage.createGraphics();
				g.drawImage(image, 0, 0, newWidth, newHeight, null);
				g.dispose();
				ImageIO.write(resizedImage, "png", file);

			} else {
				ImageIO.write(image, "png", file);
			}

		} catch (Exception ex) {
			LogFactory.getLog(FiinfraUtility.class).error("Fail to Save Image", ex);
			return null;
		}

		return file;
	}

	public static File saveImage(File root, String path, MultipartFile multiPartFile, int width, int height, int x,
			int y, int w, int h) {
		long currentTime = System.currentTimeMillis();
		String fileName = multiPartFile.getOriginalFilename().substring(0,
				multiPartFile.getOriginalFilename().lastIndexOf("."));

		if (!root.exists()) {
			root.mkdir();
		}
		String[] subFolderStrs = path.split("/");
		File basePath = root;
		for (String sf : subFolderStrs) {
			basePath = ensureFolder(basePath, sf);
		}

		File file = new File(basePath, fileName + "_" + currentTime + "." + "png");
		try {
			if (w <= 0) {
				w = width;
			}
			if (h <= 0) {
				x = 0;
				y = 0;
				h = height;
			}

			BufferedImage image = ImageIO.read(multiPartFile.getInputStream());

			int[] pixels = new int[w * h * 3];

			PixelGrabber pg = new PixelGrabber(image, x, y, w, h, pixels, 0, w);
			try {
				pg.grabPixels();
			} catch (InterruptedException e) {
				LogFactory.getLog(FiinfraUtility.class).error("Error Getting Image", e);
				return null;
			}

			Image im = Toolkit.getDefaultToolkit().createImage(new MemoryImageSource(w, h, pixels, 0, w));

			BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = resizedImage.createGraphics();
			g.drawImage(im, 0, 0, width, height, null);
			g.dispose();
			ImageIO.write(resizedImage, "png", file);

		} catch (Exception ex) {
			LogFactory.getLog(FiinfraUtility.class).error("Fail to Save Image", ex);
			return null;
		}

		return file;
	}

	private static String extractRelative(File root, String baseURI, File file) {
		String relativePath = file.getAbsolutePath().replace(root.getAbsolutePath(), "");
		relativePath = relativePath.replace('\\', '/');
		return baseURI + relativePath;
	}

	public static boolean isImageType(String fileType) {
		return "jpeg".equalsIgnoreCase(fileType) || "png".equalsIgnoreCase(fileType) || "jpg".equalsIgnoreCase(fileType)
				|| "bmp".equalsIgnoreCase(fileType) || "gif".equalsIgnoreCase(fileType);
	}

	public static boolean generateImageThumbNail(File file, File outFile, int width, int height) throws Exception {
		BufferedImage image = ImageIO.read(file);
		int type = image.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : image.getType();

		BufferedImage resizedImage = new BufferedImage(150, 150, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(image, 0, 0, 150, 150, null);
		g.dispose();

		return ImageIO.write(resizedImage, "png", outFile);

	}

	public static boolean generatePDFThumbNail(File file, File outFile, int width, int height) throws Exception {
		PDDocument document = null;
		try {
			document = PDDocument.load(file);
			List<PDPage> pages = document.getDocumentCatalog().getAllPages();
			PDPage page1 = pages.get(0);
			BufferedImage image = page1.convertToImage();
			return ImageIO.write(image, "png", outFile);

		} finally {
			if (document != null) {
				document.close();
			}
		}
	}

	public static boolean generateWordDocThumbNail(File file, File outFile, int width, int height) throws Exception {

		PDDocument document = null;
		try {
			document = PDDocument.load(file);
			List<PDPage> pages = document.getDocumentCatalog().getAllPages();
			PDPage page1 = pages.get(0);
			BufferedImage image = page1.convertToImage();
			return ImageIO.write(image, "png", outFile);

		} finally {
			if (document != null) {
				document.close();
			}
		}
	}

	public static int getFileType(String fileType) {
		return 0;
	}


	public static String uploadAttachments(MultipartFile[] m, String basePath, long currentTime) throws IOException {
		String result = "success";
		File baseFolder = new File(basePath);
		for (MultipartFile f : m) {
			if (f.getOriginalFilename() != null && !f.getOriginalFilename().equals("")) {
				String fileName = null;
				String extension = null;
				fileName = f.getOriginalFilename().substring(0, f.getOriginalFilename().lastIndexOf("."));
				extension = f.getOriginalFilename().substring(f.getOriginalFilename().lastIndexOf("."));
				fileName = fileName.replace(" ", "") + "_" + currentTime + extension;
				String filePath = basePath + "\\" + fileName;
				File fileToUpload = new File(filePath);
				if (baseFolder.exists()) {

				} else {
					baseFolder.mkdirs();// creates directory
				}
				// uploads file to that directory
				try {
					f.transferTo(fileToUpload);
				} catch (Exception e) {
					// e.printStackTrace();
					logger.error(e.getMessage());
				}
			}
		}
		return result;
	}


	public static String getBulkOpportunityActivation(List<UserData> userDatas) {
		String userXML = null;
		if (userDatas != null) {
			userXML = "<Root>";
			for (UserData userData : userDatas) {
				userXML += "<UserData>";
				userXML += "<UserName>" + userData.getUserName() + "</UserName>";
				userXML += "<UserPassword>" + userData.getUserPassword() + "</UserPassword>";
				userXML += "<UserEmailId>" + userData.getUserEmailId() + "</UserEmailId>";
				userXML += "<BuId>" + userData.getBuID() + "</BuId>";
				userXML += "<UserPartyId>" + userData.getPartyId() + "</UserPartyId>";
				userXML += "</UserData>";
			}
			userXML += "</Root>";
		}
		return userXML;
	}

	public static String getUserDataForDcActivationXML(UserData userData) {
		String dataXml = "<Root>";
		dataXml += "<UserName><![CDATA[" + userData.getUserName() + "]]></UserName>";
		dataXml += "<UserPassword><![CDATA[" + userData.getUserPassword() + "]]></UserPassword>";
		dataXml += "<UserEmailId><![CDATA[" + userData.getUserEmailId() + "]]></UserEmailId>";
		dataXml += "<BuId><![CDATA[" + userData.getBuID() + "]]></BuId>";
		dataXml += "<UserPartyId><![CDATA[" + userData.getPartyId() + "]]></UserPartyId>";
		dataXml += "</Root>";

		return dataXml;
	}


	public static String getRequestDateAndTime() {

		Date requestDateAndTime = new Date();
		String requestDateTime = sdfDateAndTime.format(requestDateAndTime);
		return requestDateTime;
	}

	public static String getRequestTime(String requestDateTime) {
		String requestTime = requestDateTime.substring(11);
		return requestTime;
	}

	public static String getResponseTime() {
		Date resonseNow = new Date();
		String responseTime = sdfDate.format(resonseNow);
		return responseTime;
	}

/**
 * @Created By: Bajirao Gharage
 * @Created Date: 1/04/2016
 * @Discription : This method return current time.
 */
	public static String getCurrentTime() {
		Date resonseNow = new Date();
		String responseTime = sdfDate.format(resonseNow);
		return responseTime;
	}
	
	/*
	 * Method returs differnce between request and responce time
	 */
	public static long getDiffRequestAndResponseTime(String requestNow, String responseNow) throws ParseException {
		SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm:ss.SSS");
		Date d1 = sdfDate.parse(requestNow);
		Date d2 = sdfDate.parse(responseNow);

		// in milliseconds
		long diffTime = d2.getTime() - d1.getTime();
		return diffTime;

	}
	
	public static boolean isValidPanNumber(String panNo) throws IOException {

    	Properties properties = new Properties();
		InputStream stream = FileHelper.class.getClassLoader()
				.getResourceAsStream("cvl.properties");
		properties.load(stream);
		
		try {

		} catch (Exception e) {

			e.printStackTrace();
			
		}

		panNo = panNo.toUpperCase();

		boolean validator1 = panNo.matches("[A-Z]{5}\\d{4}[A-Z]{1}");

		String fourthCharacter = panNo.substring(3, 4);

		boolean validatior2 = fourthCharacter.matches(properties
				.getProperty("PAN_CHARACHTER"));

		logger.info("In PanValidator class isValidPanNumber method panno="
				+ panNo);

		logger.debug("In PanValidator class isValidPanNumber method panno="
				+ panNo + ",response1=" + validator1 + "response1="
				+ validatior2);

		if (validator1 && validatior2) {
			
			return true;
			
		} else {
			
			return false;
			
		}
	}
	
	

	public static boolean validateDate(String date) {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    sdf.setLenient(false);
	    try {
	       sdf.parse(date) ;
	        return true;
	    }
	    catch(ParseException ex) {
	        return false;
	    } 
	
	}
	
	
	public static String getPayloadXMLFromMap(Map<String, String> payloadMap) {
		String payloadXML = null;
		try {
			if (payloadMap.size() > 0) {
				payloadXML = "<root>";
				Iterator iterator = payloadMap.entrySet().iterator();
				while (iterator.hasNext()) {
					payloadXML += "<payload>";
					Map.Entry mapEntry = (Map.Entry) iterator.next();
					String key = (String) mapEntry.getKey();
					String value = (String) mapEntry.getValue();
					payloadXML += "<key>" + key + "</key>";
					payloadXML += "<value>" + value + "</value>";
					payloadXML += "</payload>";
				}
				payloadXML += "</root>";
			}
		} catch (Exception e) {
			payloadXML = null;
		}
		return payloadXML;
	}

	public static String getLogoutURL(String url) {
		String prefix = null;
		Enumeration<Object> keys = TokenPropertyReader.getInstance().getAllAppProperties();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			if (url.contains(key.toString())) {
				prefix = TokenPropertyReader.getInstance().getProperty(key.toString());
				try {
					double d = Double.parseDouble(prefix);
				} catch (Exception nfe) {

					return prefix;
				}
			}
		}

		return prefix == null ? "" : prefix;
	}
	
	/**
	 * Following one static Method used for audit of Mobile API Naval Makwana
	 * 
	 * @param actionByPartyId
	 *            as partyid
	 * @param actionByUserID
	 *            as userid
	 * @param eventID
	 *            as Api event id
	 * @param sourceSystemID
	 *            as 31008
	 * @param sourceModule
	 *            as API name
	 * @param sourceScreen
	 *            as API method name
	 * @param sourceInfomation
	 *            as deviceid,ip address,location,MerchantId,API version etc..
	 * @param eventTextXML
	 *            as auditing
	 * @param objectName
	 *            as Sp name and its parameter
	 * @param buID
	 *            as Business Unit ID
	 */
	public static void doAudit(int actionByPartyId, int actionByUserID, int eventID, int sourceSystemID,
			String sourceModule, String sourceScreen, String eventTextXML, String object, int buId, String macId) {
		try {
			Audit audit = new Audit();
			audit.setSourceSystemID(sourceSystemID);
			audit.setActionByPartyId(actionByPartyId);
			audit.setEventID(eventID);
			audit.setActionByUserID(actionByUserID);
			audit.setSourceModule(sourceModule);
			audit.setSourceScreen(sourceScreen);
			audit.setEventTextXML(eventTextXML);
			audit.setObjectName(object);
			audit.setMacId(macId);

			FrameworkUtil.audit(audit, buId);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}
	
}