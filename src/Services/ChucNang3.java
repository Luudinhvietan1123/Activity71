package Services;

import Entity.NhaCungCap;

import java.sql.*;
import java.util.ArrayList;

public class ChucNang3 {

    //Liệt kê thông tin toàn bộ nhà cung cấp được sắp xếp tăng dần theo tên nhà cung
    //cấp và giảm dần theo mã số thuế

    public static ArrayList<NhaCungCap> list3 = new ArrayList<>();

    public static ArrayList setList3(){
        try{
            Class.forName("com.mysql,cj,jdbc,Driver");
        }catch(ClassNotFoundException e){}
        Connection connection = null;
        try{
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/thue_xe_cms?characterEncoding=utf8", "root", "123123");
        }catch(SQLException e){}
        try{
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM thue_xe_cms.nhacungcap ORDER BY thue_xe_cms.nhacungcap.TenNhaCC ASC, thue_xe_cms.nhacungcap.MaSoThue DESC ";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                NhaCungCap thisSupplier = new NhaCungCap(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)
                );
                list3.add(thisSupplier);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list3;
    }
}
