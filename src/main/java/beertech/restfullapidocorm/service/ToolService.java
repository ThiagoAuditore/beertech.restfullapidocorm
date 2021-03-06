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

    public Tool getToolById(Long id){
        return toolRepository.getOne(id);
    }

    public void deleteById(Long id){
        toolRepository.deleteById(id);
    }

    public void updateTool(Tool tool){
        toolRepository.save(tool);
    }
}
