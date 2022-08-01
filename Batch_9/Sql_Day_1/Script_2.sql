select empno,ename,job,sal from Emp;

-- If Job is CLERK put Head as 'Soham'
-- if job is SALESMAN put HEAD as 'Sunil'
-- if Job is ANALYST put Head as 'Himaja'
-- if job is MANAGER put head as 'Srinivasa'
-- if job is PRESIDENT put as 'Swathi'

select empno, ename, job, sal,
case JOB
   WHEN 'CLERK' THEN 'Soham'
   WHEN  'SALESMAN' THEN 'Sunil'
   WHEN 'ANALYST' THEN 'HIMAJA'
   WHEN 'MANAGER' THEN 'Srinivasa'
   else  'SWATHI'
end 'Head' 
from Emp; 

select * from Dept;

-- if Dname is 'ACCOUNTING' THEN 'PUNE' 
-- if Dname is 'RESEARCH' THEN 'HYDERABAD'
-- if Dname is 'SALES' THEN 'CHENNAI'
-- if Dname is 'OPERATIONS' then 'DELHI' 

select Deptno, Dname,
CASE DNAME
  WHEN 'ACCOUNTING' THEN 'PUNE'
  WHEN 'RESEARCH' THEN 'HYDERABAD'
  WHEN 'SALES' THEN 'CHENNAI'
  WHEN 'OPERATIONS' THEN 'DELHI'
END 'City'
from Dept;

select empno, ename, job, sal, comm from Emp;

select empno, ename, job, sal,
case 
when comm is null then 0 else comm
end 'Updated'
from Emp;

-- Dispaly values as if comm is null then sal else sal+comm as 'TakeHome'

select empno, ename,job,sal,comm,
case 
  when comm is null then sal else 
		sal+comm 
end 'TakeHome'
From Emp;
