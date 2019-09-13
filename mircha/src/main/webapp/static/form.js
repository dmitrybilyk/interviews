
    $( function() {
    var dialog, form,

    // From http://www.whatwg.org/specs/web-apps/current-work/multipage/states-of-the-type-attribute.html#e-mail-state-%28type=email%29
    emailRegex = /^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/,
    name = $( "#name" ),
    email = $( "#email" ),
    password = $( "#password" ),
    allFields = $( [] ).add( name ).add( email ).add( password ),
    tips = $( ".validateTips" );

    function updateTips( t ) {
    tips
    .text( t )
    .addClass( "ui-state-highlight" );
    setTimeout(function() {
    tips.removeClass( "ui-state-highlight", 1500 );
}, 500 );
}

    function checkLength( o, n, min, max ) {
    if ( o.val().length > max || o.val().length < min ) {
    o.addClass( "ui-state-error" );
    updateTips( "Length of " + n + " must be between " +
    min + " and " + max + "." );
    return false;
} else {
    return true;
}
}

    function checkRegexp( o, regexp, n ) {
    if ( !( regexp.test( o.val() ) ) ) {
    o.addClass( "ui-state-error" );
    updateTips( n );
    return false;
} else {
    return true;
}
}

    function addUser() {
    // var valid = true;
    // allFields.removeClass( "ui-state-error" );
    //
    // valid = valid && checkLength( name, "username", 3, 16 );
    // valid = valid && checkLength( email, "email", 6, 80 );
    // valid = valid && checkLength( password, "password", 5, 16 );
    //
    // valid = valid && checkRegexp( name, /^[a-z]([0-9a-z_\s])+$/i, "Username may consist of a-z, 0-9, underscores, spaces and must begin with a letter." );
    // valid = valid && checkRegexp( email, emailRegex, "eg. ui@jquery.com" );
    // valid = valid && checkRegexp( password, /^([0-9a-zA-Z])+$/, "Password field only allow : a-z 0-9" );
    //
    // if ( valid ) {

        // $("#addInterest").click(function (event) {
        var data = {};
            data["name"] = $("#name").val();
            data["description"] = $("#description").val();
            // var name = prompt("Please enter your name","").trim();
            // if (!!name) {
            //     var data = {};
            //     data["name"] = name;
                $.ajax({
                    type: "POST",
                    contentType: "application/json",
                    url: "/mircha/add/interest",
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
            // } else {
            //     alert("Nothing to add, bye!");
            // }
        // });


    // $( "#users tbody" ).append( "<tr>" +
    // "<td>" + name.val() + "</td>" +
    // "<td>" + email.val() + "</td>" +
    // "<td>" + password.val() + "</td>" +
    // "</tr>" );
    dialog.dialog( "close" );
// }
    return true;
}

    dialog = $( "#interest-add-edit-form" ).dialog({
    autoOpen: false,
    height: 400,
    width: 350,
    modal: true,
    buttons: {
    "Create interest": addUser,
    Cancel: function() {
    dialog.dialog( "close" );
}
},
    close: function() {
    form[ 0 ].reset();
    allFields.removeClass( "ui-state-error" );
}
});

    form = dialog.find( "form" ).on( "submit", function( event ) {
    event.preventDefault();
    addUser();
});

    $( "#addInterest" ).button().on( "click", function() {
    dialog.dialog( "open" );
    // $( "#create-user" ).button().on( "click", function() {
    // dialog.dialog( "open" );
});
} );
