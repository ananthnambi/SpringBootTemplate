package com.template.spring.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.template.spring.model.mongo.Demo;

public interface DemoRepository extends MongoRepository<Demo, Long> {

	Demo findOneByAppNo(int appNo);

}