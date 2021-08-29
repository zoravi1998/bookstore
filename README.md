# Relevel Online Bookstore 

Relevel Online Bookstore – Java Spring Boot

Problem Statement:

Relevel is planning to build an online bookstore just like https://www.sapnaonline.com/ where users can buy books of different category or genre. You have to design & build the backend for this online bookstore application. It should have ability for the users to register, log in, place on order for a book, facility for the bookstore manger to add and remove books from the store.

Your task is to go through below templates/stories and create an online bookstore for the Relevel.

The tech stack required is Java and Spring Boot. Preferred IDE is Intellij/Eclipse to import the project directly. Postman tool to test the REST APIs. Make sure maven and .m2 etc are configured on local.


How to Set up the Application:

To get ready with building the application a basic or boilerplate template code is provided below.
Template Repo Link: https://github.com/RelevelBackendTest/bookstore 
Git clone the project from above location to your local system and import it any one of the IDE to get started.
  
Once you clone the application, then run the main class of the application  as a Java Application. The default port is set to 8080 for this application , and there is a sample endpoint to test the set up is complete. Open the sample URL localhost:8080\ping in browser to see a message “Ping is Successful” . This ensures the set up is complete.

Database Set Up :
The application is configured with an in-memory H2 Database .Dependency for the database is already added in the pom.xml file. You can access the console of the H2 database using the following link 

URL for H2 Database: locahost:8080/h2-console
Username : sa
Password : password

Note : You can create table for your problem statements using this database.
Problem Breakdown:

  **Template-1: Adding Books to Store  and its related functionality**

**Story-1: Adding Books to Bookstore (~30min)**
 As a book store manager, the manager  should be able to add books to the book store under different category.
      The task is to create an endpoint localhost:8080/book to add details of the book to online store.
1.	Choose appropriate HTTP methods (GET,POST,PUT,DELETE) to hit this URL.
2.	The user needs to provide the details of the book e.g. (Book Name, Author, Price Publisher Name, Publishing Year, Language, Category(e.g. Fiction, Non-Fiction, Children, Business etc.) , Number of Pages,)
3.	Basic validation on the attributes of the book should be performed .For e.g. Book name should be 100 chars max without any special character, Author Name should be 50 char max, Number of pages should be  in between 1-5000 etc.
4.	In case user provides wrong input , they should get a message saying “Bad Request by user” with appropriate HTTP status.
5.	In case user provides right set of inputs, the data should get stored in the database with an unique book ID, and user should get a response with message “Book added Successfully” with appropriate HTTP status

**Story-2 : Deleting Books from the Bookstore(~30 min)**
The task is to create an endpoint localhost:8080/book/{bookID} to delete  a given from the book store.
1.	Choose appropriate HTTP methods (GET,POST,PUT,DELETE) to hit this URL.
2.	The user needs to provide the BOOK ID in the URL to delete a book from the book store.
3.	In case the BOOK ID is not associated with any book , the user should get a response “Book Not found for requested ID” with appropriate HTTP status.
4.	In case book ID exists in the database , delete the book from the database and send a response “Book Deleted Successfully” with appropriate HTTP status.









**Story-3 : Search Books from the Bookstore(~30 min)**
          The task is to create an endpoint localhost:8080/book search provide a search functionality for the user to search a book based on different fields.
1.	Choose appropriate HTTP methods (GET,POST,PUT,DELETE) to hit this URL.
2.	The user needs to provide the different attributes of the book (e.g. Book Name, Author, Publisher Name, Publishing Year etc.) as an input in the request body to the end point.
3.	 Upon searching , we should get a list of BOOKS (with attributes) if it matches search criteria with appropriate HTTP status
4.	In case no books matches the search criteria , the user should get an empty list with appropriate HTTP status.


**Template -2: Adding User and its related functionality**

**Story -1 (~30 min): Create a User**
      The task is to create an endpoint localhost:8080/user so that we can create a user 
a.	Choose appropriate HTTP methods(GET,POST,PUT,DELETE) to hit this URL.
b.	The user should provide details like Name, Password, Phone Number, Email ID, Age, Gender, Address
c.	Validate the user input (e.g. valid phone numbers, valid email address, Age range from 5-100 years ,password should be 8 characters minimum etc.) before saving the details to database.
d.	 Create an appropriate table to store these details of the user
e.	Upon successful creation of the user return HTTP status as 201 with a message “User Created Successfully”.
f.	If user has provided wrong input , provide appropriate HTTP status


**Story -2 (~30 min): Login for the User**
      The task is to create an endpoint localhost:8080/login so that we can verify if user credentials are valid .
a.	Choose appropriate HTTP methods(GET,POST,PUT,DELETE) to hit this URL.
b. The user needs to provide email address as username and password to verify if the user credentials are correct
c. Authenticate the value against the data stored in the database and upon successful authentication return appropriate HTTP status with JWT token.
d. In case user has provided a wrong password , return a HTTP status as 401 with message as “Invalid Password”.
e. If the user name provided by the user doesn’t exist return a HTTP status as 404 with message “User does not exist”



**Story-3 (~ 30 min): Retrieve the Details of the user**
The task is to create an endpoint localhost:8080/user/{userid}  to fetch the user details 
1.	Choose appropriate HTTP methods (GET,POST,PUT,DELETE) to hit this URL.
2.	The user needs to provide the ID of the user to get user details as  response.
3.	In case user provides an ID which does not correspond to any user , they should see a HTTP 404 status with “No users for the given ID” as the response message.
4.	In case of Success , the user should see details of the user with appropriate HTTP status


**Template: 3 : Adding a book to User’s cart and its related functionality**

**Story-1: Adding a book to a cart of a user (~30 min)**
The task is to create an endpoint localhost:8080/cart so that add books to the cart of a given user  
1.	Choose appropriate HTTP methods (GET,POST,PUT,DELETE) to hit this URL.
2.	User needs to provide an existing userID , existing BookID , no of quantity in the body of the request to add a book to the cart.
3.	In case of User ID or BookID don’t exist , send a response to the user “BOOK or USER don’t exist” with appropriate HTTP status.
4.	In case of correct input by the user the book should get added to the user’s cart and cart details are stored in the database. The user should get a response “Book Added Successfully to the Cart” with an appropriate HTTP response

 **Story-2 : Viewing the cart of a user (~30 min)**
       The task is to create an endpoint localhost:8080/cart/{userID} to view the cart of a given user.
1.	Choose appropriate HTTP methods (GET,POST,PUT,DELETE) to hit this URL.
2.	We need to provide the UserID of the user in the URL to view its cart. e.g localhost:8080/cart/5 .
3.	In case the userID does not exist , the end point should send a response “User Not Found” with appropriate HTTP status.
4.	In case a valid userID is provided , the user should get a list of Books the corresponding user has added to the cart with appropriate HTTP response.
5.	In case the user does not have any book added to its cart , the end point should send a empty list.




**Story-3 : Deleting the books from the User’s cart (~30 min)**
The task is to create an endpoint localhost:8080/cart
1.	Choose appropriate HTTP methods (GET,POST,PUT,DELETE) to hit this URL.
2.	We need to provide the UserID, BookID in the request body to delete a book from user’s cart.
3.	In case of User ID or BookID don’t exist , send a response to the user “BOOK or USER don’t exist” with appropriate HTTP status.
4.	In case of valid user ID and Book ID , delete the book from user’s cart with a response “Deleted Successfully from User’s Cart” with appropriate HTTP status




