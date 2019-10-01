<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/themes/ui-darkness/jquery-ui.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css"
          href="https://cdnjs.cloudflare.com/ajax/libs/Dynatable/0.3.1/jquery.dynatable.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="static/css/app.css"/>
    <link rel="stylesheet" type="text/css" href="static/css/appStyle.css"/>
    <link rel="stylesheet" type="text/css" href="static/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="static/css/mircha.css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>
    <script type="text/javascript"
            src="https://cdnjs.cloudflare.com/ajax/libs/Dynatable/0.3.1/jquery.dynatable.js"></script>
    <script src="static/form.js"></script>

    <script>
        function setUserPanel() {
            $.ajax({
                type: "GET",
                url: "/load/interests",
                timeout: 100000,
                cache: false,
                data: {},
                beforeSend: function () {
                    document.getElementById("tdataDis").innerHTML = ""; // innerHTML is right for a div
                    //alert("delete");
                },
                complete: function () {
                },
                success: function (data) {
                    // var response = JSON.parse(data);
                    $(function () {
                        $.each(data, function (i, item) {
                            $('<tr>').append(
                                    $('<td class="i">').text(item.id),
                                    $('<td class="n">').text(item.name),
                                    $('<td class="d">').text(item.description)
                            ).appendTo('#tdataDis');
                        });
                    });
                    $("tbody tr").click(function () {
                        $('.selected').removeClass('selected');
                        $(this).addClass("selected");
                        id = $('.i', this).html();
                        name = $('.n', this).html();
                        description = $('.d', this).html();
                    });
                },
                error: function (e) {
                    alert("userContext");
                    console.log("ERROR: ", e);

                },
                done: function (e) {
                }
            });
        }

        $(document).ready(function () {
            $('.tab-1').click(function () {
                $('#tabs-1').show();
                $('#tabs-2').hide();
                return false;
            });
            $('.tab-2').click(function () {
                $('#tabs-2').show();
                $('#tabs-1').hide();
                return false;
            });
            setUserPanel();
        });
    </script>

</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="active navbar-brand" href="#"><h4 class="meniItem">Mircha</h4></a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="#" class="tab-1"><h4 class="meniItem">Photos</h4></a></li>
            <li><a href="#" class="tab-2"><h4 class="meniItem">Interests</h4></a></li>
            <sec:authorize access="hasRole('ROLE_ADMIN')">
                <li><a href="#tabs-3"><h4 class="meniItem">Tab 3</h4></a></li>
            </sec:authorize>
        </ul>
        <ul class="nav navbar-nav" style="float: right">
            <li style="float: right;"><a href=""><h4 class="meniItem"><sec:authentication property="name"/></h4></a>
            </li>
            <li style="float: right; margin-right: 10px"><a href="${pageContext.request.contextPath}/logout"
                                                            class="logout">
                <h4 class="meniItem">Logout</h4></a></li>
        </ul>
    </div>
</nav>

<div id="tabs">
    <div id="tabs-1" class="ui-tabs-panel">
        <div class="divContainer">
            <h4>Micha's photos:</h4>
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
                <!-- Wrapper for slides -->
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="photos/1.jpg">
                    </div>
                    <div class="item">
                        <img src="photos/2.jpg">
                    </div>
                    <div class="item">
                        <img src="photos/3.jpg">
                    </div>
                </div>
                <!-- Left and right controls -->
                <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
            <%--<div class="gallery">--%>
                <%--<div class="img-list">--%>
                    <%--<img data-enlargable style="cursor: zoom-in" src="photos/1.jpg">--%>
                    <%--<img data-enlargable style="cursor: zoom-in" src="photos/2.jpg">--%>
                    <%--<img data-enlargable style="cursor: zoom-in" src="photos/3.jpg">--%>
                <%--</div>--%>
                <%--<a href="#" class="prev">Prev</a>--%>
                <%--<a href="#" class="next">Next</a>--%>
            <%--</div>--%>
            <%--<p>TODO some text</p>--%>
        </div>
    </div>
    <div id="tabs-2" class="ui-tabs-panel">
        <div class="divContainer">
            <h4>Mircha is interest in: </h4>
            <table id="tableIdToFill" class="display tableData" cellspacing="0" width="98%">
                <thead>
                <tr><td style="background: darkcyan" colspan=3>
                    <button class="btn" id="buttonAddNew" >New</button>
                    <button class="btn" id="buttonEdit" >Edit</button>
                    <button class="btn" onclick="deleteInterest()">Delete</button>
                </td></tr>
                <tr>
                    <th>Id</th><th>Name</th><th>Description</th>
                </tr>
                </thead>
                <tbody id="tdataDis">

                </tbody>
            </table>
        </div>
    </div>
    <sec:authorize access="hasRole('ROLE_ADMIN')">
        <div id="tabs-3" class="divContainer ui-tabs-panel">
            <p>Content for Tab 3</p>
        </div>
    </sec:authorize>
</div>

<%--<div id="interest-add-edit-form" title="Add/Edit interest">--%>
    <%--<form id="interestsForm">--%>
        <%--<fieldset>--%>
            <%--<label for="name">Name</label>--%>
            <%--<input type="text" name="name" id="name" class="text ui-widget-content ui-corner-all">--%>
            <%--<label for="description">Description</label>--%>
            <%--<input type="text" name="description" id="description" class="text ui-widget-content ui-corner-all">--%>
            <%--<!-- Allow form submission with keyboard without duplicating the dialog button -->--%>
            <%--<!--<input type="submit" id="submit" value="Create" tabindex="-1" style="position:absolute; top:-1000px">-->--%>
        <%--</fieldset>--%>
    <%--</form>--%>
<%--</div>--%>
<%--<div id="confirm-delete-form" title="Delete interest">--%>
    <%--<p>Are you really want to delete this interest?</p>--%>
<%--</div>--%>


<div style="height: 250px; width: 500px" id="dialogAddInterest" title="Add a new Interest">
        <div hidden>
            <label class="control-lb" for="name">Id :</label>
            <div class="col-sm-8">
                <input id="id" type="text" class="form-control" value=""  placeholder="Id"/>
            </div>
        </div><br/>
        <div class="form-group">
            <label class="control-lb col-sm-4" for="name">Name :</label>
            <div class="col-sm-8">
                <input id="name" type="text" class="form-control" value=""  placeholder="Name"/>
            </div>
        </div><br/>
        <div class="form-group">
            <label class="control-lb col-sm-4" for="description">Description:</label>
            <div class="col-sm-8">
                <input id="description" type="text" class="form-control" value=""   placeholder="Description"/>
            </div>
        </div><br/>
       <%--<div class="col-sm-offset-8 col-sm-4">--%>
        <%--<input class="btn" id="submit" type="button" value="Save">--%>
    <%--</div>--%>

</div>

</body>
</html>
