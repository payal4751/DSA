class Solution {
    public double[] convertTemperature(double celsius) {
        double k=celsius + 273.15;
        double f=celsius * 1.80 + 32.00;

        return new double [] {k,f};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna