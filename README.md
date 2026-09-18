# Java Foundations

A practical Java learning repository focused on building strong foundations in **Core Java, Object-Oriented Programming, SOLID principles, Collections, Generics, and Unit Testing** — using small, realistic domains instead of isolated syntax examples.

The goal is to build a strong foundation for:

- DSA
- Backend Development
- Spring Boot
- System & Low-Level Design
- Technical Interviews

---

## 🎯 Purpose

This repository is designed to learn Java through implementation.

The learning approach is:

1. Understand the concept
2. Implement the concept in Java
3. Apply it to a realistic problem
4. Write unit tests
5. Run and verify the implementation
6. Commit the work using Git
7. Maintain the project on GitHub

Each OOP concept is deliberately implemented **twice** — once in isolation to make the concept unambiguous, and once combined with the others in a single realistic model — so the repository shows both:

> "I understand the pillar on its own" and "I can use them together."

---

## 📚 What This Repository Demonstrates

| Concept | Where |
| --------------------------------- | ---------------------------------------------------------------------- |
| Encapsulation & Abstraction | `oop/library` — `LibraryItem`, `Book`, `DVD`, `Magazine` |
| Inheritance | `inheritancecomposition/inheritance/payment` |
| Composition (favored alternative) | `inheritancecomposition/composition/payment` |
| Runtime & Compile-time Polymorphism | `inheritancecomposition/polymorphism/payment` |
| Single Responsibility Principle (SRP) | `inheritancecomposition/inheritance/payment` — `PaymentValidator` extracted from `PaymentMethod` |
| Open/Closed Principle (OCP) | `solid/ocp/payment` — `WalletPayment` extension |
| Liskov Substitution Principle (LSP) | `solid/lsp/payment` — separated refund capability |
| Interface Segregation Principle (ISP) | `solid/isp/notification` — capability-based interfaces |
| Dependency Inversion Principle (DIP) | `oop/combined/notification` — constructor injection |
| All 4 OOP pillars combined | `oop/combined/notification` — `Notification`, `EmailNotification`, `SmsNotification` |
| Collections & Generics | `collections/library` — `Library`, `LibraryUtils` |

---

# 🛠️ Technologies

| Technology | Purpose |
| --------------- | ----------------------------- |
| Java 21 | Programming language |
| Maven | Build and dependency management |
| JUnit 5 | Unit testing |
| IntelliJ IDEA | Development environment |
| Git | Version control |
| GitHub | Repository hosting |

---

# 📂 Project Structure

