use practice9;

drop table if exists EmployNew;

create table EmployNew
(
   Empno INT,
   Name varchar(5),
   Basic numeric(3,2)
);

-- Add Primary Key on Empno Field

alter table EmployNew add Primary Key(empno);

desc EmployNew;

alter table EmployNew Modify Name varchar(20);

desc EmployNew;

alter table EmployNew Modify Basic Numeric(9,2);

Desc EmployNew;

Alter Table EmployNew Add Dept varchar(30);

Desc EmployNew;

Alter Table EmployNew add Desig varchar(30);

-- Add new Field status which of varchar(1)

Alter Table EmployNew Add Status varchar(1);

Alter Table EmployNew drop column status;

Desc EmployNew;

select * from EmployNew;