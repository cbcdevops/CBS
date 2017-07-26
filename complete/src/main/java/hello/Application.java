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
        return "Hi There!. This is CBS Service 1.0 here from BlueMix. I have 2 instance of mine running in this Node. Morning Session";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
