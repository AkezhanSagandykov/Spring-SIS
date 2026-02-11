package com.example.demo;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequestMapping("/api")
public class POSTController {

    @PostMapping("/calculate")
    public Map<String, Integer> calculate(@RequestBody Map<String, Integer> request) {

        int a = request.get("a");
        int b = request.get("b");

        int result = a + b;

        return Map.of("result", result);
    }
}