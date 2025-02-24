package north;

import java.io.*;
import java.util.*;

public class StudentInfo {

    private static final String FILE_NAME = "StudentInfo.txt";

    // 读取学生信息
    public static List<Student> readStudents() {
        List<Student> students = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return students;
        }
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    // 写入学生信息
    public static void writeStudents(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(FILE_NAME)))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 新增学生信息
    public static void addStudent(Student student) {
        List<Student> students = readStudents();
        students.add(student);
        writeStudents(students);
    }

    // 删除学生信息
    public static void deleteStudent(String studentId) {
        List<Student> students = readStudents();
        students.removeIf(s -> s.getStudentId().equals(studentId));
        writeStudents(students);
    }

    // 修改学生信息
    public static void updateStudent(String studentId, Student updatedStudent) {
        List<Student> students = readStudents();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(studentId)) {
                students.set(i, updatedStudent);
                break;
            }
        }
        writeStudents(students);
    }

    // 查询学生信息
    public static Student findStudent(String studentId) {
        List<Student> students = readStudents();
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    // 查询所有学生信息
    public static List<Student> getAllStudents() {
        return readStudents();
    }
}
