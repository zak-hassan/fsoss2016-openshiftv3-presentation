package com.openshift.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fsoss")
public class RestApi {


     @RequestMapping(value = "{name}",method= RequestMethod.GET)
    public String greeting(@PathVariable("name") String name) {
        return "job service: "+name+" DBENV="+System.getenv("DATA_SERVICE_PORT_27017_TCP");
    }
}
