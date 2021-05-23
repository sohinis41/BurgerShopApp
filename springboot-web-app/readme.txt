I have build a very small application project on SpringBoot called "Burger Shop".
Features- 
1.Adding Burger Details from "Add Product" to database
2.Viewing all the added Burgers under "All Products" display section.
3.For every burger, if we click on continue, it will show Buy option along with Burger description.
4.Login user through "Your Account" tab.
5.Added validation for Login page where it is mandatory to give username and password.
6.SignUp user through "Not Registered Yet".
7.Update user email address giving new Email , valid username and password.


Details for every feature:
1. This feature is for the admin login. 
Admin user after login can add burger details .(Admin login feature is not taken care in this section yet.

2. In order to view burgers , first we need to add the burger. After that we can view burger details.

3. Buy option I haven't taken care for this assignment.

4. Although we can view UserLogin page after clicking on "Your Account", first we need to register ourself
 and then only we can login. After successful login, it will show login success page. In case, after login 
 we are on the login page , that means the user failed to login.
 
5. Under login page, if we keep any field blank and try to login, it will show validation message on the page.

6. While sign up, we need to give email, username and password. Email is not mandatory here.
 We can add email later through "Update user details".In case signup is successful, it will redirect to login page.
 
7. Updating email address will require valid usename and password. In case it doesnot match to database ,
 update will not occur. In case , updated successfully, it will go to home page directly.
 
Note: I have used H2 database for this project as it is lightweight and doesnot require additional support.
As this is a small assignment , so i have mainly focused on CRUD operations and kept the database lightweight.


