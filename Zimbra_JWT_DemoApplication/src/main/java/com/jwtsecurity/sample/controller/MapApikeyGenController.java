package com.jwtsecurity.sample.controller;

import java.time.Instant;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Controller
public class MapApikeyGenController {
	@RequestMapping(value = "/keygen",method=RequestMethod.GET)
	@ResponseBody
	public String generateKey(@RequestParam(value="email") String email) {
		String jws = Jwts.builder().setIssuer("Rajanikanta").setSubject("Ascessing for Services").claim("uid", email)
				.claim("scope", "user")
				// Fri Jun 24 2016 15:33:42 GMT-0400 (EDT)
				.setIssuedAt(Date.from(Instant.ofEpochSecond(1466796822L)))
				// Sat Jun 24 2116 15:33:42 GMT-0400 (EDT)
				.setExpiration(Date.from(Instant.ofEpochSecond(4622470422L)))
				.signWith(SignatureAlgorithm.HS256, "secretekey")
				.compact();
		return jws;

	}
	

}
