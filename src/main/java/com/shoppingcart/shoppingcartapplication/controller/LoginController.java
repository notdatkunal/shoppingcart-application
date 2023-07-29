package com.shoppingcart.shoppingcartapplication.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.shoppingcartapplication.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class LoginController {
	
	@Autowired
	private final LoginService service;
	
	@PostMapping("/signup")
	public void signUp(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String link = service.create(request);
		response.sendRedirect(link);
	}
	
	@PostMapping("/login")
	public void logIn(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		String link = service.verify(request);
		response.sendRedirect(link);
	}

	

}
