### ¿Why this project?

Actually, we cannot even call this a "project", this is just a very simple exercise to really understand abstract classes as a concept and a couple of uses cases to put in practice what we learnt.

### Abstract classes ¿What are they?

It is a kind of class in the OOP paradigm that we can use to avoid code duplication and increase re-usability between classes that could share same code.

An abstract class will never be instantiated. In fact, you could not. They are made for being extended of a subclass. For example, you could create an abstract class 'Animal' and then extend it in a subclass called 'Cat' or 'Whale'.

In this case, the 'Animal' class could have defined functions or fields that can be used by the subclass. This is simply what we call inheritance. But with abstract classes you can create abstract methods, and that is they key, because you let the subclasses implement it. That means that the inherit the contract but not the implementation of it.

### Open/Closed SOLID principle

One of the five SOLID principles is 'Open/Closed principle'. And it tells us that a class/module/function should be open for extension but closed for modification. Here is where abstract classes can be very helpful. In the ExtractReport example of this mvn project we can see it clearer.

Imagine that instead of inheriting from ExtractReport in PhoneNumberExtractorReport or EmailNumberExtractorReport, we just have a class called ExtractReport. In this class, we have the method 'parse'. We would need to send a parameter to tell what kind of report do we want. And inside, depending on this parameter, do some logic or another. Imagine when the number of reports types increases...

This, breaks the rule. Because for every new kind of report, we need to extend the class, but also we need to modify!!

To solve this, we could create a new class called 'NewKindExtractorReport' and inherit from ExtractorReport. Like this, the rest of subclasses don't notice.

### Abstract classes vs interfaces

This question has already become a mainstream in the technical interviews to access to any company as a senior developer. I think that it is not so hard to give a good answer, but im sure that to apply this knowledge isn't that easy.

For me the most important difference is easier to understand when you know about SOLID principles. It is all about it, because abstract classes are perfect to apply the open/closed principle and interfaces can be used to apply the dependency inversion principle.

Anyway, I made this little schema to see other differences:
[![Screenshot-from-2022-07-02-18-25-28.png](https://i.postimg.cc/dtTy1B5D/Screenshot-from-2022-07-02-18-25-28.png)](https://postimg.cc/bspJVQcj)