package vau.ac.lk.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FistController    {

    @GetMapping("/welcome")             //http://localhost:8080/welcome

    public  String welcome()
    {
        return "Welcome..!!!";
    }

    @GetMapping("/welcome2")                //http://localhost:8080/welcome2?name=Alex

    public  String welcome2(@RequestParam String name)
    {
        return "Welcome to the word " + name;
    }

    @GetMapping("/welcome3/{a}")            //http://localhost:8080/welcome3/apple
    public  String welcome3(@PathVariable String a)
    {
        return "welcome "+ a;
    }

    @GetMapping("/welcome4/{a}/{b}")            //http://localhost:8080/welcome3/apple
    public  String welcome4(@PathVariable int a,@PathVariable int b)
    {

        //return String.valueOf(a+b);
        return "Sum is " + (a + b);
    }





}


