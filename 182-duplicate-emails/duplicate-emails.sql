# Write your MySQL query statement below
-- select email as Email from Person where email not in (select distinct email from Person);

select email as Email from Person group by email having count(*) >1;