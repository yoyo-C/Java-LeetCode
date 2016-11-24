package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/10/10.
 */
public class RemoveDupFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        else if(head.next == null){
            return head;
        }
        else if(head.val == head.next.val){
            head.next = head.next.next;
            return deleteDuplicates(head);
        }
        else{
            head.next = deleteDuplicates(head.next);
            return head;
        }
    }
}

