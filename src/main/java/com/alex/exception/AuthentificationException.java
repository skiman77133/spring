package com.alex.exception;

import org.springframework.security.core.AuthenticationException;;

public class AuthentificationException extends AuthenticationException{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -6591905019313289696L;
	

	public AuthentificationException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

}
