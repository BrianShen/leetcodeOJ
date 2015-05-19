package code_1_10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * AddTwoNumbers_2 Tester.
 *
 * @author brian.shen
 * @version 1.0
 * @since ${DATE}  ${TIME}
 */
public class AddTwoNumbers_2Test {
    private AddTwoNumbers_2 addTwoNumbers_2;
    @Before
    public void before() throws Exception {
        addTwoNumbers_2 = new AddTwoNumbers_2();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: addTwoNumbers(ListNode l1, ListNode l2)
     */
    @Test
    public void testAddTwoNumbers() throws Exception {
        ListNode l11= new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(9);

        l21.next = l22;
        l22.next = l23;

        System.out.println(l11);
        System.out.println(l21);

        ListNode resultList = addTwoNumbers_2.addTwoNumbers(l11, l21);
        System.out.println(resultList);
        Assert.assertTrue(resultList != null);
        Assert.assertTrue(resultList.val == 7);
        Assert.assertTrue(resultList.next.val == 0);
        Assert.assertTrue(resultList.next.next.val == 3);

    }


} 
