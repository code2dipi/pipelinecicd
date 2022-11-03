package com.dipi.workflowcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class WorkflowCicdApplication {

    @GetMapping("/ny/test")
    public String getMessage(){
        return "Welcome to CI/CD pipeline";
    }
    public static void main(String[] args) {
        SpringApplication.run(WorkflowCicdApplication.class, args);
    }

}
