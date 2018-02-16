package prasad.algorithms;

/**
 * Created by pputta on 1/28/18.
 */
public class Node {

    Node next = null;
    int data;
    public Node(int data){
        this.data = data;
    }
    void append(int data){
        Node node = new Node(data);
        this.next=node;
    }


}
