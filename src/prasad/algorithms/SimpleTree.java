package prasad.algorithms;

/**
 * Created by 153608 on 5/1/2017.
 */
public class SimpleTree<T extends Comparable > {
    T value;
    SimpleTree<T> left;
    SimpleTree<T> right;


    void insert(SimpleTree<Integer> toInsert){

    }



public static void main(String [] args){
    SimpleTree<Integer> tree = new SimpleTree<>();
    tree.value = 23;
    tree.left = new SimpleTree<>();
    tree.right = new SimpleTree<>();
    tree.left.value = 20;
    tree.right.value = 18;
}


}


