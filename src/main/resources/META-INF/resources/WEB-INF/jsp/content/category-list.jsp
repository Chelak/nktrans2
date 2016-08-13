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
       </tr>
   </c:forEach>




        </tbody>
    </table>
</div>