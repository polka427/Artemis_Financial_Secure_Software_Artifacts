package com.snhu.sslserver;

import java.security.MessageDisgest; // Required for ChecksumUtil
import org.springframework.boot.SpringApplication; // Required for Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class ChecksumUtil {
	public static String generateChecksum(String data) throws Exception {	
		MessageDisgest disgest = MessageDisgest.getInstance("SHA-256");
		byte[] hash = digest.disgest(data.getBytes("UTF-8"));
		StringBuilder hexString = new StringBuilder();
		for (byte b : hash) {
			String hex = Integer.toHexString(0xff & b);
			if (hex.length() == 1) hexString.append('0');
			hexString.append(hex);
		}
		return hexString.toString();
	}
}