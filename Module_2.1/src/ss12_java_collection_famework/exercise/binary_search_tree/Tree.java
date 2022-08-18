package ss12_java_collection_famework.exercise.binary_search_tree;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();
    void postorder();
}
