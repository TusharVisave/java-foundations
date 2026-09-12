# Java Foundations

A practical Java learning repository focused on building strong foundations in **Core Java, Object-Oriented Programming, Collections, Generics, Unit Testing, and Git/GitHub**.

The repository uses a small **Library Management** domain to apply Java concepts through practical implementations rather than isolated syntax examples.

The goal is to build a strong foundation for:

- DSA
- Backend Development
- Spring Boot
- Software Engineering
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

The current project uses a **Library Management** domain to demonstrate Java programming concepts.

---

# 🛠️ Technologies

| Technology | Purpose |
|---|---|
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
│   │                   ├── collections/
│   │                   │   └── library/
│   │                   │       ├── CollectionsMain.java
│   │                   │       ├── Library.java
│   │                   │       └── LibraryUtils.java
│   │                   │
│   │                   └── oop/
│   │                       └── library/
│   │                           ├── Book.java
│   │                           ├── DVD.java
│   │                           ├── LibraryItem.java
│   │                           ├── Magazine.java
│   │                           └── Main.java
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── tushar/
│                   └── javafoundations/
│                       │
│                       ├── collections/
│                       │   └── library/
│                       │       └── LibraryTest.java
│                       │
│                       └── oop/
│                           └── library/
│                               └── LibraryItemTest.java
│
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
