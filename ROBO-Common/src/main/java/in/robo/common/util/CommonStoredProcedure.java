package in.robo.common.util;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.object.StoredProcedure;

public class CommonStoredProcedure extends StoredProcedure {
	
	public CommonStoredProcedure(JdbcTemplate jdbcTemplate, String name) {
		super(jdbcTemplate, name);
		setFunction(false);
	}
	
	@Override
	public Map<String, Object> execute(Map<String, ?> inParams) {
		return super.execute(inParams);
	}
}
