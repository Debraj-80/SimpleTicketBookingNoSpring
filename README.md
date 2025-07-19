# 🎫 Simple Ticket Booking System (Core Java, No Spring)

A beginner-friendly, console-based Java application for booking, updating, viewing, and canceling movie tickets — built using **pure Java** (no Spring, no database).

---

## 🚀 Features

- 📥 Book a new ticket
- 📋 View all booked tickets
- ✏️ Update an existing ticket
- ❌ Cancel a ticket
- 🧾 Console output for all actions
- 🧼 Clean OOP structure with Repository and Service layers

---

## 🛠 Technologies Used

- Java (Core)
- OOP (Object-Oriented Programming)
- Java Collections (`ArrayList`)
- No frameworks or databases

---

## 📁 Project Structure

<pre> ## 📁 Project Structure ``` SimpleTicketBookingNoSpring/ ├── Ticket.java # Model class (POJO) for ticket details ├── TicketRepository.java # Simulated database using List<Ticket> ├── TicketService.java # Business logic layer └── Main.java # Entry point to run the app ``` </pre>












---

## ✅ How It Works

1. `Main.java` creates sample tickets
2. Calls service methods to:
   - Book tickets
   - Display them
   - Update a ticket
   - Cancel a ticket
3. All operations are printed in the console

---

## 📦 How to Run

> ⚠️ Make sure Java is installed.

```bash
# Compile all classes
javac *.java

# Run the program
java Main
