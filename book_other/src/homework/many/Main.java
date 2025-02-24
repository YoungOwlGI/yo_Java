package homework.many;

import homework.Student;
import homework.Teacher;

public class Main {
    public static void main(String[] args) {
        // 创建Student对象，传入姓名、年龄、性别和成绩信息
        homework.Student student = new homework.Student("祁海涛", 19, "男", 99.5);
        // 调用Student对象的eat()方法
        student.eat();

        // 创建Teacher对象，传入姓名、年龄、性别和工资信息
        homework.Teacher teacher = new homework.Teacher("杜姣姣", 30, "女", 85000.0);
        // 调用Teacher对象的eat()方法
        teacher.eat();
    }
}