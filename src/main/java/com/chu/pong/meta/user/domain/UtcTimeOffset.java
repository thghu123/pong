package com.chu.pong.meta.user.domain;

public enum UtcTimeOffset {
	P0800("+08:00"),
	P0900("+09:00"),
	P0930("+09:30"),
	P1000("+10:00"),
	P1030("+10:30"),
	P1100("+11:00"),
	P1200("+12:00"),
	P1300("+13:00"),
	N1100("-11:00"),
	N1000("-10:00"),
	N0900("-09:00"),
	N0800("-08:00"),
	N0700("-07:00"),
	N0600("-06:00"),
	N0500("-05:00"),
	N0430("-04:30"),
	N0400("-04:00"),
	N0330("-03:30"),
	N0300("-03:00"),
	N0200("-02:00"),
	N0100("-01:00"),
	P0000("+00:00"),
	P0100("+01:00"),
	P0200("+02:00"),
	P0300("+03:00"),
	P0400("+04:00"),
	P0430("+04:30"),
	P0500("+05:00"),
	P0530("+05:30"),
	P0545("+05:45"),
	P0600("+06:00"),
	P0630("+06:30"),
	P0700("+07:00"),
	NONE("NONE"),
	;

	private final String value;

	UtcTimeOffset(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static UtcTimeOffset getEnum(String value) {
		for (UtcTimeOffset utcTimeOffset : values()) {
			if (utcTimeOffset.getValue().equalsIgnoreCase(value)) {
				return utcTimeOffset;
			}
		}
		return NONE;
	}
}
