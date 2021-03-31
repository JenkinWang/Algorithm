package com.jenkin.algorithm.linkedList;

/**
 * @Author: wangyb
 * @Date: 3/31/21 1:47 PM
 * @Description: 环形链表
 */
public class HasCycle {

    /**
     * 快慢指针
     *
     * @param head
     * @return
     */
    public static boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }

        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}

class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}