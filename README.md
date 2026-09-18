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

Each OOP concept is deliberately implemented **twice** — once in isolation to make the
concept unambiguous, and once combined with the others in a single realistic model — so
the repository shows both "I understand the pillar on its own" and "I can use them
together."

---

## 📚 What This Repository Demonstrates

| Concept                          | Where                                                                 |
| --------------------------------- | ---------------------------------------------------------------------- |
| Encapsulation & Abstraction       | `oop/library` — `LibraryItem`, `Book`, `DVD`, `Magazine`               |
| Inheritance                       | `inheritancecomposition/inheritance/payment`                          |
| Composition (favored alternative) | `inheritancecomposition/composition/payment`                          |
| Runtime & Compile-time Polymorphism | `inheritancecomposition/polymorphism/payment`                       |
| Single Responsibility Principle (SOLID) | `inheritancecomposition/inheritance/payment` — `PaymentValidator` extracted from `PaymentMethod` |
| All 4 pillars combined            | `oop/combined/notification` — `Notification`, `EmailNotification`, `SmsNotification` |
| Collections & Generics            | `collections/library` — `Library`, `LibraryUtils`                     |

---

# 🛠️ Technologies

| Technology     | Purpose                      |
| --------------- | ----------------------------- |
| Java 21          | Programming language          |
| Maven            | Build and dependency management |
| JUnit 5          | Unit testing                  |
| IntelliJ IDEA    | Development environment       |
| Git              | Version control                |
| GitHub           | Repository hosting             |

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
```

---

# 🔍 Concept Walkthroughs

## 1. Encapsulation & Abstraction — `oop/library`

`LibraryItem` is an abstract class with `private final` fields and constructor-level
validation (rejects blank titles, non-positive IDs). `Book`, `DVD`, and `Magazine` each
implement the abstract `getItemType()` and `getLoanPeriodDays()` methods, so calling code
never needs to know how loan periods differ per item type — that complexity is hidden
behind the abstraction.

## 2. Inheritance vs. Composition — same domain, two designs

Both versions model `CardPayment` and `UpiPayment`. The **inheritance** version has them
extend an abstract `PaymentMethod`. The **composition** version instead has a
`PaymentProcessor` that *holds* a `PaymentMethod` reference and delegates to it — showing
the "favor composition over inheritance" trade-off directly, side by side, rather than as
an abstract claim.

## 3. Polymorphism — both kinds, not just one

`PolymorphismMain` demonstrates:
- **Runtime polymorphism**: a `List<PaymentMethod>` iterated and dispatched through the
  common interface, calling each subtype's own `pay()`.
- **Compile-time polymorphism**: an overloaded `calculateTotal()` method resolved at
  compile time based on argument types (`int` vs `double`).

## 4. Single Responsibility Principle

The inheritance-based `PaymentMethod` originally validated its own inputs. That
validation logic was extracted into a dedicated `PaymentValidator` utility class —
`PaymentMethod` now only models a payment method, and `PaymentValidator` only validates.
This is a real refactor commit (`refactor: split PaymentMethod validation logic to
respect SRP`), not a from-scratch example, to show the "before → identify the violation
→ fix it" process directly.

## 5. All Four Pillars Together — `oop/combined/notification`

`Notification` is an abstract base class (abstraction) with private validated fields
(encapsulation). `EmailNotification` and `SmsNotification` extend it (inheritance) and
override `send()` differently (polymorphism). `NotificationService` operates only on the
`Notification` abstraction, so it works unchanged for any current or future notification
type.

## 6. SOLID Principles

The SOLID principles are demonstrated through real refactors and implementations in this
repository. Each principle is connected to code that was deliberately changed or designed
to demonstrate the principle in practice.

### Single Responsibility Principle (SRP)

**Principle:** A class should have one reason to change and should have a focused
responsibility.

**Real code:** `inheritancecomposition/inheritance/payment`

`PaymentMethod` originally handled both payment behavior and input validation. The
validation responsibility was extracted into `PaymentValidator`.

The refactor resulted in:

- `PaymentMethod` → responsible for payment behavior.
- `PaymentValidator` → responsible for validation.

This was implemented as a real refactor rather than a separate theoretical example.

### Open/Closed Principle (OCP)

**Principle:** Software entities should be open for extension but closed for modification.

**Real code:** `solid/ocp/payment`

The payment hierarchy was extended by adding `WalletPayment` without modifying the existing
payment implementations.

This demonstrates that a new payment type can be introduced by extending the existing
abstraction instead of changing already-tested payment classes.

### Liskov Substitution Principle (LSP)

**Principle:** Objects of a subtype should be usable wherever the base type is expected
without breaking the expected behavior.

**Real code:** `solid/lsp/payment`

The original payment hierarchy incorrectly required every `PaymentMethod` to support
`refund()`. A non-refundable payment implementation had to throw
`UnsupportedOperationException`, creating an LSP violation.

The design was refactored so that:

- `PaymentMethod` contains only the common `pay()` behavior.
- `Refundable` represents the separate refund capability.
- `CardPayment` implements `Refundable`.
- Non-refundable payment types are not forced to provide refund behavior.

This makes the inheritance hierarchy respect the actual capabilities of each type.

### Interface Segregation Principle (ISP)

**Principle:** Clients should not be forced to depend on methods they do not use.

**Real code:** `solid/isp/notification`

The original `Notification` interface contained sending, scheduling, and retry-policy
operations. `SmsNotification` did not support all of these operations and therefore had
to throw `UnsupportedOperationException`.

The interface was split into smaller capability-based interfaces:

- `NotificationSender`
- `NotificationScheduler`
- `RetryPolicy`

`SmsNotification` now implements only `NotificationSender`, while
`EmailNotification` implements the capabilities it actually supports.

### Dependency Inversion Principle (DIP)

**Principle:** High-level modules should depend on abstractions rather than concrete
implementations.

**Real code:** `oop/combined/notification/NotificationService`

`NotificationService` receives its `Notification` dependency through its constructor
instead of creating a specific notification implementation internally.

```java
public NotificationService(Notification notification) {
    if (notification == null) {
        throw new IllegalArgumentException("Notification cannot be null");
    }

    this.notification = notification;
}


## 7. Collections & Generics — `collections/library`

`Library` and `LibraryUtils` apply Java's Collections framework and generics to manage a
set of `LibraryItem`s — search, filtering, and utility operations over a generic
collection rather than a hardcoded type.

---

# 🧪 Testing

Each concept has a corresponding JUnit 5 test class verifying both expected behavior and
edge cases (e.g. invalid constructor arguments throwing `IllegalArgumentException`,
correct dispatch for polymorphic calls, and the SRP-extracted validator behaving
identically to the original in-line validation).

Run all tests using:

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
