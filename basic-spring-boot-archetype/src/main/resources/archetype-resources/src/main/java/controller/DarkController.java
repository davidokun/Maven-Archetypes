package ${package}.controller;

import ${package}.service.DarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DarkController {

    @Autowired
    private DarkService darkService;

    @GetMapping("hello")
    public String sayDarkHello(){

        return darkService.sayHelloDark();
    }
}