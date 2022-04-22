<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <style type="text/css">
            .container {
            width: 40%;
            margin: auto;;
            padding: 20px;
            font-size: 20px;
            border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>My Form</h1>
            <form action="register" method="get">
                <table>
                    <tr>
                        <td>Enter your name</td>
                        <td><input type="text" name="user_name"
                            required placeholder="enter here" /></td>
                    </tr>
                    <tr>
                        <td>Enter your password</td>
                        <td><input required type="password"
                            name="user_password"
                            placeholder="enter here" /></td>
                    </tr>
                    <tr>
                        <td>Enter your mail</td>
                        <td><input type="email" name="user_mail"
                            placeholder="enter here" /></td>
                    </tr>
                    <tr>
                        <td>selet gender</td>
                        <td><input type="radio" name="user_gender"
                            value="Male" />male</td>
                        <td><input type="radio" name="user_gender"
                            value="Female" />female</td>
                    </tr>
                    <tr>
                        <td>Select your course</td>
                        <td>
                            <select name="user_courde">
                                <option value="java">JAVA</option>
                                <option value="php">PHP</option>
                                <option
                                    value="python">PYTHON</option>
                                <option
                                    value="android">ANDROID</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right"><input type="checkbox" value="checked" name="condition" /></td>
                        <td>Agree terms and condition</td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button type="submit">Register</button>
                            <button type="reset">Reset</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <style type="text/css">
            .container {
            width: 40%;
            margin: auto;;
            padding: 20px;
            font-size: 20px;
            border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>My Form</h1>
            <form action="register" method="get">
                <table>
                    <tr>
                        <td>Enter your name</td>
                        <td><input type="text" name="user_name"
                            required placeholder="enter here" /></td>
                    </tr>
                    <tr>
                        <td>Enter your password</td>
                        <td><input required type="password"
                            name="user_password"
                            placeholder="enter here" /></td>
                    </tr>
                    <tr>
                        <td>Enter your mail</td>
                        <td><input type="email" name="user_mail"
                            placeholder="enter here" /></td>
                    </tr>
                    <tr>
                        <td>selet gender</td>
                        <td><input type="radio" name="user_gender"
                            value="Male" />male</td>
                        <td><input type="radio" name="user_gender"
                            value="Female" />female</td>
                    </tr>
                    <tr>
                        <td>Select your course</td>
                        <td>
                            <select name="user_courde">
                                <option value="java">JAVA</option>
                                <option value="php">PHP</option>
                                <option
                                    value="python">PYTHON</option>
                                <option
                                    value="android">ANDROID</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right"><input type="checkbox" value="checked" name="condition" /></td>
                        <td>Agree terms and condition</td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button type="submit">Register</button>
                            <button type="reset">Reset</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
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
        String mail = req.getParameter("user_mail");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_courde");
        String cond = req.getParameter("condition");
        System.out.println(name + " " + password + " " + mail + " " + gender + " " +
            course);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text.html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> welcome </h1>");
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String mail = req.getParameter("user_mail");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_courde");
        String cond = req.getParameter("condition");
        System.out.println(name + " " + password + " " + mail + " " + gender + " " +
            course);
    }

}