package code_11_20;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * ContainerWithMostWater_11 Tester.
 *
 * @author brian.shen
 * @version 1.0
 * @since ${DATE}  ${TIME}
 */
public class ContainerWithMostWater_11Test {
    private ContainerWithMostWater_11 container;
    @Before
    public void before() throws Exception {
        container = new ContainerWithMostWater_11();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: maxArea(int[] height)
     */
    @Test
    public void testMaxArea() throws Exception {
        int[] height = new int[] {1,3,4,1,2};
        int water = container.maxArea(height);
        System.out.println(water);
    }


} 
