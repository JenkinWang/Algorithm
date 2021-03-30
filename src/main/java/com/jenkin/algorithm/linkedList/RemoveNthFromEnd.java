package com.jenkin.algorithm.linkedList;

/**
 * @Author: Jenkin Wang
 * @Date: 3/30/21 2:30 PM
 * @Description: 删除链表的倒数第N个节点
 */
public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmpNode = head;
        int count = 0;
        while (tmpNode != null) {
            ++count;
            tmpNode = tmpNode.next;
        }

        ListNode node = new ListNode(0, head);
        ListNode curNode = node;
        for (int i = 0; i < count - n; i++) {
            curNode = curNode.next;
        }
        curNode.next = curNode.next.next;
        return node.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(node);
        System.out.println(removeNthFromEnd(node, 2));
    }
}
