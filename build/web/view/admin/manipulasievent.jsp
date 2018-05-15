<%-- 
    Document   : manipulasievent
    Created on : Apr 25, 2018, 9:14:08 AM
    Author     : sesom92
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>UKM - Admin</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="../img/favicon-new.ico" />
        <link href="../../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../../css/style.css" rel="stylesheet" type="text/css"/>
        <script src="../../js/bootstrap.js"></script>
        <script src="../../js/jquery.min.js"></script>
        <style>
            button {
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
            }

            button:hover {
                background-color: #333
            }

            #frameSub{
                width: 100%;
                padding: 0;
                height: 250px;
                border: 2px solid black;
            }
        </style>
    </head>
    <body>
        <%-- start-header --%>
        <div style="text-align:center;clear:both;">
            <h1><img src="../../img/hehe1.png"></h1>
        </div>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li><a href="home.jsp">Home</a></li>
                    <li class="active"><a href="manipulasievent.jsp">Event Tidak Wajib</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a onclick="return confirm('Apakah anda akan logout?')" href="../login.jsp?out=y">Logout</a></li>
                </ul>
            </div>          
        </nav>

        <div class="panel-body">
            <form action="../../../BuatEventTWServlet" method="post">
                <center>
                    <table>
                        <tr>
                            <td>
                                <label><b>Nama Event</b></label>
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
                                <label><b>Tempat</b></label>
                            </td>
                            <td>
                                <input type="text" placeholder="Enter Username" name="tempat" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <br>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label><b>Kuota</b></label>
                            </td>
                            <td>
                                <input type="number" placeholder="Enter Username" name="kuota" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <br>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label><b>Tanggal Event</b></label>
                            </td>
                            <td>
                                <form action="/action_page.php">
                                    <input type="date" name="tanggalevent">
                                </form>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <br>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label><b>Batas Daftar</b></label>
                            </td>
                            <td>
                                <form action="/action_page.php">
                                    <input type="date" name="batasdaftar">
                                </form>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <br>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label><b>Deskripsi</b></label>
                            </td>
                            <td>
                                 <input type="text" placeholder="Enter Username" name="des" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <button type="submit" class="btn-success">Simpan</button>  
                            </td>
                        </tr>
                    </table>
                </center>
            </form>
        </div>

        <%-- end-header --%>
        <div class="container">

        </div>       
    </body>
</html>
