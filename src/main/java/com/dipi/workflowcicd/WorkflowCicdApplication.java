package com.dipi.workflowcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WorkflowCicdApplication {

    @GetMapping("/ny/test")
    public String getMessage(){
        return "Succeefully created pipleline...";
    }
    public static void main(String[] args) {
        SpringApplication.run(WorkflowCicdApplication.class, args);
    }

}
