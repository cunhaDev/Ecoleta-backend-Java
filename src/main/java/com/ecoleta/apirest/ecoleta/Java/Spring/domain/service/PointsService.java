package com.ecoleta.apirest.ecoleta.Java.Spring.domain.service;

import com.ecoleta.apirest.ecoleta.Java.Spring.domain.model.Points;
import com.ecoleta.apirest.ecoleta.Java.Spring.domain.repository.PointsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointsService {

    @Autowired
    private PointsRepository pointsRepository;

    public Points savePoints(Points points)
    {

        //TODO implementar validação
//        Points pointExist = pointsRepository.findByPoint(points.getName());
//        if(pointExist != null && !pointExist.equals(points.getName()))
//        {
//            System.out.println("ja existe este Point!");
//        }
        return pointsRepository.save(points);
    }
}
