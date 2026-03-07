package vau.ac.lk.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FistController    {

    @GetMapping("/welcome")
    public  String welcome()
    {
        return "Welcome..!!!";
    }

    @GetMapping("/welcome2")
    public  String welcome2(@RequestParam String name)
    {
        return "Welcome to the word " + name;
    }

}
