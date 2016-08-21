<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Category Title</th>
            <th>Category  Description</th>
        </tr>
        </thead>
        <tbody>
   <c:forEach var="category" items="${categories}">
       <tr>
           <td>${category.id}</td>
           <td>${category.title}</td>
           <td>${category.description}</td>
           <td><button type="button" class="btn btn-primary" onclick="window.location.href='/category/${category.id}/edit'">Edit</button></td>
       </tr>
   </c:forEach>




        </tbody>
    </table>
</div>