# Write your MySQL query statement below
SELECT name AS Employee
FROM Employee e
WHERE salary > (
    SELECT salary
    FROM Employee
    WHERE id = e.managerId
);

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna