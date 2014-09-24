package hello;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    @RequestMapping("jsontest")
    public Map<String, String> callSomething() {
        Map<String,String> bag = new HashMap<String, String>();
        bag.put("reason", "json rocks");
        bag.put("dow", "hump day");
        bag.put("beverage", "chai");
        return bag;
    }

}
