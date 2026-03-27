# Write your MySQL query statement below
SELECT DISTINCT num AS ConsecutiveNums FROM (SELECT num,
LEAD(num,1) OVER (ORDER BY id) AS next_1,
LEAD(num,2) OVER (ORDER BY id) AS next_2
FROM Logs)temp
WHERE num = next_1 AND num = next_2;