package DBMS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value=" ") //here to get an mapping for the url
    public String showHomePage(){
        return"index";
    }

}
