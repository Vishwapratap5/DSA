# Write your MySQL query statement below
select p.product_id,
if(ROUND(SUM(u.units*p.price)/sum(u.units),2) is null ,0,ROUND(SUM(u.units*p.price)/sum(u.units),2)) as average_price
from
Prices p
left join
UnitsSold u
on 
p.product_id=u.product_id
AND 
u.purchase_date between p.start_date AND p.end_date
group by p.product_id;