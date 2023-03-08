// --> SANYAM 21CSU234

package com.Spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String home() {
		return"index";
	}
	
	@RequestMapping(value="/home")
	public String homepage() {
		return"index";
	}
}
