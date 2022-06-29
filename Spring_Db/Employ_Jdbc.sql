drop database if exists hexawarenew;

create database hexawarenew;

use hexawarenew;

Create Table Employ
(
    Empno INT primary key, 
    name varchar(30),
    Gender ENUM('MALE','FEMALE'),
    Dept varchar(30),a
    Desig varchar(30),
    Basic numeric(9,2)
);

Insert into Employ(Empno,Name,Gender,Dept,Desig,Basic)
values(1,'Aishwarya','FEMALE','Java','Programmer',88224),
(2,'Krishna','MALE','SQL','DBA',88455),
(3,'MuraliKrishna','MALE','JAVA','Programmer',88144),
(4,'Nikita','FEMALE','Angular','Expert',99234),
(5,'Santosh','MALE','SQL','Programmer',88114);

select * from Employ;