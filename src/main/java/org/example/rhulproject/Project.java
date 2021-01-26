package org.example.rhulproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Project {
    public static void main(String[] args) {
        SpringApplication.run(Project.class, args);
    }

    @RequestMapping("/")
    String index() {
        return "index";
    }
}
