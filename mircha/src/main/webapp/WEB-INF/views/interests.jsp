<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="styles/mircha.css"/>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

    <script>
        jQuery(document).ready(function ($) {
            $("#addInterest").click(function (event) {
                var name = prompt("Please enter your name","").trim();
                if (!!name) {
                    var data = {};
                    data["name"] = name;
                    $.ajax({
                        type: "POST",
                        contentType: "application/json",
                        url: "${pageContext.request.contextPath}/mvc/add/interest",
                        data: JSON.stringify(data),
                        dataType: 'json',
                        timeout: 600000,
                        success: function (response) {
                            var htmlString = '<ol id="selectable">';
                            // var obj = jQuery.parseJSON(response);
                            $.each(response, function () {
                                htmlString += '<li class="ui-widget-content">' + this.name + '</li>';
                            });
                            htmlString += '</ol>';
                            $("#interestsDiv").html(htmlString);
                            // data.forEach();
                            // $("#tabs-2 ol li:last").after('<li class="ui-widget-content">' + name + '</li>');
                            //...
                        },
                        error: function (e) {
                            alert("Not working");
                            //...
                        }
                    });
                } else {
                    alert("Nothing to add, bye!");
                }
            });

            $("#tabs").tabs({
                activate: function (event, ui) {
                    var active = $('#tabs').tabs('option', 'active');
                    $("#tabid").html('the tab id is ' +
                            $("#tabs ul>li a").eq(active).attr("href"));
                }
            });

            <%-- script for making photo large: --%>
            $('img[data-enlargable]').addClass('img-enlargable').click(function () {
                var src = $(this).attr('src');//get the source attribute of the clicked image
                $('<div>').css({
                    background: 'RGBA(0,0,0,.5) url(' + src + ') no-repeat center',
                    backgroundSize: 'contain',
                    width: '100%', height: '100%',
                    position: 'fixed',
                    zIndex: '10000',
                    top: '0', left: '0',
                    cursor: 'zoom-out'
                }).click(function () {
                    $(this).remove();
                }).appendTo('body');
            });
        });
    </script>

</head>
<body>
<h2>Mircha</h2>
<div id="tabs">
    <ul>
        <li><a href="#tabs-1">Photos</a>
        </li>
        <li><a href="#tabs-2">Interests</a>
        </li>
        <li><a href="#tabs-3">Tab 3</a>
        </li>
    </ul>
    <div id="tabs-1"  class="ui-tabs-panel">
        <img data-enlargable style="cursor: zoom-in" src="photos/1.jpg">
        <img data-enlargable style="cursor: zoom-in" src="photos/2.jpg">
        <img data-enlargable style="cursor: zoom-in" src="photos/3.jpg">
        <p>Content for Tab 1</p>
    </div>
    <div id="tabs-2" class="ui-tabs-panel">
        <div id="interestsDiv">
            <ol id="selectable">
                <c:forEach items="${interests}" var="interest">
                    <li class="ui-widget-content">${interest.name}</li>
                </c:forEach>
            </ol>
        </div>
        <div>
            <button id="addInterest">Add Interest</button>
        </div>
    </div>
    <div id="tabs-3" class="ui-tabs-panel">
        <p>Content for Tab 3</p>
    </div>
</div>
<div id="tabid"></div>


</body>
</html>
