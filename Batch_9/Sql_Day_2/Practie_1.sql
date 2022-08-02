DROP Database if exists practice9;

create database practice9;

use practice9;

/* ************************************************************************************
					Creating Employ Table 
   ************************************************************************************
*/

Create Table Employ
(  
    Empno INT,
    Name varchar(30),
    Gender Enum('MALE','FEMALE'),
    Dept varchar(30),
    Desig varchar(30),
    Basic numeric(9,2)
);

/* *******************************************************************************
				        Insert into Employ Table 
   *******************************************************************************
*/

Insert into Employ(Empno,Name,Gender,Dept,Desig,Basic) 
values(1, 'Sivaprakash','MALE','Java','Programmer',84235),
	  (2,'Samhitha','FEMALE','Dotnet','Expert',85234),
      (3,'Srinivasa','MALE','Sql','Developer',84234),
      (4,'Sravya','FEMALE','Java','Programmer',85244),
      (5,'Sunil','MALE','Sql','Expert',84224);
      
select * from Employ;      