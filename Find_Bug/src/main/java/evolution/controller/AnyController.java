package evolution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnyController {
	@GetMapping("/get")
	public void get() {
		System.out.println("Are you ready to see an error?");
		int i = 1 / 0;
		String string = null;
		int j = string.length();
	}
}
