# Digital Library Book Management System

## Project Overview
The **Digital Library Book Management System** is a console-based Java application designed to enable librarians to efficiently manage books in a library. It allows adding, updating, searching, deleting, and viewing books, along with maintaining their availability status.

## Features
- **Add a Book**: Users can add books by providing the title, author, genre, and availability status.
- **View All Books**: Displays a list of all books with their details.
- **Search Book by ID or Title**: Enables users to search for a book using its ID or title.
- **Update Book Details**: Allows modifying book attributes such as title, author, and availability status.
- **Delete a Book Record**: Removes a book from the catalog.
- **Exit System**: Safely closes the program.

## Tech Stack
- **Programming Language**: Java and It's Object Oriented Programming Concepts
- **Data Structure**: HashMap (for efficient book storage and retrieval)
- **User Input Handling**: Java Scanner class

## 🚀 Setup Instructions
### Prerequisites
Ensure you have the following installed:
- **Java Development Kit (JDK) 11 or later**
- **Git** (for cloning the repository)

### 🔹 Clone the Repository
```sh
 git clone https://github.com/your-github-username/digital-library-management.git
 cd digital-library-management
```

### 🔹 Compile and Run the Program
```sh
 javac DigitalLibrary.java
 java DigitalLibrary
```

## Usage Instructions
Upon running the program, you will be presented with a menu to choose from various options:
1️⃣ Add a Book
2️⃣ View All Books
3️⃣ Search Book by ID or Title
4️⃣ Update Book Details
5️⃣ Delete a Book Record
6️⃣ Exit System

Simply enter the corresponding number for the desired action and follow the prompts.

## Challenges Faced
- Implementing **unique book IDs** and ensuring proper validation.
- Managing **user input errors** and handling exceptions gracefully.
- Designing an **efficient book search mechanism** using HashMap for O(1) access time.

## Future Improvements
- Implementing a **GUI version** of the system using Java Swing or JavaFX.
- Adding a **database** (PostgreSQL or MySQL) to store books persistently.
- Integrating **sorting and filtering** features for better book organization.

## Deployment Link
The project is currently a **console-based application** and does not require deployment. However, a GUI or web-based version can be deployed in the future.

## Contribution
Feel free to fork the repository, create a new branch, and submit a pull request for improvements.


