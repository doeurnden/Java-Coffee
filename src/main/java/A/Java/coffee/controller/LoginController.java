package A.Java.coffee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
    @GetMapping("/")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
}
