package life.majing.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/haha")
    public String hello(@RequestParam("name") String name, Model model){
        System.out.println("=========================");
        model.addAttribute("name",name);
        return "hello";
    }
}
