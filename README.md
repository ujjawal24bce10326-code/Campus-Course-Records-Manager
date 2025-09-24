# Campus-Course-Records-Manager

# 📚 Campus Course & Records Manager (CCRM)

A **console-based Java SE application** to help manage Students,their  Courses, Course Enrollments, Grades, and Records for the institute.  
This project demonstrates **OOPs concepts, advanced Java feature, and design patterns** as part of the Programming in Java project given by Vit .

---

## 📖 Project Overview
The **Campus Course & Records Manager (CCRM)** allows:
- Student management :-creation ,updation ,deactivation and transcription 
- Course management :- create, assign instructors, search/filter  
- Enrollment & grading (business rules, GPA computation)  
- File utilities (import/export CSV, backups, recursive folder utilities)  
- CLI workflow with a menu-driven interface  

---

## ⚡ How to Run

**JDK Version Required:** Java SE 17+  

### Compile
```bash
javac -d out $(find src -name "*.java")
```

### Run
```bash
java -cp out edu.ccrm.cli.Main
```

---

## 🕰️ Evolution of Java (short timeline)
- **1995** → Java 1.0 released by Sun Microsystems  
- **1998** → Java 2  :- J2SE, J2EE, J2ME were introduced that establiseh Java as a standard for large-scale enterprise systems. 
- **2004** → Java 5 (Generics, Annotations, Enums, Autoboxing)  
- **2011** → Java 7 (NIO.2, try-with-resources)  
- **2014** → Java 8 (Streams API, Lambdas, Date/Time API)  
- **2017** → Java 9 (Modules, JShell)  
- **2019 onwards** → 6-month release cycle (Java 11 LTS, Java 17 LTS, etc.)  

---

## 🔄 Java ME vs SE vs EE

| **Aspect**     | **Java ME (Micro Edition)** | **Java SE (Standard Edition)** | **Java EE (Enterprise Edition)** |
|----------------|-----------------------------|---------------------------------|----------------------------------|
| Target         | Mobile/embedded devices      | Desktop & general applications  | Large-scale enterprise apps       |
| Libraries      | Lightweight, limited APIs    | Core APIs (Collections, I/O, OOP, Streams) | Adds Servlets, JSP, EJB, JPA, etc. |
| Use Cases      | IoT, feature phones, small devices | Desktop apps, console apps, utilities | Web apps, enterprise backends, cloud |

---
1. JVM (Java Virtual Machine)
Purpose: The JVM is the heart of Java, responsible for executing Java bytecode. 
Functionality: It acts as an interpreter, translating the compiled bytecode into machine-readable code for the specific operating system and hardware, making Java platform-independent. 
2. JRE (Java Runtime Environment)
Purpose: To provide an environment for running Java applications. 
Contents: It includes the JVM, core Java libraries, and other supporting files. 
Users: End-users who only want to run Java programs, not develop them. 
3. JDK (Java Development Kit)
Purpose: The complete toolkit for developing, compiling, and running Java applications. 
Contents: It contains everything in the JRE (JVM and libraries) plus development tools such as a compiler (javac), debugger (jdb), and other utilities. 
Users: Java developers who need to write and build new Java applications.
 
In summary: 
JVM: is the runtime engine.
JRE: contains the JVM and essential libraries to run Java applications.
JDK: contains the JRE and adds tools needed to develop Java applications.

## 🖥️ Install & Setup (Windows)

### Install JDK
1. Download JDK 17+ from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or [Adoptium](https://adoptium.net/).  
2. Run installer and set environment variables:  
   - `JAVA_HOME = C:\Program Files\Java\jdk-17`  
   - Add `%JAVA_HOME%\bin` to PATH


![jdk](https://github.com/user-attachments/assets/722f8473-5d99-47ef-bec1-0e98cb3e742a)

  
<img width="1000" height="618" alt="Step2SettingEnvironmentVariable" src="https://github.com/user-attachments/assets/c4c59625-11be-4751-ba1a-db0544a0fdc0" />


   
3. Verify installation:  
   ```bash
   java -version
   javac -version
   ```
   

   <img width="581" height="221" alt="1" src="https://github.com/user-attachments/assets/44085355-a5d0-4d63-9826-4ac3add6962b" />



### Setup Eclipse IDE
1. Download Eclipse IDE (Java Developers).  
2. Create a new Java Project → `CCRM`.  
3. Add source folders (`src`) and packages (`edu.ccrm.*`).  
4. Copy project files into `src`.  
5. Run → `Main.java`.  

<img width="672" height="709" alt="Screenshot4" src="https://github.com/user-attachments/assets/750c2c1a-a10f-45cb-9f1d-9a8dd14f2d64" />



<img width="613" height="398" alt="2" src="https://github.com/user-attachments/assets/c34be52f-6858-43a0-b780-d9ee0e589714" />


---

## 🗺️ Mapping Table: Syllabus Topic → Code Location

| **Syllabus Topic** | **File / Class / Method** |
|---------------------|----------------------------|
| Encapsulation | `Student.java` (private fields + getters/setters) |

| Inheritance | `Person.java` → `Student.java`, `Instructor.java` |

| Abstraction | `Person.java` (abstract class) |

| Polymorphism | Transcript printing (`toString()` overrides, `Main.java`) |

| Arrays / Strings | `FileUtil.java` (CSV handling), `Main.java` (input) |

| Streams API | `CourseService.java` (filterByInstructor, etc.) |

| Lambda Expressions | `CourseService.java` (Streams filter + lambdas) |

| Nested Classes | `Course.java` → `Builder` (static nested) |'

| Enums | `Semester.java`, `Grade.java` |

| Singleton | `AppConfig.java` |

| Builder Pattern | `Course.Builder` |

| Exception Handling | `EnrollmentService.java`, `DuplicateEnrollmentException.java`, `MaxCreditLimitExceededException.java` |

| NIO.2 (Files, Path) | `FileUtil.java` |

| Recursion | `FileUtil.folderSize()` (recursive folder walk) |

| Upcasting/Downcasting | `Person` references to `Student`/`Instructor` (in services, CLI) |

| Assertions | `Person.java` constructor (`assert id != null`) |

---

## 🛠️ Enabling Assertions
By default, **assertions are disabled** at runtime.  
To enable:
```bash
java -ea -cp out edu.ccrm.cli.Main
```

Example in `Person.java`:
```java
assert id != null;
```

---



