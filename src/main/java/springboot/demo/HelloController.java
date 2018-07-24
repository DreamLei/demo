package springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    protected GirlProperties girlProperties;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public  String say(){
        return girlProperties.getContent();
    }
}