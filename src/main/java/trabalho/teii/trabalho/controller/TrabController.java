package trabalho.teii.trabalho.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TrabController {
    @GetMapping("/trabalho")
    public String hello(){
        return "hello, World!";
    }


}