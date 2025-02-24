package north;

import java.util.*;

public class StudentManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n学生管理系统");
            System.out.println("1. 新增学生信息");
            System.out.println("2. 删除学生信息");
            System.out.println("3. 修改学生信息");
            System.out.println("4. 查询学生信息");
            System.out.println("5. 查询所有学生信息");
            System.out.println("6. 退出");
            System.out.print("请输入你的选择: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character after integer input

            switch (choice) {
                case 1:
                    // 新增学生信息
                    System.out.print("请输入学号: ");
                    String studentId = scanner.nextLine();
                    System.out.print("请输入姓名: ");
                    String name = scanner.nextLine();
                    System.out.print("请输入家庭住址: ");
                    String address = scanner.nextLine();
                    System.out.print("请输入电话号码: ");
                    String phoneNumber = scanner.nextLine();
                    Student newStudent = new Student(studentId, name, address, phoneNumber);
                    StudentUtils.addStudent(newStudent);
                    System.out.println("学生信息已新增！");
                    break;
                case 2:
                    // 删除学生信息
                    System.out.print("请输入要删除的学号: ");
                    String deleteId = scanner.nextLine();
                    StudentUtils.deleteStudent(deleteId);
                    System.out.println("学生信息已删除！");
                    break;
                case 3:
                    // 修改学生信息
                    System.out.print("请输入要修改的学号: ");
                    String updateId = scanner.nextLine();
                    Student existingStudent = StudentUtils.findStudent(updateId);
                    if (existingStudent != null) {
                        System.out.println("当前学生信息: " + existingStudent);
                        System.out.print("请输入新姓名: ");
                        String newName = scanner.nextLine();
                        System.out.print("请输入新家庭住址: ");
                        String newAddress = scanner.nextLine();
                        System.out.print("请输入新电话号码: ");
                        String newPhone = scanner.nextLine();
                        Student updatedStudent = new Student(updateId, newName, newAddress, newPhone);
                        StudentUtils.updateStudent(updateId, updatedStudent);
                        System.out.println("学生信息已修改！");
                    } else {
                        System.out.println("未找到该学号的学生！");
                    }
                    break;
                case 4:
                    // 查询学生信息
                    System.out.print("请输入要查询的学号: ");
                    String searchId = scanner.nextLine();
                    Student student = StudentUtils.findStudent(searchId);
                    if (student != null) {
                        System.out.println("学生信息: " + student);
                    } else {
                        System.out.println("未找到该学号的学生！");
                    }
                    break;
                case 5:
                    // 查询所有学生信息
                    List<Student> allStudents = StudentUtils.getAllStudents();
                    if (allStudents.isEmpty()) {
                        System.out.println("暂无学生信息！");
                    } else {
                        System.out.println("所有学生信息:");
                        for (Student s : allStudents) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 6:
                    // 退出程序
                    System.out.println("感谢使用学生管理系统，再见！");
                    scanner.close();
                    return;
                default:
                    System.out.println("无效选项，请重新选择！");
            }
        }
    }
}
