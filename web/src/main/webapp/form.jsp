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
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <%--<script>--%>
    <%--function loadXMLDoc() {--%>
      <%--var xhttp = new XMLHttpRequest();--%>
      <%--var elements = document.getElementsByClassName("formElement");--%>
      <%--var formData = new FormData();--%>
      <%--for(var i=0; i<elements.length; i++)--%>
      <%--{--%>
        <%--formData.append(elements[i].name, elements[i].value);--%>
      <%--}--%>
      <%--xhttp.onreadystatechange = function() {--%>
        <%--if (this.readyState == 4 && this.status == 200) {--%>
          <%--document.getElementById('loading').innerHTML = "";--%>
          <%--// Typical action to be performed when the document is ready:--%>
<%--//          document.getElementById("demo").innerHTML = xhttp.responseText;--%>
          <%--var array = xhttp.response;--%>
          <%--for (var i = 0; i < array.length; i++) {--%>

            <%--var table = document.getElementById('contentTable');--%>
            <%--var row = table.insertRow(table.rows.length);--%>
            <%--var cell1 = row.insertCell(0);--%>
            <%--var cell2 = row.insertCell(1);--%>
            <%--var name = document.createTextNode(array[i].name);--%>
            <%--var age = document.createTextNode(array[i].age);--%>
            <%--cell1.appendChild(name);--%>
            <%--cell2.appendChild(age);--%>
          <%--}--%>
        <%--}--%>
      <%--};--%>
      <%--xhttp.open("GET", "${pageContext.request.contextPath}/SubmitHandlerServlet", true);--%>
      <%--xhttp.responseType = 'json';--%>
      <%--xhttp.send(formData);--%>
      <%--document.getElementById('loading').innerHTML = "Loading...";--%>
    <%--}--%>
  <%--</script>--%>
    <script>
        jQuery(function () {
            jQuery('#sendForm').submit(function (event) {
                event.preventDefault();
                let data = jQuery(".formElement");
                jQuery.ajax({
                    type: "POST",
                    url: "${pageContext.request.contextPath}/SubmitHandlerServlet",
                    data: JSON.stringify(data),
                    success: function (response) {
                        for (var i = 0; i < response.length; i++) {

                            var table = document.getElementById('contentTable');
                            var row = table.insertRow(table.rows.length);
                            var cell1 = row.insertCell(0);
                            var cell2 = row.insertCell(1);
                            var name = document.createTextNode(response[i].name);
                            var age = document.createTextNode(response[i].age);
                            cell1.appendChild(name);
                            cell2.appendChild(age);
                        }
                    }
                });
            })
        })

  </script>
        <%--$("#sendForm").submit(function (event) {--%>
        <%--event.preventDefault();--%>
        <%--let data = $(".formElement");--%>
        <%--$.ajax({--%>
        <%--type: "POST",--%>
        <%--url: "${pageContext.request.contextPath}/SubmitHandlerServlet",--%>
        <%--data: JSON.stringify(data),--%>
        <%--dataType: 'json',--%>
        <%--contentType: 'application/json; charset=utf-8',--%>
        <%--success: function (response) {--%>
        <%--alert(response);--%>
        <%--alert("success777");--%>
        <%--},--%>
        <%--error: function (e) {--%>
        <%--console.log("ERROR : ", e);--%>

        <%--}--%>
        <%--});--%>
        <%--});--%>
      <%--// });    });--%>

    <%--function loadJqueryXMLDoc() {--%>
      <%--// var xhttp = new XMLHttpRequest();--%>
      <%--let elements = $(".formElement");--%>
      <%--var formData = new FormData();--%>
      <%--// for(var i=0; i<elements.length; i++)--%>
      <%--// {--%>
      <%--//   formData.append(elements[i].name, elements[i].value);--%>
      <%--// }--%>

      <%--$.get("${pageContext.request.contextPath}/SubmitHandlerServlet", function () {--%>
        <%--alert("fff");--%>
      <%--});--%>

      <%--&lt;%&ndash;xhttp.onreadystatechange = function() {&ndash;%&gt;--%>
        <%--&lt;%&ndash;if (this.readyState == 4 && this.status == 200) {&ndash;%&gt;--%>
          <%--&lt;%&ndash;document.getElementById('loading').innerHTML = "";&ndash;%&gt;--%>
          <%--&lt;%&ndash;// Typical action to be performed when the document is ready:&ndash;%&gt;--%>
<%--&lt;%&ndash;//          document.getElementById("demo").innerHTML = xhttp.responseText;&ndash;%&gt;--%>
          <%--&lt;%&ndash;var array = xhttp.response;&ndash;%&gt;--%>
          <%--&lt;%&ndash;for (var i = 0; i < array.length; i++) {&ndash;%&gt;--%>

            <%--&lt;%&ndash;var table = document.getElementById('contentTable');&ndash;%&gt;--%>
            <%--&lt;%&ndash;var row = table.insertRow(table.rows.length);&ndash;%&gt;--%>
            <%--&lt;%&ndash;var cell1 = row.insertCell(0);&ndash;%&gt;--%>
            <%--&lt;%&ndash;var cell2 = row.insertCell(1);&ndash;%&gt;--%>
            <%--&lt;%&ndash;var name = document.createTextNode(array[i].name);&ndash;%&gt;--%>
            <%--&lt;%&ndash;var age = document.createTextNode(array[i].age);&ndash;%&gt;--%>
            <%--&lt;%&ndash;cell1.appendChild(name);&ndash;%&gt;--%>
            <%--&lt;%&ndash;cell2.appendChild(age);&ndash;%&gt;--%>
          <%--&lt;%&ndash;}&ndash;%&gt;--%>
        <%--&lt;%&ndash;}&ndash;%&gt;--%>
      <%--&lt;%&ndash;};&ndash;%&gt;--%>
      <%--&lt;%&ndash;xhttp.open("GET", "${pageContext.request.contextPath}/SubmitHandlerServlet", true);&ndash;%&gt;--%>
      <%--&lt;%&ndash;xhttp.responseType = 'json';&ndash;%&gt;--%>
      <%--&lt;%&ndash;xhttp.send(formData);&ndash;%&gt;--%>
      <%--&lt;%&ndash;document.getElementById('loading').innerHTML = "Loading...";&ndash;%&gt;--%>
    <%--}--%>
  <%--</script>--%>

  <%--<script type="text/javascript">--%>
    <%--$(function() {--%>
      <%--$("<p>Hi there!</p>").insertAfter("#loading");--%>
    <%--});--%>
  <%--</script>--%>
</head>
<body>
<h2>HTML Forms</h2>
<div id="loading"></div>
<form  id=test action="${pageContext.request.contextPath}/SubmitHandlerServlet" id="sendForm" method="post">
  Name:<br>
  <input type="text" name="name" id="name" class="formElement" value="${requestScope.get("name")}">
  <br>
  Age:<br>
  <input type="number" name="age" id="age" class="formElement" value="${requestScope.get("age")}">
  <br><br>
  <%--<input type="submit" value="Submit" onclick="event.preventDefault(); loadXMLDoc();">--%>
  <input type="submit" value="Submit">
</form>
<%--<div id="demo">Initial text</div>--%>
<%--<button type="button" onclick="loadXMLDoc()">Change Content</button>--%>
<table id="contentTable">
<tr>
<th>Name</th><th>Age</th>
</tr>
</table>
<div id="server-results"></div>
</body>
</html>
