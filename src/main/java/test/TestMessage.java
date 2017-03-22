package test;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class TestMessage {
	private String name;
	private ZonedDateTime sysDate;
}
