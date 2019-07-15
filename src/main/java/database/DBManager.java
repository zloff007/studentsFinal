package database;

import entity.Semestr;
import entity.Student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Student> getAllStudents() {
        ArrayList<Student> allStudent = new ArrayList<>();

        try {
            String url = "jdbc:mysql://localhost/studens_controls?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    url, "root", "1122334477qq");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student where status = '1'");
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setSername(rs.getString("sername"));
                student.setName(rs.getString("name"));
                student.setGroup(rs.getString("group"));
                student.setDate(rs.getDate("date"));
                student.setStatus(1);
                allStudent.add(student);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return allStudent;
    }



    public static void CreateStudent(String name, String sername, String group, String date) {

        try {
            String url = "jdbc:mysql://localhost/studens_controls?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    url, "root", "1122334477qq");
            Statement stmt = con.createStatement();
            stmt.execute("INSERT INTO `student` (`sername`, `name`, `group`, `date`) VALUES ('" + sername + "', '" + name + "', '" + group + "', '" + date + "');");


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static ArrayList<Semestr> getAllActiveSemestrs(){
        ArrayList<Semestr>allActiveSmestrs = new ArrayList<>();
        try {
            String url = "jdbc:mysql://localhost/studens_controls?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    url, "root", "1122334477qq");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM term where status = '1'");

            while (rs.next()){
                Semestr semestr = new Semestr();
                semestr.setId(rs.getInt("id"));
                semestr.setTerm(rs.getString("term"));
                semestr.setDuration(rs.getString("duration"));
                semestr.setStatus(1);
                allActiveSmestrs.add(semestr);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return allActiveSmestrs;
    }
}
