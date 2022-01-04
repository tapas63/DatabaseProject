                                       FUNDAMENTAL OF DATABASE FINAL PROJECT REPORT

Project Name-Sardar Motor Leasing Management System

TECHNOLOGY USED FOR THE PROJECT
Mysql workbench ---Database tool 
JAVA---------------------Programming language
Maven------------------Build Tool and dependency management tool(no need to download separate tools maven will take care.)
Spring boot------------Application Development
Spring data jpa-------database connectivity
Jsp------------------------UI design
Jstl------------------------looping in UI to print the database data
Boot strap--------------front-end framework



Step to configure the project.

•	Download the project and unzip the project
•	Import the project any editor like eclipse, visual studio…
•	Go to application.properties file under the resources package update the below details of database used in your local system.
                 spring.datasource.url=jdbc:mysql://localhost:3306/Sardarleasingmanagement
spring.datasource.username=root
spring.datasource.password=(password of database)
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

•	Run the Maven  project pom.xml file to download all the dependency of the project. 
Maven command—mvn clean install.
•	Go to the SardarleasingmanagementApplication.java file under the com.example.Sardarleasingmanagement package Rightclick> Run as> java application.
•	Once Application is up and running open a Tab of google chrome
•	Enter the below URL
              http://localhost:8080/























ER Diagram.

 

Data population in different tables Database(Few database table screenshot populating data)


1.	SUV Table

 
2.	Sedan

 




3.	Pickup Truck
 



4.	Van
 







5.	Employee

 

6.	Customer

 






7.	sardar_motor_leasing_and_co

 

8.	leasing office

 






9.	location

 

10.	Customer email

 






11.	Customer email

 
Modules and Functionality of Application
Functionality of Application.
1.	Login page
•	Username-admin
•	Password-admin

 

2.	Dashboard
•	All the links available for navigating the pages leasing office, customer details, employee details.
•	Logo of the company
•	 Header section also available to navigate to different pages like leasing office, customer details, employee details.
•	Login and logout

 



3.	Leasing Office
•	Displaying Employee Details
•	Displaying all the vehicles available under the different office.
•	Submit button to submit the office id details.
•	Refresh List is used to refresh the data after the search functionality.
•	Logo of the company
•	 Header section also available to navigate to different pages like leasing office, customer details, employee details.
•	Login and logout
Sc-1
 

Sc-2
 


Sc-3(Data displaying after filtering with office id)
 


4.	Employee Details
•	Employee Details is displaying.
•	Logo of the company
•	 Header section also available to navigate to different pages like leasing office, customer details, employee details.
•	Login and logout

 


5.	Customer Details
•	Customer Details is displaying.
•	Logo of the company
•	 Header section also available to navigate to different pages like leasing office, customer details, employee details.
•	Login and logout

 
6.	Logout
Sc-1
 



Sc-2(Landing back to login screen with confirmation message logout successfully.)

 



                                                       THANK YOU
![image](https://user-images.githubusercontent.com/91026693/148102734-51396cfc-a968-494f-a3d7-0d8a54995028.png)
