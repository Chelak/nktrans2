<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container">
    <h3>Add new category</h3>

    <form:form method="POST" action="/category/add-category" modelAttribute="category">
        <table>
            <tr>
                <td><form:label path="title">Category Title</form:label></td>
                <td><form:input path="title"/></td>
            </tr>

            <tr>
                <td><form:label path="description">Category Description</form:label></td>
                <td><form:textarea path="description"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>
</div>