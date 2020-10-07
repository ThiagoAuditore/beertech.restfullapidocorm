DROP TABLE IF EXISTS tool;
 
CREATE TABLE tool (
  tool_Id INT AUTO_INCREMENT  PRIMARY KEY,
  tool_Name VARCHAR(250) NOT NULL
);
 
INSERT INTO tool (tool_Name) VALUES
  ('Jira'),
  ('Github'),
  ('Swagger');