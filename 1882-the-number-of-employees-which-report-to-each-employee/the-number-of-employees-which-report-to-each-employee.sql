# Write your MySQL query statement below
select m.employee_id, m.name,count(*) as reports_count,ROUND(avg(e.age)) as average_age
from Employees m
inner join 
Employees e
on m.employee_id=e.reports_to
group by e.reports_to
order by e.reports_to;
