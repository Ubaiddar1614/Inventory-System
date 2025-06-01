# 🧾 Java Inventory Management System

A simple Inventory Management System built using **Java Swing** for GUI and **OOP principles** like classes, encapsulation, and event handling.

---

## 🚀 Features

- 🔐 **Login System**  
  Allows only registered users to access the inventory using hardcoded credentials.

- 📦 **Inventory Form**  
  Users can add item details like:
  - Item Name
  - Category (Dropdown)
  - Availability (Checkbox)

- 🖨️ **Live Output Display**  
  Items added are shown in a scrollable text area for real-time feedback.

---

## 🧠 Concepts Used

- Java Swing (JFrame, JLabel, JTextField, JButton, etc.)
- Object-Oriented Programming (Classes, Constructors, Encapsulation)
- ActionListeners (Event-driven programming)
- Basic Authentication Logic

---

## 🗂️ Project Structure

```plaintext
InventorySystem/
│
├── Main.java             // Entry point, loads login screen
├── auth.java             // Login GUI logic
├── InventoryWindow.java  // Inventory form GUI
├── user.java             // User class with username/password
└── UserData.java         // Stores and authenticates user credentials
