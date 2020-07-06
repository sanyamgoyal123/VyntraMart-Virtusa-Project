<h1 class="my-4" style="position: relative; top: 20px;">Vyntra</h1>
<div class="list-group">
	<c:forEach var="category" items="${categories}">
		<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name}</a>
	</c:forEach>
</div>