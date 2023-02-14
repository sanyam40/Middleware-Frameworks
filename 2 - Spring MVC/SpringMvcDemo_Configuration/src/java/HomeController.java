// SANYAM 21CSU234
// DATE : 9/2/23

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String test(){
		return "index";
	}

}
