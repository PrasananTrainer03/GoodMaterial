-- string functions

-- instr() : Displays the first occurrence of the given char. 

select instr('bhagyashree','a');

-- Length() : displays total no.of characters avaialble

select length('Bhagyashree');

select ename, length(ename) from Emp;

-- Reverse() : Displays the string in reverse order 

select reverse('Soham');

select ename, reverse(ename) from Emp;

-- left() : Displays no.of left-side chars 

select ename, left(ename,4) from Emp;

-- right() : Displays no.of right-side chars

select ename, right(ename,4) from Emp;

-- concat() : Concatenates multiple strings into a single string 

select concat('sumit',' ','patil');

select concat(ename,' ',job) from Emp;

-- replace() : Used to replace old-char/string with new-char/string in all occurrences

select replace('Java Training','Java','MySql');

-- substring() : used to display part of the string 

select substring('Welcome to Java',5,8);