package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hi There!. This is CBS Service 1.0 here from BlueMix. I have 2 instance of mine running in this Node. Morning Session";
    }

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String getMovie(@PathVariable String name) {
        return "Hello " + name + ". Are you checking the new change";
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String getMovie() {
        return "Hi There!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
