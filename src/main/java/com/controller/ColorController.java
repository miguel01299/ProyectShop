package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.entity.Color;
import com.service.ColorService;

import java.util.List;

@RestController
@RequestMapping("/api/color") //http://localhost:8080/api/color
public class ColorController {

    @Autowired
    private ColorService colorService;

    //http://localhost:8080/api/color
    @PostMapping
    public Color addColor(Color c){
        return colorService.create(c);
    }

    @PutMapping("/{colorId}") //http://localhost:8080/api/color/10 PUT
    public Color updateColor(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/color GET
    public List<Color> getAllColor(){
        return null;
    }

    @GetMapping ("/{colorId}") //http://localhost:8080/api/color GET
    public Color getColorById(){

        return null;
    }

    @DeleteMapping ("/{colorId}") //http://localhost:8080/api/color DELETE
    public void deleteColor(){

    }
}