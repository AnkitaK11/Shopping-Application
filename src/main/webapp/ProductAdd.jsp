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

/* Set gray background color and 100% height */
.sidenav {
	background-color: #f1f1f1;
	height: 100%;
}

/* On small screens, set height to 'auto' for the grid */
@media screen and (max-width: 767px) {
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body style="font-family: system-ui;">

	<form action="ProductController">
		<nav class="navbar navbar-inverse visible-xs">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">ADMIN</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#"> DASHBOARD</a></li>
						<li><a href="ProductAdd.jsp"> ADD PRODUCT </a></li>
					</ul>
				</div>
			</div>
		</nav>

		<div class="container-fluid" style="background-color: steelblue;">
			<div class="row content">
				<div class="col-sm-3 sidenav hidden-xs">
					<h2>ADMIN</h2>
					<ul class="nav nav-pills nav-stacked">
						<li class="active"><a href="#section1">DASHBOARD</a></li>
						<li><a href="ProductAdd.jsp"> ADD PRODUCT </a></li>
					</ul>
					<br>
				</div>
				<br>

				<div class="col-sm-9">
					<div class="well">
						<h4>Enter Product Details</h4>
						<table bgcolor=teal style="width: 60%">
							<tr>
								<td>Product Id</td>
								<td><input type="text" name="prodId" required="required" /></td>
							</tr>
							<tr>
								<td>Product Name</td>
								<td><input type="text" name="prodName" required="required" /></td>
							</tr>
							<tr>
								<td>Product Price</td>
								<td><input type="text" name="prodPrice" required="required" /></td>
							</tr>
							<tr>
								<td>Product Quantity</td>
								<td><input type="text" name="prodQty" required="required" /></td>
							</tr>
						</table>
						<h4></h4>
						<input type="submit" value="ADD" />
					</div>



					<div class="row">
						<div class="col-sm-12">
							<div class="well">
								<%!String str = null;%>
								<%
								str = (String) session.getAttribute("msg");
								session.invalidate();
								%>
								<h4><%=str%></h4>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-2">
							<div class="well">
								<a href="Dashboard.html"> Back </a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>