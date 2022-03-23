package com.project.gs.red.Api;

import com.project.gs.red.Entitys.Red;
import com.project.gs.red.Services.RedServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedController {
    @Autowired
    private RedServiceImpl redService;

    @GetMapping("detalle/{id}")
    public Red ver (@PathVariable Long id){
        return redService.findById(id);
    }
}
