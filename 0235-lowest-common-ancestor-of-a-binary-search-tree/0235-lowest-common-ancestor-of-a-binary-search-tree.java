class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {

            // Both on left side
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }

            // Both on right side
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }

            // Split point found
            else {
                return root;
            }
        }

        return null;
    }
}