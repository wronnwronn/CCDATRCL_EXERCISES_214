// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Create root node A
        Node President = new Node("Ronn Adia");
        // Create node B
        Node VicePresident = new Node("Alexander Du");
        // Create node C
        Node Secretary = new Node("Neil Rifarial");
        // Create node D
        Node Director  = new Node("Mycko Par");
        // Create node E
        Node ShareHolder = new Node("Jimuel Bustarde");
        // Create node F
        Node Supervisor = new Node("Gerald Gayetano");
        // Create node G
        Node CEO = new Node("Cymon Mopera");
       

        // Set left and right child of root node A
        President.left = VicePresident;
        President.right = Secretary;

        // Set left and right child of node B
        VicePresident.left = Director;
        VicePresident.right = ShareHolder;

        // Set left and right child of node C
        Secretary.left = Supervisor;
        Secretary.right = CEO; 

        // Traverse Preorder method
                System.out.print("\nIn order Traversal: ");
                traverseInOrder(President);

                System.out.print("\nPost order Traversal: ");
                traversePostOrder(President);
                System.out.print("\nPre order Traversal: ");
                traversePreOrder(President);
            } 
       
        static void traversePreOrder(Node node) {
            if (node != null) {
                System.out.print(" " + node.data);
                traversePreOrder(node.left);
                traversePreOrder(node.right);
            }  
        } 
                // Traverse Inorder Method
                static void traverseInOrder(Node node) {
                if (node != null) {
                traverseInOrder(node.left);
                System.out.print(" " + node.data);
                traverseInOrder(node.right);
        }
                }
        // Traverse Postorder method
                static void traversePostOrder(Node node) {
                if (node != null) {
                traversePostOrder(node.left);
                traversePostOrder(node.right);
                System.out.print(" " + node.data);
        }
    } 
}
