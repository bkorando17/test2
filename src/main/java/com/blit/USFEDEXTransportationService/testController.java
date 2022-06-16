package com.blit.USFEDEXTransportationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class testController {
	

		@GetMapping("/msg")
		public String message() {
			return "This is a test message";
		}
		
		@GetMapping("/msg2")
		public String message2() {
			return "A second message to check for test. If this works too then congradulations!";
		}
	}


