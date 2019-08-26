<html>
<head>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

    <style>
        #feedback { font-size: 1.4em; }
        #selectable .ui-selecting { background: #FECA40; }
        #selectable .ui-selected { background: #F39814; color: white; }
        #selectable { list-style-type: none; margin: 0; padding: 0; width: 60%; }
        #selectable li { margin: 3px; padding: 0.4em; font-size: 1.4em; height: 18px; }
    </style>

<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>--%>
    <script>
        $(function () {
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
        });

    </script>

    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="styles/mircha.css"/>
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
    <div id="tabs-1">
        <img src="photos/1.jpg">
        <img src="photos/2.jpg">
        <img src="photos/3.jpg">
        <p>Content for Tab 1</p>
    </div>
    <div id="tabs-2">
        <ol id="selectable">
            <li class="ui-widget-content">Item 1</li>
            <li class="ui-widget-content">Item 2</li>
            <li class="ui-widget-content">Item 3</li>
            <li class="ui-widget-content">Item 4</li>
            <li class="ui-widget-content">Item 5</li>
            <li class="ui-widget-content">Item 6</li>
            <li class="ui-widget-content">Item 7</li>
        </ol>

        <div>
            <button id="addInterest">Add Interest</button>
        </div>
    </div>
    <div id="tabs-3">
        <p>Content for Tab 3</p>
    </div>
</div>
<div id="tabid"></div>


</body>
</html>
