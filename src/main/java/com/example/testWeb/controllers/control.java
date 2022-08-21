package com.example.testWeb.controllers;

import com.example.testWeb.Manifest;
import com.example.testWeb.clients.ManifestClient;
import com.example.testWeb.clients.RoverClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class control {

    @Autowired
    RoverClient roverClient;

    @Autowired
    ManifestClient manifestClient;

    @GetMapping
    public String getIndex(Model model){
        return "index2";
    }

    @GetMapping(value = "/curiosity")
    public String getInde(Model model){
        Manifest manifest = manifestClient.getManifest();
        model.addAttribute("manifest", manifest);
        return "curiosity2";
    }


}