package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.print("HomeURl");
		model.addAttribute("name", "Rahul Bhardwaz");
		model.addAttribute("id", 620);
		return"index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Rahul");
		friends.add("Anshole");
		friends.add("Pulli");
		friends.add("Jaadu");
		friends.add("Yashu");
		friends.add("Lacchu");
		friends.add("Kadhi Chawal");
	    
		model.addAttribute("f",friends);
		
		return"about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView mod= new ModelAndView();
		mod.addObject("name", "Ramu");
		mod.addObject("roll", 6789);
		mod.setViewName("help");
		
		LocalDateTime now= LocalDateTime.now();
		mod.addObject("time",now);
		return mod;
	}
	
	@RequestMapping("/jstl")
	public ModelAndView jstl() {
		ModelAndView m = new ModelAndView();
		m.addObject("course", "JSP Expression Language");
		
		ArrayList<String> loc = new ArrayList<String>();
		loc.add("Gurgaon");
		loc.add("Purnia");
		loc.add("Patna");
		loc.add("Delhi");
		loc.add("Noida");
		
		m.addObject("l",loc);
		
		m.setViewName("jstl");
		
		return m;
	}
}
