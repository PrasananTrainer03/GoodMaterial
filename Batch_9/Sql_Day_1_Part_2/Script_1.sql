-- How to change to existing database 
use HexaBatch9;

-- Display list of tables avaialble in the current database 
Show Tables;

-- Display Structure of Dept table 

Desc Dept;

-- Display Structure of Emp Table 

Desc Emp;

-- Display all records from Emp table 

select * from Emp;

-- Display all records from Dept Table 

select * from Dept;

-- Display Empno, Ename,job, sal,mgr from Emp table 

select Empno, Ename, Job, Sal, Mgr 
from Emp;

--  Where clause : Used to display filtered records 

-- Display all records from Emp whose empno is 7900

select * from Emp where empno=7900;

-- Display all records from Emp whose Sal > 2000

select * from Emp where sal > 2000;

-- Display information whose Ename is 'KING' 

select * from Emp where Ename='KING';

-- Display all reords whose job is 'CLERK' 

select * from Emp where job='CLERK';

-- Between...AND : Used to dispaly records from start to end range 

-- Display all records whose sal from 1000 to 2000

select * from Emp 
where sal between 1000 and 2000;

-- Display all records whose Sal not between 1000 and 2000 

select * from Emp 
where sal not between 1000 and 2000;

-- IN clause : Used to display multiple values of particular column attribute 

-- Display information whose Ename is SMITH or FORD or JONES 

select * from Emp where Ename IN('SMITH','FORD','JONES');

-- Display information whose Job is 'CLERK' or 'MANAGER' 

select * from Emp where Job in('CLERK','MANAGER');

-- Wild cards : % and _ are known as wild cards

-- Display all records whose Ename starts with 'S'

select * from Emp where ename like 'S%';

-- Display all records whose Ename starts with 'J'

select * from Emp where ename like 'j%';

-- Display all reords whose Ename ends withh 'S' 

select * from Emp where ename like '%S';

-- Display all records whose Ename starts with 'J' and 5th character is 'S' 

select * from Emp where Ename like 'J___S';

-- Order By : Used to display records w.r.t. Specific field(s) in ascending or descending order 

select Empno, Ename, job, sal, mgr from Emp
Order By Job;

select Empno, Ename, job, sal, mgr from Emp 
order by sal desc;

select Empno, Ename, job, sal, mgr from Emp
Order By Job, Ename;

select Empno, Ename, job, sal, mgr from Emp
order by job, Ename desc;

-- Dispaly all records whose comm is null

select * from Emp where comm is null;

-- Display all records whose mgr is null

select * from Emp where mgr is null;

