# Write your MySQL query statement below
/*select p.email as Email
from Person p
inner join 
Person q  on
p.id=q.id
where p.email=q.email;*/

select p.email as Email
from Person p
group by p.email
having count(p.email)>1;