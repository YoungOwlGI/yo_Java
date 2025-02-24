package homework.many;

// 创建Person类，代表一般的人，包含姓名、年龄、性别属性以及吃饭的方法
class Person {
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

