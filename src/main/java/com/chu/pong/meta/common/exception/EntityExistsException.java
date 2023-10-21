package com.chu.pong.meta.common.exception;

import java.util.Arrays;
import java.util.List;

public class EntityExistsException extends RuntimeException {

	public EntityExistsException(List<Long> idList) {
		super(String.format("Id Already Exists '%s'", Arrays.toString(idList.toArray())));
	}

	public EntityExistsException(String message) {
		super(message);
	}
}
