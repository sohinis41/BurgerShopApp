<%@ include file="header.jsp"%>

<div class="container">
	<div class="row">
		<div class="col-sm-4">
			<div class="panel panel-primary">
				<div class="panel-heading">${burger.name}</div>
				<div class="panel-body">
					<p>Description: ${burger.description}</p>
					<p>Price : ${burger.price}</p>
				</div>
				<div class="panel-footer">
					<button type="button" class="btn btn-primary btn-md"
						onClick="location.href='/burgers/${burger.id} ' ">Buy</button>
				</div>
			</div>
		</div>
	</div>
</div>
<br>

<%@ include file="footer.jsp"%>