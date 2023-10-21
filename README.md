# LibraryManagementSystem
## About:
This project implements a basic CRUD application for a Library Management System using Java SpringBoot with MySql database. The application allows users to manage library books.

### Requirements:
* [JDK 17](https://www.eclipse.org/downloads/)
* [eclipse](https://www.eclipse.org/downloads/)
* [Apache Maven](https://maven.apache.org/install.html)
* [MySQL Woekbench 8.0 CE]
* [Lombok]
* Port:http://localhost:8080

### Running the application locally
* Download the source code and import it to Eclipse.
* In src/main/resources open application.properties, provide usserName and password of your MySQl Workbench
* open src/main/java and expand com.hire3x.LibrearyManagementSystem package. Run LibraryManagementSystemApplication.java

### Steps to test in Postman
*Step 1:* Create a collection 
*Step 2:* Add a request
*Step 3:* To Add Books 
In POST method for body selct raw, text as JSON.
In the Body Pass the values in JSON like this:
{
        "isbn": 2512,
        "title": "The Wings of Fire",
        "author": "A P J AbdulKalam",
        "publicationyear": "1999-01-07",
        "genre": "Autobiography"
    }
Then send http://localhost:8080/books 
