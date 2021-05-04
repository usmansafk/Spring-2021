package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController -- allows external access to our app via HTTP requests
public class TestController {
	
	@GetMapping("/test")// @TypeofRequest("location")
	public String test() {
		return "Yay, it works";
	}
	

}


