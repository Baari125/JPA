<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Shop</title>
    </head>
    <body>
        <h2>Shop items:</h2>
        <div>
            <table>
                <tr>
                    <th>Nazwa</th>
                    <th>Cena</th>
                    <th>Liczba</th>
                    <th>Kategoria</th>
                </tr>
                <c:forEach var="items" items="${items}" >
                    <tr>
                        <td><form:hidden path="id"/></td>
                        <td>${items.nazwa}</td>
                        <td>${items.cena}</td>
                        <td>${items.liczba}</td>
                        <td>${items.itemKategory.nazwa}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
