package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping
    public ModelAndView index() {
        Map<String,String> bag = new HashMap<String, String>();
        bag.put("pageTitle", "Spring Boot Sandbox");
        bag.put("greeting", "Hello from the sandbox");
        bag.put("farewell", "Farewell from the sandbox");
        bag.put("footer", "This is some footer text");

        return new ModelAndView("views/home", bag);
    }

}
