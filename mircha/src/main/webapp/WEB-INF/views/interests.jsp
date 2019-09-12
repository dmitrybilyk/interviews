<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %><html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="styles/mircha.css"/>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="static/form.js" ></script>
    <%--<script data-cfasync="false" src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script></body>--%>

    <style>
        label, input { display:block; }
        input.text { margin-bottom:12px; width:95%; padding: .4em; }
        fieldset { padding:0; border:0; margin-top:25px; }
        h1 { font-size: 1.2em; margin: .6em 0; }
        div#users-contain { width: 350px; margin: 20px 0; }
        div#users-contain table { margin: 1em 0; border-collapse: collapse; width: 100%; }
        div#users-contain table td, div#users-contain table th { border: 1px solid #eee; padding: .6em 10px; text-align: left; }
        .ui-dialog .ui-state-error { padding: .3em; }
        .validateTips { border: 1px solid transparent; padding: 0.3em; }
    </style>

    <script>
        function extracted(htmlString) {
            htmlString += '<li class="ui-widget-content">' +
                    '<div style="float: left;">' + this.name + '</div>'
                    +
                    '<div style="float: right;">' +
                    '<a class="updateInterest" id=' + this.id + ' name=' + this.name +' href="#">Update</a>' +
                    '</div>' +
                    '<div style="float: right;">' +
                    '<a class="deleteInterest" id=' + this.id + ' href="#">Delete</a>' +
                    '</div>' +
                    '</li>';
            return htmlString;
        }

        jQuery(document).ready(function ($) {
            $("#interestsDiv").on("click", ".deleteInterest", function () {
                    var data = {};
                    data["id"] = this.id;
                    $.ajax({
                        type: "DELETE",
                        contentType: "application/json",
                        url: "${pageContext.request.contextPath}/delete/interest",
                        data: JSON.stringify(data),
                        dataType: 'json',
                        timeout: 600000,
                        success: function (response) {
                            var htmlString = '<ol id="selectable">';
                            // var obj = jQuery.parseJSON(response);
                            $.each(response, function () {
                                htmlString = extracted.call(this, htmlString);
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
            });



        <%--jQuery(document).ready(function ($) {--%>

            jQuery(document).ready(function ($) {
                $("#interestsDiv").on("click", ".updateInterest", function () {
                    var name = prompt("Please enter your name", this.name).trim();
                    if (!!name) {
                        var data = {};
                        data["id"] = this.id;
                        data["name"] = name;
                        $.ajax({
                            type: "PUT",
                            contentType: "application/json",
                            url: "${pageContext.request.contextPath}/update/interest",
                            data: JSON.stringify(data),
                            dataType: 'json',
                            timeout: 600000,
                            success: function (response) {
                                var htmlString = '<ol id="selectable">';
                                $.each(response, function () {
                                    htmlString = extracted.call(this, htmlString);
                                });
                                htmlString += '</ol>';
                                $("#interestsDiv").html(htmlString);
                            },
                            error: function (e) {
                                alert("Not working");
                                //...
                            }
                        });
                    }

                });




            $("#addInterest").click(function (event) {
                var name = prompt("Please enter your name","").trim();
                if (!!name) {
                    var data = {};
                    data["name"] = name;
                    $.ajax({
                        type: "POST",
                        contentType: "application/json",
                        url: "${pageContext.request.contextPath}/add/interest",
                        data: JSON.stringify(data),
                        dataType: 'json',
                        timeout: 600000,
                        success: function (response) {
                            var htmlString = '<ol id="selectable">';
                            // var obj = jQuery.parseJSON(response);
                            $.each(response, function () {
                                htmlString = extracted.call(this, htmlString);
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
        })
        });
    </script>

</head>
<body>
<div style="width: 100%;"><div style="float:left;"><h2>Mircha</h2></div><div style="float: right;"><sec:authentication property="name"/></div>
    <div style="float: right;"><a href="${pageContext.request.contextPath}/logout">Logout</a></div></div>

<div id="tabs" style="clear:both;">
    <ul>
        <li><a href="#tabs-1">Photos</a>
        </li>
        <li><a href="#tabs-2">Interests</a>
        </li>
<sec:authorize access="hasRole('ROLE_ADMIN')">
    <li><a href="#tabs-3">Tab 3</a>
    </li>
</sec:authorize>
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
                    <li class="ui-widget-content">
                        <div style="float: left;">${interest.name}</div>
                        <div style="float: right;">
                            <a class="updateInterest" id="${interest.id}" name="${interest.name}" href="#">Update</a>
                        </div>
                        <div style="float: right;">
                            <a class="deleteInterest" id="${interest.id}" href="#">Delete</a>
                        </div>
                    </li>
                </c:forEach>
            </ol>
        </div>
        <div>
            <button id="addInterest">Add Interest</button>
        </div>
    </div>
    <sec:authorize access="hasRole('ROLE_ADMIN')">
        <div id="tabs-3" class="ui-tabs-panel">
            <p>Content for Tab 3</p>
        </div>
    </sec:authorize>
</div>
<div id="tabid"></div>


<div id="dialog-form" title="Create new user">
    <p class="validateTips">All form fields are required.</p>

    <form>
        <fieldset>
            <label for="name">Name</label>
            <input type="text" name="name" id="name" value="Jane Smith" class="text ui-widget-content ui-corner-all">
            <label for="email">Email</label>
            <input type="text" name="email" id="email" value="jane@smith.com" class="text ui-widget-content ui-corner-all">
            <label for="password">Password</label>
            <input type="password" name="password" id="password" value="xxxxxxx" class="text ui-widget-content ui-corner-all">

            <!-- Allow form submission with keyboard without duplicating the dialog button -->
            <input type="submit" tabindex="-1" style="position:absolute; top:-1000px">
        </fieldset>
    </form>
</div>

<div id="users-contain" class="ui-widget">
    <h1>Existing Users:</h1>
    <table id="users" class="ui-widget ui-widget-content">
        <thead>
        <tr class="ui-widget-header ">
            <th>Name</th>
            <th>Email</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>John Doe</td>
            <td><a href="/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="d7bdb8bfb9f9b3b8b297b2afb6baa7bbb2f9b4b8ba">[email&#160;protected]</a></td>
            <td>johndoe1</td>
        </tr>
        </tbody>
    </table>
</div>
<button id="create-user">Create new user</button>

</body>
</html>
