<!DOCTYPE html>
<html lang="en">
<head>
<title>Admin</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 745px
}

.sidenav {
	background-color: #f1f1f1;
	height: 100%;
}

@media screen and (max-width: 767px) {
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body class="text-center" style="font-family: system-ui;">

	<div class="container-fluid" style="background-color: #f1f1f1;">
		<div class="row content">
			<div class="col-sm-3 sidenav visible-xs">
			</div>
			<br>
			<div class="row" >
				<div class="col-sm-5">
				
					<div class="well">
						<ul class="nav nav-pills nav-stacked">
							<li class="active"><a href="User.jsp"><strong>ADMIN DASHBOARD</strong> </a></li>
							<li><a ></a></li>
							<li class="active"><a href="Admin.jsp"> <strong>USER DASHBOARD</strong> </a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>