<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %><html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/themes/ui-darkness/jquery-ui.css" rel="stylesheet">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/Dynatable/0.3.1/jquery.dynatable.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="static/css/app.css"/>
    <link rel="stylesheet" type="text/css" href="static/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="static/css/mircha.css"/>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/Dynatable/0.3.1/jquery.dynatable.js"></script>
    <script src="static/form.js" ></script>

    <script>
        $(document).ready(function() {
            $('#tab-1').click(function() {
                $('#tabs-1').show();
                return false;
            });
            $('#tab-2').click(function() {
                $('#tabs-2').open();
                return false;
            });

            $.ajax({
                type : "GET",
                url : "/load/interests",
                timeout : 100000,
                cache    : false,
                data : {
                },
                beforeSend: function(){
                },
                complete: function(){

                },
                success : function(data) {
                    // alert(data);
                    console.log(data);
                    // var response = JSON.parse(data);
                    // console.log(response);
                    $('#tableIdToFill').dynatable({

                        dataset: {
                            records: data
                        }
                    });

                },
                error : function(e) {
                    alert("userContext");
                    console.log("ERROR: ", e);

                },
                done : function(e) {
                }
            });


        });

    </script>

</head>
<body>
<nav style="background: teal;" class="navbar navbar-default">
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
            <li style="float: right;"><a href=""><h4 class="meniItem"><sec:authentication property="name"/></h4></a></li>
            <li style="float: right; margin-right: 10px"><a href="${pageContext.request.contextPath}/logout" class="logout">
                <h4 class="meniItem">Logout</h4></a></li>
        </ul>
    </div>
</nav>

<div id="tabs">
    <div id="tabs-1"  class="ui-tabs-panel">
        <img data-enlargable style="cursor: zoom-in" src="photos/1.jpg">
        <img data-enlargable style="cursor: zoom-in" src="photos/2.jpg">
        <img data-enlargable style="cursor: zoom-in" src="photos/3.jpg">
        <p>Content for Tab 1</p>
    </div>
    <div id="tabs-2" class="ui-tabs-panel">
        <table id="tableIdToFill" class="display" cellspacing="0" width="98%">
            <thead>
            <tr>
                <th>Name</th>
                <th>Description</th>
            </tr>
            </thead>
        </table>
    </div>
    <sec:authorize access="hasRole('ROLE_ADMIN')">
    <div id="tabs-3" class="ui-tabs-panel">
        <p>Content for Tab 3</p>
    </div>
    </sec:authorize>
</div>

<div id="interest-add-edit-form" title="Add/Edit interest">
    <form id="interestsForm">
        <fieldset>
            <label for="name">Name</label>
            <input type="text" name="name" id="name" class="text ui-widget-content ui-corner-all">
            <label for="description">Description</label>
            <input type="text" name="description" id="description" class="text ui-widget-content ui-corner-all">
            <!-- Allow form submission with keyboard without duplicating the dialog button -->
            <!--<input type="submit" id="submit" value="Create" tabindex="-1" style="position:absolute; top:-1000px">-->
        </fieldset>
    </form>
</div>
<div id="confirm-delete-form" title="Delete interest">
    <p>Are you really want to delete this interest?</p>
</div>
</body>
</html>
