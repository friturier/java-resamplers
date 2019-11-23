package org.ruivieira.resamplers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StratifiedTest {

    @Test
    void resample() {

        double[] weights = new double[100];

        for (int i = 0 ; i < 100 ; i++) {
            weights[i] = Math.random();
        }

        Resampler mn = new Stratified();

        int[] indices = mn.resample(weights);

        System.out.println(Arrays.toString(indices));

        assertEquals(100, indices.length);


    }
}