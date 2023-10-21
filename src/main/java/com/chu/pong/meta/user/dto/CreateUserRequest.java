package com.chu.pong.meta.user.dto;

import com.chu.pong.meta.user.domain.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CreateUserRequest {

	private String name;
	private String email;
	private String password;

	public User toEntity() {
		return User.builder()
			.name(this.name)
			.password(this.password)
			.email(this.email)
			.point(0)
			.build();
	}

	@Builder
	public CreateUserRequest(String name,
		String email,
		String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
}
