package in.robo.common.util;


import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

public class FiinfraResponseBuilder { 		

	@Produces(MediaType.APPLICATION_JSON)
	public static  <T> Response getSuccessResponse(BaseResponse<T> myResponseObject,String reasonCode) {
		//BaseResponse baseResponse = new BaseResponse();
		myResponseObject.setStatus(FiinfraConstants.success);
		if(reasonCode!=null )
			myResponseObject.setReasonCode(reasonCode);
		ResponseBuilder resBuilder = Response.status(Status.OK).entity(myResponseObject);
		Response response= resBuilder.build();
		return Response.status(200).entity(myResponseObject).build();
       // return response;
	}
	
	/*@Produces(MediaType.APPLICATION_JSON)
	public static Response getSuccessResponse(String message) {
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setStatus(FiinfraConstants.success);
		baseResponse.setReasonCode(message);
		ResponseBuilder resBuilder = Response.status(Status.OK).entity(baseResponse);
        return resBuilder.build();
	}*/
    
		@Produces(MediaType.APPLICATION_JSON)
	public static  <T> Response getPartialSuccessResponse(BaseResponse<T> myResponseObject,String reasonCode) {
		//BaseResponse baseResponse = new BaseResponse();
		myResponseObject.setStatus(FiinfraConstants.PARTIAL_SUCCESS);
		if(reasonCode!=null )
			myResponseObject.setReasonCode(reasonCode);
		ResponseBuilder resBuilder = Response.status(Status.OK).entity(myResponseObject);
		Response response= resBuilder.build();
		return Response.status(200).entity(myResponseObject).build();
       // return response; 
	}
	    
	@Produces(MediaType.APPLICATION_JSON)
	public static Response getErrorResponse(String message) {
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setStatus(FiinfraConstants.fail);
		baseResponse.setReasonCode(message);
		ResponseBuilder resBuilder = Response.status(Status.OK).entity(baseResponse).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        return resBuilder.build();
    }
	
	@Produces(MediaType.APPLICATION_JSON)
	public static Response getInternalServerErrorResponse(String message) {
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setStatus(FiinfraConstants.fail);
		baseResponse.setReasonCode(message);
		ResponseBuilder resBuilder = Response.status(Status.INTERNAL_SERVER_ERROR).entity(baseResponse).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		return resBuilder.build();
	}
	
	@Produces(MediaType.APPLICATION_JSON)
	public static Response getEmptyResultResponse(String message)
	  {
	    BaseResponse res = new BaseResponse();
	    res.setStatus(FiinfraConstants.EMPTY_RESULT_SET);
	    res.setReasonCode(message);
	    Object[] arr = new Object[1];
	    arr[0] = res;
	    return Response.status(Status.NOT_FOUND).entity(arr).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	  }
	
	@Produces(MediaType.APPLICATION_JSON)
	public static Response getValidationErrorResponse(String message) {
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setReasonCode(message);
		ResponseBuilder resBuilder = Response.status(Status.BAD_REQUEST).entity(baseResponse).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		return resBuilder.build();
	}
	
	@Produces(MediaType.APPLICATION_JSON)
	public static Response getAuthFailureResponse(String message){
		BaseResponse baseResponse= new BaseResponse();
		baseResponse.setStatus(FiinfraConstants.fail);
		baseResponse.setReasonCode(message);
		ResponseBuilder resBuilder = Response.status(Status.UNAUTHORIZED).entity(baseResponse).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		return resBuilder.build();
	}
	@Produces(MediaType.APPLICATION_JSON)
	public static Response getAuthSuccessResponse(Object userObject) { // Viraj To Do: replace Object by specfic object
		return Response.status(Status.OK).entity(userObject).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
    }
}
