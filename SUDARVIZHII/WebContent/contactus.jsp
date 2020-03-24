<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>
contact us 
</title>
<link rel="stylesheet" type="text/css"href="contactus.css">
</head>
<body>
<div class="container">
  <div style="text-align:center">
    <h1>Contact Us</h1>
    <p>WE ARE THERE TO HELP YOU!!!</p>
  </div>
  <div class="row">
    <div class="column">
      <img src="contact.jpg" style="width:100%">
    </div>
    <div class="column">
      <form method="post" action="">
        <label for="fname">First Name</label>
        <input type="text" id="fname" name="firstname" placeholder="Your name..">
        <label for="lname">Last Name</label>
        <input type="text" id="lname" name="lastname" placeholder="Your last name..">
        <label for="country">Country</label>
        <select id="country" name="country">
          <option value="australia">Australia</option>
          <option value="canada">Canada</option>
          <option value="India">India</option>
        </select>
        <label for="subject">Subject</label>
        <textarea id="subject" name="subject" placeholder="Write something.." style="height:170px"></textarea>
        <input type="submit" value="Submit">
      </form>
    </div>
  </div>
</div>


</body>
</html>