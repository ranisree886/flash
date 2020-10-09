package com.nisum.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailService {
	private JavaMailSender mailsender;
	public EmailService(JavaMailSender mailsender){
		this.mailsender=mailsender;
		
	}
	public void sendEmail(SimpleMailMessage email) {
		mailsender.send(email);
	}
	
	

}
