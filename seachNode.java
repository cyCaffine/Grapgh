public class seachNode {
    public Node search(int root, int key){

        // base case:  root is null or key is present at root
        if(root == null || root.key == key){
            return root;
        }
        // if value is greater then root
        if(root.key > key){
           return search(root.left, key);
        }

        // else value is less than root

        return search(root.right, key);

    }
}
