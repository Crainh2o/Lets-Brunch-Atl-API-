# Lets-Brunch-Atl-API-

This is the back end of my project Lets-Brunch-Atl-API-. My project is about my top three brunch restaurants in Atlanta. Brunch is right after breakfast but before lunch. That's how you have Brunch.
With me being a wife and mom of two, brunch is great way for me to hang out with my friends and be home before the afternoon. 

# Tools and Technologies 

- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
- ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
- ![IntelliJ](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
- [ERD Tool](https://www.lucidchart.com/)
- **Postman** - testing DB requests


# Testing 

For testing I used Cucumber with Assured. Picture below.
![Screenshot 2023-06-05 at 5 01 00 PM](https://github.com/Crainh2o/Lets-Brunch-Atl-API-/assets/124539081/5f8ff1f7-6806-4eaf-9205-28c9f6924b24)
![Screenshot 2023-06-05 at 5 01 19 PM](https://github.com/Crainh2o/Lets-Brunch-Atl-API-/assets/124539081/c5204b08-de7d-4c8b-84b7-0e12e5798e6b)
![Screenshot 2023-06-05 at 5 01 34 PM](https://github.com/Crainh2o/Lets-Brunch-Atl-API-/assets/124539081/54092cbf-0ff0-4292-864e-ef9af981f854)

# Hurdles and Problems I had to Overcome

I had to overcome a lot on the back-end. I had to redo my testing because I hard coded what I wanted the test to do. I also had problems with my data loader. Calling the correct methods 
have always been a issue for me. I also had an issue my menu endpoint. I overcame my hurdles by knowledge sharing with my classmates and also looking back through the class documentation. 

# User Stories

As a user, I want to be able to retrieve a list of brunch restaurants near my location, so that I can decide where to go for brunch.
As a user, I want to be able to search for brunch restaurants based on price range. 
As a user, I want to be able to view detailed information about a specific brunch restaurant, including its menu, opening hours, and customer reviews. 
As a user, I want to be able to leave a review or rating for a brunch restaurant through the API, so that I can share my experience with others.

I chose only three brunch places but the user will be able to choose a brunch place my price, location, and menu. I used google sheets for my planning process. The slide for 
my user stories is below.

![Screenshot 2023-06-05 at 5 24 30 PM](https://github.com/Crainh2o/Lets-Brunch-Atl-API-/assets/124539081/1f441cf2-0eed-4844-aad8-d11242589c49)


# ERD Diagram 

https://online.visual-paradigm.com/app/diagrams/#diagram:proj=0&type=ERDiagram&width=11&height=8.5&unit=inch

![Screenshot 2023-06-05 at 5 20 22 PM](https://github.com/Crainh2o/Lets-Brunch-Atl-API-/assets/124539081/d167d7ce-8b18-4f05-a657-2832fff5190e)

# Planning 

My goal was to have the back end done by end of day Monday June 5. We started the project Wednesday May 31st. I didn't do a timeline by days but I used a Kanban board to help me organize everything I needed to do for the back end of the Brunch API. I also used google slides to plan out my entire project. 

https://docs.google.com/presentation/d/1gSl3Fc2rOrjJYbE7zULuXbAfmcVDRBVzIEGij17jbX8/edit#slide=id.g24d03e3a1db_0_100

![Screenshot 2023-06-05 at 5 26 25 PM](https://github.com/Crainh2o/Lets-Brunch-Atl-API-/assets/124539081/3ec51b2e-807d-45d9-a6ed-449c11704660)

# Installation Instructions/ Dependencies 

In order to use this codebase you will need to ake sure yu have the following dependencies in your pom.xml file:

```
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-rest</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-jdbc</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>${cucumber.version}</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>${cucumber.version}</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-spring</artifactId>
        <version>${cucumber.version}</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>4.3.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>3.0.5</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
```
    
    
    In order to successfully replicate/ run Cucumber Tests you will need to add this property to your pom.xml property tag:
    
    <cucumber.version>6.8.1</cucumber.version>
    
# Rest API Endpoints


    

    

    
   




