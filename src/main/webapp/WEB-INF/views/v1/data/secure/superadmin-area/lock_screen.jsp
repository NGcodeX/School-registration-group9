<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Verrouillage</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap core CSS -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Font Awesome -->
    <link href="css/font-awesome.min.css" rel="stylesheet">

    <!-- Perfect -->
    <link href="css/app.min.css" rel="stylesheet">

</head>

<body style="background-color:#3a3a3a;">

<!--Modal-->
<div class="modal fade lock-screen-wrapper" id="lockScreen">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-body">
                <div class="lock-screen-img">
                    <img src="img/user.jpg" alt="">
                </div>

                <div class="text-center m-top-sm">
                    <div class="h4 text-white">${usermatricule}</div>

                    <div class="input-group m-top-sm">
                        <form class="form-login" method="post" action="verrouiller?matricule=${usermatricule}">
                            <input type="password" required name="password" class="form-control text-sm" placeholder="Entrer votre mot de passe">
                            <span class="input-group-btn">
										<button><i class="fa fa-arrow-right"></i></button>
								</span>
                        </form>
                    </div>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->

<!-- Jquery -->
<script src="js/jquery-1.10.2.min.js"></script>

<!-- Bootstrap -->
<script src="bootstrap/js/bootstrap.min.js"></script>

<!-- Modernizr -->
<script src='js/modernizr.min.js'></script>

<!-- Pace -->
<script src='js/pace.min.js'></script>

<!-- Popup Overlay -->
<script src='js/jquery.popupoverlay.min.js'></script>

<!-- Slimscroll -->
<script src='js/jquery.slimscroll.min.js'></script>

<!-- Cookie -->
<script src='js/jquery.cookie.min.js'></script>

<!-- Perfect -->
<script src="js/app/app.js"></script>

<script>
    $(function () {
        $('#lockScreen').modal({
            show: true,
            backdrop: 'static'
        })
    });
</script>
</body>
</html>
