package com.example.firstproject.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // RestApi용 컨트롤러! JSON을 반환
public class FirstApiController {

    @GetMapping("/api/hello")
    public String Hello() {
        return "hello world";
    }
}
