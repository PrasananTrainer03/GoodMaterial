select * from Agent
where agentiD <> ALL(select AgentID from AgentPolicy);

select * from Policy 
where PolicyID <> ALL (select PolicyID from AgentPolicy);

select * from Agent 
where AgentID = ANY(select AgentID From AgentPolicy);

select * from Policy 
Where PolicyID = ANY(Select PolicyID from AgentPolicy);