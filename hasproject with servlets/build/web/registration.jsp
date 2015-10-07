<%-- 
    Document   : registration
    Created on : Sep 28, 2015, 11:34:53 AM
    Author     : Tiger
--%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>    
<%    
    String pwd = request.getParameter("password");
    String fname = request.getParameter("First Name");
    String lname = request.getParameter("Last Name");
    String email = request.getParameter("email");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:XE", "SD_CAREERS", "admin");
    Statement st = con.createStatement();
    ResultSet rs;
    int i = st.executeUpdate("insert into members(first_name, last_name, email, password) values ('" + fname + "','" + lname + "','" + email + "','" + pwd + "', CURDATE())");
    if (i > 0) {
       // session.setAttribute("userid", user);
        response.sendRedirect("welcome.jsp");
       out.print("Registration Successfull!"+"<a href='signin.jsp'>Signin</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>
    