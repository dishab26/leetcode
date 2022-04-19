class Solution {
    int treeDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return treeDiameter;
    }
    
    public int height(TreeNode root) {
        if(root == null) return -1;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        int diameter = leftHeight + rightHeight + 2;
        if(diameter > treeDiameter)
            treeDiameter = diameter;
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
