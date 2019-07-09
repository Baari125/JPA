<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>List shops</title>
    </head>
    <body>
        <h2>Shops:</h2>
        <div>
            <table>
                <tr>
                    <th>Nazwa</th>
                    <th>Kategoria</th>
                    <th>Ulica</th>
                    <th>Miasto</th>
                    <th>Kod</th>
                </tr>
                <c:forEach var="shops" items="${shops}" >
                    <tr>
                        <c:url var="update" value="/shops/updateShopForm">
                            <c:param name="shopId" value="${shops.id}"/>
                        </c:url>

                        <c:url var="delete" value="/shops/deleteShopForm">
                            <c:param name="shopId" value="${shops.id}"/>
                        </c:url>

                        <c:url var="select" value="/shops/selectShopForm">
                            <c:param name="shopId" value="${shops.id}"/>
                        </c:url>

                        <td>${shops.nazwa}</td>
                        <td>${shops.shopKategory.nazwa}</td>
                        <td>${shops.shopAddress.street}</td>
                        <td>${shops.shopAddress.city}</td>
                        <td>${shops.shopAddress.zipcode}</td>

                        <td><a href="${update}" >update</a> </td>
                        <td><a href="${delete}" >delete</a> </td>
                        <td><a href="${select}" >select</a> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div>
            <input type="button" value="Add Shop"
            onclick="window.location.href='shopadd';return false;" />
         </div>
    </body>
</html>
