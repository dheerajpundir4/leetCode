package DSA;


 // Definition for binary tree

import java.util.ArrayList;

class TreeNode {

      int val;

      TreeNode left;

      TreeNode right;

      TreeNode(int x) {

       val = x;

       left=null;

       right=null;

      }
 }


 class Solution {

    public ArrayList<Integer> recoverTree(TreeNode A) {

        ArrayList<Integer> ans=new ArrayList<Integer>();

        TreeNode cur=A,prev=null,first=null,second=null;

        while(cur!=null){

            if(cur.left==null){

                if(prev!=null && cur.val<prev.val){

                    if(first==null){

                        first=prev;

                        second=cur;

                    }
                    else{ second=cur;
                    }

                }

                prev=cur;

                cur=cur.right;

            }

            else{

                TreeNode temp=cur.left;

                while(temp.right!=null && temp.right!=cur){
                    temp=temp.right;
                }

                if(temp.right==null){
                    temp.right=cur;
                    cur=cur.left;
                } else {
                    temp.right = null;
                }

                    if(prev!=null && cur.val<prev.val){

                        if(first==null){

                            first=prev;

                            second=cur;

                        }

                        else second=cur;

                    }

                    prev=cur;

                    cur=cur.right;

                }

            }

        }

        ans.add(Math.min(first.val,second.val));

        ans.add(Math.max(first.val,second.val));

        return ans;

    }

}
public class Moris {
}
