package org.example.rhulproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@Controller
@SpringBootApplication
@RestController
public class Project {
    public static void main(String[] args) {
        SpringApplication.run(Project.class, args);
    }

    @GetMapping("/time")
    String time() {
        return Instant.now().toString();
    }
}
