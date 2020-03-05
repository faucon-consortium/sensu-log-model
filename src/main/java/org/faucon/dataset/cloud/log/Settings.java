package org.faucon.dataset.cloud.log;

public class Settings {

	private String hexdigest = null;

	// parent of Root
	private Long limit = null;
	
	public String getHexdigest() {
		return hexdigest;
	}

	public void setHexdigest(String hexdigest) {
		this.hexdigest = hexdigest;
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}
	
	
	
}
