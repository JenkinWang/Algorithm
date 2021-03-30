package com.jenkin.algorithm.linkedList;

/**
 * @Author: Jenkin Wang
 * @Date: 3/30/21 2:40 PM
 * @Description: 合并两个有序链表
 */
public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode tmp = node;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }

            tmp = tmp.next;
        }

        tmp.next = l1 == null ? l2 : l1;
        return node.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println(node1);
        System.out.println(node2);
        System.out.println(mergeTwoLists(node1, node2));
    }
}
