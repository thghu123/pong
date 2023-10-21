package com.chu.pong.meta.user.dto;

import com.chu.pong.meta.user.domain.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserLoginRequest {

	private String email;
	private String password;

	public static UserLoginRequest create(String email, String password) {

		return new UserLoginRequest(email, password);
	}

	public User toEntity() {
		return User.builder()
			.email(email)
			.password(password)
			.build();
	}

}
