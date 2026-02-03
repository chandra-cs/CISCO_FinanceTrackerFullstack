# 💰 Personal Finance Tracker – Full Stack Application
# Author : Chandra Sekhar Jena 

A **full-stack Personal Finance Tracker** application built using **Spring Boot, React, and MySQL** that helps users manage income, expenses, budgets, and financial trends with secure authentication and insightful analytics.

This project is designed following **industry best practices**, clean architecture, and is suitable for **real-world usage and resume showcase**.

---

## 🚀 Features

### 🔐 Authentication & Security
- User registration and login
- Secure password storage (BCrypt)
- JWT-based authentication
- Role-based access control

### 💸 Expense & Income Management
- Add, edit, delete income and expenses
- Categorize transactions (Food, Rent, Travel, etc.)
- Monthly and yearly transaction tracking and Exporting (CSV or Excel)

### 📊 Financial Insights & Analytics
- Monthly expense vs income charts
- Category-wise spending distribution
- Forecasting and trend analysis
- Visual dashboards for better financial decisions
- Exporting (CSV or Excel)

### 🎯 Budget Management
- Set monthly budgets by category
- Budget vs actual spending comparison
- Alerts for overspending
- Exporting (CSV or Excel)

### 🖥️ User-Friendly Interface
- Responsive UI (desktop & mobile)
- Clean dashboard layout
- Interactive charts and graphs

---

## 🧱 Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- RESTful APIs
- JWT Authentication

### Frontend
- React.js
- Axios
- Chart.js / Recharts
- CSS / Responsive Design

### Database
- MySQL
- JPA / Hibernate ORM

### Tools & Others
- Maven
- Git & GitHub
- Postman (API testing)

---

## ⚙️ Backend Setup (Spring Boot)

### Prerequisites
- Java 17+
- Maven
- MySQL

### Steps
```bash
cd backend
mvn clean install
mvn spring-boot:run
Backend runs on: http://localhost:8080

🎨 Frontend Setup (React)
Prerequisites
Node.js (v18+ recommended)

npm or yarn

Steps
bash
Copy code
cd frontend
npm install
npm run dev
Frontend runs on: http://localhost:5173

🗄️ Database Setup (MySQL)
Create database:

sql
Copy code
CREATE DATABASE finance_tracker_db;
Update application.properties:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/finance_tracker_db
spring.datasource.username=your_username
spring.datasource.password=your_password
Tables are auto-created using JPA/Hibernate.

🔌 API Overview
Method	Endpoint	Description

income-controller
GET /api/incomes
POST /api/incomes
GET /api/incomes/page
DELETE /api/incomes/{id}

expense-controller
GET /api/expenses
POST /api/expenses
GET /api/expenses/page
DELETE /api/expenses/{id}

budget-controller
GET /api/budgets
POST /api/budgets
DELETE /api/budgets/{id}

auth-controller
POST /api/auth/verify-otp
POST /api/auth/register
POST /api/auth/login

🧪 Testing
Backend APIs tested using Postman or Swagger

Manual UI testing on multiple screen sizes

🛡️ Security Highlights
JWT token validation

Password hashing using BCrypt

Protected API endpoints

Secure role-based access

📈 Future Enhancements

Email notifications

Multi-currency support

Mobile application version

🤝 Contribution
Contributions, suggestions, and improvements are welcome.

📄 License
This project is for learning and demonstration purposes.

👨‍💻 Author
Chandra Sekhar Jena
GitHub: https://github.com/chandra-cs
