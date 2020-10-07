package beertech.restfullapidocorm.service;

import beertech.restfullapidocorm.model.Tool;
import beertech.restfullapidocorm.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToolService {

    @Autowired
    ToolRepository toolRepository;

    public void saveTool(Tool tool){
        toolRepository.save(tool);
    }
}
