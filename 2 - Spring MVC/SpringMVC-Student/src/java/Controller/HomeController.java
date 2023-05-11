package com.Spring.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	/* --> SENDING DATA FROM CONTROLLER TO VIEW
	       METHOD 1 : MODEL 
	       METHOD 2 : MODELANDVIEW
	*/
	
	@RequestMapping(value="/Model")
	public String Model(Model model) {
		model.addAttribute("Name","SANYAM");
		return"Model";
	}
	
	@RequestMapping(value="/Model-View")
	public ModelAndView Model_View() {
		ModelAndView modelandview=new ModelAndView();
		
		modelandview.addObject("Namee", "SANYAM NARANG");
		List<Integer> list=new ArrayList<Integer>();
		list.add(45);
		list.add(89);
		
		modelandview.addObject("marks", list);
		
		// TO SET THE JSP PAGE
		modelandview.setViewName("Model");
		
		return modelandview;	
	}
}
