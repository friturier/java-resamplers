package org.ruivieira.resamplers;

import org.ruivieira.resamplers.utils.ResamplerUtils;

public class Stratified implements Resampler {

    public int[] resample(double[] weights) {

        final int N = weights.length;

        double[] nweights = ResamplerUtils.normalize(weights, ResamplerUtils.sum(weights));

        double[] Q = ResamplerUtils.cumulativeSum(nweights);

        int[] indices = new int[N];

        final double[] T = ResamplerUtils.linearSpace(0.0, 1.0 - 1.0/(float) N, N);

        for (int i = 0 ; i < N ; i++) {
            T[i] += Math.random() / (float) N;
        }

        int i = 0;
        int j = 0;

        while (i < N && j < N) {
            while (Q[j] < T[i]) {
                j += 1;
            }
            indices[i] = j;
            i += 1;
        }

        return indices;

    }


}
