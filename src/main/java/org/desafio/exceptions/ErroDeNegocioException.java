package org.desafio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ErroDeNegocioException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ErroDeNegocioException(String exception) {
	    super(exception);
	  }
}