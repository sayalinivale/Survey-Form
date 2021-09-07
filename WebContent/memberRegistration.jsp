<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Page</title>
<style >
.container{
		width:40%;
		border:1px solid black;
		margin: auto;
		padding:25px;

      }


</style>
</head>
<body>
<div class="container">
	<h1>Survey Form</h1>
	
	<form action="Register" method="post">
		<table>
			<tr>
			<td>Name   :</td>
			<td> <input type="text" name="user_name" placeholder="Enter your name"required/><td>
			</tr>
		
			<tr>
			<td>Adhar Number :</td>
			<td> <input type="number" name="user_number" placeholder="Enter your Adhar no"required/><td>
			</tr>
			
			<tr>
			<td>Email   :</td>
			<td> <input type="email" name="user_email" placeholder="Enter your email"/><td>
			</tr>
			
			<tr>
			<td>Phone Number   :</td>
			<td> <input type="number" name="user_phonenumber" placeholder="Enter your number"required/><td>
			</tr>
			
			<tr>
			<td>Gender   :</td>
			<td> <input type="radio" name="user_gender" value="male"/> Male 
			<input type="radio" name="user_gender" value="female"/>Female<td>
			</tr>
			
			
			<tr>
			<td>Are you Vaccinated   :</td>
			<td> <input type="radio" name="user_vaccinated" value="yes"/> Yes 
			<input type="radio" name="user_vaccinated" value="no"/>No</td>
			</tr>
			
			<tr>
			<td>First Dose   :</td>
			
			<td> <input type="radio" name="user_dose1" value="yes"/> Yes 
			<input type="radio" name="user_dose1" value="no"/>No</td>
			
			</tr>
			
			<tr>
			<td>Second Dose   :</td>
			
			<td> <input type="radio" name="user_dose2" value="yes"> Yes 
			<input type="radio" name="user_dose2" value="no">No</td>
			
			</tr>
			
			<tr>
			<td>Name Of Vaccine   :</td>
			<td>
				<select name="Vaccine Name">
				<option value=""></option>
				<option value="sputnik">Sputnik</option>
				<option value="covaxin">Covaxin</option>
				<option value="covishield">Covishield</option>
				<option value="pfiezer">Pfiezer</option>
				<option value="moderna">Moderna</option>
				</select>
			 </td>
			</tr>
			
			<tr>
				<td style="text-align:right;">
					<input type="checkbox" value="checked" name="condition"/>
				</td>
				<td>
					Agree terms  and conditions
				</td>
				</tr>
				<tr>
				<td>
				
				
				</td>	
					<td>
					<button type="submit">Submit</button>
					<button type="reset">Reset</button>
								
					</td>
							
				</tr>
				
		</table>
	
	</form>
		
</div>
</body>
</html>