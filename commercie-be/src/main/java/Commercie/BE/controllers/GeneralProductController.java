package Commercie.BE.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GeneralProductController {
    @GetMapping("/products")
    public String generalProduct() {
        return "General Product";
    }
}
