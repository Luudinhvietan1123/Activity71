package Services;

import Entity.NhaCungCap;

import java.sql.*;
import java.util.ArrayList;

public class ChucNang5 {

    // Liệt kê tên của toàn bộ các hãng xe có trong cơ sở dữ liệu với yêu cầu mỗi hãng xe
    //chỉ được liệt kê một lần

    public static ArrayList<String> list5 = new ArrayList<>();

    public static ArrayList setList5(){
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
            String sql = "SELECT distinct thue_xe_cms.dongxe.HangXe FROM thue_xe_cms.dongxe";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                list5.add(resultSet.getString(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list5;
    }

}
