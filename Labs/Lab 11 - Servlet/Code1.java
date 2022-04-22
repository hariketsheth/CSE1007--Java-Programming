Register servlet
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *	Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text.html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> welcome </h1>");
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");

        String mail = req.getParameter("user_city");
        String gender = req.getParameter("user_server");
        String course = req.getParameter("user_role");
        String cond = req.getParameter("user_sign");
        System.out.println(name + " " + password + " " + mail + " " + gender + " " +
            course);
    }
}

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <body>
        <section style="display: flex; justify-content: center; align-items: center; margin-top:
            150px; padding: 10px;">
            <form action="register" method="post">
                <div style="margin: 10px;">
                    <label for="">Username</label>
                    <input type="text" name="user_name" required placeholder="Enter Text"> 
                </div>
                <div style="margin: 10px;">
                    <label for="" style="margin-right: 2px;">Password</label>
                    <input type="password" name="user_password" required placeholder="Enter
                        Text">
                </div>
                <div style="margin: 10px;">
                    <label for="">City of</label><br>
                    <label for="">Employment</label>
                    <input type="text" name="user_city" required placeholder="Enter Text" > 
                </div>
                <div style="margin: 10px;">
                    <label for="">Webserver</label>
                    <select name="user_server" id="">
                        <option value="apache">Apache</option>
                        <option value="Jigsaw">Jigsaw</option>
                        <option value="IIS">IIS</option>
                        <option value="Nginx">Nginx</option>
                    </select>
                </div >
                <div style="display: flex; margin: 10px;">
                    <label for="">Please specify Role</label>
                    <div>
                        <div><input type="radio" name="user_role" value="Admin" id="">Admin</div>
                        <div><input type="radio" name="user_role" value="Engineer"
                            id="">Engineer</div>
                        <div><input type="radio" name="user_role" value="Guest" id="">Guest</div>
                        <div><input type="radio" name="user_role" value="Manager"
                            id="">Manager</div>
                    </div>
                </div>
                <div style="display: flex; margin: 10px;">
                    <label for="">Single Sign-in </label><br>
                    <label for="">on the following</label>
                    <div>
                        <div><input type="checkbox" name="user_sign" id="">Mail</div>
                        <div><input type="checkbox" name="user_sign" id="">Payroll</div>
                        <div><input type="checkbox" name="user_sign" id="">Self-service</div>
                    </div>
                </div>
                <div style="display: flex;">
                    <button style="margin: 10px;" type="submit">Submit</button>
                    <button style="margin: 10px;" type="reset">Reset</button> 
                </div>
            </form>
        </section>
    </body>
</html>