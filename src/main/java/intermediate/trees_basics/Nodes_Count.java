package intermediate.trees_basics;

public class Nodes_Count {

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

    public static int count= 0;

    public static int solve(Tree A) {

        postOrder(A);
        return count;
    }

    public static void postOrder(Tree A) {

        if(A == null)
            return;

        postOrder(A.left);
        postOrder(A.right);

        count++;     // when reach root .. count++
    }

    public static void main(String[] args)
    {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.right.left = new Tree(4);
        root.right.left.right = new Tree(5);


        System.out.print(solve(root));
    }
}
