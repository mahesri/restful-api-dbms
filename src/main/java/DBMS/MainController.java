package DBMS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value="/index") //we got an error from here
    public String showHomePage(){
        return"index";
    }
}
