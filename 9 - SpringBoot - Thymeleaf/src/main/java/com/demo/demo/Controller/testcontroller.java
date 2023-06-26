package com.demo.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testcontroller {

    @RequestMapping("/")
    public String test(Model model) {
        System.out.println("test");
        model.addAttribute("name", "sanyam");
        return "test";
    }
// FOR INTERATION
    @RequestMapping("/list")
    public String list(Model model) {
        List<String>list=new ArrayList<>();
        list.add("sanyam");
        list.add("saksham");
        System.out.println("list");
        model.addAttribute("list", list);

        //  conditional operator , elivis operator 
        model.addAttribute("bool", true);
        
        return "list";
    }

    @RequestMapping("/fragments")
    public String fragments(Model model) {
        System.out.println("fragments");
        model.addAttribute("name", "sanyam");
        return "fragments";
    }

    @RequestMapping("/inhertance")
    public String inhertance() {
        return "about";
    }
}
