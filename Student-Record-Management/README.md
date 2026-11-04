# Student Record Management System

A simple, console-based Student Record Management System developed using **Core Java**. This project allows users to manage student records using Java's `HashMap` collection.

**Project Status:** 🚧 In Progress

## Features

The following features are currently implemented:

- **Add Student:** Store student roll numbers and names.
- **View All Students:** Display all stored student records.
- **Search Student:** Find a student using their roll number.
- **Delete Student:** Remove a student record using their roll number.
- **Update Student:** Update the name of an existing student.
- **Count Students:** Display the total number of student records.

## Technologies Used

- Java
- Java Collections Framework
- HashMap
- Scanner Class
- VS Code

## Java Concepts Practised

- Classes and Objects
- `main()` method
- Loops (`while`)
- Conditional Statements (`if-else`)
- User Input using `Scanner`
- Java Map Interface
- HashMap implementation
- Key-value pairs
- Methods such as:
  - `put()`
  - `get()`
  - `remove()`
  - `containsKey()`
  - `size()`

## How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/vishwaabhishek2208/Java-Mini-Projects.git
   ```

2. Open the `Student-Record-Management` folder.

3. Compile the Java file:

   ```bash
   javac Menu.java
   ```

4. Run the program:

   ```bash
   java Menu
   ```

## Sample Output

```text
Enter Roll Number (0 to exit): 101
Enter Name: Rahul
Student added successfully

Enter Roll Number (0 to exit): 102
Enter Name: Aman
Student added successfully

Enter Roll Number (0 to exit): 0

All Student Details:
{101=Rahul, 102=Aman}

Enter roll number to search: 101
Student Name: Rahul

Enter the rollNumber to remove the Student: 102
Student removed successfully --> Aman

Student details now: {101=Rahul}

Enter the roll Number for update a Student: 101
Enter the name for the Student to update: Rahul Sharma
Student details after the updation: {101=Rahul Sharma}

To find the total number of Students enter 'total'
The total number of Students are: 1
```

## Future Improvements

The following features are planned:

- Create a menu-driven interface using `switch`.
- Add input validation.
- Prevent duplicate roll numbers.
- Improve console output formatting.
- Make the program more user-friendly.

## Author

**Abhishek Vishwakarma**

B.Tech CSE '29 | LNCT&S Bhopal

- GitHub: [@vishwaabhishek2208](https://github.com/vishwaabhishek2208)

---

*This project is part of my journey of learning Core Java and practising the Java Collections Framework through hands-on projects.*
