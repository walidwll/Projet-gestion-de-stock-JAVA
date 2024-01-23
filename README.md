# Inventory System with Java Swing and MySQL Database

## Overview

Welcome to the Stock Management System project! This application is designed to help businesses efficiently manage their stock by providing a user-friendly interface built with Java Swing and a robust backend powered by MySQL database.

## Table of Contents

1. [Features](#features)
2. [Requirements](#requirements)
3. [Installation](#installation)
4. [Configuration](#configuration)
5. [Usage](#usage)
6. [Contributing](#contributing)
7. [License](#license)

## Features

- **User-Friendly Interface:** The application is built using Java Swing, offering a simple and intuitive user interface for managing stock.
- **Database Integration:** Utilizes MySQL database to store and retrieve stock information, ensuring data consistency and reliability.
- **Product Management:** Add, update, and delete products with ease.
- **Stock Tracking:** Keep track of stock levels, receive notifications for low stock, and view detailed stock reports.
- **User Authentication:** Secure the system with user authentication to control access and maintain data integrity.
- **Export/Import Data:** Easily import or export stock data to/from the system.

## Requirements

To run this application, you need:

- Java Development Kit (JDK) 8 or above
- MySQL Database

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/walidwll/Projet-gestion-de-stock-JAVA.git

2. Compile the Java code:
    ```bash
    javac -cp ".:path/to/mysql-connector-java.jar" Main.java

3. Run the application:
    ```bash
    java -cp ".:path/to/mysql-connector-java.jar" Main


## Configuration
1. Set up the MySQL Database: 

- Create a new database named 'stock_management'.
- Import the database.sql file to create the necessary tables and initial data.

2. Update database configuration in 'DatabaseConfig.java':

    ```java
    public class DatabaseConfig {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/stock_management";
    static final String USER = "your_username";
    static final String PASSWORD = "your_password";
    }

## Usage
Run the application and log in using your credentials.
Navigate through the user-friendly interface to manage products, track stock levels, and generate reports.
## Contributing
If you'd like to contribute to the project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and submit a pull request.
## License
This project is licensed under the MIT License, which means you are free to use, modify, and distribute the code for both commercial and non-commercial purposes.

Feel free to reach out if you have any questions or need further assistance. Happy coding!