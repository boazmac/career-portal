package submit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class signup extends HttpServlet {

    
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
   
    String fname = request.getParameter("First Name");
    String lname = request.getParameter("Last Name");
    String uname = request.getParameter("User Name");
    String email = request.getParameter("email");
    String pwd = request.getParameter("password");
    
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SD_CAREERS", "admin");
    Statement st = con.createStatement();
    ResultSet rs;
    int i = st.executeUpdate("insert into members(first_name, last_name, user_name, email, password) values ('" + fname + "','" + lname + "','" + uname + "','"+ email +"','" + pwd + "', CURDATE())");
    if (i > 0) {
       // session.setAttribute("userid", user);
        response.sendRedirect("welcome.jsp");
       out.print("Registration Successfull!"+"<a href='signin.jsp'>Signin</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
   }catch(ClassNotFoundException | SQLException e){
                    System.out.println("Exception occured! "+e.getMessage()+" "+Arrays.toString(e.getStackTrace()));
                }  
    
 }
}

