package davenkin.helloworld;

import davenkin.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yteng on 4/3/17.
 */
@RestController("/hello")
public class HelloWorldController {

    private HelloWorld helloWorld;

    public HelloWorldController(HelloWorld helloWorld) {

        this.helloWorld = helloWorld;
    }

    @GetMapping
    public String hello() {
        return helloWorld.sayHello();
    }
}
