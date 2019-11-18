package org.ruivieira.resamplers.utils;

public class ResamplerUtils {

    public static double sum(double[] weights) {
        double sum = 0.0;
        for (double weight : weights)
            sum += weight;
        return sum;
    }

    public static double[] normalize(double[] values, double factor) {
        double[] normalized = new double[values.length];
        for (int i = 0 ; i < values.length ; i++)
            normalized[i] = values[i] / factor;
        return normalized;
    }

    public static double[] cumulativeSum(double[] values) {
        double[] cumulative = new double[values.length];
        double total = 0.0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
            cumulative[i] = total;
        }
        return cumulative;
    }
}
