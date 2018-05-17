package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {

    public String hello(String name){
        System.out.println("Hello!!! " + name);

        return "foo";
    }
}
