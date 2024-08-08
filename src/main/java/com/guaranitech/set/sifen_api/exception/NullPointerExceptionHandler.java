package com.guaranitech.set.sifen_api.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NullPointerExceptionHandler extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NullPointerExceptionHandler(String errorMessage) {
		super(errorMessage);
	}

}
