/*🧱 What will this app do?
You can create tickets 🎟️

You can view all tickets

You can update a ticket

You can delete a ticket

Data is stored in a list (we’ll simulate a repository)

*/

public class Main {
    public static void main(String[] args) {
        // 1. Create the repository
        TicketRepository repo = new TicketRepository();

        // 2. Create the service and give it the repository
        TicketService service = new TicketService(repo);

    //    3. Create some tickets
        Ticket t1 = new Ticket(1, "Alice", "Avengers");
        Ticket t2 = new Ticket(2, "Bob", "Spiderman");

        // 4. Book the tickets
        service.bookTicket(t1);
        service.bookTicket(t2);

        // 5. Show all tickets
        System.out.println("\nAll Tickets:");
        service.showAllTickets();

        // 6. Update a ticket
        System.out.println("\nUpdating Ticket 2:");
        service.updateTicket(2, "Bob", "Batman");

        // 7. Show all again
        System.out.println("\nAll Tickets After Update:");
        service.showAllTickets();

        // 8. Cancel a ticket
        System.out.println("\nCanceling Ticket 1:");
        service.cancelTicket(1);

        // 9. Show final list
        System.out.println("\nFinal Tickets:");
        service.showAllTickets();
    }
}

   