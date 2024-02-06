package com.example.es3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {
    @GetMapping("/nome")
    public String getNome (@RequestParam String nome) {
        return nome;
    }
    @PostMapping("/nome")
    public String getNomeContrario (@RequestParam String nome) {
        StringBuilder stringBuilder = new StringBuilder(nome);
        return stringBuilder.reverse().toString();
    }
}
