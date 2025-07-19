//Business logic (book, cancel, update)
public class TicketService {

    
    private TicketRepository repository; //This is your helper to save, find, and delete tickets.
                                         //Like saying: “I’ll need access to the storage box.”


    // Constructor
    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public void bookTicket(Ticket ticket) {
        repository.save(ticket);
        System.out.println("✅ Ticket booked!");
    }

    public void showAllTickets() {
        for (Ticket t : repository.findAll()) {
            System.out.println(t);
        }
    }

    public void updateTicket(int id, String newName, String newMovie) {
        Ticket ticket = repository.findById(id);
        if (ticket != null) {
            ticket.setCustomerName(newName);
            ticket.setMovieName(newMovie);
            System.out.println("✏️ Ticket updated.");
        } else {
            System.out.println("❌ Ticket not found.");
        }
    }

    public void cancelTicket(int id) {
        repository.deleteById(id);
        System.out.println("❌ Ticket canceled (if it existed).");
    }
}

