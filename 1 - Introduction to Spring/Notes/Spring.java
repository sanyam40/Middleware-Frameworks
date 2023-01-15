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





*/