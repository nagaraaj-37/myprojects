package com.secure.SecureSpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureRestController {

	@RequestMapping("/login")
	public String getResult() {
		return "This is secured rest controller";

	}

}
