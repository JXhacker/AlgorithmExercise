package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/2
 */

class treeNode {
    char data;
    treeNode lchild;
    treeNode rchild;

    treeNode(char data) {
        this.data = data;
    }
}

public class BinaryTraversal {
    private static int index = 1;

    private static void InOrder(treeNode tree) {
        if (tree.data == '#') return;
        InOrder(tree.lchild);
        System.out.print(tree.data + " ");
        InOrder(tree.rchild);
    }

    private static void buildTree(treeNode T, String s) {
        if (T.data != '#') {
            T.lchild = new treeNode(s.charAt(index++));
            buildTree(T.lchild, s);
            T.rchild = new treeNode(s.charAt(index++));
            buildTree(T.rchild, s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        treeNode t;
        while (sc.hasNext()) {
            s = sc.nextLine();
            if (s.length() == 0) {
                System.out.println();
            } else {
                t = new treeNode(s.charAt(0));
                buildTree(t, s);
                InOrder(t);
                System.out.println();
            }
            index = 1;
        }
    }
}