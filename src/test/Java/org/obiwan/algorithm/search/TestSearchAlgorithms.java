package org.obiwan.algorithm.search;

import org.junit.Assert;
import org.junit.Test;

public class TestSearchAlgorithms {

    private static Integer[] array;
    private static final Integer elementToSearch = 8;

    @Test
    public void linearSearchIntegerArrayTest() {
        array = new Integer[]{12, 2, 8, 5, 1, 6, 4, 15};
        ISearch<Integer> searchAlgorithm = new LinearSearch<>();
        int index = searchAlgorithm.search(array, elementToSearch);

        Assert.assertEquals(2, index);
        searchAlgorithm.print(elementToSearch, index);
    }

    @Test
    public void linearSearchFloatArrayTest() {
        Float[] floatArray = new Float[]{12.0f, 2.5f, 8.5f, 5.6f, 1.2f, 6.3f, 4.5f, 15.0f};
        Float elementToSearch = 8.5f;
        ISearch<Float> searchAlgorithm = new LinearSearch<>();
        int index = searchAlgorithm.search(floatArray, elementToSearch);

        Assert.assertEquals(2, index);
        searchAlgorithm.print(elementToSearch, index);
    }

    @Test
    public void linearSearchDoubleArrayTest() {
        Double[] doubleArray = new Double[]{12.0, 2.5, 8.5, 5.6, 1.2, 6.3, 4.5, 15.0};
        Double elementToSearch = 8.5;
        ISearch<Double> searchAlgorithm = new LinearSearch<>();
        int index = searchAlgorithm.search(doubleArray, elementToSearch);

        Assert.assertEquals(2, index);
        searchAlgorithm.print(elementToSearch, index);
    }

    @Test
    public void binarySearchIntegerArrayTest() {
        array = new Integer[]{1, 2, 4, 5, 6, 8, 12, 15};
        ISearch<Integer> searchAlgorithm = new BinarySearch<>();
        int index = searchAlgorithm.search(array, elementToSearch);

        Assert.assertEquals(5, index);
        searchAlgorithm.print(elementToSearch, index);
    }

    @Test
    public void binarySearchFloatArrayTest() {
        Float[] floatArray = new Float[]{1.0f, 2.0f, 4.0f, 5.0f, 6.0f, 8.0f, 12.0f, 15.0f};
        Float elementToSearch = 8.0f;
        ISearch<Float> searchAlgorithm = new BinarySearch<>();
        int index = searchAlgorithm.search(floatArray, elementToSearch);

        Assert.assertEquals(5, index);
        searchAlgorithm.print(elementToSearch, index);
    }

    @Test
    public void binarySearchDoubleArrayTest() {
        Double[] doubleArray = new Double[]{1.0, 2.0, 4.0, 5.0, 6.0, 8.0, 12.0, 15.0};
        Double elementToSearch = 8.0;
        ISearch<Double> searchAlgorithm = new BinarySearch<>();
        int index = searchAlgorithm.search(doubleArray, elementToSearch);

        Assert.assertEquals(5, index);
        searchAlgorithm.print(elementToSearch, index);
    }

}
