package com.visualpath.example;

public class HiSpring {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Hi Spring message: " + message);
	}
}
