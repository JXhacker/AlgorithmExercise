package LeetCode.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanzhiwen
 * @time 2019/3/4
 */
public class q94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        inorder(ans,root);
        return ans;
    }
    public void inorder(List list,TreeNode root){
        if (root==null)return;
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
    }

}
