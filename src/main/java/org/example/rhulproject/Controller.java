package org.example.rhulproject;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.JSON;
import com.blade.mvc.annotation.Path;

import java.time.Instant;

@Path
public class Controller {
    @GetRoute("/")
    public String get(){
        return "index.html";
    }

    @GetRoute("/time")
    @JSON
    public String time() {
        return Instant.now().toString();
    }
}
