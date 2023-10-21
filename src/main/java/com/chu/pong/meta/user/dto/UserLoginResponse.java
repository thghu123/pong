package com.chu.pong.meta.user.dto;

import com.chu.pong.meta.user.domain.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserLoginResponse {

	private Long userId;
	private String name;
	private String email;
	private Long point;

	private UserLoginResponse(User user) {
		userId = user.getId();
		name = user.getName();
		email = user.getEmail();
		point = user.getPoint();
	}

	public static List<UserLoginResponse> from(List<User> users) {
		return users.stream().map(UserLoginResponse::new).collect(Collectors.toList());
	}

	public static UserLoginResponse from(User user) {
		return new UserLoginResponse(user);
	}

}
