package com.example.chatGPT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/GPT")
public class chatGptController {
    @Autowired
    private ApiService apiService;
    @GetMapping
    public String chat(Model model) {
        return "index";
    }

    @PostMapping("/search")
    public String chatGPT(@RequestBody String query, Model model) {
        String content = apiService.callApi(query);
        return content;
    }
}
