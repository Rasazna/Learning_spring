package io.javabrains.sprinbootstarter.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class helloCOntroller {

    @Value("${my.greetings}")
    String myGreetings;

    @RequestMapping("/hello")
    public String say_hi()
    {
        return "Hi";
    }

    @RequestMapping("/greetings")
    public String greeting()
    {
        return myGreetings;
    }

}
