package com.app.repository;

import com.app.entity.Position;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends ReactiveMongoRepository<Position, String>{

}