<%--
  Created by IntelliJ IDEA.
  User: dik81
  Date: 10.06.19
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Submit Form</title>
  <script>
    function loadXMLDoc() {
      var xhttp = new XMLHttpRequest();
      var elements = document.getElementsByClassName("formElement");
      var formData = new FormData();
      for(var i=0; i<elements.length; i++)
      {
        formData.append(elements[i].name, elements[i].value);
      }
      xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
          document.getElementById('loading').innerHTML = "";
          // Typical action to be performed when the document is ready:
//          document.getElementById("demo").innerHTML = xhttp.responseText;
          var array = xhttp.response;
          for (var i = 0; i < array.length; i++) {

            var table = document.getElementById('contentTable');
            var row = table.insertRow(table.rows.length);
            var cell1 = row.insertCell(0);
            var cell2 = row.insertCell(1);
            var name = document.createTextNode(array[i].name);
            var age = document.createTextNode(array[i].age);
            cell1.appendChild(name);
            cell2.appendChild(age);
          }
        }
      };
      xhttp.open("GET", "${pageContext.request.contextPath}/SubmitHandlerServlet", true);
      xhttp.responseType = 'json';
      xhttp.send(formData);
      document.getElementById('loading').innerHTML = "Loading...";
    }
  </script>
</head>
<body>
<h2>HTML Forms</h2>
<div id="loading">loading</div>
<form action="${pageContext.request.contextPath}/SubmitHandlerServlet">
  Name:<br>
  <input type="text" name="name" id="name" class="formElement" value="${requestScope.get("name")}">
  <br>
  Age:<br>
  <input type="number" name="age" id="age" class="formElement" value="${requestScope.get("age")}">
  <br><br>
  <input type="submit" value="Submit" onclick="event.preventDefault(); loadXMLDoc();">
</form>
<div id="demo">Initial text</div>
<%--<button type="button" onclick="loadXMLDoc()">Change Content</button>--%>
<table id="contentTable">
<tr>
<th>Name</th><th>Age</th>
</tr>
</table>
</body>
</html>
