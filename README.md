# LibraryManagementSystem
## About:
This project implements a basic CRUD application for a Library Management System using Java SpringBoot with MySql database. The application allows users to manage library books.

### Requirements:
* [JDK 17](https://www.eclipse.org/downloads/)
* [eclipse](https://www.eclipse.org/downloads/)
* [Apache Maven](https://maven.apache.org/install.html)
* MySQL Workbench 8.0 CE
* Lombok
* Port:http://localhost:8080

### Running the application locally
* Download the source code and import it to Eclipse.
* In src/main/resources open application.properties, and provide userName and password of your MySQL Workbench
* open src/main/java and expand com.hire3x.LibrearyManagementSystem package. Run LibraryManagementSystemApplication.java

### Steps to test in Postman
**Step 1:** Create a collection
  
* *Step 2:* Add a request
  
* *Step 3:* To Add Books 
  Select the POST method. For the body select raw, text as JSON.

In the Body Pass the values in JSON like this:

{

        "isbn": 2512,
        
        "title": "The Wings of Fire",
        
        "author": "A P J AbdulKalam",
        
        "publicationyear": "1999-01-07",
        
        "genre": "Autobiography"
        
    }
    
Then send this URL:http://localhost:8080/books 

* *Step 4:* To fetch All The Details of the Books

Add another request.

select the GET method and send this URL:http://localhost:8080/books

* *Step 5:* To Update a Book

Select the PUT method.

In the param section send the 'key' as 'isbn' and isbn of the book to be updated as 'value'.

For the body select raw, text as JSON.

Update the Body in JSON like this:

{

        "title": "The Wings of Fire",
        
        "author": "A P J AbdulKalam",
        
        "publicationyear": "1999-01-17",
        
        "genre": "Autobiography"
        
    }

send this URL:http://localhost:8080/books

* *Step 6:* To Delete a Book

Select the DEL method.

In the param section send the 'key' as 'isbn' and isbn of the book to be deleted as 'value'.

send this URL:http://localhost:8080/books


### Results:
