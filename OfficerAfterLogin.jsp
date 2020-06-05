<%@page import="java.util.LinkedList"%>
<%@page import="GetterSetter.ReportCase"%>
<%@page import="DataHandler.DBHandler"%>
<%@page import="GetterSetter.Officer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Header.html"%>
    
<!DOCTYPE html>

<style>
.navbar {
    font-family: Montserrat, sans-serif;
    margin-bottom: 0;
    background-color: rgba(0,0,0,0.5);
    border: 0;
    font-size: 22px !important;
    letter-spacing: 6px;
    opacity: 0.9;
    padding: 8px;
    margin:2px;
    
  }
  .navbar-nav li{
  background-color: #29292c !important;
  padding: 4px;
  margin: 4px;
  }
  .navbar-nav li a:hover {
    color: silver;
    background-color: rgba(0,0,0,0.5);
    opacity: 0.9;
  }
  .navbar-nav li.active a {
    color: #fff !important;
    background-color: #29292c !important;
  }
  
  .navbar-default .navbar-toggle {
    border-color: transparent;
  }
  
  .btn{
   background-color: rgba(0,0,0,0.5);
   font-size: 22px;
   color: white;
  opacity: 0.9;
  margin:4px;
  padding:2px;
  }
  .btn:hover{
  font-size:26px;
  }
  .btn:active{
  background-color:none;
  color:white;
  }
  
  .butn{
  height : 50px;
  width: 100px;
  background-color: gray;
  color: black;
  margin-left: 20%;
  }
  
  
  
  .SideBar{
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x :hidden;
  transition: 0.5s;
  padding-top: 60px;
    }
  
  
.sidebar a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  transition: 0.3s;

}

.sidebar a:hover {
  color: #f1f1f1;
}

.sidebar .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

.openbtn {
  font-size: 20px;
  cursor: pointer;
  background-color: #111;
  color: white;
  padding: 10px 15px;
  border: none;
}

.openbtn:hover {
  background-color: #444;
}

#main {
  transition: margin-left .5s;
  padding: 16px;
}

/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */
@media screen and (max-height: 450px) {
  .sidebar {padding-top: 15px;}
  .sidebar a {font-size: 18px;}
}
  
  
  .btn{
  font-size: 20px;
  
  }
  
  #AddSuspects{
  display: none;
  margin-left:40%;
  font-size:22px;
  }
  
  #AddEvidence{
  display: none;
  margin-left:40%;
  font-size:22px;
  }
  #AddCase{
  display: none;
  margin-left:40%;
  font-size:22px;
  }
  #PoliceStation{
  display: none;
  margin-left:50%;
  font-size:22px;
  }
  #ViewCases{
  display: none;
 font-size: 22px;
  }
  #OfficerBio{
 	font-size: 26px; 
	margin-left: 45%;
	margin-top: 10%;
  }
  #AddOfficer{
  font-size: 26px;
  display: none;
  
  }
  
  
  
  </style>


</head>
<body>




<!-- <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">


<nav class="navbar navbar-default  navbar-responsive">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                               
      </button>
      
    <div class="collapse navbar-collapse pull-right" id="myNavbar">
      <ul class="nav navbar-nav navbar-right navbar-responsive">
        <li><button onClick="AddCase()"class="btn">Add Case</button></li>
        <li><button onClick="AddSuspects()" class="btn">Add Suspects</button></li>
        <li><button onClick="AddEvidence()"class="btn">Add Evidence</button></li>
        <li><button onClick="AddResult()"class="btn">Add Result</button></li>
         <li><button onClick="Result()"class="btn">View Prisoners</button></li>
       </ul>
       </div>
       </div>
       </nav>
 -->
 
 
