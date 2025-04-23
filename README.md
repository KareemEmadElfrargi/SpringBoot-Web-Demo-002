# 🌐 Spring Boot Web Demo

This is a simple **Spring Boot + JSP** demo project for learning and practicing web development using Spring MVC, JSP, and Model binding.

## 📌 Project Overview

This project allows users to:
- Submit a form with `aid` and `aname` (Alien ID and name).
- Automatically bind form data to a Java object (`Alien` class).
- Display the submitted data on a result page using JSP and Model Attributes.
- Demonstrates basic addition using form parameters (`numberOne`, `numberTwo`) and displays the result.

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- JSP (Java Server Pages)
- Maven
- Tomcat (Embedded)
- HTML & CSS

🧑‍🚀 Alien Form Submission
URL: /addAlien

HTTP Method: POST

Fields:

aid → Alien ID (integer)

aname → Alien name (string)

Result Page: Displays the submitted Alien object and a hardcoded course name (Java).

➕ Simple Calculator
URL: /add

HTTP Method: GET or POST

Parameters: numberOne, numberTwo

Result Page: Displays the sum of the two numbers
