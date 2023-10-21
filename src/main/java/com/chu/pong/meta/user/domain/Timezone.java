package com.chu.pong.meta.user.domain;

public enum Timezone {
	Asia_Shanghai("Asia/Shanghai"),
	Asia_Seoul("Asia/Seoul"),
	Australia_Darwin("Australia/Darwin"),
	Australia_Brisbane("Australia/Brisbane"),
	Australia_Adelaide("Australia/Adelaide"),
	Pacific_Noumea("Pacific/Noumea"),
	Asia_Anadyr("Asia/Anadyr"),
	Pacific_Apia("Pacific/Apia"),
	Pacific_Midway("Pacific/Midway"),
	Pacific_Honolulu("Pacific/Honolulu"),
	America_Nome("America/Nome"),
	America_Tijuana("America/Tijuana"),
	America_Phoenix("America/Phoenix"),
	America_Chicago("America/Chicago"),
	America_New_York("America/New_York"),
	America_Caracas("America/Caracas"),
	America_GlaceBay("America/Glace_Bay"),
	America_StJohns("America/St_Johns"),
	America_Argentina_BuenosAires("America/Argentina/Buenos_Aires"),
	America_Noronha("America/Noronha"),
	Atlantic_Azores("Atlantic/Azores"),
	Europe_London("Europe/London"),
	Europe_Berlin("Europe/Berlin"),
	Africa_Cairo("Africa/Cairo"),
	Europe_Moscow("Europe/Moscow"),
	Asia_Yerevan("Asia/Yerevan"),
	Asia_Kabul("Asia/Kabul"),
	Asia_Tashkent("Asia/Tashkent"),
	Asia_Kolkata("Asia/Kolkata"),
	Asia_Kathmandu("Asia/Kathmandu"),
	Asia_Dhaka("Asia/Dhaka"),
	Asia_Rangoon("Asia/Rangoon"),
	Asia_Bangkok("Asia/Bangkok"),
	NONE("NONE"),
	;

	private final String value;

	Timezone(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static Timezone getEnum(String value) {
		for (Timezone timezone : values()) {
			if (timezone.getValue().equalsIgnoreCase(value)) {
				return timezone;
			}
		}
		return NONE;
	}
}
