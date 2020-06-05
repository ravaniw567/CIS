<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file="Header.html"%> 
   
<!DOCTYPE html>

<style>
.btn{
height:50px;
width:100px;
border:2px solid black;
margin-left:50%;
color:black;
padding: 8px;
}

</style>


<span style="font-size:60px; margin-left:30% ">Officer Login from here...</span><br><br>

<form method="post" action="AuthOfficer">

<span style="font-size:20px"><b><center>
Username:<input type="text" name="AUnm"><br><br>
Password:<input type="password" name="APwd"><br><br>
</center></b></span>

<button class="button btn" value="Login"><span style="font-size:28px">Login</span></button>
</form>

</body>
</html>