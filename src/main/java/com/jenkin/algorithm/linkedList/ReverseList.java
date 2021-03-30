package com.jenkin.algorithm.linkedList;

import java.util.Stack;

/**
 * @Author: Jenkin Wang
 * @Date: 3/30/21 2:34 PM
 * @Description: 反转链表，利用栈的特性
 */
public class ReverseList {

    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        if (stack.empty()) {
            return null;
        }

        ListNode listNode = stack.pop();
        ListNode resultNode = listNode;
        while (!stack.empty()) {
            listNode.next = stack.pop();
            listNode = listNode.next;
        }

        listNode.next = null;
        return resultNode;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(node);
        System.out.println(reverseList(node));
    }
}
