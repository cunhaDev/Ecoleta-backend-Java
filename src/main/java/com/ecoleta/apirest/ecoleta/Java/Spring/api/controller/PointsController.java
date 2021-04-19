package com.ecoleta.apirest.ecoleta.Java.Spring.api.controller;

import com.ecoleta.apirest.ecoleta.Java.Spring.domain.model.Points;
import com.ecoleta.apirest.ecoleta.Java.Spring.domain.service.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/pointscontroller"})
public class PointsController {

    @Autowired
    private PointsService pointsService;

    @PostMapping("/points")
    public Points salvar(@RequestBody Points points){
        return pointsService.savePoints(points);
    }

}
