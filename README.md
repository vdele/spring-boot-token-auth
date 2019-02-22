# spring-boot-token-auth
A simple app with token authentification using Spring Security and JWT

This app has been developed foolowing this tutorial :
https://o7planning.org/fr/11677/securiser-spring-boot-restful-service-en-utilisant-auth0-jwt


To run the application :
 - Build the project with maven : mvn clean install
 - in target folder, Execute the generated JAR :  java -jar tokenauthent-0.0.1-SNAPSHOT.jar

Your application is running.


 Database is not required, to simplify the tutorial, users are referenced in the SecurityConfig.java class.

 Users :
  - username : tom, password : 123
  - username : jerry, password : 123
  - username : admin, password : admin


To authenticate a user :
 - Execute login webservice (with app as Postman) :
   GET http://localhost:8080/login?username=tom&password=123
 - Get the token in Header response "Authorization", (value is "Bearer [...]")

Execute another webservice with token in request header :
  - GET http://localhost:8080/taches
    Authorization : Bearer [...]
  - Response status is 200 OK, and you must see this JSON content :
  [
      {
          "numTache": 1,
          "titre": "Eplucher les pommes de terre",
          "description": "Prendre un excellent économe et éplucher les pommes de terres",
          "deadLine": "2019-02-22T13:10:16.894+0000"
      },
      {
          "numTache": 2,
          "titre": "Couper les pommes de terre",
          "description": "Prendre un excellent couteau et couper les pommes de terres en petits cubes égaux",
          "deadLine": "2019-02-22T13:10:16.895+0000"
      },
      {
          "numTache": 3,
          "titre": "Cuire les pommes de terre",
          "description": "Prendre un excellent économe et éplucher les pommes de terres",
          "deadLine": "2019-02-22T13:10:16.895+0000"
      }
  ]
