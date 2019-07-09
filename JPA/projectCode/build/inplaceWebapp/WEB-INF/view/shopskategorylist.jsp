<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>List shops kategory</title>
    </head>
    <body>
        <h2>Shops kategory:</h2>
        <div>
            <table>
                <tr>
                    <th>Nazwa</th>
                </tr>

                <c:forEach var="shopsKategory" items="${shopsKategory}" >
                    <tr>
                        <c:url var="update" value="/shopsKategory/updateShopKategoryForm">
                            <c:param name="shopKategoryId" value="${shopsKategory.id}"/>
                        </c:url>

                        <c:url var="delete" value="/shopsKategory/deleteShopKategoryForm">
                            <c:param name="shopKategoryId" value="${shopsKategory.id}"/>
                        </c:url>

                        <td>${shopsKategory.nazwa}</td>

                        <td><a href="${update}" >update</a> </td>
                        <td><a href="${delete}" >delete</a> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div>
            <input type="button" value="Add Shop Kategory"
            onclick="window.location.href='shopkategoryadd';return false;" />
        </div>
    </body>
</html>
