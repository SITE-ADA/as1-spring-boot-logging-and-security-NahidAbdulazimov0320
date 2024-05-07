Assignment 1
Creating a simple crud application.
Dear students,

In this assignment, you need to submit your Spring Boot application similar to what we practiced in class. It requires additional reading and practicing. The requirements are simple:

Task related: (70%)
Create two entities Note: these entities should have either one-to-many or many-to-many bidirectional relationship.
Use H2 Database to store the data (make sure you add some records before launching the application).
Enable the user to do operations like Create, Retrieve, Update, Delete (e.g., create a new user, list all users, update an existing user, delete a user).
Use your design knowledge from WM1 to enhance the project with CSS files and make it user friendly.
Add query methods to the repository (e.g., findStudentByCourseName).
Write additional JPA @Query (non-native)
Task related: (10%)
Create a home page where you provide links to the pages (e.g., students and courses separately).
Design it as you prefer using your design knowledge from WM1 to have a user friendly page.
Task related: (20%)
Create Add/Remove for the cross-relationship (like removal or addition of courses for the Student).
Write native queries with some advanced SQL.
Bonus: (10 %)
Bonus (3%): Add Pagination to each view where you list entities.
Bonus (3%): Add Sorting to each view where you list entities based on each field.
Bonus (4%): Add Filtration to each view where you list entities based on each field.
Submission related:
Make sure you configured your git client (i.e., username and email is set). Use firstname_lastname as the username.
Please, also ensure that you regularly check, add and commit your changes to the remote repo so that we can see your progress.
Things to be submitted to the BB grader in a .zip format:
Documentation pages of your app created by the Gradle, (during the development use javadoc comments appropriately)
This README.md file updated to have
the instructions on how to start and use the application
link to the video recording
Application source after ./gradlew clean
Note: Please work every day; this is definitely not a task you can complete on the last day! To keep track of the progress, create a git repository, commit, and push each change (ideally at least every time you complete a feature) to the repository. Ensure that you have at least 1 commit a day STARTING from March 7th otherwise you will lose points.

For late submissions please refer to the SYLLABUS.

This assignment will give you 15% of the total.
Good luck!
NS




Instructions:
We have 2 entities: Student and Course.
To perform CRUD operations on them and some more, users should access localhost:8080/main.html page after executing the project through any of the java files.
Student and Course operations are separated. After entering chosen page, all CRUD operations will be obvious to unterstand because interface is userfriendly and self-explanatry. 
Additionally, there is a function not present in the webpage. Accessing a list of students through their name. User should change the url to localhost:8080/students/name/{name} and the list will be presented. 
To access the database, use localhost:8080/h2-database. Password:123


Link to video:
https://youtu.be/mUwsU--2DpM