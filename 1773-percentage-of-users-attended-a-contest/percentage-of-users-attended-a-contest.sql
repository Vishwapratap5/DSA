# Write your MySQL query statement below
select r.contest_id,ROUND(
    (count(r. user_id)/(SELECT COUNT(*) from Users)*100),2) as percentage
from 
Register r
group by r.contest_id
Order by percentage DESC,r.contest_id asc;