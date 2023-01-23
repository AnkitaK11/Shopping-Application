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
	background-color: steelblue;
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
<body class="text-center" style="font-family: system-ui;">

	<div align="center" class="container-fluid"
		style="background-color: steelblue;">
		<div class="row content">
			<div class="col">
				<div class="col-sm-4">
					<div class="well">
						<div class="col align-self-center">
							<div class="well">
								<h4>Sign Up</h4>
								<table bgcolor=teal style="width: 60%">
									<tr>
										<td>Product Id</td>
										<td><input type="text" name="prodId" required="required" /></td>
									</tr>
									<tr>
										<td>Product Name</td>
										<td><input type="text" name="prodName"
											required="required" /></td>
									</tr>
									<tr>
										<td>Product Price</td>
										<td><input type="text" name="prodPrice"
											required="required" /></td>
									</tr>
									<tr>
										<td>Product Quantity</td>
										<td><input type="text" name="prodQty" required="required" /></td>
									</tr>
								</table>
							</div>
							<h4></h4>
							<input type="submit" value="REGISTER" />
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>