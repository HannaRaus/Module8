<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <title>GOIT</title>
    <link href="${contextPath}/view/css/common.css" rel="stylesheet"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <c:import url="/view/navibar.jsp"/>

        <div class="container">
            <form:form method="POST" modelAttribute="entityForm" class="form-signin" action="/manufacturers">
                <h2 class="form-signin-heading">Create manufacturer</h2>
                <form:input type="hidden" path="id" value="${entityForm.id}"/>

                <spring:bind path="name">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="text" path="name" class="form-control" placeholder="Name" autofocus="true"></form:input>
                        <form:errors path="name"></form:errors>
                    </div>
                </spring:bind>

                <spring:bind path="products">
                    <form:select class="form-control form-control-lg" path="products" name="products" items="${products}" itemLabel="name" itemValue="id" />
                </spring:bind>

                <button class="btn btn-outline-success btn-block" type="submit">Submit</button>
            </form:form>
        </div>

</body>
</html>