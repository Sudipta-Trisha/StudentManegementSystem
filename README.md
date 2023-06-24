# Student Manegement System

![GitHub stars](https://img.shields.io/github/stars/Sudipta-Trisha/StudentManegementSystem)  ![GitHub forks](https://img.shields.io/github/forks/Sudipta-Trisha/StudentManegementSystem)

Student Management System is a simple CRUD (Create, Read, Update, Delete) application designed to facilitate student information management for educational institutions. With the Student Management System, administrators, teachers, and other stakeholders can efficiently add, update, and delete student information, ensuring accurate records and streamlined administrative processes.

The Student Management System simplifies the administrative tasks associated with managing student data, allowing educational institutions to centralize and organize student information in a user-friendly interface. By utilizing this system, institutions can improve efficiency, reduce manual paperwork, and enhance communication among teachers, administrators, and students.

### Technology Stack
  
By leveraging Spring Boot on the backend and combining HTML, Bootstrap, and Thymeleaf on the frontend, this project offers a robust and user-friendly experience. The combination of these technologies ensures efficient development, a responsive user interface, and seamless integration between the frontend and backend components.

This technology stack allows for rapid development, scalability, and easy maintenance of the project. Developers familiar with Spring Boot, HTML, Bootstrap, and Thymeleaf will find it easy to customize and extend the system to meet specific requirements.


## Table of Contents

* [Student Mangement System](#student-management-system)
   * [Table of Contents](#table-of-contents)
   * [Features](#features)
   * [System Requirements](#system-requirements)
   * [Installation](#installation)
   * [Usage](#usage)
   * [Contributing](#contributing)
   * [License](#license)
 
## Features

* <strong>Add Student</strong> : Users can add new students to the system by entering their details, such as name, age ,contact information, and email address.

* <strong>View Student Information</strong>: Users can view the details of all students stored in the system, including their names, contact information, and enrollment details.

* <strong>Update Student Information</strong>: Users have the ability to update the information of existing students, such as modifying their contact details, program changes, or any other relevant information.

* <strong>Delete Student</strong>: Users can remove a student's information from the system if it is no longer required or if there is a need for data cleanup.

* <strong>Validation and Error Handling</strong>: The system incorporates validation checks to ensure that accurate and valid data is entered. It provides appropriate error messages or prompts users to correct any input errors.

* <strong>User Authentication and Authorization</strong>: The system may include user authentication to ensure that only authorized individuals can access and perform operations within the application.

* <strong>Responsive User Interface</strong>: The frontend interface is designed using Thymeleaf and Bootstrap, providing a responsive and user-friendly experience across different devices and screen sizes.

* <strong>Database Integration</strong>: The system integrates with a MySQL database to store and manage student information efficiently.

* <strong>Data Persistence</strong>: The system ensures that student data is persisted between sessions, allowing users to access and modify information consistently.

## System Requirements

* IDE: IntelliJ IDEA Ultimate/Netbeans/Eclipse
* Mysql server
* JDK 20
* Maven

## Installation

1. Clone the project repository or Download zip file

```bash
  git clone https://github.com/Sudipta-Trisha/StudentManegementSystem.git
```

 2. Navigate to the project directory
``` bash
  cd Student-Management-System
```

3. Install the dependecies
```bash
  mvn clean package
```

4. Configure the Application
    Open the [**application.properties**](Student-Management-System/src/main/resources/application.properties) file in a text editor and modify the database connection properties (e.g., URL, username, password) to match local MySQL configuration. 

6. Run the application
```bash
  mvn spring-boot:run
```

7. Open the web browser and navigate to **http://localhost:8080/students**

## Usage

The Student Management System allows you to perform the following tasks:

- Add Student: Add new students to the system by providing their name, age, email address and enrollment details.

- Update Student Information: Edit and update existing student information, such as contact details or enrollment information.

- Delete Student: Remove a student's information from the system when it is no longer needed.

To use the system, open a web browser and navigate to the provided URL. From there, user can access the different functionalities and interact with the application.

## Contributing

We appreciate your interest in contributing to the Student Management System project. Please check the guidelines in [**Contributing.md**](Student-Management-System/CONTRIBUTING.md). Your contributions help make the project better and benefit the entire community.

Feel free to reach out to **sudiptatrisha.19@gmail.com** , if you have any questions or need further assistance regarding the contribution process.

## License

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-green.svg)](https://www.gnu.org/licenses/gpl-3.0)

This software is licensed under the GNU General Public License (GPL) version 3.

The full text of the GPL can be found in the [**LICENSE**](LICENSE) file.






