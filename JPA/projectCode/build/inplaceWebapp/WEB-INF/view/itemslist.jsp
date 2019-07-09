<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>List items</title>
    </head>
    <body>
        <h2>Items:</h2>
        <div>
            <table>
                <tr>
                    <th>Nazwa</th>
                    <th>Cena</th>
                    <th>Ilosc</th>
                    <th>Kategoria</th>
                </tr>
                <c:forEach var="items" items="${items}" >
                    <tr>
                        <c:url var="update" value="/items/updateItemForm">
                            <c:param name="itemId" value="${items.id}"/>
                        </c:url>

                        <c:url var="delete" value="/items/deleteItemForm">
                            <c:param name="itemId" value="${items.id}"/>
                        </c:url>
                        <td>${items.nazwa}</td>
                        <td>${items.cena}</td>
                        <td>${items.liczba}</td>
                        <td>${items.itemKategory.nazwa}</td>

                        <td><a href="${update}" >update</a> </td>
                        <td><a href="${delete}" >delete</a> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div>
            <input type="button" value="Add Item"
            onclick="window.location.href='itemadd';return false;" />
         </div>
    </body>
</html>
