# FactoryPatttern
FACTORY METHOD PATTERN:
          It is define,an interface or abstract class for creating the object but let the subclass decide
which subclass to instantiate.It is one the best method to create an object where object creational is 
hidden from the client.It comes under creational design pattern. 

          In this project,interface 'Operator' has been created and 'Addition','Subtraction','Multiplication'
'Division' are the concrete classes which implements the interface.A 'Calculation' is the factory class which
is a next step.'Main' will only use Calculation  class to get  object of concrete classes by passing an 
information such as(Addition/Substraction/Multiplication/Division) to Calculation to get type of object it 
needs. 




JunitTest:
     There is Junit Test for all the type of factory pattern and test coverage in jacoco report is 100% 
successful.

SONARQUBE 

gradle command to publish code to SonarQube
gradle sonarqube 
  -Dsonar.projectKey=FactoryPattern 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=772bcd0fa0b8feecd34f94a9d5408a5b49cf0006