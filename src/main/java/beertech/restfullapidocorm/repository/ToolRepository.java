package beertech.restfullapidocorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beertech.restfullapidocorm.model.Tool;

@Repository
public interface ToolRepository extends JpaRepository <Tool, Long> {

    
}