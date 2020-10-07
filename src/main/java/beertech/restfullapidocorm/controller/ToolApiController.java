package beertech.restfullapidocorm.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.istack.NotNull;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-07T00:00:49.580Z")

@Controller
public class ToolApiController  {

    private static final Logger log = LoggerFactory.getLogger(ToolApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public ToolApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }


    @ApiOperation(value = "Add a new tool", nickname = "addTool", notes = "", tags={ "tool", })
    @ApiResponses(value = {
            @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/tool",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    public ResponseEntity<Void> addTool(@ApiParam(value = "Tool object that needs to be added" ,required=true )  @RequestBody Tool body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "Deletes a tool", nickname = "deleteTool", notes = "", tags={ "tool", })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Tool not found") })
    @RequestMapping(value = "/tool/findByToolId",
            produces = { "application/json" },
            method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteTool(@NotNull @ApiParam(value = "Tool id to delete", required = true) @RequestParam(value = "toolId", required = true) String toolId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "Finds tools by id", nickname = "findByToolId", notes = "Multiple status values can be provided with comma separated strings", response = Tool.class, responseContainer = "List", tags={ "tool", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = Tool.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Invalid status value") })
    @RequestMapping(value = "/tool/findByToolId",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<List<Tool>> findByToolId(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true)  @RequestParam(value = "toolId", required = true) String toolId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Tool>>(objectMapper.readValue("[ {  \"toolId\" : 0,  \"toolName\" : \"toolName\"}, {  \"toolId\" : 0,  \"toolName\" : \"toolName\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Tool>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Tool>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "Update an existing tool", nickname = "updateTool", notes = "", tags={ "tool", })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Tool not found"),
            @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/tool",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    public ResponseEntity<Void> updateTool(@ApiParam(value = "Tool object that needs to be added" ,required=true )  @RequestBody Tool body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
