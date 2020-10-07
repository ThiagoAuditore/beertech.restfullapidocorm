package beertech.restfullapidocorm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Tool
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-07T00:00:49.580Z")


public class Tool   {
  @JsonProperty("toolId")
  private Long toolId = null;

  @JsonProperty("toolName")
  private String toolName = null;

  public Tool toolId(Long toolId) {
    this.toolId = toolId;
    return this;
  }

  /**
   * Get toolId
   * @return toolId
  **/
  @ApiModelProperty(value = "")


  public Long getToolId() {
    return toolId;
  }

  public void setToolId(Long toolId) {
    this.toolId = toolId;
  }

  public Tool toolName(String toolName) {
    this.toolName = toolName;
    return this;
  }

  /**
   * Get toolName
   * @return toolName
  **/
  @ApiModelProperty(value = "")


  public String getToolName() {
    return toolName;
  }

  public void setToolName(String toolName) {
    this.toolName = toolName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tool tool = (Tool) o;
    return Objects.equals(this.toolId, tool.toolId) &&
        Objects.equals(this.toolName, tool.toolName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolId, toolName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tool {\n");
    
    sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
    sb.append("    toolName: ").append(toIndentedString(toolName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

