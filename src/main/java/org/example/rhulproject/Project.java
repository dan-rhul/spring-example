package org.example.rhulproject;

import express.*;
import express.middleware.Middleware;

import java.io.IOException;
import java.time.Instant;

public class Project {
    private final Express app;

    public Project(Express app) throws IOException {
        this.app = app;

        registerRoutes();
        startServer();
    }

    public static void main(String[] args) {}

    private void registerRoutes() throws IOException {
        this.app.get("/", Middleware.statics("pages/"));
        this.app.get("/time", (request, response) -> response.send(Instant.now().toString()));
    }

    private void startServer() {
        this.app.listen();
    }
}
