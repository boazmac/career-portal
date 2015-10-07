<%-- 
    Document   : validation
    Created on : Sep 28, 2015, 8:49:57 AM
    Author     : Tiger
--%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
        <%
        String email = request.getParameter("Email Address");
        String password = request.getParameter("password");
        String driver = "oracle.jdbc.driver.OracleDriver";
        String dbURL = "jdbc:oracle:thin:@localhost:XE";
        String dbuser = "SD_CAREERS";
        String dbpassword = "admin";
        Connection conn = null;
        PreparedStatement st = null;


            try{  
                Class.forName(driver);
                Connection con =DriverManager.getConnection(dbURL,dbuser,dbpassword);  
                st = con.prepareStatement("select * from LOGIN where username=? and password=?");
                st.setString(1,request.getParameter("Email Address"));
                st.setString(2,request.getParameter("password"));
                ResultSet rs = st.executeQuery();

                if(rs.next())
                    System.out.println("Success");
                else
                    System.out.println("Failed");

                }catch(Exception e){
                    System.out.println("Exception occured! "+e.getMessage()+" "+e.getStackTrace());
                }  
        %>
   