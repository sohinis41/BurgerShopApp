<%@ include file="header.jsp"%>
<!-- Section-->
<div class="container">
	<div class="row">
		<div class="col-sm-4">
			<div class="panel panel-primary">
				<div class="panel-heading">Add Burger</div>
				<div class="panel-body">
					<form:form modelAttribute="add" method="post"
						class="form-horizontal">
						<form:input path="name" type="text" />
						<form:input path="description" type="text" />
						<form:input path="price" type="text" />
						<form:button type='success' class="btn btn-success">Add</form:button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<br>
<%@ include file="footer.jsp"%>