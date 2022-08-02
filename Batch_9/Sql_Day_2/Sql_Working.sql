select * from Emp;

-- Display the max. salary from Emp table

select max(sal) from Emp;

-- Display Employ Name, who is getting max. salary 

select ename from Emp where sal =
(select max(sal) from Emp);

-- Display the 2nd max. salary 

select max(sal) from emp where sal < (select max(sal) from Emp);

-- Dispaly Employ name who is getting 2nd max. salary 

select ename from Emp where sal=
(select max(sal) from Emp where sal < (select max(sal) from Emp));

select max(annualpremium) from policy;

-- Display policyId for which we are collecting max. annualpremium 

select policyId from policy where annualpremium = (select max(annualpremium) from policy);

-- Display 2nd max. annual premium 

select max(annualpremium) from Policy where annualPremium < (select 
max(annualpremium) from Policy);

select sal from emp e1 where 4-1=(select count(distinct sal) from emp e2 
where e2.sal > e1.sal);

-- Display all common departments from Dept and Emp tables 

select * from Dept where deptno = ANY(select deptno from Emp);

-- Display Idle Departments means (which exists in Dept table, but not in Emp Table) 

select * from Dept where deptno <> ALL(select deptno from Emp);
							-- Deptno <> 10 AND DeptNo <> 20 AND DeptNo <> 30
                            
-- Display Common agent records from Agent and AgentPolicy Tables (means agentId exists 
-- agent table, but not in AgentPolicy Table)

select * from Agent where AgentId = Any(select AgentID from AgentPolicy);

-- Display Idle Agents (Which are in Agent Table, but not there in AgentPolicy Tables) 

select * from Agent where AgentID <> ALL(select AgentId from AgentPolicy);

-- Display Common Policy Records from Policy and AgentPolicy Tables (means PolicyID exists
-- in Policy Table, but not in AgentPolicy Table)

select * from Policy where PolicyId = ANY(select PolicyID from AgentPolicy);

-- Display Idle Policies (which exists in Policy table, but not in AgentPolicy Table) 

select * from Policy where PolicyID <> ALL(select PolicyId from AgentPolicy);
