package homework;

// 创建Person类，代表一般的人，包含姓名、年龄、性别属性以及吃饭的方法
public class Person {
    private String name;
    private int age;
    private String sex;

    // 构造方法，用于初始化Person对象的属性
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // 吃饭的方法
    public void eat() {
        System.out.println(name + "正在吃饭");
    }

    // 以下是各个属性的Getter和Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

// 创建Student类，继承自Person类，代表学生，额外含有成绩属性
public class Student extends Person {
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

// 创建Teacher类，继承自Person类，代表老师，额外含有工资属性
public class Teacher extends Person {
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

// 创建测试类，用于创建Student和Teacher对象，并调用eat()方法输出在吃饭的信息
public class work_one {
    public static void main(String[] args) {
        // 创建Student对象，传入姓名、年龄、性别和成绩信息
        Student student = new Student("祁海涛", 19, "男", 99.5);
        // 调用Student对象的eat()方法
        student.eat();

        // 创建Teacher对象，传入姓名、年龄、性别和工资信息
        Teacher teacher = new Teacher("杜姣姣", 30, "女", 85000.0);
        // 调用Teacher对象的eat()方法
        teacher.eat();
    }
}