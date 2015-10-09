package submit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import submit.signup;
import submit.members;
import submit.signin;



@WebServlet(name = "membercontroller", urlPatterns = {"/membercontroller"})
public class membercontroller extends HttpServlet {

 
      
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
         members members =new members();
         String firstname =request.getParameter("First Name");
         String lastname =request.getParameter("Last Name");
         String username =request.getParameter("Username");
         String email = request.getParameter("email");
         String password =request.getParameter("password");
         
         
         members.setFirstName(firstname);
         members.setLastName(lastname);
         members.setUserName(username);
         members.setemail(email);
         members.setpassword(password);      
                         
                                
       
        
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
