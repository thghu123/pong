package com.chu.pong.meta.user.exception;

import com.chu.pong.meta.common.exception.EntityNotFoundException;

import static java.lang.String.format;

public class UserIdNotFoundException extends EntityNotFoundException {

	public UserIdNotFoundException(long userId) {
		super(format("User Id '%s' is not exists", userId));
	}

}
