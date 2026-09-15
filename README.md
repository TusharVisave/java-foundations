Java Foundations

A practical Java learning repository focused on building strong foundations in Core Java, Object-Oriented Programming, SOLID principles, Collections, Generics, and Unit Testing — using small, realistic domains instead of isolated syntax examples.

The goal is to build a strong foundation for:

DSA
Backend Development
Spring Boot
System & Low-Level Design
Technical Interviews
🎯 Purpose

This repository is designed to learn Java through implementation.

The learning approach is:

Understand the concept
Implement the concept in Java
Apply it to a realistic problem
Write unit tests
Run and verify the implementation
Commit the work using Git
Maintain the project on GitHub

Each OOP concept is deliberately implemented twice — once in isolation to make the concept unambiguous, and once combined with the others in a single realistic model — so the repository shows both "I understand the pillar on its own" and "I can use them together."

📚 What This Repository Demonstrates
Concept	Where
Encapsulation & Abstraction	oop/library — LibraryItem, Book, DVD, Magazine
Inheritance	inheritancecomposition/inheritance/payment
Composition (favored alternative)	inheritancecomposition/composition/payment
Runtime & Compile-time Polymorphism	inheritancecomposition/polymorphism/payment
Single Responsibility Principle (SOLID)	inheritancecomposition/inheritance/payment — PaymentValidator extracted from PaymentMethod
All 4 pillars combined	oop/combined/notification — Notification, EmailNotification, SmsNotification
Collections & Generics	collections/library — Library, LibraryUtils
🛠️ Technologies
Technology	Purpose
Java 21	Programming language
Maven	Build and dependency management
JUnit 5	Unit testing
IntelliJ IDEA	Development environment
Git	Version control
GitHub	Repository hosting
📂 Project Structure
text
java-foundations/
│
├── src/
│   │
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── tushar/
│   │               └── javafoundations/
│   │                   │
│   │                   ├── oop/
│   │                   │   ├── library/
│   │                   │   │   ├── LibraryItem.java        (abstract base — encapsulation + abstraction)
│   │                   │   │   ├── Book.java
│   │                   │   │   ├── DVD.java
│   │                   │   │   ├── Magazine.java
│   │                   │   │   └── Main.java
│   │                   │   │
│   │                   │   └── combined/
│   │                   │       └── notification/           (all 4 pillars together)
│   │                   │           ├── Notification.java
│   │                   │           ├── EmailNotification.java
│   │                   │           ├── SmsNotification.java
│   │                   │           └── NotificationService.java
│   │                   │
│   │                   ├── inheritancecomposition/
│   │                   │   ├── inheritance/
│   │                   │   │   └── payment/                (inheritance + SRP-extracted validator)
│   │                   │   │       ├── PaymentMethod.java
│   │                   │   │       ├── CardPayment.java
│   │                   │   │       ├── UpiPayment.java
│   │                   │   │       ├── PaymentValidator.java
│   │                   │   │       └── InheritanceMain.java
│   │                   │   │
│   │                   │   ├── composition/
│   │                   │   │   └── payment/                (same domain, composition instead)
│   │                   │   │       ├── PaymentMethod.java
│   │                   │   │       ├── CardPayment.java
│   │                   │   │       ├── UpiPayment.java
│   │                   │   │       ├── PaymentProcessor.java
│   │                   │   │       └── CompositionMain.java
│   │                   │   │
│   │                   │   └── polymorphism/
│   │                   │       └── payment/                (runtime + compile-time polymorphism)
│   │                   │           ├── PaymentMethod.java
│   │                   │           ├── CardPayment.java
│   │                   │           ├── UpiPayment.java
│   │                   │           └── PolymorphismMain.java
│   │                   │
│   │                   └── collections/
│   │                       └── library/
│   │                           ├── Library.java
│   │                           ├── LibraryUtils.java
│   │                           └── CollectionsMain.java
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── tushar/
│                   └── javafoundations/
│                       ├── oop/
│                       │   ├── library/LibraryItemTest.java
│                       │   └── combined/notification/NotificationServiceTest.java
│                       ├── inheritancecomposition/
│                       │   └── payment/
│                       │       ├── PaymentValidatorTest.java
│                       │       ├── PaymentComparisonTest.java
│                       │       └── polymorphism/payment/PaymentPolymorphismTest.java
│                       └── collections/library/LibraryTest.java
│
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
🔍 Concept Walkthroughs
1. Encapsulation & Abstraction — oop/library

LibraryItem is an abstract class with private final fields and constructor-level validation (rejects blank titles, non-positive IDs). Book, DVD, and Magazine each implement the abstract getItemType() and getLoanPeriodDays() methods, so calling code never needs to know how loan periods differ per item type — that complexity is hidden behind the abstraction.

2. Inheritance vs. Composition — same domain, two designs

Both versions model CardPayment and UpiPayment. The inheritance version has them extend an abstract PaymentMethod. The composition version instead has a PaymentProcessor that holds a PaymentMethod reference and delegates to it — showing the "favor composition over inheritance" trade-off directly, side by side, rather than as an abstract claim.

3. Polymorphism — both kinds, not just one

PolymorphismMain demonstrates:

Runtime polymorphism: a List<PaymentMethod> iterated and dispatched through the common interface, calling each subtype's own pay().
Compile-time polymorphism: an overloaded calculateTotal() method resolved at compile time based on argument types (int vs double).
4. Single Responsibility Principle

The inheritance-based PaymentMethod originally validated its own inputs. That validation logic was extracted into a dedicated PaymentValidator utility class — PaymentMethod now only models a payment method, and PaymentValidator only validates. This is a real refactor commit (refactor: split PaymentMethod validation logic to respect SRP), not a from-scratch example, to show the "before → identify the violation → fix it" process directly.

5. All Four Pillars Together — oop/combined/notification

Notification is an abstract base class (abstraction) with private validated fields (encapsulation). EmailNotification and SmsNotification extend it (inheritance) and override send() differently (polymorphism). NotificationService operates only on the Notification abstraction, so it works unchanged for any current or future notification type.

6. Collections & Generics — collections/library

Library and LibraryUtils apply Java's Collections framework and generics to manage a set of LibraryItems — search, filtering, and utility operations over a generic collection rather than a hardcoded type.

🧪 Testing

Each concept has a corresponding JUnit 5 test class verifying both expected behavior and edge cases (e.g. invalid constructor arguments throwing IllegalArgumentException, correct dispatch for polymorphic calls, and the SRP-extracted validator behaving identically to the original in-line validation).

Run all tests using:

bash
./mvnw test

Expected result:

text
Tests run: ...
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
🌱 What's Next
LLD track begins once Stage 1 (this repo) is fully closed out — tracked in a separate low-level-design repository, not scattered into this one.
DSA continues in parallel in dsa-java.
This repository stays focused on Java/OOP fundamentals; it will not expand into frameworks or infrastructure — that begins with the flagship backend projects.
