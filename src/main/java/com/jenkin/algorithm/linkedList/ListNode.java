package com.jenkin.algorithm.linkedList;

/**
 * @Author: Jenkin Wang
 * @Date: 3/30/21 2:22 PM
 * @Description: 单链表
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return val + " -> " + next;
    }
}
