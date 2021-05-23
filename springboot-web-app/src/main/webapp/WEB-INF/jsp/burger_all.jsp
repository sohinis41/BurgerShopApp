
<%@ include file="header.jsp"%>

<div class="container">
	<div class="row">
		<c:forEach items="${burgers}" var="burger">
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">${burger.name}</div>
					<div class="panel-body">
						<p>Price : ${burger.price}</p>
					</div>
					<div class="panel-footer">
						<button type="button" class="btn btn-primary btn-md"
							onClick="location.href='/burgers/${burger.id}' ">Continue</button>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</div>
<br>
<!--   </section> -->
<%@ include file="footer.jsp"%>