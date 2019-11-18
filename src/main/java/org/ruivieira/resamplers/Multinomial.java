package org.ruivieira.resamplers;

import org.ruivieira.resamplers.utils.ResamplerUtils;

public class Multinomial {


    public Multinomial() {

    }

    public int[] resample(double[] weights) {
        final int N = weights.length;

        double[] nweights = ResamplerUtils.normalize(weights, ResamplerUtils.sum(weights));

        double[] Q = ResamplerUtils.cumulativeSum(nweights);

        int[] indices = new int[N];
        int i = 0;

        while (i < N) {
            double sample = Math.random();
            int j = 0;
            while (Q[j] < sample) {
                j += 1;
            }
            indices[i] = j;
            i += 1;
        }

        return indices;
    }

}
