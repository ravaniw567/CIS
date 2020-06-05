<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file="Header.html"%> 
       <%@ page import="DataHandler.DBHandler" %>
       <%@ page import="GetterSetter.Case" %>
       <%@ page import="GetterSetter.Suspect" %>
       

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
  
 .input{
  font-size:22px;
  border:none;
  border-bottom :2px;
  }
  
  #AddOfficer{
  display: none;
  margin-left:40%;
  font-size:22px;
  }
  
  #Suspect{
  display: none;
  margin-left:40%;
  font-size:22px;
  }
  
  #Case{
  display: none;
    margin-left:40%;
  font-size:22px;
  }
  
  #Evidence{
  display: none;
    margin-left:40%;
  font-size:22px;
  }
  #Result{
  display: none;
	margin-left:40%;
  font-size:22px;
  }
  #PoliceStation{
  display: none;
    margin-left:40%;
  font-size:22px;
  }
  </style>


<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">


<nav class="navbar navbar-default  navbar-responsive">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                               
      </button>
      
    <div class="collapse navbar-collapse pull-right" id="myNavbar">
      <ul class="nav navbar-nav navbar-right navbar-responsive">
        <li><button onClick="AddOfficer()" class="btn">Add Officer</button></li>
        <li><button onClick="Suspect()"class="btn">View Suspect</button></li>
        <li><button onClick="Case()"class="btn">View Case</button></li>
        <li><button onClick="Evidence()"class="btn">View Evidence</button></li>
         <li><button onClick="Result()"class="btn">Add Result</button></li>
		<li><button onClick="PoliceStation()"class="btn">Add Police Station</button></li>
       </ul>
       </div>
       </div>
       </nav> 
<script>
function AddOfficer() {
  var x = document.getElementById("AddOfficer");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function Suspect() {
	  var x = document.getElementById("Suspect");
	  if (x.style.display === "none") {
	    x.style.display = "block";
	  } else {
	    x.style.display = "none";
	  }
	}
	
function Case() {
	  var x = document.getElementById("Case");
	  if (x.style.display === "none") {
	    x.style.display = "block";
	  } else {
	    x.style.display = "none";
	  }
	}
	
function Evidence() {
	  var x = document.getElementById("Evidence");
	  if (x.style.display === "none") {
	    x.style.display = "block";
	  } else {
	    x.style.display = "none";
	  }
	}
	
	
function Result() {
	  var x = document.getElementById("Result");
	  if (x.style.display === "none") {
	    x.style.display = "block";
	  } else {
	    x.style.display = "none";
	  }
	}	
	
function PoliceStation() {
	  var x = document.getElementById("PoliceStation");
	  if (x.style.display === "none") {
	    x.style.display = "block";
	  } else {
	    x.style.display = "none";
	  }
	}	
</script>
<form action="BtnHandler" method="post" enctype="multipart/form-data">


<div id="AddOfficer">
	<h1>Add Officer</h1><br>
	
	
	Officer Id:  &nbsp;&nbsp;&nbsp;&nbsp;    <input type="number" name="id"><br><br>
	Password: &nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="pwd"><br><br>
	Officer Name: <input type="text" name="name"><br><br>
	Contact No: &nbsp;&nbsp;&nbsp;<input type="number" name="cntct"><Br><br>
	Address: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="add"><Br><br>
	Email: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="email" name="email"><br><br>
	Area: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="area"><br><br>
	Image: <input type="file" class="form-control-file" onchange="readURL(this) " name="img"><bR>
	
	<button type="submit" class="button butn" value="Add" name="btn"> Add </button>
</div>




<div id="Suspect">
<%
DBHandler objDb=new DBHandler();
Case casee=new Case();
Suspect sus=new Suspect();
int intCaseId=casee.getIntCid();
objDb.viewSuspect(intCaseId);
%>
	Case Id: <input type="number" value="">
	
	<br>
	
	Case Name: <input type="text" value=<%casee.getStrCname(); %>><br>
	Suspect: <input type="text" value=<%sus.getIntPname(); %>><br>
	Contact number: <input type="number" value=<%sus.getIntPno(); %>><br>
	Adderss: <input type="text" value=<%sus.getStrPAdd(); %>><br>
	Relation: <input type="text" value=<%sus.getStrRel(); %>><br>
	Rank: <input type="number" value=<%sus.getStrPS(); %>><br>
	Note: <input type="text" value=<%sus.getStrNote(); %>><br>
	

</div>


<div id="Case">
	
	Case Id:
	Case Name:
	Officer Id:
	Officer Name:
	Note:
	

</div>


<div id="Evidence">

	Case Id:
	Evidence:
	Type:
	Suspect:
	Note:
	Rank:
	Date:
	Officer ID:

</div>


<div id="Result">

	Case ID:
	Case Name:
	Suspect:
	Note:

</div>







</form>

</body>
</html>