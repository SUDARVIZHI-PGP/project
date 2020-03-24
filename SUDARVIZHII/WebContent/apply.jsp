<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>Job Application Design</title>
    <link rel="stylesheet" type="text/css" href="apply.css">
    <body>
        <div class="applicationbox">
 <center> <h2> Apply For Job </h2> </center>
  <form method="post" action="Apply">
  <p>Full Name</p>
                       <input type="text" name="fullname" placeholder="">
                       <p>Email Address</p>
                       <input type="email"name="email" placeholder="">
                       <p>Message</p>
                       <br><br>
                       <table>
                           <tr>
                               <td><textarea rows="10" cols="45" name="msg" placeholder="Type Your Message..."></textarea></td>
                           </tr>
                       </table>
                       <p>Upload CV</p>
                       <input type="file" name="CV">
                       
                       <input type="submit" value="Send Application">
                       </form>
        </div>
        </body>
</html>
