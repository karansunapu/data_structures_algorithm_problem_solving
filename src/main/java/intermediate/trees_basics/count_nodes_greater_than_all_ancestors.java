package intermediate.trees_basics;

public class count_nodes_greater_than_all_ancestors {

//    static int count;

    // Structure for the node of the tree
    static class Tree
    {
        int val;
        Tree left;
        Tree right;
        Tree(int _val)
        {
            val = _val;
            left = null;
            right = null;
        }
    };

    // Dfs Function
    static int dfs(Tree node, int maxx, int count)
    {
        // Base case
        if (node == null)
        {
            return count;
        }
        else
        {

            // Increment the count if the current
            // node's value is greater than the
            // maximum value in it's ancestors
            if (node.val > maxx)
                count++;

            // Left traversal
            count = dfs(node.left, Math.max(maxx, node.val), count);

            // Right traversal
            count = dfs(node.right, Math.max(maxx, node.val), count);

            return count;
        }
    }

    public static void main(String[] args)
    {
        Tree root = new Tree(4);
        root.left = new Tree(5);
        root.right = new Tree(2);
        root.right.left = new Tree(3);
        root.right.right = new Tree(6);

        // To store the required count;
        int count = 0;

        count = dfs(root, Integer.MIN_VALUE, count);

        System.out.print(count);
    }
}

