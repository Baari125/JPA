<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>items kategory</title>
    </head>
    <body>
        ADD ITEM KATEGORY
        <form:form action="saveItemKategory" modelAttribute="itemKategory" method="POST">
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
            <a href="${pageContext.request.contextPath}/itemsKategory/list "> return </a>
        </p>
    </body>
</html>