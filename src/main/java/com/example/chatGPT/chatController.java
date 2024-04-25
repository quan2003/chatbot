package com.example.chatGPT;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class chatController {

    @GetMapping("/feed")
    public String index() {
        return "index";
    }
}
