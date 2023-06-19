package A.Java.coffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TableController {
    @GetMapping("/table")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("table-section");
        return mv;
    }
}
