import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {

/*
import package
load and register
create connection
create statement
execute statement
process the results
close


*/

        int sid = 102;
        String sname = "Jasmine";
        int marks = 52;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "6031";

        String sql = "insert into student values (?,?,?)";


        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        st.execute();


        con.close();


    }
}
