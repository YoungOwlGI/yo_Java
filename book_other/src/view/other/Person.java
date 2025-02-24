package view.other;

import java.util.Scanner;

public class Person {
    public String name;
    public String sex;
    public int age;
    public void eat() {
        System.out.println("I am eating");
    }
    public void sleep() {
        System.out.println("I am sleeping");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Person 类对象测试：");
        System.out.print("Enter your name: ");
        person.name = input.nextLine();
        System.out.print("Enter your sex (M/F): ");
        person.sex = input.next();
        System.out.print("Enter your age: ");
        person.age = input.nextInt();
        System.out.println("Person 类对象信息如下：");
        System.out.println("\t姓名\t\t性别\t\t年龄 ");
        System.out.println("\t" + person.name + "\t\t" + person.sex + "\t\t" + person.age);
        System.out.println("Person 类对象正在做一些事情...如下：");
        person.eat();
        person.sleep();
    }
}
