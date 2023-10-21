package com.chu.pong.meta.user.exception;

public class LoginFailedException extends RuntimeException {

	public LoginFailedException() {
		super("Cannot Login, Please Check Id and Password");
	}
}
