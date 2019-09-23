<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="static/css/mircha.css"/>
    <style>
        #feedback { font-size: 1.4em; }
        #selectable .ui-selecting { background: #FECA40; }
        #selectable .ui-selected { background: #F39814; color: white; }
        #selectable { list-style-type: none; margin: 0; padding: 0; width: 60%; }
        #selectable li { margin: 3px; padding: 0.4em; font-size: 1.4em; height: 18px; }
    </style>

<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>--%>
    <script>
<%-- $(function () {
     $("#tabs").tabs({
                 activate: function (event, ui) {
                     var active = $('#tabs').tabs('option', 'active');
                     $("#tabid").html('the tab id is ' + $("#tabs ul>li a").eq(active).attr("href"));

                 }
             }

     );
 });
 $(function () {
     $("#selectable" ).selectable();
     $("#addInterest").click(function () {
         $("#tabs-2 ol li:last").after('<li class="ui-widget-content">demo</li>');
     })
 });--%>

    </script>
</head>
<body>
 <jsp:forward page="WEB-INF/views/welcome.jsp"/>
</body>
</html>
