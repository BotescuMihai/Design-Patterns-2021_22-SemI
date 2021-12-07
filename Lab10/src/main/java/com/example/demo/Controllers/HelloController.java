package com.example.demo.Controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private ClientComponent ccomp;
    public HelloController(ClientComponent ccomp){
        this.ccomp = ccomp;
    }
    @GetMapping("/")
    public String greetings(){
        return "Greetings from SpringBoot!";
    }
    @GetMapping("/clientComponent")
    @Autowired
    public String clientComponent(){
            return this == null ?
                    "Hello from nowhere!"
                    :
                    String.format(
                    "Hello from ClientComponent = %s",
                    this
            );
    }

}
