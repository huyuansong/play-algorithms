public interface Queue<E> {
    // 基础功能
    int getSize();
    boolean isEmpty(); 

    // 特有功能
    void enqueue(E e);
    E dequeue();
    E getFront();
}
