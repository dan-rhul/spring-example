package org.example.rhulproject;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.time.Instant;

public class Project {
    public static void main(String[] args) {
        SpringApplication.run(Project.class, args);
    }

    @RequestMapping("/")
    String index() {
        return "index";
    }
//    private final Express app;
//
//    public Project(Express app) throws IOException {
//        this.app = app;
//
//        registerRoutes();
//        startServer();
//    }
//
//    public static void main(String[] args) {}
//
//    private void registerRoutes() throws IOException {
//        this.app.get("/", Middleware.statics("pages/"));
//        this.app.get("/time", (request, response) -> response.send(Instant.now().toString()));
//    }
//
//    private void startServer() {
//        this.app.listen(Integer.parseInt(System.getenv("PORT")));
//    }
}
