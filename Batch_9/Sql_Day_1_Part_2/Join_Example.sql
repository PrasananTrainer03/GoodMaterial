select Dept.Deptno,Dname,Empno,Ename,job,sal
from Dept, Emp 
Where Dept.Deptno=Emp.Deptno;

-- Inner Join : Acts as an intersect operator, used to extract only the common records from the given table(s) 

select Dept.Deptno,Dname,Empno,Ename,job,sal
from Dept INNER JOIN Emp 
ON Dept.Deptno=Emp.Deptno;

-- The above query using alias

select D.Deptno,Dname,Empno,Ename,job,sal
from Dept D INNER JOIN Emp E 
ON D.Deptno=E.Deptno;

-- Inner Join w.r.t. 3 tables 

select A.AgentID,FirstName,LastName,City,State,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A INNER JOIN AgentPolicy AP 
ON A.AgentID = AP.AgentID 
INNER JOIN Policy P ON 
P.PolicyID = AP.PolicyID;

-- Example for Outer Joins 

-- Left Outer Join

select D.Deptno,Dname,Empno,Ename,job,sal
from Dept D INNER JOIN Emp E 
ON D.Deptno=E.Deptno;

select D.Deptno,Dname,Empno,Ename,job,sal
from Dept D LEFT JOIN Emp E 
ON D.Deptno=E.Deptno;

select A.AgentID,FirstName,LastName,City,State,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A LEFT JOIN AgentPolicy AP 
ON A.AgentID = AP.AgentID 
LEFT JOIN Policy P ON 
P.PolicyID = AP.PolicyID;

-- Right Outer Join : All records from right-side table, and matching records from left-side table. if any field
-- value not avaialble, then it would be replaced with NULL keyword

select D.Deptno,Dname,Empno,Ename,job,sal
from Dept D RIGHT JOIN Emp E 
ON D.Deptno=E.Deptno;

select A.AgentID,FirstName,LastName,City,State,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A RIGHT JOIN AgentPolicy AP 
ON A.AgentID = AP.AgentID 
RIGHT JOIN Policy P ON 
P.PolicyID = AP.PolicyID;

