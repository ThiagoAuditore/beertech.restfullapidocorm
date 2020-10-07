DROP TABLE IF EXISTS tool;
 
CREATE TABLE tool (
  toolId INT AUTO_INCREMENT  PRIMARY KEY,
  toolName VARCHAR(250) NOT NULL
);
 
INSERT INTO tool (toolName) VALUES
  ('Jira'),
  ('Github'),
  ('Swagger');