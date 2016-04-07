/**
 * 
 */
package in.robo.common.util;

/**
 * @author Kunal
 *
 */
public enum DataTypeEnum {

	TEXt(37001),INTEGER(37002),AMOUNT(37003),PERCENTAGE(37004),DATE(37005),DATETIME(37006),
	RECORDPOINTER(37007),BINARY(37008);
	
	private Integer codeValueId;

	private DataTypeEnum(Integer codeValueId) {
		this.codeValueId = codeValueId;
	}

	public Integer getCodeValueId() {
		return codeValueId;
	}
	
	
}
