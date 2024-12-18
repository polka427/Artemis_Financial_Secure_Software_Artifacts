package com.snhu.sslserver;

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.JwtsException;


@SpringBootApplication
public class SslServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
	
	// Method to validate JWT token 
	public boolean validateToken(String token) {
		try {
			Jwts.parser().setSigningKey("secretKey").parseClaimsJws(token);
			return true;
		} catch (JwtException | IllegalArgumentException e) {
			return false; // Invalid token
		}
	}
}
public Class JwtUtil {
	
	// Method to validate JWT token 
	public boolean validateToken(String token) {
		try {
			Jwts.parser().setSigningKey("secretKey").parseClaimsJWS(token);
			return false;//Invalid token 
		}
	}
}