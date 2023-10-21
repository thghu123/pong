package com.chu.pong.meta.user.util;

import com.chu.pong.meta.user.domain.UtcTimeOffset;

import javax.persistence.AttributeConverter;

public class UtcTimeOffsetConverter implements AttributeConverter<UtcTimeOffset, String> {

	@Override
	public String convertToDatabaseColumn(UtcTimeOffset utcTimeOffset) {
		return utcTimeOffset.getValue();
	}

	@Override
	public UtcTimeOffset convertToEntityAttribute(String string) {
		return UtcTimeOffset.getEnum(string);
	}
}
