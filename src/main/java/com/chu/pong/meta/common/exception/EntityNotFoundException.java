package com.chu.pong.meta.common.exception;

public class EntityNotFoundException extends RuntimeException {

	public EntityNotFoundException(Long id) {
		super(String.format("Not found id '%d'", id));
	}

	public EntityNotFoundException(String msg) {
		super(msg);
	}
}
