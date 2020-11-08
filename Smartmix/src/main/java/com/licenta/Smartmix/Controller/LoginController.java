package com.licenta.Smartmix.Controller;

import com.licenta.Smartmix.Forms.LoginForm;
import com.mysql.cj.protocol.Resultset;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.*;

@Controller
public class LoginController {
    // Get Login
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginForm() {
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("loginForm")LoginForm loginForm, Model model) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/users?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            if(con!=null) System.out.println("Se Conecteaza Cu Baza De Date MySQL Din XAMPP");

            String querySelect = "select * from users_table";
            PreparedStatement statementSelect = con.prepareStatement(querySelect);
            ResultSet resultSetSelect = statementSelect.executeQuery();

            while(resultSetSelect.next()) {
                String username = resultSetSelect.getString("username");
                String password = resultSetSelect.getString("password");

                if(loginForm.getUsername().equals(username)&& loginForm.getPassword().equals(password)) {
                    return "retete-apreciate";
                }
                //System.out.println("username: "+ username + " password: " + password);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        model.addAttribute("perecheanumeparolanuexista", true);

        return "login";
    }
}