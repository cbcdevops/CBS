package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hi There!. This is Canal Barges first Microservice Service running in Kubernetes on BlueMix. I have two instance me running. I'm exposed via a MicroService.";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
