package Services;

import Entity.NhaCungCap;

import java.sql.*;
import java.util.ArrayList;

public class ChucNang8 {

    //Liệt kê thông tin của các nhà cung cấp chưa từng thực hiện đăng ký cung cấp
    //phương tiện lần nào cả.

    public static ArrayList<NhaCungCap> list8 = new ArrayList<>();

    public static ArrayList setList8(){
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
            String sql = "SELECT * FROM thue_xe_cms.nhacungcap WHERE thue_xe_cms.nhacungcap.MaNhaCC NOT IN (SELECT thue_xe_cms.dangkycungcap.MaNhaCC FROM thue_xe_cms.dangkycungcap)";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                NhaCungCap thisSupplier = new NhaCungCap(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)
                );
                list8.add(thisSupplier);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list8;
    }

}
