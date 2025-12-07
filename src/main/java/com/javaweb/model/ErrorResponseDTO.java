package com.javaweb.model;

import java.util.List;

public class ErrorResponseDTO {
	private String nameOfError;
	private List<String> details;

	/**
	 * @return the nameOfError
	 */
	public String getNameOfError() {
		return nameOfError;
	}

	/**
	 * @param nameOfError the nameOfError to set
	 */
	public void setNameOfError(String nameOfError) {
		this.nameOfError = nameOfError;
	}

	/**
	 * @return the details
	 */
	public List<String> getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(List<String> details) {
		this.details = details;
	}

}
