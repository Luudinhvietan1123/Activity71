package Services;

import Entity.DongXe;

import java.sql.*;
import java.util.ArrayList;

public class ChucNang1 {

    //Liệt kê những dòng xe có số chỗ ngồi trên 5 chỗ trả về list1

    public static ArrayList<DongXe> list1 = new ArrayList<>();

    public static ArrayList setList1(){
        try{
            Class.forName("com.mysql,cj,jdbc,Driver");
        }catch(ClassNotFoundException e){}
        Connection connection = null;
        try{
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/thue_xe_cms.dongxe?characterEncoding=utf8", "root", "123123");
        }catch(SQLException e){}
        try{
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM thue_xe_cms.dongxe WHERE SoChoNgoi > 5";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                DongXe thisCar = new DongXe
                        (resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getInt(3));
                list1.add(thisCar);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list1;
    }
}
