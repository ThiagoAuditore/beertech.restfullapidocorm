package beertech.restfullapidocorm.controller;

import beertech.restfullapidocorm.service.ToolService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import beertech.restfullapidocorm.model.Tool;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-07T00:00:49.580Z")

@Controller
@RequestMapping("/tool")
public class ToolApiController  {

    private static final Logger log = LoggerFactory.getLogger(ToolApiController.class);

    private final HttpServletRequest request;

    private final ToolService toolService;

    @Autowired
    public ToolApiController(HttpServletRequest request, ToolService toolService) {
        this.request = request;
        this.toolService = toolService;
    }


    @ApiOperation(value = "Add a new tool", nickname = "POST", notes = "", tags={ "tool", })
    @ApiResponses(value = {
            @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    public ResponseEntity<Void> addTool(@ApiParam(value = "Tool object that needs to be added" ,required=true )  @RequestBody Tool body) {
        toolService.saveTool(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @ApiOperation(value = "Deletes a tool", nickname = "DELETE", notes = "", tags={ "tool", })
    @ApiResponses(value = @ApiResponse(code = 400, message = "Invalid ID supplied"))
    @RequestMapping(value = "/{toolId}",
            produces = { "application/json" },
            method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteTool(@ApiParam(value = "Tool id to delete", required = true) @PathVariable(value = "toolId") Long toolId) {
        try {
            toolService.deleteById(toolId);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);    
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @ApiOperation(value = "Finds tools by id", nickname = "GET", notes = "Multiple status values can be provided with comma separated strings", response = Tool.class, responseContainer = "List", tags={ "tool", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = Tool.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Invalid status value") })
    @RequestMapping(value = "/{toolId}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<Tool> findByToolId(@ApiParam(value = "Status values that need to be considered for filter", required = true)  @PathVariable(value = "toolId") Long toolId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Tool>(toolService.getToolById(toolId), HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Tool>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<Tool>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ApiOperation(value = "Update an existing tool", nickname = "PUT", notes = "", tags={ "tool", })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Tool not found"),
            @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/{toolId}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    public ResponseEntity<Void> updateTool(
        @ApiParam(value = "Tool object that needs to be added" ,required=true )  @RequestBody Tool body,
        @ApiParam(value = "Tool object that needs to be added" ,required=true ) @PathVariable(value = "toolId") Long toolId) {

        if (toolId != body.getToolId()) {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }

        try {
            toolService.updateTool(body);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
