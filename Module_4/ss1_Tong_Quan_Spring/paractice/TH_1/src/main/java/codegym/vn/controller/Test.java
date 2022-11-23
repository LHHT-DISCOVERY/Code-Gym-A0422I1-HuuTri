package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Test")
public class Test {
    @GetMapping("/test")
    public String show() {
        return "TestHello/test";
    }
}
