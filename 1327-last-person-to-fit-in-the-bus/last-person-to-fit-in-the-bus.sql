# Write your MySQL query statement below
WITH CumulativeWeight AS (
    SELECT person_name, turn, SUM(weight) OVER (ORDER BY turn ASC) AS Total_Weight FROM Queue
)
SELECT person_name FROM CumulativeWeight WHERE Total_Weight <= 1000
ORDER BY turn DESC LIMIT 1;