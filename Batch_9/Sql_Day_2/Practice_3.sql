Drop database if exists lms9;

create database lms9;

use lms9;


Drop Table if exists LeaveDetails;

Drop Table If Exists Employe;

/* *******************************************************************************
						Creating Employee Table 
   *******************************************************************************
*/

create table Employee
(
   Empno INT Primary Key,
   FirstName varchar(30),
   LastName varchar(30),
   Dob Date,
   MgrNo INT,
   LeaveAvailable INT,
   Email varchar(30),
   PhoneNo varchar(12)
);

/*  *****************************************************************************
						Insert into Employee Table 
	*****************************************************************************
*/

Insert into Employee(Empno,FirstName,LastName,Dob,MgrNo,LeaveAvailable,Email,
PhoneNo) values(1000,'Sumit','Chaurasia','2000-12-12',NULL,21,'sumit@gmail.com',
'884823554'),
(2000,'Sujana','Shree','1999-12-23',1000,19,'sujana@gmail.com','84828543'),
(3000,'Sushrut','Magdum','2000-11-12',1000,21,'sushrut@gmail.com','848235234'),
(4000,'Srinivas','CV','2000-12-22',2000,21,'srinivas@gmail.com','848235334'),
(5000,'Sravya','Gunda','2000-12-21',3000,22,'sravya@gmail.com','48823523');

select * from Employee;

/*  ******************************************************************************
						Creating LeaveDetails Table 
	******************************************************************************
*/

Drop Table if exists LeaveDetails;

Create Table LeaveDetails
(
   LeaveID INT auto_increment Primary Key,
   Empno INT references Employee(Empno),
   LeaveStartDate Date,
   LeaveEndDate Date,
   NoOfDays INT,
   LeaveReason varchar(30),
   LeaveType ENUM('EL','PL','ML'),
   LeaveStatus ENUM('PENDING','ACCEPTED','REJECTED') default 'PENDING',
   ManagerComments varchar(30)
);

select * from LeaveDetails;

Insert into LeaveDetails(Empno,LeaveStartDate,LeaveEndDate,LeaveReason,LeaveType,
		ManagerComments) 
	values(1000,'2022-12-12','2022-12-23','SICK','EL','Proceed'),
		   (2000,'2022-12-23','2022-12-26','Trip','PL','Enjoy');
	
select * from LeaveDetails;