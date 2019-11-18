package org.ruivieira.resamplers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultinomialTest {

    @org.junit.jupiter.api.Test
    void resample() {

        double[] weights = new double[100];

        for (int i = 0 ; i < 100 ; i++) {
            weights[i] = Math.random();
        }

        Multinomial mn = new Multinomial();

        int[] indices = mn.resample(weights);

        assertEquals(100, indices.length);

    }
}