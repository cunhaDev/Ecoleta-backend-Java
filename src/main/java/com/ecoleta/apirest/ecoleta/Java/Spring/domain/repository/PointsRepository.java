package com.ecoleta.apirest.ecoleta.Java.Spring.domain.repository;

import com.ecoleta.apirest.ecoleta.Java.Spring.domain.model.Points;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointsRepository extends JpaRepository<Points,Long>
{
    Points findByPoint(String name);
}
