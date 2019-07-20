/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycodingchallange;

public class DAY8 {

    
    public static void main(String[] args) {
        Universal univ=new Universal();
        univ.isUniv(root);//root is the root of the given tree.
    }
    
}
class Universal
{
    int leaf=0,k=0;
    Universal root=null;
        int val;
        Universal left,right;
    Universal(int va)
    {
        val=va;
        left=right=null;
    }
    Universal()
    {
        
    }
    
    void isUniv(Universal root)
    {
        int noOfUniv=FindUniversal(root,root.val);
        System.out.println("NoOf Universal tree in the given tree is:"+noOfUniv);
    }
    int FindUniversal(Universal root,int val)
    {
        if(root==null)
            return 0;
        boolean isUniv=true;
        if(left!=null&&left.val!=val)
            isUniv=false;
         if(right!=null&&right.val!=val)
            isUniv=false;
         if(isUniv==true)
             return(FindUniversal(root.left,left.val)+FindUniversal(root.right,right.val)+1);
         else
             return(FindUniversal(root.left,left.val)+FindUniversal(root.right,right.val));
    }
}
