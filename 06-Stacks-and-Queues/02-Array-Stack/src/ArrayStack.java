public class ArrayStack<E> implements Stack<E> {

    private Array<E> array;  // 这种模式叫做组合模式 array的功能比较多，栈只要复用其中栈需要的功能就够了

    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayStack(){   // 要是不给初始的栈指定大小，那就采取底层数组默认的大小
        array = new Array<>();
    }

    @Override
    public int getSize(){
        return array.getSize();
    }

    @Override
    public boolean isEmpty(){
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public void push(E e){
        array.addLast(e);
    }

    @Override
    public E pop(){
        return array.removeLast(); // 因为栈只能从栈顶取出元素，对应数组就是数组的末尾
    }

    @Override
    public E peek(){  // 看一眼元素
        return array.getLast();  // 对应数组就是查看一下数组的最后一个元素
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] top");
        return res.toString();
    }
}
