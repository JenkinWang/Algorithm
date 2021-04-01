package com.jenkin.algorithm.tree;

/**
 * @Author: wangyb
 * @Date: 3/31/21 2:02 PM
 * @Description: 二叉搜索树的最大深度
 */
public class MaxDepth {

    /**
     * 递归
     *
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(treeNode);
        System.out.println(maxDepth(treeNode));
    }
}
