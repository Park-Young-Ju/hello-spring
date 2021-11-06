package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //localhost8080 들어가지면 이것이 처음으로 실행됨
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
