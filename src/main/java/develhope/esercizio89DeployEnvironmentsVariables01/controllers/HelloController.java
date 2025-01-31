package develhope.esercizio89DeployEnvironmentsVariables01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String hello() {
        String devName = environment.getProperty("devName");
        String authCode = environment.getProperty("authCode");
        return "Hello, " + devName + "! This is your auth code: " + authCode;
    }
}
