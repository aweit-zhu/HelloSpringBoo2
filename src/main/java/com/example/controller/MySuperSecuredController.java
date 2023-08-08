package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/secured")
@RestController
@PreAuthorize("hasRole('SYS_ADMIN')")
public class MySuperSecuredController {

    @GetMapping("/get-data")
    public String get(){
        return "SUPER SECURED DATA"; 
    }

}