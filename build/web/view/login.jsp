<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="shortcut icon" href="../img/favicon-new.ico" />
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <script src="../js/bootstrap.js"></script>
        <script src="../js/jquery.min.js"></script>
    </head>
    <body>
        <%-- start-header --%>
        <div style="text-align:center;clear:both;">
            <h1><img src="../img/hehe1.png"></h1>
        </div>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="about.jsp">About</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="signup.jsp">Sign Up</a></li>
                    <li class="active"><a href="login.jsp">Login</a></li>
                </ul>
            </div>
        </nav>
        <%-- end-header --%>
        <div class="container">  
            <div class="row">
                <div class="col-sm-4 col-lg-offset-4"> 
                    <div class="panel panel-success">
                        <div class="panel-heading"></div>
                        <div class="panel-body">
                            <form action="../loginServlet" method="post">
                                <center>
                                    <% try {
                                            if (request.getParameter("error").equals("y")) {
                                    %>
                                    <h5 style="color:red">Username/Password incorrect!!</h5>
                                    <%                                            }
                                        } catch (Exception e) {

                                        }
                                    %>
                                    <%
                                        try {
                                            if (request.getParameter("out").equals("y")) {
                                                session.removeAttribute("sname");
                                                session.invalidate();
                                                Model.Mahasiswa.clear();
                                                
                                    %> 
                                    <h5 style="color:red">Anda telah Logout</h5>
                                    <% }
                                        } catch (Exception e) {

                                        }
                                    %>
                                </center>
                                <table>
                                    <tr>
                                        <td>
                                            <label><b>Username</b></label>
                                        </td>
                                        <td>
                                            <input type="text" placeholder="Enter Username" name="username" required>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <br>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label><b>Password</b></label>
                                        </td>
                                        <td>
                                            <input type="password" placeholder="Enter Password" name="password" required>
                                        </td>
                                    </tr><tr>
                                        <td>
                                            <br>
                                        </td>
                                    </tr>
                                </table>
                                <div style="background-color:#f1f1f1">
                                    <button type="submit" class="editbtn">Login</button>
                                    Forgot <a href="#">password?</a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div style="text-align:center;clear:both;">
            <p>&copy; 2018.</p>
        </div>
    </body>
</html>
