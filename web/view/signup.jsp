<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up Member - UKM</title>
        <link rel="shortcut icon" href="../img/favicon-new.ico" />
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <script src="../js/bootstrap.js"></script>
        <script src="../js/jquery.min.js"></script>
    </head>
    <body>
        <%-- start-header --%>
        <div style="text-align:center;clear:both;">
            <h1><img src="../img/hehe1.jpg"></h1>
        </div>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="about.jsp">About</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="signup.jsp">Sign Up</a></li>
                    <li><a href="login.jsp">Login</a></li>
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
                            <form action="../signUpServlet" method="post">
                                <center>
                                    <% try {
                                            if (request.getParameter("error").equals("n")) {
                                    %>
                                    <h5 style="color:green">Sign Up Success!</h5>
                                    <%                                            } else {
                                    %>
                                    <h5 style="color:red">Please Try Again!</h5>
                                    <%      }
                                        } catch (Exception e) {

                                        }
                                    %>

                                </center>
                                <table>
                                    <tr>
                                        <td>
                                            <label><b>Nama</b></label>
                                        </td>
                                        <td>
                                            <input type="text" placeholder="Enter Username" name="nama" required>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <br>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label><b>NIM</b></label>
                                        </td>
                                        <td>
                                            <input type="text" placeholder="Enter Username" name="nim" required>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <br>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label><b>Prodi</b></label>
                                        </td>
                                        <td>
                                            <input type="text" placeholder="Enter Username" name="prodi" required>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <br>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label><b>Nomor Telephone</b></label>
                                        </td>
                                        <td>
                                            <input type="text" placeholder="Enter Username" name="notlp" required>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <br>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label><b>Jenis Kelamin</b></label>
                                        </td>
                                        <td>
                                            <input type="radio" name="jk" value="l"> Laki-Laki<br>
                                            <input type="radio" name="jk" value="p"> Perempuan<br>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <br>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label><b>Email</b></label>
                                        </td>
                                        <td>
                                            <input type="email" placeholder="Enter Email" name="email" required>

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
                                            <input type="password" placeholder="Enter Password" name="password1" required>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <br>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label><b>Confirm Password</b></label>
                                        </td>
                                        <td>
                                            <input type="password" placeholder="Re-Enter Password" name="password2" required>
                                        </td>
                                    </tr>

                                </table>                       
                                <br>
                                <div style="background-color:#f1f1f1">
                                    <button type="submit" class="btn-success">Sign Up</button>            
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
