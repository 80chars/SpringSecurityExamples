package org.eightychars.sandbox.sfilters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController
{
    static Logger log = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public ModelAndView helloWorld()
    {
        log.warn("helloWorld");
        String message = "MVC Controller: Hello";
        return new ModelAndView("hello", "message", message);
    }
    
    @RequestMapping("/welcome")
    public ModelAndView welcome()
    {

        String message = "MVC Controller: Welcome";
        return new ModelAndView("welcome", "message", message);
    }

}
