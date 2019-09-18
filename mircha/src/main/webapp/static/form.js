$(function () {
    var dialog, form, dialogConfirm;
    // jQuery(document).ready(function ($) {
        $("#tabs").tabs({
            activate: function (event, ui) {
                var active = $('#tabs').tabs('option', 'active');
            }
        });
        function extracted(htmlString) {
            htmlString += '<li class="ui-widget-content">' +
                '<div style="float: left;">' + this.name + '</div>'
                +
                '<div style="float: right;">' +
                '<a class="updateInterest" id=' + this.id + ' name=' + this.name + ' href="#">Update</a>' +
                '</div>' +
                '<div style="float: right;">' +
                '<a class="deleteInterest" id=' + this.id + ' href="#">Delete</a>' +
                '</div>' +
                '</li>';
            return htmlString;
        }
        function deleteInterest(id) {
            var data = {};
            data["id"] = id;
            $.ajax({
                type: "DELETE",
                contentType: "application/json",
                url: "/delete/interest",
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
                },
                error: function (e) {
                    alert("Noooooot working");
                }
            });
        }
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
        function addInterest() {
            var data = {};
            data["name"] = $("#name").val();
            data["description"] = $("#description").val();
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
                },
                error: function (e) {
                    alert("Notttt working");
                }
            });
            dialog.dialog("close");
            return true;
        }

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
    // });
});
