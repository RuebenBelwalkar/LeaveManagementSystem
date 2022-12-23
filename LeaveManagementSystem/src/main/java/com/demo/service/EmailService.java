package com.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailService {
	@Autowired
	JavaMailSender mailSender;
	
	public void sendEmail(String name,String password,String toEmail) {
		
		SimpleMailMessage message =new SimpleMailMessage();
		String emailbody="Congratulations !!!! \nYour UserID Password is :\n"+"Username : "+name+"\nPassword : "+password;
		message.setFrom("prathamvora987@gmail.com");
		message.setTo(toEmail);
		message.setText(emailbody);
		message.setSubject("Your Account Details");
		System.out.println(name);
		System.out.println(password);
		System.out.println(toEmail);
		System.out.println(emailbody);
		System.out.println(message);
		mailSender.send(message);
		System.out.println("Mail Sent");
		}
}

