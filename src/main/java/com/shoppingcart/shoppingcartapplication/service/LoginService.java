package com.shoppingcart.shoppingcartapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.shoppingcartapplication.dto.Admin;
import com.shoppingcart.shoppingcartapplication.dto.Customer;
import com.shoppingcart.shoppingcartapplication.dto.Merchant;
import com.shoppingcart.shoppingcartapplication.repository.AdminRepository;
import com.shoppingcart.shoppingcartapplication.repository.CustomerRepository;
import com.shoppingcart.shoppingcartapplication.repository.MerchantRepository;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class LoginService {
	@Autowired
	private final AdminRepository adminRepository;
	@Autowired
	private final MerchantRepository merchantRepository;
	@Autowired
	private final CustomerRepository customerRepository;

	public String create(HttpServletRequest request) {
		String mode = request.getParameter("mode");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Long number = Long.parseLong(request.getParameter("number"));
		System.out.println(mode);
		var session = request.getSession();
		if ("customer".equals(mode)) {
			Customer user = new Customer(name, email, password, number);
			customerRepository.save(user);
			session.setAttribute(mode, user);
		}
		if ("merchant".equals(mode)) {
			Merchant user = new Merchant(name, email, password, number);
			merchantRepository.save(user);
			session.setAttribute(mode, user);
		}
		if ("admin".equals(mode)) {
			Admin user = new Admin(name, email, password, number);
			adminRepository.save(user);
			session.setAttribute(mode, user);
		}
		return mode + ".html";
	}

	public String verify(HttpServletRequest request) {
		String mode = request.getParameter("mode");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		var session = request.getSession();
		if("admin".equals(mode)) {
			Admin user = adminRepository.findByEmail(email);
				if(user!=null)
					session.setAttribute(mode, user);
				return user.getPassword().equals(password)?"admin.html":"wrongPass.html";
		}
		if("merchant".equals(mode)) {
			Merchant user = merchantRepository.findByEmail(email);
			
			
			return user.getPassword().equals(password)?"merchant.html":"wrongPass.html";
		}
		if("customer".equals(mode)) {
			Customer user = customerRepository.findByEmail(email);
			
			
			return user.getPassword().equals(password)?"customer.html":"wrongPass.html";
		}
		

		return "error.html";
	}

}
