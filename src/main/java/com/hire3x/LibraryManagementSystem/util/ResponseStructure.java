package com.hire3x.LibraryManagementSystem.util;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ResponseStructure<T> {
		private String message;
		private int status;
		private Object data;
	}

