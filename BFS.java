import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
    static public class Tree {

        int data;
        Tree left, right;

        public Tree(int key) {
            data = key;
            left = right = null;
        }

        public int getValue() {
            return this.data;
        }

    }

    public static Tree search(int value, Tree root) {
        Queue<Tree> queue = new ArrayDeque<>();
        queue.add(root); // first we add the root node as the
        // only member of the queue

        while (!queue.isEmpty()) {

            System.out.print("Current queue: ");
            for (Tree item : queue) {
                System.out.print(item.getValue() + " ");
            }
            System.out.println();

            Tree currentNode = queue.remove(); // we remove the first node in queue
            // and save it as currentNode
            

            // check for "win" condition
            if (currentNode.getValue() == value) {
                System.out.println("Finished searching!");
                return currentNode;
            }
            // if we did not find the value we are looking for..
            // add all children to the queue in order

            if (currentNode.left != null) {
                queue.add(currentNode.left);

            }

            /* add right right child to the queue */
            if (currentNode.right != null) {
                queue.add(currentNode.right);

            }

        }

        return null;
    }

    public static void main(String[] args) {

        Tree root = new Tree(0);
        root.left = new Tree(1);
        root.right = new Tree(2);
        root.left.left = new Tree(3);
        root.left.right = new Tree(4);

        Tree foundNode = search(2, root); // BFS search

        if (foundNode != null) { 
            System.out.print("Found value: ");
            System.out.print(foundNode.getValue());
        } else {
            System.out.println("Found nothing!");
        }

    }
}