package org.geekbrains;

import java.util.LinkedList;
import java.util.List;

public class Hw3 {
    public List<String> binaryTreePaths(TreeNode root) {

        if (root == null) {
            return new LinkedList<String>();
        }

        if (root.left == null && root.right == null) {
            List<String> path = new LinkedList<>();
            path.add(String.valueOf(root.val));
            return path;
        }

        List<String> leftPath = binaryTreePaths(root.left);
        List<String> rightPath = binaryTreePaths(root.right);

        for(int i = 0; i < leftPath.size(); i++) {
            String s = leftPath.remove(i);
            s = root.val + "->" + s;
            leftPath.add(i, s);
        }

        for(int i = 0; i < rightPath.size(); i++) {
            String s = rightPath.remove(i);
            s = root.val + "->" + s;
            rightPath.add(i, s);
        }

        leftPath.addAll(rightPath);

        return leftPath;
    }
}