```text
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
│   │                   │   │   ├── LibraryItem.java
│   │                   │   │   ├── Book.java
│   │                   │   │   ├── DVD.java
│   │                   │   │   ├── Magazine.java
│   │                   │   │   └── Main.java
│   │                   │   │
│   │                   │   └── combined/
│   │                   │       └── notification/
│   │                   │           ├── Notification.java
│   │                   │           ├── EmailNotification.java
│   │                   │           ├── SmsNotification.java
│   │                   │           └── NotificationService.java
│   │                   │
│   │                   ├── inheritancecomposition/
│   │                   │   ├── inheritance/
│   │                   │   │   └── payment/
│   │                   │   │       ├── PaymentMethod.java
│   │                   │   │       ├── CardPayment.java
│   │                   │   │       ├── UpiPayment.java
│   │                   │   │       ├── PaymentValidator.java
│   │                   │   │       └── InheritanceMain.java
│   │                   │   │
│   │                   │   ├── composition/
│   │                   │   │   └── payment/
│   │                   │   │       ├── PaymentMethod.java
│   │                   │   │       ├── CardPayment.java
│   │                   │   │       ├── UpiPayment.java
│   │                   │   │       ├── PaymentProcessor.java
│   │                   │   │       └── CompositionMain.java
│   │                   │   │
│   │                   │   └── polymorphism/
│   │                   │       └── payment/
│   │                   │           ├── PaymentMethod.java
│   │                   │           ├── CardPayment.java
│   │                   │           ├── UpiPayment.java
│   │                   │           └── PolymorphismMain.java
│   │                   │
│   │                   ├── solid/
│   │                   │   ├── ocp/
│   │                   │   │   └── payment/
│   │                   │   │       ├── PaymentMethod.java
│   │                   │   │       ├── CardPayment.java
│   │                   │   │       ├── UpiPayment.java
│   │                   │   │       └── WalletPayment.java
│   │                   │   │
│   │                   │   ├── lsp/
│   │                   │   │   └── payment/
│   │                   │   │       ├── PaymentMethod.java
│   │                   │   │       ├── Refundable.java
│   │                   │   │       ├── CardPayment.java
│   │                   │   │       └── RefundablePayment.java
│   │                   │   │
│   │                   │   └── isp/
│   │                   │       └── notification/
│   │                   │           ├── NotificationSender.java
│   │                   │           ├── NotificationScheduler.java
│   │                   │           ├── RetryPolicy.java
│   │                   │           ├── EmailNotification.java
│   │                   │           └── SmsNotification.java
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
│                       │
│                       ├── oop/
│                       │   ├── library/
│                       │   │   └── LibraryItemTest.java
│                       │   └── combined/
│                       │       └── notification/
│                       │           └── NotificationServiceTest.java
│                       │
│                       ├── inheritancecomposition/
│                       │   └── payment/
│                       │       ├── PaymentValidatorTest.java
│                       │       ├── PaymentComparisonTest.java
│                       │       └── polymorphism/
│                       │           └── payment/
│                       │               └── PaymentPolymorphismTest.java
│                       │
│                       ├── solid/
│                       │   ├── ocp/
│                       │   │   └── payment/
│                       │   │       └── WalletPaymentTest.java
│                       │   │
│                       │   ├── lsp/
│                       │   │   └── payment/
│                       │   │       └── LspViolationTest.java
│                       │   │
│                       │   └── isp/
│                       │       └── notification/
│                       │           └── IspViolationTest.java
│                       │
│                       └── collections/
│                           └── library/
│                               └── LibraryTest.java
│
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

# 🔍 Concept Walkthroughs

## 1. Encapsulation & Abstraction — `oop/library`

`LibraryItem` is an abstract class with `private final` fields and constructor-level validation that rejects invalid input.

`Book`, `DVD`, and `Magazine` implement the abstract:

- `getItemType()`
- `getLoanPeriodDays()`

Calling code does not need to know how the loan period differs for each item type. The implementation details are hidden behind the abstraction.

---

## 2. Inheritance vs. Composition — Same Domain, Two Designs

Both versions model `CardPayment` and `UpiPayment`.

### Inheritance

The inheritance version uses an abstract `PaymentMethod` as the parent class.

```text
PaymentMethod
     │
 ┌───┴────┐
Card     UPI
```

### Composition

The composition version uses a `PaymentProcessor` that holds a `PaymentMethod` reference and delegates to it.

```text
PaymentProcessor
       │
       ▼
 PaymentMethod
       │
   ┌───┴────┐
 Card      UPI
```

This demonstrates the **"favor composition over inheritance"** trade-off using actual Java code.

---

## 3. Polymorphism — Runtime and Compile-time

`PolymorphismMain` demonstrates both major forms of polymorphism.

### Runtime Polymorphism

A common `PaymentMethod` reference can point to different implementations.

```java
List<PaymentMethod> payments = List.of(
        new CardPayment(),
        new UpiPayment()
);

for (PaymentMethod payment : payments) {
    payment.pay();
}
```

The overridden `pay()` method is selected at runtime based on the actual object.

### Compile-time Polymorphism

Method overloading demonstrates compile-time polymorphism.

```java
calculateTotal(int amount);
calculateTotal(double amount);
```

The compiler determines which overloaded method to call based on the argument type.

---

## 4. Single Responsibility Principle (SRP)

**Principle:** A class should have one reason to change and should have a focused responsibility.

**Real code:** `inheritancecomposition/inheritance/payment`

`PaymentMethod` originally handled both:

- Payment behavior
- Input validation

The validation responsibility was extracted into a dedicated `PaymentValidator`.

The refactor resulted in:

- `PaymentMethod` → responsible for payment behavior.
- `PaymentValidator` → responsible for validation.

This was implemented as a real refactor rather than a theoretical example.

---

# 🧱 SOLID Principles

The SOLID principles are demonstrated through real refactors and implementations in this repository.

Each principle is connected to actual code that was deliberately changed or designed to demonstrate the principle in practice.

---

## 5. Single Responsibility Principle (SRP)

**Principle:** A class should have one reason to change and should have a focused responsibility.

**Real code:** `inheritancecomposition/inheritance/payment`

`PaymentMethod` originally handled both payment behavior and input validation.

The validation responsibility was extracted into `PaymentValidator`.

### Result

- `PaymentMethod` → payment behavior
- `PaymentValidator` → validation

This demonstrates how separating responsibilities can make classes easier to understand and maintain.

---

## 6. Open/Closed Principle (OCP)

**Principle:** Software entities should be open for extension but closed for modification.

**Real code:** `solid/ocp/payment`

The payment hierarchy was extended by adding `WalletPayment` without modifying the existing payment implementations.

The existing abstraction can therefore support a new payment type through extension.

### Key idea

```text
Existing PaymentMethod
        │
   ┌────┼──────┐
 Card  UPI   Wallet
