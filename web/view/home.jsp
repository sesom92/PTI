<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <div></div>
        <title>UKM - Admin</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="./img/psmcflogo.jpeg" rel="shortcut icon" >
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
        <table width="100%" border="0" align="center" bgcolor="#FFFFFF">
            <tr >
                <td colspan="3"> 
            <marquee direction="left" scrollamount="6" style="font-size:14px; 
                                          background:#FFFFFF; color:#3399ff">                        
                <strong>Selamat Datang di Smart Office UKM</strong>
            </marquee>              
                </td>
            </tr>
        </table>
       <div style="text-align:center;clear:both;">
           <h1><img src="../../img/hehe1.png"></h1>
             <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="home.jsp">
                        <span class="glyphicon glyphicon-home"></span> Home</a></li>
                    <li><a href="manipulasievent.jsp">
                           <span class="glyphicon glyphicon-pencil"></span> Event</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a onclick="return confirm('Apakah anda akan logout?')" href="../login.jsp?out=y">
                            <span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>
            </div>
        </nav>
        </div>
       <div style="background-image: image; background-position: center ">
           <h1><img src="../../img/background1.jpg"></h1>
       </div>
      
        <%-- end-header --%>
        <div class="container">
            
        </div>       
    </body>
</html>
