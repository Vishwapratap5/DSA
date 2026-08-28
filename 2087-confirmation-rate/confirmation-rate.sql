# Write your MySQL query statement below
select s.user_id,
case 
   when round(
     SUM(c.action='confirmed')/count(c.user_id),2) is null then 0
    else
    round(
     SUM(c.action='confirmed')/count(c.user_id),2)  
end
as confirmation_rate 
from Signups s
left join 
Confirmations c
on s.user_id=c.user_id
group by s.user_id;