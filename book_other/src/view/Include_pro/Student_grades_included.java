package view.Include_pro;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Student_grades_included {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Map<String, Object>> studentsList = new ArrayList<>(); // 创建一个列表来存储学生信息

        System.out.print("请输入学生人数：");
        int numStudents = in.nextInt();
        in.nextLine(); // 清除换行符

        for (int i = 0; i < numStudents; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个学生的姓名：");
            String name = in.nextLine();
            Map<String, Object> studentMap = new HashMap<>(); // 创建一个 Map 来存储一个学生的信息

            studentMap.put("name", name); // 存储学生姓名

            // 输入成绩
            float[] scores = new float[3];
            float sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.println("请输入第 " + (j + 1) + " 个成绩：");
                scores[j] = in.nextFloat();
                sum += scores[j];
            }
            in.nextLine(); // 清除换行符

            // 计算平均分
            float average = sum / 3;
            studentMap.put("average", average); // 存储平均分
            studentMap.put("scores", scores); // 存储成绩数组

            studentsList.add(studentMap); // 将学生对象添加到学生列表中
        }

        // 输出学生信息到控制台
        System.out.println("学生信息如下：");
        System.out.println("姓名\t平均分\t成绩");
        for (Map<String, Object> student : studentsList) {
            String name = (String) student.get("name");
            float avg = (float) student.get("average");
            float[] scores = (float[]) student.get("scores");

            System.out.print(name + "\t" + avg + "\t");
            for (float score : scores) {
                System.out.print(score + " ");
            }
            System.out.println();
        }

        in.close(); // 关闭扫描器
    }
}
