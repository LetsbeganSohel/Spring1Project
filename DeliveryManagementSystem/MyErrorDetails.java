package com.test.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class MyErrorDetails {

	private LocalDateTime timestamp;
	private String message;
	private String description;

	public void setTimestamp(LocalDateTime now) {
		// TODO Auto-generated method stub

	}

	public void setMessage(String message2) {
		// TODO Auto-generated method stub

	}

	public void setDescription(String description2) {
		// TODO Auto-generated method stub

	}

}