<script>
function AddSuspects() {
  var x = document.getElementById("AddSuspects");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function AddEvidence() {
	  var x = document.getElementById("AddEvidence");
	  if (x.style.display === "none") {
	    x.style.display = "block";
	  } else {
	    x.style.display = "none";
	  }
	}
function AddCase() {
	  var x = document.getElementById("AddCase");
	  if (x.style.display === "none") {
	    x.style.display = "block";
	  } else {
	    x.style.display = "none";
	  }
	}
function AddPS() {
	  var x = document.getElementById("PoliceStation");
	  if (x.style.display === "none") {
	    x.style.display = "block";
	  } else {
	    x.style.display = "none";
	  }
	}
	
	function AddOfficer(){
		var x=document.getElementById("AddOfficer");
		if(x.style.display === "none"){
			x.style.display= "block";
		}else{
			x.style.display= "none";
		}
	}
	
	function ViewCases(){
		var x=document.getElementById("ViewCases");
		if(x.style.display=== "none"){
			x.style.display = "block";
		}else{
			x.style.display = "none";
		}
		
	}
	
	function AddEvidence(){
		var x=document.getElementById("AddEvidence");
		if(x.style.display === "none"){
			x.style.display= "block";
		}else{
			x.style.display = "none";
		}
	}
	
	
	function openNav(){
		document.getElementById("SideBar").style.width= "250px";
		document.getElementById("Bar").style.marginLeft= "250px";
	}
	function closeNav(){
		document.getElementById("SideBar").style.width= "0";
		document.getElementById("Bar").style.marginLeft= "0";
	}
	
</script>




<div id="Bar">
	<button class="openbtn" onClick="openNav()">|||</button>
</div>

<div id="SideBar" class="SideBar">
	<a href="javascript:void(0)" class="closeBtn" onClick="closeNav()">X</a>
	<span style="font-size: 28px; color: silver;">Crime Investigation System</span><br><br>
	<button onClick="ViewCases()" class="button btn">View Cases</button><br><br>
	<button onClick="AddPS()" class="button btn">Add Police Stations</button><br><br>
	<button onClick="AddSuspect()" class="button btn">Add Suspects</button><br><br>
	<button onClick="AddCase()" class="button btn">Add Cases</button><br><br>
	<button onclick="AddOfficer()" class="button btn">Add Officer</button><br><Br>
	<button onClick="AddEvidence()" class="button btn">Add Evidence</button><br><br>
</div>

















<%int strID=Integer.valueOf(request.getParameter("unm"));
Officer officer=null;
DBHandler objDB=new DBHandler();
officer=objDB.RetriveOfficer(strID);
%>


<h1><center>Welcome <%=officer.getStrName() %></center></h1><br>

<div id="OfficerBio">



	Id: <%=strID %><br>
	Contact no: <%=officer.getIntPno() %><br>
	Address: <%=officer.getStrAdd() %><br>
	Email: <%=officer.getStrEmail() %><br>
	Area: <%=officer.getStrArea() %><br>
	Image: <%=officer.getImg() %><br>

</div>

<form action="BtnHandler" method="post" enctype="multipart/form-data">

<div id="AddSuspects">

	
	<h1>Add Suspects</h1><bR>
	
	Case Id:<input type="number" name="id"><br><br>
	Name: <input type="text" name="name"><br><br>
	Suspect Id: <input type="number" name="sid"><br><br>
	Contact No: <input type="tel" name="cntct"><br><br>
	Address: <input type="text" name="add"><bR><br>
	Relation: <input type="text" name="rel"><br><br>
	Note: <input type="text" name="note"><br><br>
	Police Station: <input type="text" name="ps"><br>
	Image: <input type="file" name="img"><br><br>
	Image Hairs: <input type="file" name="hairs"><br>
	Image Eyes: <input type="file" name="eyes"><br>
	Image Lips: <input type="file" name="lips"><br>
	Image Nose: <input type="file" name="nose"><br>
	
<button type="submit" class="button butn" value="AddSuspect" name="btn"> Add Suspect</button>


</div>



<div id="AddOfficer">

	<h1>Add Officer</h1><br>
	
	
	Officer Name: <input type="text" name="name"><br>
	Password: &nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="pwd"><br>
	Contact No: &nbsp;&nbsp;&nbsp;<input type="number" name="cntct"><Br>
	Address: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="add"><Br>
	Email: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="email" name="email"><br>
	Area: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="area"><br>
	Image: <input type="file" class="form-control-file" onchange="readURL(this) " name="img"><bR>
	
	<button class="button butn" type="submit"  value="AddOfficer" name="btn"> Add Officer </button>
</div>



<div id="ViewCases">

<%
LinkedList<ReportCase> lst=objDB.RetriveReptCases();
%>
<table class="table table-hover table-responsive">
  <thead class="thead-dark">
    <tr>
    <th>Sno.</th>
    <th>Name</th>
      <th>Contact</th>
      <th>Email </th>
      <th>Area</th>
      <th>Report Type</th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody id="myTable" >
  <%
  int sno=1;
  for(ReportCase ReptCase:lst)
  {
  %>
  <tr>
  <%-- <td><%=obj.getStrFoodId() %></td>
 --%>    
    <td><%=sno %></td>
    <td><%=ReptCase.getStrName() %></td>
       <td><%=ReptCase.getIntContact() %></td>
       <td><%=ReptCase.getStrEmail() %></td>
       <td><%=ReptCase.getStrArea() %></td>
       <td><%=ReptCase.getStrReptType() %></td>
       <td><%=ReptCase.getStrDesc() %></td>
     </tr>
     <%
     sno++;
    }
  %>

</tbody>
</table>

</div>



<div id="AddEvidence">

<h1>Add Evidence</h1>
	
	Case Id: <input type="number" name="CaseId"><br><br>
	Evidence Type: <input type="text" name="EType"><br><br>
	Evidence: <input type="text" name="Evidence"><br><br>
	Suspect: <input type="text" name="Suspect"><br><br>
	Note: <input type="text" name="Note"><br><br>
	Points: <input type="number" name="Points"><br><br>
	
	<button class="button butn" type="submit" name="btn" value="AddEvidence">Add Evidence</button>
	
</div>


<div id="AddCase">

<h1>Add Case</h1>
		
	<h3>Name: <input type="text" placeholder="Enter your name" name="name" required/><br><br>
	Contact no: <input type="number" placeholder="Enter Contact no." name="contact" required/><br><br>
	Email: <input type="email" placeholder="Enter Email" name="email" /><br><br>
	
	Report type: <select id="Select" name="reporttype">
				<option value="EnvirmentalDestruction">Environmental Destruction</option>
				<option value="SuspiciousDeath">Suspicious Death</option>
				<option value="SocialCrime">SocialCrime</option>
		</select><br><br>
		
	Area: <input type="text" placeholder="Enter your Area" name="area" required="required"><br><br>	
	Description: <textarea placeholder="Enter Description" name="desc" required/></textarea>
	
	<br><br><center><input  type="submit"  name="btn" rows="5" value="AddCase" ></center>
	
	</h3>

</div>



<div id="PoliceStation">

<h1>Add Police Station</h1>

	Name: &nbsp;&nbsp;&nbsp; <input type="text" name="PSname"><br><br>
	Area: &nbsp;&nbsp;&nbsp; <input type="text" name="PSarea"><br><br>
	PIN: &nbsp;&nbsp;&nbsp;&nbsp; <input type="number" name="PSpin"><br><br>
	Incharge: <input type="text" name="PSincharge"><br><br>

<button class="button butn" name="btn" value="AddPS" type="submit">Add</button>

</div>


</form>

</body>
</html>