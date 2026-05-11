package com.fsd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fsd.entity.Summary;

@Repository
public interface SummaryRepository extends CrudRepository<Summary, String> {

}
