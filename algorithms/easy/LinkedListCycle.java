package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/10/10.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode.next = listNode2;
        listNode2.next = listNode;
        if(linkedListCycle.hasCycle(listNode)) {
            System.out.print(1);

        }
        else if(!linkedListCycle.hasCycle(listNode)) {
            System.out.print(2);
        }
    }
}
