package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.Email;
import com.boot.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@PostMapping("/sendEmail")
	public ResponseEntity<?> sendEmail(@RequestBody Email email) {

		boolean result = this.emailService.sendEmail(email.getSubject(), email.getSubject(), email.getto());

		if (result) {
			return ResponseEntity.ok("Email sent successfully");
		} else {
			return ResponseEntity.ok("Email not sent successfully");
		}
	}
}
