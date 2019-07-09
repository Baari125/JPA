<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>List items kategory</title>
    </head>
    <body>
        <h2>Items kategory:</h2>
        <div>
            <table>
                <tr>
                    <th>Nazwa</th>
                </tr>

                <c:forEach var="itemsKategory" items="${itemsKategory}" >
                    <tr>
                        <c:url var="update" value="/itemsKategory/updateItemKategoryForm">
                            <c:param name="itemKategoryId" value="${itemsKategory.id}"/>
                        </c:url>

                        <c:url var="delete" value="/itemsKategory/deleteItemKategoryForm">
                            <c:param name="itemKategoryId" value="${itemsKategory.id}"/>
                        </c:url>

                        <td>${itemsKategory.nazwa}</td>

                        <td><a href="${update}" >update</a> </td>
                        <td><a href="${delete}" >delete</a> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div>
            <input type="button" value="Add Item Kategory"
            onclick="window.location.href='itemkategoryadd';return false;" />
        </div>
    </body>
</html>
