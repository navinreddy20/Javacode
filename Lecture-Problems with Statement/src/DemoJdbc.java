import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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

        int sid=101;
        String sname="Max";
        int marks=48;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "6031";

        String sql = "insert into student values ("+sid+",'"+sname+"',"+marks+")";
        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");
        Statement st = con.createStatement();
        st.execute(sql);




        con.close();
        System.out.println("Connection closed");


    }
}
