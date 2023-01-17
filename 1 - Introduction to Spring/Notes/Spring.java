/* 

--> SANYAM 21CSU234 FS-IV-A

--> INTRODUCTION TO SPRING

- Why Spring Comes into the Market? -- 
a) Early versions of EJB were extremely complex
b) To speed up the development process
c) To enable S/W best practices
   i) Loose Coupling
   ii) SOLID Principle
   iii) Convention over Configuration (you can add a new feature without having to change any existing code at all) 

-- TIGHT COUPLING --
i) It is difﬁcult to test and debug if  any component stops working.
ii) It is difﬁcult to replace or use any  component with other  components.

• When multiple classes are highly dependent on each other, they are said to be ‘tightly  coupled’.
• In software development, normally, an object of one class needs an object of another  class to execute its functionality. For example, a car needs an engine to execute its  functionality.
However, when you refer a dependency class directly inside the dependent class, it  introduces tight coupling.

-- LOSE COUPLING --
i) It is easy to test and debug if any  component malfunctions.
ii) It is easy to replace or reuse any  component with other  components.

• Methods of Lose Coupling : 
- Interfces 
- Factory Pattern
• You can make changes in the dependency classes without making any change in the  Main class.
• You can also create more greeting services and use them in your Main class through  GreetingServiceFactory without signiﬁcantly changing the code in the Main class.

-- Inversion Of Control (Ioc)-- 

i) Normal Flow 
  - In a classical code, the person  who is writing the software  instructs the computer ‘Do this,  do that and then, go here, etc.’
  - The coder is in control!

ii) Inverted Flow
  - The coder who is writing the  software ﬁlls out a template for  the framework, and the  framework decides what it will  do.
  - The framework is in control!

  • The normal ﬂow of execution is as follows:
   i) The developer creates a class named ‘EnglishGreetingService’.
   ii) The developer creates an instance of the class ‘EnglishGreetingService’ in the Main class.
   iii) The developer invokes a method deﬁned in the ‘EnglishGreetingService’ class for  execution in the Main class.

  • Flow of execution when using the IoC Framework:
   i) The developer creates a class named ‘EnglishGreetingService’.
   ii) The IoC Framework creates an instance of ‘EnglishGreetingService’ that can be used  inside the Main class.
   iii) The developer invokes a method deﬁned in the ‘EnglishGreetingService’ class for  execution in the Main class.

--> What is Spring ? 
• For big enterprise applications, this boilerplate code can get quite complex and divert you  from the main goal of the application.
• Spring Framework helps you by providing this boilerplate code.
• Spring framework is an open-source Java Framework that provides comprehensive infrastructure support for developing robust Java applications very easily and very rapidly.
• Almost all modern frameworks, including Spring, rely on the concept of Inversion of Control (IoC).
--> Spring Container
• The IoC Framework instantiates objects of the dependency classes that can be used by the dependent classes.
• The IoC Frameworks behave like containers for such objects, so IoC Frameworks are also called IoC containers.
• The IoC container of the Spring Framework, for obvious reasons, is called the Spring container.
• In Spring, the dependency objects contained inside the Spring container are called Spring beans or, simply, beans.

• Spring provides the following two distinct types of containers:
i) Spring BeanFactory Container
ii) Spring ApplicationContext Container

--> BeanFactory Container :
i) It is similar to a factory class that contains a collection of methods to get beans  from the Spring container.
ii) It is lightweight, as it instantiates beans only when requested by the application,  instead of creating all the beans at the start of the application.
iii) Being lightweight, it is generally used for mobile device applications.

--> ApplicationContext Container : 
i) It is an interface that extends the BeanFactory interface.
ii) ApplicationContext is a heavyweight interface compared to BeanFactory, as it  loads all the beans at the startup of the application.
iii) It provides some extra enterprise-speciﬁc functionality on top of the BeanFactory  container.
iv) Since it includes all the functionalities of the BeanFactory container and also  provides some additional facilities, it is generally recommended over BeanFactory  wherein the startup time is not an issue, such as when writing the server-side code.

--> Spring Features : 
i) It is open source & lightweight in terms of execution, as it does not require an external container  support to run applications, such as the Servlet container that is used to run the  Servlet/JSP application, and because of its POJO implementation.
ii) Modular: It is developed in different modules. So, you can import only those  required Spring modules that are needed as per the requirements of the  application and ignore the rest.
iii) The integration with other frameworks is loosely coupled, such as integration with  the Hibernate Framework.
iv) Aspect-oriented programming (AOP): It uses AOP to separate cross-cutting  concerns (logging, security, exception handling, etc.) from the business logic.
v) Dependency injection: It helps in developing loosely coupled applications and, in  turn, facilitates easier unit testing.
vi) IoC containers: It creates and manages the lifecycle of the Spring beans.
vii) Transaction management: It is used to maintain transactions and is mostly used to  maintain database transactions.

*/