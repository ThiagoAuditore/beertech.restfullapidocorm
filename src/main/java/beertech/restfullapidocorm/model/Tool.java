package beertech.restfullapidocorm.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Tool
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-07T00:00:49.580Z")
@JsonSerialize
@Entity
public class Tool {
  
  @Id
  @JsonProperty("toolId")
  private Long toolId ;

  @JsonProperty("toolName")
  private String toolName;

  public Tool toolId(Long toolId) {
    this.toolId = toolId;
    return this;
  }
  public Tool toolName(String toolName) {
    this.toolName = toolName;
    return this;
  }

  public Long getToolId() {
    return toolId;
  }

  public void setToolId(Long toolId) {
    this.toolId = toolId;
  }

  public String getToolName() {
    return toolName;
  }

  public void setToolName(String toolName) {
    this.toolName = toolName;
  }

}

