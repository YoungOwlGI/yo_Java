package north;

import java.io.Serializable;

public class Student implements Serializable {
    // 显式指定 serialVersionUID
    private static final long serialVersionUID = 1745008080644422000L;

    private String studentId;  // 学号
    private String name;       // 姓名
    private String address;    // 家庭住址
    private String phoneNumber; // 电话号码

    public Student(String studentId, String name, String address, String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "学号: " + studentId + ", 姓名: " + name + ", 地址: " + address + ", 电话: " + phoneNumber;
    }
}
