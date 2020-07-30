public class Student {

    private String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object student){

        if(this == student)  // 地址相同，则对象相同
            return true;

        if(student == null)  // 对象为空，则不相等
            return false;

        if(this.getClass() != student.getClass())  // 两个对象不是同一个类的实例，不相等
            return false;

        Student another = (Student)student;
        return this.name.equals(another.name);
    }
}
