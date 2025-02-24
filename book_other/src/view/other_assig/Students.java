package view.other_assig;

public class Students {
    public static class Student {
        public String name;
        public int age;
        public String school;

        public void printInfo() {
            System.out.println("姓名：" + name + "，年龄：" + age + "，学校：" + school);
        }
    }

    public static void main(String[] args) {
        Students outer = new Students();
        Students.Student student1 = new Students.Student();
        student1.name = "小猫头鹰";
        student1.age = 18;
        student1.school = "郑州信息工程职业学院";
        student1.printInfo();

        Students.Student student2 = new Students.Student();
        student2.name = "Young Owl";
        student2.age = 18;
        student2.school = "郑州信息工程职业学院B";
        student2.printInfo();

        Students.Student student3 = new Students.Student();
        student3.name = "Catherine Erin";
        student3.age = 18;
        student3.school = "郑州信息工程职业学院C";
        student3.printInfo();
    }
}