```

A new payment implementation can be added without changing already-tested payment classes.

---

## 7. Liskov Substitution Principle (LSP)

**Principle:** Objects of a subtype should be usable wherever the base type is expected without breaking expected behavior.

**Real code:** `solid/lsp/payment`

The original payment hierarchy incorrectly required every `PaymentMethod` to support `refund()`.

A non-refundable payment implementation therefore had to throw:

```java
UnsupportedOperationException
```

This represented an LSP violation.

### Refactored design

- `PaymentMethod` contains only common `pay()` behavior.
- `Refundable` represents the separate refund capability.
- `CardPayment` implements `Refundable`.
- Non-refundable payment types are not forced to provide refund behavior.

This makes the type hierarchy better aligned with the actual capabilities of each implementation.

---

## 8. Interface Segregation Principle (ISP)

**Principle:** Clients should not be forced to depend on methods they do not use.

**Real code:** `solid/isp/notification`

The original `Notification` interface contained:

- Sending
- Scheduling
- Retry policy

`SmsNotification` did not support all of these operations and therefore had to throw `UnsupportedOperationException`.

The interface was split into smaller capability-based interfaces:

- `NotificationSender`
- `NotificationScheduler`
- `RetryPolicy`

### Result

`SmsNotification` implements only:

```java
NotificationSender
```

while `EmailNotification` implements the capabilities it actually supports.

This prevents classes from being forced to depend on irrelevant methods.

---

## 9. Dependency Inversion Principle (DIP)

**Principle:** High-level modules should depend on abstractions rather than concrete implementations.

**Real code:** `oop/combined/notification/NotificationService`

`NotificationService` receives its `Notification` dependency through its constructor.

```java
public NotificationService(Notification notification) {
    if (notification == null) {
        throw new IllegalArgumentException("Notification cannot be null");
    }

    this.notification = notification;
}
```

The service therefore depends on the `Notification` abstraction rather than a specific notification implementation.

### Why Constructor Injection?

The dependency is provided from outside the class:

```text
NotificationService
        │
        ▼
   Notification
        │
   ┌────┴────┐
 Email      SMS
```

This makes the dependency explicit and also makes testing easier.

The test suite provides a fake `Notification` implementation to verify the service without requiring a real email or SMS implementation.

This was implemented through the:

`feature/dip-constructor-injection`

branch.

---

# 📚 10. Collections & Generics — `collections/library`

`Library` and `LibraryUtils` apply Java's Collections Framework and generics to manage a collection of `LibraryItem` objects.

The implementation demonstrates:

- Collections
- Generic types
- Searching
- Filtering
- Utility methods
- Type-safe collection operations

The goal is to use collections in a realistic domain instead of isolated syntax examples.

---

# 🧪 Testing

Each concept has corresponding JUnit 5 tests verifying expected behavior and edge cases.

Examples include:

- Invalid constructor arguments
- Payment validation
- Runtime polymorphism
- SRP-extracted validation
- OCP payment extension
- LSP capability separation
- ISP notification capabilities
- DIP constructor injection
- Fake dependency testing
- Collection operations

Run the complete test suite using:

```bash
./mvnw test
```

Expected result:

```text
Tests run: ...
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
```

---

# 🔀 Git Workflow

The SOLID implementations were developed using feature branches and integrated through pull requests.

Example workflow:

```bash
git checkout -b feature/<feature-name>

git add .

git commit -m "descriptive commit message"

git push -u origin feature/<feature-name>
```

After review and verification, the feature branch can be merged into `main`.

This repository therefore demonstrates not only Java implementation but also basic professional Git workflow.

---

# 🎯 Learning Philosophy

This repository follows a practical progression:

```text
Core Java
    ↓
OOP
    ↓
SOLID
    ↓
Collections & Generics
    ↓
Unit Testing
    ↓
DSA
    ↓
Backend Development
    ↓
Spring Boot
```

The focus is on understanding concepts by implementing them, testing them, and documenting the reasoning behind the design.

---

# 🌱 What's Next

- Continue DSA in parallel in [`dsa-java`](https://github.com/TusharVisave/dsa-java).
- Begin the Low-Level Design track after the Java foundations are sufficiently consolidated.
- Keep this repository focused on Java fundamentals, OOP, SOLID, Collections, Generics, and testing.
- Move framework and infrastructure learning into dedicated backend projects.

---

## 👨‍💻 Author

**Tushar Visave**

Java • DSA • Backend Development • Software Engineering
