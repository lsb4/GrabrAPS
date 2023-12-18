package com.example.demo.controllers;

import com.example.demo.gui.Fachada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ControllerLogin {

    @Autowired
    private Fachada fachada;

    @GetMapping("/login")
    public boolean efetuarLogin(@RequestParam(name = "login") String login, @RequestParam(name = "senha") String senha) {
        return fachada.efetuarLogin(login, senha);
    }
}