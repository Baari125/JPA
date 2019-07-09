<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>shops kategory</title>
    </head>
    <body>
        ADD SHOP KATEGORY
        <form:form action="saveShopKategory" modelAttribute="shopKategory" method="POST">
            <table>
                <tbody>
                    <td><form:hidden path="id"/></td>
                    <tr>
                        <td><label>nazwa:</label></td>
                        <td><form:input path="nazwa" /></td>
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
            <a href="${pageContext.request.contextPath}/shopsKategory/list "> return </a>
        </p>
    </body>
</html>