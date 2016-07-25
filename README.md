Number to British Word Conversion Library
==================================

Scenario
----------
A library suitable for use in a server-side application that can take a java integer in the range 0 to 999,999,999 inclusive and returns the equivalent number as string in British words


**Sample Data**
Input					Output
0						zero
1						one
21						twenty one
105						one hundred and five
123						one hundred and twenty three
1005					one thousand and five
1042					one thousand and forty two
1105					one thousand one hundred and five
56945781				fifty six million nine hundred and forty five thousand seven hundred and eighty one
999999999				nine hundred and ninety nine million  nine hundred and ninety nine thousand nine hundred and ninety nine

Introduction
-------------
A programming challenge to translate a java integer between the range of 0 to 999,999,999 to British words

The solution is not expected to involve a command line or GUI application, it is an object-oriented Java library
that could be packaged as a jar and used in a larger application.

The application is organized into main/java and test/java source folders containing the application and test code respectively.

The application is developed, compiled and tested with Java8.


# Instructions
 - Build the project with maven :

```
mvn clean package

This cleans and compiles the project then packages the jar file NumbersToWords/target/numberstowords-1.0-SNAPSHOT.jar

```
- Import the jar file into the server side application library build path and it will be ready for use.

