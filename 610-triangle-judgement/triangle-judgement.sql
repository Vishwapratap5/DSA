# Write your MySQL query statement below
select X,Y,Z,
case
    when ( (x+y<=z) || (x+z<=y) ||(z+y<=x) ) then 'No'
    else 'Yes'
end as triangle
from Triangle;