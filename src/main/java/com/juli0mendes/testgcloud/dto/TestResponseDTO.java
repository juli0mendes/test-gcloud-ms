package com.juli0mendes.testgcloud.dto;

import java.io.Serializable;

public class TestResponseDTO implements Serializable {

	private static final long serialVersionUID = -3500274804447990283L;

	private String message;
	
	public TestResponseDTO(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
