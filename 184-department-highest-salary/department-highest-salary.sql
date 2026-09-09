# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary as Salary
from Department d
left join 
Employee e
on d.id=e.departmentId
WHERE (e.departmentId, e.salary) IN
(
    SELECT departmentId, MAX(salary)
    FROM Employee
    GROUP BY departmentId
);