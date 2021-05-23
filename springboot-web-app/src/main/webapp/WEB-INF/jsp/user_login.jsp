<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ include file="header.jsp"%>

<div class="container">
	<div id="loginbox" style="margin-top: 50px"
		class="mainbox col-md-offset-4 col-center">
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="panel-title">Sign In</div>
			</div>
			<div style="padding-top: 30px" class="panel-body">
				<form:form modelAttribute="user" method="post"
					class="form-horizontal">
					<div style="margin-bottom: 25px" class="input-group" align="center">
						<form:input path="username" type="text"
							placeholder="Enter Username" />
					</div>
					<form:errors path="username" cssClass="text-danger" />
					<div style="margin-bottom: 25px" class="input-group" align="center">
						<form:input path="password" type='password'
							placeholder="Enter Password" />
					</div>
					<form:errors path="password" cssClass="text-danger" />
					<div style="margin-top: 10px" class="form-group" align="center">
						<div class="col-sm-12 controls">
							<form:button type='success' class="btn btn-success">Login</form:button>
						</div>

					</div>
				</form:form>
				<div class="col-sm-12 controls">
					<button type="submit" onclick="window.location.href='/user/signup'">Not
						Registered Yet</button>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
