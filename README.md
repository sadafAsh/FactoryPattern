# FactoryPattern

          It is define,an interface or abstract class for creating the object but let the subclass decide
which subclass to instantiate.It is one the best method to create an object where object creational is 
hidden from the client.It comes under creational design pattern. 

          In this project,interface 'Operator' has been created and 'Addition','Subtraction','Multiplication'
'Division' are the concrete classes which implements the interface.'Calculation' is the factory class which
is a next step.'Main' will only use Calculation class to get  object of concrete classes by passing an 
information (Addition/Substraction/Multiplication/Division) to Calculation to get type of object it 
needs. 


JunitTest:
   
      The  Junit Test is done of all the entities in  "factory pattern" project and test coverage 
is 100% successful in jacoco report.

       
  SONARQUBE :
          In sonarqube,reliability ,security , securityReview and maintainability is A and 
the code coverage is 100%. 


SONARQUBE 

gradle command to publish code to SonarQube
gradle sonarqube 
  -Dsonar.projectKey=FactoryPattern 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=772bcd0fa0b8feecd34f94a9d5408a5b49cf0006