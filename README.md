# Campus-Course-Records-Manager

# 📚 Campus Course & Records Manager (CCRM)

A **console-based Java SE application** to manage Students, Courses, Enrollments, Grades, and Records for an institute.  
This project demonstrates **OOP concepts, advanced Java features, and design patterns** as part of the Programming in Java project.

---

## 📖 Project Overview
The **Campus Course & Records Manager (CCRM)** allows:
- Student management (create, update, deactivate, transcripts)  
- Course management (create, assign instructors, search/filter)  
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
- **1995** → Java 1.0 released (Sun Microsystems)  
- **1998** → Java 2 (J2SE, J2EE, J2ME introduced)  
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

## ⚙️ JDK vs JRE vs JVM
- JDK (Java Development Kit)** → Contains compiler (`javac`), debugger, libraries, and JRE. Needed for development.  
- JRE (Java Runtime Environment)** → Contains JVM + libraries required to run Java programs. No compiler.  
- JVM (Java Virtual Machine)** → Abstract machine that executes bytecode. Platform-independent execution.  

---

## 🖥️ Install & Setup (Windows)

### Install JDK
1. Download JDK 17+ from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or [Adoptium](https://adoptium.net/).  
2. Run installer and set environment variables:  
   - `JAVA_HOME = C:\Program Files\Java\jdk-17`  
   - Add `%JAVA_HOME%\bin` to PATH  
3. Verify installation:  
   ```bash
   java -version
   javac -version
   ```

   

📸 *[Insert screenshot of `java -version` output]*  

### Setup Eclipse IDE
1. Download Eclipse IDE (Java Developers).  
2. Create a new Java Project → `CCRM`.  
3. Add source folders (`src`) and packages (`edu.ccrm.*`).  
4. Copy project files into `src`.  
5. Run → `Main.java`.  


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



