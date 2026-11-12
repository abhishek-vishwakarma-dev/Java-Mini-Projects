# 🎓 Student Record Management System

A menu-driven, console-based Student Record Management System built using **Core Java**. This project allows users to manage student records using Java Collections, particularly the `HashMap` class.

## 🚀 Features

### Implemented

- Add student records using roll number and name.
- Prevent duplicate roll numbers.
- Display all student records.
- Search for a student using their roll number.
- Search for students using their name (case-insensitive).
- Update existing student names using roll numbers.
- Remove student records using roll numbers.
- Count the total number of registered students.
- Exit the program using a menu-driven approach.

## 🛠️ Technologies Used

- **Language:** Java
- **JDK:** Java 17+
- **IDE:** VS Code
- **Version Control:** Git & GitHub

## 📚 Java Concepts Practised

- HashMap (`Map<Integer, String>`)
- Java Collections Framework
- Map Interface and Key-Value Pairs
- `put()` method
- `get()` method
- `remove()` method
- `containsKey()` method
- `entrySet()` method
- `isEmpty()` method
- `size()` method
- `Map.Entry`
- Methods and Method Calling
- Conditional Statements
- Loops
- Switch Statements
- Scanner Class
- String Comparison using `equalsIgnoreCase()`
- User Input Handling

## ▶️ How to Run

1. Clone this repository or download the project.
2. Open the project folder in VS Code.
3. Make sure Java JDK is installed.
4. Compile the Java file:

   ```bash
   javac Menu.java
   ```

5. Run the program:

   ```bash
   java Menu
   ```

## 💻 Sample Output

```text
========== Student Record Management System ==========

1. Add Student
2. Display All Students
3. Search Student by Roll Number
4. Search Student by Name
5. Update Student
6. Remove Student
7. Count Total Students
0. Exit

Enter your choice: 1

Enter Roll Number: 101
Enter Student Name: Abhishek
Student Added Successfully!

Enter your choice: 7

Total Students: 1

Enter your choice: 0

Thank you for using the system!
```

*Note: Sample output illustrates some of the implemented features. Actual output depends on user input.*

## 🔮 Future Improvements

- Add input validation for student names and roll numbers.
- Implement better exception handling.
- Explore file handling to store student records permanently.
- Introduce additional student details such as email and course.
- Improve the menu-driven interface.

## 👨‍💻 Author

**Abhishek Vishwakarma**

B.Tech CSE '29 | LNCT&S Bhopal

GitHub: [@abhishek-vishwakarma-dev](https://github.com/abhishek-vishwakarma-dev)

---

⭐ If you find this project useful, consider giving it a star!

*Built as part of my journey to strengthen Core Java and Java Collections Framework concepts.*
