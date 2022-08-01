-- Date Functions

-- todays date 

select curdate();

-- todays time

select curtime();

-- dayOfweek : Displays the day of the week

select dayofweek(curdate());

-- dayname

select dayname(curdate());

-- addDate : Used to add no.of days/months/years to the given date

select adddate(Curdate(), INTERVAL 5 DAY);

select adddate(curdate(), INTERVAL 10 MONTH);