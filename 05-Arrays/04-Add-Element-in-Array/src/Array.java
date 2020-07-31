
public class Array {

    private int[] data;
    private int size;  // 表示的是数据的大小，也就是元素的个数，对应索引就是下一个要存放新元素的位置，该位置目前为空

    // 构造函数，传入数组的容量capacity构造Array
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public Array(){
        this(10);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(int e){

//        if(size == data.length)
//            throw new IllegalArgumentException("AddLast failed. Array is full.");
//
//        data[size] = e;
//        size ++;
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(int e){
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, int e){

        if(size == data.length)
            throw new IllegalArgumentException("Add failed. Array is full.");

        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");

        // 最后一个元素的索引 size-1 ，由于新插入元素在index位置，index原来元素也要后移
        for(int i = size - 1; i >= index ; i --) 
            data[i + 1] = data[i];  // size < capacity 所以不会越界，后面的元素取前面元素的值(元素后移)

        data[index] = e; // index位置元素已经后移，可以被直接覆盖为新值e

        size ++;  // 插入新元素后，维护size的语义
    }

}
