<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %><html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="styles/mircha.css"/>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="static/form.js" ></script>

    <style>
        label, input { display:block; }
        input.text { margin-bottom:12px; width:95%; padding: .4em; }
        fieldset { padding:0; border:0; margin-top:25px; }
        h1 { font-size: 1.2em; margin: .6em 0; }
        div#users-contain { width: 350px; margin: 20px 0; }
        div#users-contain table { margin: 1em 0; border-collapse: collapse; width: 100%; }
        div#users-contain table td, div#users-contain table th { border: 1px solid #eee; padding: .6em 10px; text-align: left; }
        button { border: 1px solid transparent; margin-top: 20px; }
        .deleteInterest {margin-right: 20px}
    </style>

    <script>

    </script>

</head>
<body>
<div style="width: 100%;"><div style="float:left; margin-left: 30px"><h2>Mircha</h2></div><div style="float: right;"><sec:authentication property="name"/></div>
    <div style="float: right; margin-right: 20px"><a href="${pageContext.request.contextPath}/logout">Logout</a></div></div>

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

<div id="interest-add-edit-form" title="Add/Edit interest">
    <p class="validateTips">All form fields are required.</p>
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
