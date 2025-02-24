package homework.many;

import homework.Person;

// 创建Student类，继承自Person类，代表学生，额外含有成绩属性
class Student extends homework.Person {
    private double score;

    // 构造方法，调用父类构造方法初始化继承自父类的属性，并初始化自己特有的成绩属性
    public Student(String name, int age, String sex, double score) {
        super(name, age, sex);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

