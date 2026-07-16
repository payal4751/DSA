# Write your MySQL query statement below
SELECT player_id,min(event_date) as first_login
FROM Activity
GROUP BY player_id

# Complexity Analysis:
# Time Complexity: O(N) where N is the number of rows in the Activity table.
# Space Complexity: O(P) where P is the number of unique players.
# This is the optimal complexity for this problem.

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna