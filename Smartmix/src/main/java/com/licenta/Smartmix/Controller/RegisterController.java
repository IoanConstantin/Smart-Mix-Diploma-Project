package com.licenta.Smartmix.Controller;

import com.licenta.Smartmix.Forms.LoginForm;
import com.licenta.Smartmix.Forms.RegisterForm;
import com.mysql.cj.protocol.Resultset;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.*;

@Controller
public class RegisterController {
    //to get register page
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getRegisterForm() {
        return "register";
    }

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String register(@ModelAttribute("registerForm") RegisterForm registerForm, Model model) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/users?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            if(con!=null) System.out.println("Se Conecteaza Cu Baza De Date MySQL Din XAMPP");

            String queryInsert = " INSERT INTO `users_table`(`username`, `password`) VALUES ('" + registerForm.getUsername() +
                    "','" + registerForm.getPassword() + "');";

            System.out.println(queryInsert);

            String querySelect = "select * from users_table";
            PreparedStatement statementSelect = con.prepareStatement(querySelect);
            ResultSet resultSetSelect = statementSelect.executeQuery();
            int userDejaInregistrat = 0;

            while(resultSetSelect.next()) {
                String usernameSelect = resultSetSelect.getString("username");
                String passwordSelect = resultSetSelect.getString("password");

                if(registerForm.getUsername().equals(usernameSelect)) {
                    userDejaInregistrat = 1;
                }
            }

            if(userDejaInregistrat == 0) {
                PreparedStatement statement = con.prepareStatement(queryInsert);
                statement.execute();
            } else {
                System.out.println("Userul este deja inregistrat!");

                model.addAttribute("utilizatorexistent", true);

                return "register";
            }

            return "retete-apreciate";

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return "login";
    }
}