# Write your MySQL query statement below
SELECT ROUND(
    COUNT(DISTINCT a1.player_id) /
    (SELECT COUNT(DISTINCT player_id) FROM Activity),
    2
) AS fraction
FROM Activity a1
JOIN Activity a2
    ON a1.player_id = a2.player_id
    AND DATEDIFF(a1.event_date, a2.event_date) = 1
JOIN (
    SELECT player_id, MIN(event_date) AS first_date
    FROM Activity
    GROUP BY player_id
) first_login
    ON a2.player_id = first_login.player_id
    AND a2.event_date = first_login.first_date;
