# Write your MySQL query statement below
select requester_id as id,COUNT(requester_id) as num 
from 
(select r.requester_id
from RequestAccepted r
UNION ALL
select a.accepter_id
from RequestAccepted a) as followers

group by requester_id
order by COUNT(requester_id) DESC limit 1;