package com.jenkin.algorithm.linkedList;

import java.util.Stack;

/**
 * @Author: Jenkin Wang
 * @Date: 3/30/21 2:48 PM
 * @Description: 回文链表
 */
public class IsPalindrome {

    /**
     * 使用快慢指针
     *
     * @param head
     * @return
     */
    public static boolean isPalindromeWithPointer(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        slow = reverseNode(slow);
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }

            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    /**
     * 反转链表
     *
     * @param head
     * @return
     */
    private static ListNode reverseNode(ListNode head) {
        ListNode node = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = node;
            node = head;
            head = next;
        }

        return node;
    }

    /**
     * 使用栈的方式：效率低
     *
     * @param head
     * @return
     */
    public static boolean isPalindromeWithStack(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode tmp = head;
        Stack<Integer> stack = new Stack<>();
        while (tmp != null) {
            stack.push(tmp.val);
            tmp = tmp.next;
        }

        while (!stack.empty()) {
            if (stack.pop() != head.val) {
                return false;
            }

            head = head.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        System.out.println(isPalindromeWithPointer(node));
    }
}
