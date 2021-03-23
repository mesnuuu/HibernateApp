# HibernateApp
In this Spring Boot tutorial,  develop a Java web application that manages information in a database – with standard CRUD operations: Create, Retrieve, Update and Delete. We use 

# Technologies:

Spring Boot - Spring MVC - Spring Data JPA -  Hibernate - Thymleaf - Mysql
 
# Dependencies : 

   <br> Spring Boot Starter Web, 
   <br>Spring Boot Data JPA, 
   <br> Spring Boot ThymeLeaf
   <br>MySQL JDBC driver.
  
  # Create MySqlDatabase
  
  ![image](https://user-images.githubusercontent.com/46952459/112082049-7b09bd80-8ba6-11eb-9538-cfc9846a3bbd.png)
  
  CREATE TABLE `product` (
  <br>`id` int(11) NOT NULL AUTO_INCREMENT,
 <br> `name` varchar(45) NOT NULL,
 <br> `brand` varchar(45) NOT NULL,
 <br> `madein` varchar(45) NOT NULL,
 <br> `price` float NOT NULL,
 <br> PRIMARY KEY (`id`)
<br>) ENGINE=InnoDB DEFAULT CHARSET=utf8;

![image](https://user-images.githubusercontent.com/46952459/112083405-ca50ed80-8ba8-11eb-9384-4ad765bcabda.png)
