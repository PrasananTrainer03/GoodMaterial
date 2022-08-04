select * from bank.accounts;

select * into accounts from bank.accounts;

use hexanew;

create table accounts as select * from bank.accounts;

select * from accounts;


select A.AccountNo,FirstName,LastName,City,TransAmount,TransDate
from accounts A INNER JOIN Bank.Trans T
ON A.AccountNo=T.AccountNo;


select A.AccountNo,FirstName,LastName,City,TransAmount,TransDate
from accounts A LEFT JOIN Bank.Trans T
ON A.AccountNo=T.AccountNo;
