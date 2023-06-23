package com.borad.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
// 이 코드를 작성함으로 "/main"이 "/api/main"이 됨
@RequestMapping("/api")
public class BoardController {

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "post요청";
    }

    @GetMapping("/main")
    @ResponseBody
    public String hello(){
        return "hello World";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "pust요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "delete요청";
    }
}
