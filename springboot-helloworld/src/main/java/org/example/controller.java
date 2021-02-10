package org.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    public String hello(){
        return  "Application successfully deployed in Elastic Bean Stack";
    }
}
