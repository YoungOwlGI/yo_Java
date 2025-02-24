package homework.many;

import homework.Person;

// 创建Teacher类，继承自Person类，代表老师，额外含有工资属性
class Teacher extends Person {
    private double salary;

    // 构造方法，调用父类构造方法初始化继承自父类的属性，并初始化自己特有的工资属性
    public Teacher(String name, int age, String sex, double salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}