package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
	// Test the sanitizeInput functionality
	SslServerApplication app = new SslServerApplication();
	app.processUserInput("Test123!@#"); // Should print: Sanitized Input: Test123
}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
//Method to sanitize input 
public String sanitizeInput(String input) {
	//Remove special characters to prevent injection attacks 
	return input.replaceAll("[^a-zA-ZO-9]", "");
}

// Example usage of sanitization 
public void processUserInput(String userInput) {
	String sanitizedInput = sanitizeInput(userInput);
	System.out.println("Sanitized Input: " + sanitizedInput);
	// Additional processing with sanitized input
	
 	}
}