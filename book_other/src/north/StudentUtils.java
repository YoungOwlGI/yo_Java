package north;

import java.io.*;
import java.util.*;

public class StudentUtils {

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

    // 如果文件是以其他编码格式保存的，可以使用 BufferedReader 指定编码格式
    public static List<Student> readStudentsWithEncoding() {
        List<Student> students = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return students;
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), "UTF-8"))) {
            // 这里需要根据文件的实际内容解析为 Student 对象
            // 假设文件内容是序列化的 Student 对象，可以使用 ObjectInputStream
            // 如果文件内容是纯文本，需要逐行读取并解析
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
            students = (List<Student>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
