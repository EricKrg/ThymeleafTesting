package com.testsite.testsite.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@Controller  // controller tries to return a view, while rest-controller writes directly to http-request
public class PageController {
    @RequestMapping("/")
    public  String home(){

        return "index";
    }
}
