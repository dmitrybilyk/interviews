var id = 0;
var name = "";
var description = "";

var actioCreate = false;
var actioEdit = false;

function fillTable(data) {
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
}

function addInterest() {
    var data = {};
    data["name"] = $("#name").val();
    data["description"] = $("#description").val();
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/add/interest",
        data: JSON.stringify(data),
        dataType: 'json',
        timeout: 600000,
        beforeSend: function () {
            document.getElementById("tdataDis").innerHTML = ""; // innerHTML is right for a div
        },
        success: function (response) {
            $("#dialogAddInterest").dialog("close");
            fillTable(response)
        },
        error: function (e) {
            alert("Notttt working");
        }
    });
}

function editInterest() {
    if (id!==0) {
        var data = {};
        data["id"] = $("#id").val();
        data["name"] = $("#name").val();
        data["description"] = $("#description").val();
        $.ajax({
            type: "PUT",
            contentType: "application/json",
            url: "/update/interest",
            data: JSON.stringify(data),
            dataType: 'json',
            timeout: 600000,
            beforeSend: function () {
                document.getElementById("tdataDis").innerHTML = ""; // innerHTML is right for a div
                //alert("delete");
            },
            success: function(data) {
                $("#dialogAddInterest").dialog("close");
                fillTable(data);
            },
            complete: function () {
            },
            error: function (e) {
                alert("Notttt working");
            }
        });
    }
}

function deleteInterest() {
    if (id!==0) {
        var data = {};
        data["id"] = id;
        $.ajax({
            type: "DELETE",
            url: "/delete/interest",
            contentType: "application/json",
            data: JSON.stringify(data),
            dataType: 'json',
            success: function(data) {
                fillTable(data)
            },
            beforeSend: function () {
                document.getElementById("tdataDis").innerHTML = ""; // innerHTML is right for a div
                //alert("delete");
            },
            complete: function () {
                // setUserPanel();
            }
        })
    }
}




$(function () {
    $("#dialogAddInterest").dialog({
        autoOpen: false,
        maxWidth: 850,
        maxHeight: 500,
        width: 850,
        height: 400,
        buttons: {
            "Save": function(e) {
                if (actioCreate) {
                    addInterest();
                } else if (actioEdit) {
                    editInterest();
                }
            },
            Cancel: function () {
                $(this).dialog("close");
            }
        }
    });

    $("#buttonAddNew").on("click", function () {
        actioCreate = true;
        actioEdit = false;
        $('#name').val("");
        $('#description').val("");

        $("#dialogAddInterest").dialog("open");
        $("#dialogAddInterest").dialog('title', 'Add a new interest');
    });

    $("#buttonEdit").on("click", function () {
        if (id !== 0 && name !== "") {
            actioCreate = false;
            actioEdit = true;

            $('#id').val(id);
            $('#name').val(name);
            $('#description').val(description);

            $("#dialogAddInterest").dialog({title: "Edit: "+name}).dialog('open');
            // $("#dialogAddInterest").dialog('title');
        } else {
            alert("Please select an interest you want to edit!");
        }
    });

    //$("#submit").click(function (e) {
    //    if (actioCreate) {
    //        addInterest();
    //    } else if (actioEdit) {
    //        editInterest();
    //    }
    //});

    var dialog, form, dialogConfirm;
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


        // From http://www.whatwg.org/specs/web-apps/current-work/multipage/states-of-the-type-attribute.html#e-mail-state-%28type=email%29
        //emailRegex = /^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/,
        //    name = $("#name"),
        //    email = $("#email"),
        //    password = $("#password"),
        //    allFields = $([]).add(name).add(email).add(password),
        //    tips = $(".validateTips");
        //function updateTips(t) {
        //    tips
        //        .text(t)
        //        .addClass("ui-state-highlight");
        //    setTimeout(function () {
        //        tips.removeClass("ui-state-highlight", 1500);
        //    }, 500);
        //}
        //function checkLength(o, n, min, max) {
        //    if (o.val().length > max || o.val().length < min) {
        //        o.addClass("ui-state-error");
        //        updateTips("Length of " + n + " must be between " +
        //            min + " and " + max + ".");
        //        return false;
        //    } else {
        //        return true;
        //    }
        //}
        //function checkRegexp(o, regexp, n) {
        //    if (!( regexp.test(o.val()) )) {
        //        o.addClass("ui-state-error");
        //        updateTips(n);
        //        return false;
        //    } else {
        //        return true;
        //    }
        //}


        dialog = $("#interest-add-edit-form").dialog({
            autoOpen: false,
            height: 400,
            width: 350,
            modal: true,
            buttons: {
                "Save": addInterest,
                Cancel: function () {
                    dialog.dialog("close");
                }
            },
            close: function () {
                form[0].reset();
            }
        });
        dialogConfirm = $("#confirm-delete-form").dialog({
            autoOpen: false,
            height: 200,
            width: 350,
            modal: true,
            buttons: {
                "Delete": deleteInterest(),
                Cancel: function () {
                    dialogConfirm.dialog("close");
                }
            },
            close: function () {
                form[0].reset();
            }
        });

        form = dialog.find("form").on("submit",
            function (event) {
                event.preventDefault();
                addUser();
            });

        $("#addInterest").button().on("click",
            function () {
                dialog.dialog("open");
            });
        $("#interestsDiv").on("click", ".deleteInterest",
            function () {
                dialogConfirm.dialog("open");
            });

        var start = 0;
        var nb = 5;
        var end = start + nb;
        var length = $('.img-list img').length;
        var list = $('.img-list img');

        list.hide().filter(':lt(' + (end) + ')').show();


        $('.prev, .next').click(function (e) {
            e.preventDefault();

            if ($(this).hasClass('prev')) {
                start -= nb;
            } else {
                start += nb;
            }

            if (start < 0 || start >= length) start = 0;
            end = start + nb;

            if (start == 0) list.hide().filter(':lt(' + (end) + ')').show();
            else list.hide().filter(':lt(' + (end) + '):gt(' + (start - 1) + ')').show();
        });
});
