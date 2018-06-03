package object_info;

/**
 * Created by Mingpoint on 2018/6/3.
 *
 * @Description:
 */
public class Student implements Comparable<Student>{
    String name;                                 //姓名
    int score;                                   //某门课程成绩

    public Student(String name, int score)       //构造方法
    {
        this.name = name;
        this.score = score;
    }

    public String toString()                     //返回对象的描述字符串，形式为“(,)”。覆盖
    {
        return "("+this.name+","+this.score+")";
    }

    public boolean equals(Object obj)            //比较对象是否相等，仅比较name，意按name识别Student对象。覆盖
    {
        return this==obj || (obj instanceof Student) &&  this.name.equals(((Student)obj).name);
        //调用String类的equals(Object)方法，比较两串是否相等
    }

    public int compareTo(Student stu)            //比较对象大小，实现Comparable<T>接口
    {
        return this.score - stu.score;           //按成绩比较对象大小
    }
}
