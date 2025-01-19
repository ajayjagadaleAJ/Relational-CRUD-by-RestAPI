# Relational-CRUD-by-RestAPI
Nimap Company's machine test task using springboot,DataJPA and Postgresql database to create CRUD operation with product and categories having one-to-many relation relations.

# Category CRUD operation:

 <table>
        <thead>
            <tr>
                <th>Method</th>
                <th>URL</th>
                <th>Description</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>POST</td>
                <td> http://localhost:8080/api/categories/savedata</td>
                <td>Create a new category</td>
            </tr>
            <tr>
                <td>GET</td>
                <td>http://localhost:8080/api/categories/getall?page=1&size=5</td>
                <td>Get all the categories with pagination (page 1, size 5)</td>
            </tr>
            <tr>
                <td>PUT</td>
                <td>http://localhost:8080/api/categories/updatebyId/{id}</td>
                <td>Update a category by its ID</td>
            </tr>
            <tr>
                <td>DELETE</td>
                <td>http://localhost:8080/api/categories/deletebyId/{id}</td>
                <td>Delete a category by its ID</td>
            </tr>
        </tbody>
    </table>

 # Product CRUD Operation:

<table>
        <thead>
            <tr>
                <th>Method</th>
                <th>URL</th>
                <th>Description</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>POST</td>
                <td> http://localhost:8080/api/product/savedata</td>
                <td>Create a new product</td>
            </tr>
            <tr>
                <td>GET</td>
                <td>http://localhost:8080/api/product/getall?page=1&size=5</td>
                <td>Get all the product with pagination (page 1, size 5)</td>
            </tr>
            <tr>
                <td>PUT</td>
                <td>http://localhost:8080/api/product/updatebyId/{id}</td>
                <td>Update a product by its ID</td>
            </tr>
            <tr>
                <td>DELETE</td>
                <td>http://localhost:8080/api/product/deletebyId/{id}</td>
                <td>Delete a product by its ID</td>
            </tr>
        </tbody>
    </table>
   
