package in.robo.common.token;

public class FiinfraTokenException extends Exception {

	private static final long serialVersionUID = 4863208349741568637L;
	
	public FiinfraTokenException(String errorMessage) {
		super(errorMessage);
	}

	public FiinfraTokenException(Exception ex) {
		super(ex);
	}
}
