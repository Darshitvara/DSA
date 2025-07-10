public class LinkedList{
    public static void main(String[] args) {
        Node head = new Node();
        Node node1 = new Node(34);
        Node node2 = new Node(66);
        Node node3 = new Node(11);
        Node node4 = new Node(75);
        Node node5 = new Node(90);

        // Linking the nodes
        head.next = node1;  
        node1.next = node2;
        node2.next = node3; 
        node3.next = node4;
        node4.next = node5;

        printLL(head);

        System.out.println("Length of the linked list: " + llLength(head));

        int searchValue = 66;
        int position = searchLL(head, searchValue);
        if(position != -1) {
            System.out.println("Value " + searchValue + " found at position: " + position);
        } else {
            System.out.println("Value " + searchValue + " not found in the linked list.");
        }
        
        
        
        

    }
    // Traversing the linked list
        public static void printLL(Node head) {
            Node current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next; // Move to the next node
            }
            System.out.println(); // Print a new line after printing all nodes
        }
        // Function to calculate the length of the linked list
        public static int llLength(Node head) {
            int counter = 0; // Initialize a counter to count the nodes
            Node current = head;
            while(current != null){
                counter++; // Increment the counter for each node
                current = current.next; // Move to the next node
            }
            return counter;
        }
        // Function to search for a value in the linked list
        public static int searchLL(Node head,int value) {
            int counter = 0; // Initialize a counter to count the nodes
            Node current = head;
            while(current != null){
                counter++; // Increment the counter for each node
                if(current.data == value){
                    return counter;
                }
                current = current.next; // Move to the next node
            }
            return -1; // Return -1 if the value is not found
        }

    
}

class Node{
    int data;
    Node next;

    Node(){
        this.data = 0;
        this.next = null;
    }
    // Constructor to initialize the node with data
    Node(int data){
        this.data = data;
        this.next = null;
    }
}