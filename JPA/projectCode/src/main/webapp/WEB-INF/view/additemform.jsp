<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>items</title>
    </head>
    <body>
        ADD ITEM
        <form:form action="saveItem" modelAttribute="item" method="POST">
            <table>
                <tbody>
                    <td><form:hidden path="id"/></td>
                    <tr>
                        <td><label>nazwa:</label></td>
                        <td><form:input path="nazwa" /></td>
                    </tr>
                    <tr>
                        <td><label>cena:</label></td>
                        <td><form:input path="cena" /></td>
                    </tr>
                    <tr>
                        <td><label>liczba:</label></td>
                        <td><form:input path="liczba" /></td>
                    </tr>
                    <tr>
                        <td><label>kategoria:</label></td>
                        <td><form:input path="itemKategory.nazwa" /></td>
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
            <a href="${pageContext.request.contextPath}/items/list "> return </a>
        </p>
    </body>
</html>