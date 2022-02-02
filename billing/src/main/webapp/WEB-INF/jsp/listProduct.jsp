<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>HPlus</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <%@ page isELIgnored="false"%>

</head>
<body>
<div class="container">
    <div class="col-md-offset-1 col-md-10">
        <h3 class="text-center">Product</h3>
        <hr />

        <input type="button" value="Add Product"
               onclick="window.location.href='showForm'; return false;"
               class="btn btn-primary" /> <br />
        <br />
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Product List</div>
            </div>
            <div class="panel-body">
                <table class="table table-striped table-bordered">
                    <tr>
                        <th>name</th>
                        <th>imagePath</th>
                        <th>Action</th>
                    </tr>

                    <!-- loop over and print our products -->
                    <c:forEach var="tempProduct" items="${products}">

                        <!-- construct an "update" link with product id -->
                        <c:url var="updateLink">
                            <c:param name="productId" value="${tempProduct.id}" />
                        </c:url>

                        <!-- construct an "delete" link with product id -->
                        <c:url var="deleteLink">
                            <c:param name="productId" value="${tempProduct.id}" />
                        </c:url>

                        <tr>
                            <td>${tempProduct.name}</td>
                            <td>${tempProduct.imagePath}</td>

                            <td>
                                <!-- display the update link --> <a href="${updateLink}">Update</a>
                                | <a href="${deleteLink}"
                                     onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
                            </td>

                        </tr>

                    </c:forEach>

                </table>

            </div>
        </div>
    </div>

</div>

</body>

</html>
