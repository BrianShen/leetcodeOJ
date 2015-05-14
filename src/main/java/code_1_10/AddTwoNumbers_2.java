package code_1_10;

import java.util.ArrayList;
import java.util.List;

/**
 * author: brian.shen  brian.shen@dianping.com
 * description:
 * date: 2015/5/13  14:29
 * discription:You are given two linked lists representing two non-negative numbers.
 *  The digits are stored in reverse order and each of their nodes contain a single digit.
 *  Add the two numbers and return it as a linked list.
 *  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *  Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = null;
        List<ListNode> list = new ArrayList<ListNode>();
        int inc = 0;
        while (l1 != null && l2 != null) {
            int bitSum = l1.val + l2.val + inc;
            inc = bitSum < 10 ? 0 : bitSum / 10;
            if (sum != null) {
                list.add(new ListNode(bitSum < 10 ? bitSum : bitSum % 10));
            } else {
                sum = new ListNode(bitSum < 10 ? bitSum : bitSum % 10);
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode tempNotNull = l1 == null ? l2 : l1;
        while (tempNotNull!= null) {
            int bitSum = tempNotNull.val + inc;
            inc = bitSum < 10 ? 0 : bitSum / 10;
            list.add(new ListNode(bitSum < 10 ? bitSum : bitSum % 10));
            tempNotNull = tempNotNull.next;
        }
        if (inc > 0) {
            list.add(new ListNode(inc));
        }
        for (int i = 0;i < list.size() - 1;i ++) {
            list.get(i).next = list.get(i + 1);
        }
        if (list.size() > 0) {
            sum.next = list.get(0);
        }

        return sum;
    }
    
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(val);
        ListNode temp = next;
        while (temp != null) {
            sb.append("->" + temp.val);
            temp = temp.next;
        }
        return sb.toString();
    }
}
