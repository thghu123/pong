package com.chu.pong.meta.user.util;

import com.chu.pong.meta.user.domain.Timezone;

import javax.persistence.AttributeConverter;

public class TimezoneConverter implements AttributeConverter<Timezone, String> {

	@Override
	public String convertToDatabaseColumn(Timezone timezone) {
		return timezone.getValue();
	}

	@Override
	public Timezone convertToEntityAttribute(String string) {
		return Timezone.getEnum(string);
	}
}
