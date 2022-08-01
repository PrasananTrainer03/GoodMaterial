select * from Emp;

-- Sum() : Perform sum operation on the given field

select sum(sal) from Emp;

-- avg() : Perform avg operation on the given field 

select avg(sal) from Emp; 

-- max() : Display's max. value 

select max(sal) from Emp;

-- min() : Display's the min. value 

select min(sal) from Emp;

-- count(*) : Display's total no.of records of a table 

select count(*) from Emp;

-- if you field name in count(), then it displays count of all not-null values of the field

select count(comm) from Emp;

select count(mgr) from emp;

