package in.robo.common.util;

import java.util.List;

public class GridData<T> {

	/**
	 * Current page of the query
	 */
	private int page;
	
	private int pageSize;
	
	/**
	 * Total pages for the query
	 */
	private int total;
	
	/**
	 * Total number of records for the query
	 */
	private int records;
	
	/**
	 * An array that contains the actual objects
	 */
	private List<T> rows;
	

	
	public GridData() {
	}
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		this.records = records;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}


	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
