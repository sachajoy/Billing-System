<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>H+ Sport</title>
<link rel="stylesheet" href="css/style.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>


<ul class="navbar">
                <li><a href="#">home</a></li>
                <li><a href="#">login</a></li>
                <li><a href="#">search</a></li>
				<li><a href="#">product</a></li>
                <li><a href="#">linkedin</a></li>
            </ul>


			<form action="/search" method="get">
				<label class="card-title">Search your product</label>
				 <input path="search" name="search" value="">
			    <input type="submit" value="Search">
			</form>

            <c:if test="${!empty(products)}">
    		<section id="products" class="section">

    		<div class="productContainer">
                            <c:forEach var="product" items="${products}">
            				<div class="productContainerItem">
            					<img id="pic1" src="${product.imagePath}">
            					<input type="text" name="product"
            						value="${product.name}"><br />

            				</div>
                        
 </c:forEach>
            		</div>

            </section>
            </c:if>

</body>
</html>