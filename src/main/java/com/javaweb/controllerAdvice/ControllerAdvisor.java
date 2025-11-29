package com.javaweb.controllerAdvice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.javaweb.model.ErrorResponseDTO;

import customException.FieldRequiredException;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
	// @annotation identify spectifically error (.class)
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<Object> handleArithmeticException(ArithmeticException ex, WebRequest request) {

		ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
		// set name error
		errorResponseDTO.setNameOfError(ex.getMessage());
		// set details error
		List<String> list = new ArrayList<>();
		list.add("Error Arithmmetic");
		list.add("Error maybe is divide for zero");
		errorResponseDTO.setDetails(list);
		return new ResponseEntity<>(errorResponseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(FieldRequiredException.class)
	public ResponseEntity<Object> handleFieldRequiredException(FieldRequiredException ex, WebRequest request) {
		ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();

		// set name for exception
		errorResponseDTO.setNameOfError(ex.getMessage());
		List<String> detailsList = new ArrayList<>();
		// set details for exception
		detailsList.add("Requird re-check input name");
		detailsList.add("Requird re-check input floor");
		detailsList.add("Requird re-check input price");
		errorResponseDTO.setDetails(detailsList);
		return new ResponseEntity<Object>(errorResponseDTO, HttpStatus.BAD_GATEWAY);
	}
}
