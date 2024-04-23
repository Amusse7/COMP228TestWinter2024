# COMP228Test Winter2024 

## Description
This repository contains a JavaFX GUI application designed to assist car salespersons in selecting a vehicle based on the buyer's budget. The application retrieves vehicle information from an Oracle database table named Vehicle and filters the results based on the maximum price provided by the user. It utilizes SQL queries to perform filtering on the database side, ensuring efficient retrieval of relevant data.

## Features
- **GUI Interface:** Implements a user-friendly GUI interface using JavaFX for interaction with the application.
- **Database Interaction:** Retrieves vehicle information from the Oracle database table 'Vehicle'.
- **Dynamic Filtering:** Allows the user to specify a maximum budget, and retrieves vehicles with prices less than or equal to the budget using SQL queries.
- **Error Handling:** Catches exceptions for inappropriate input of the budget, preventing the program from crashing and displaying error messages in the console.
- **Layout Management:** Utilizes appropriate layout manager classes in JavaFX to implement the layout of the GUI interface.

## Prerequisites
- Java Development Kit (JDK)
- JavaFX
- SQL Developer
- Oracle server

## Usage
1. Clone the repository to your local machine.
2. Ensure that you have an Oracle database with a table named 'Vehicle' populated with vehicle information.
3. Compile the Java source files.
4. Run the JavaFX application.
5. Input the maximum budget for the vehicle.
6. View the displayed vehicle information based on the specified budget.
7. Handle any error messages displayed in the console, if inappropriate input is provided.

## Files Included
- **README.md:** Provides an overview of the project and instructions for usage.
- **Java Source Code:** Contains the source code for the JavaFX application, including classes for GUI implementation and database interaction.
- **Other necessary files:** Any additional files required for the proper functioning of the application.

## Author
Abdulkadir Musse


