package view.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc {
    public static void main(String[] args) {
        Connection conn = null; //连接对象
        PreparedStatement pst = null;//命令对象
        //异常处理
        try{
            //1. 加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接对象Connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cust?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai","root","xiaomty");
            //3.写sql语句，创建pst对象
            String sql = "update t_cust set custScore=custScore+?  " +
                    "where custNo=?";
            pst = conn.prepareStatement(sql);

            //4.给占位符赋值
            pst.setInt(1,500);
            pst.setString(2,"10003");
            //5. 调用方法执行sql语句：增、删、改：executeUpdate()
            int count = pst.executeUpdate();
            if(count>0){
                System.out.println("执行成功");
            }else{
                System.out.println("执行失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            if(pst!=null){
                try {
                    pst.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }




    }
}