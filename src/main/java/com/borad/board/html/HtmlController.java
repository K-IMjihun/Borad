package com.borad.board.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/api")
public class HtmlController {

    private static long visitCount = 0;

    @GetMapping("/static-hello")
    public String hello(){
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlStatic(){
        return "redirect:/hello.html";
    }


    // 밑에꺼 두개 안됨
    // 안됨
    @RequestMapping("/html/templates")
    public String htmlTemplates(){
        return "hello";
    }

    @RequestMapping("/html/dynamic")
    public String htmlDynamic(Model model){
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }
}
