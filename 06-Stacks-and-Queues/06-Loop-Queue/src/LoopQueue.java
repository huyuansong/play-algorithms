public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front, tail;
    private int size;   // 有兴趣的同学，在完成这一章后，可以思考一下：
                        // LoopQueue中不声明size，如何完成所有的逻辑？
                        // 这个问题可能会比大家想象的要难一点点：）

    public LoopQueue(int capacity){
        data = (E[])new Object[capacity + 1]; // 用户期待能装入capacity个元素，在实现的原理上，需要空出一个位置区分头和尾
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getCapacity(){
        return data.length - 1;  // 有一个空余的位置，实际长度需要-1
    }

    @Override
    public boolean isEmpty(){
        return front == tail;   // tail指针指向的是最后一个元素的下一个位置，两个指针重叠表示为空，则为满的时候只能让数组空出来一个位置
    }

    @Override
    public int getSize(){
        return size;
    }

    // 下一小节再做具体实现
    @Override
    public void enqueue(E e){

    }

    // 下一小节再做具体实现
    @Override
    public E dequeue(){
        return null;
    }

    // 下一小节再做具体实现
    @Override
    public E getFront(){
        return null;
    }
}
