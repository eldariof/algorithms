package ru.eabdrazakov.sort.mergesort;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for MergeSort.
 */
public class MergeSortTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MergeSortTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MergeSortTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testMergeSort()
    {
    	int[] arrayA = { 1, 2, 3 };
    	int[] arrayB = { 2, 3, 4, 5 };
    	MergeSort sorter = new MergeSort();
    	int[] result = sorter.intersect(arrayA, arrayB);
    	assertTrue(result.length == 2);
        assertTrue(result[0] == 2);
        assertTrue(result[1] == 3);
    }
}
