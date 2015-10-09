package submit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
//import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class signin extends HttpServlet {

    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
       try (PrintWriter out = response.getWriter()) {
                        String userame = request.getParameter("User Name");
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
                st = con.prepareStatement("select * from LOGIN where user_name=? and password=?");
                st.setString(1,request.getParameter("User Name"));
                st.setString(2,request.getParameter("password"));
                ResultSet rs = st.executeQuery();

                if(rs.next())
                    System.out.println("Success");
                else
                    System.out.println("Failed");

                }catch(ClassNotFoundException | SQLException e){
                    System.out.println("Exception occured! "+e.getMessage()+" "+Arrays.toString(e.getStackTrace()));
                }  
         
           
        }
   
        }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    /**@Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    */
}

