<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>shops</title>
    </head>
    <body>
        ADD SHOP
        <form:form action="saveShop" modelAttribute="shop" method="POST">
            <table>
                <tbody>
                    <td><form:hidden path="id"/></td>
                    <tr>
                        <td><label>nazwa:</label></td>
                        <td><form:input path="nazwa" /></td>
                    </tr>
                    <tr>
                        <td><label>kategoria:</label></td>
                        <td><form:input path="shopKategory.nazwa" /></td>
                    </tr>
                    <tr>
                        <td><label>ulica:</label></td>
                        <td><form:input path="shopAddress.street" /></td>
                    </tr>
                    <tr>
                        <td><label>miasto:</label></td>
                        <td><form:input path="shopAddress.city" /></td>
                    </tr>
                    <tr>
                        <td><label>kod:</label></td>
                        <td><form:input path="shopAddress.zipcode" /></td>
                    </tr>
                    <tr>
                        <td><label></label></td>
                        <td><input type="submit" value="Save" class="save" /></td>
                    </tr>
                </tbody>
            </table>
        </form:form>
/<!-- -wracamy do listy bez zapisu->
        <p>
            <a href="${pageContext.request.contextPath}/shops/list "> return </a>
        </p>
    </body>
</html>