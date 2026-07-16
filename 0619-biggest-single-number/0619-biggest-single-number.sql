# Write your MySQL query statement below
SELECT (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num)=1
    ORDER BY num DESC
    limit 1
) AS num;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna