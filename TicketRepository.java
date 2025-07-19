//Stores tickets (like a fake database)

import java.util.ArrayList;
import java.util.List;

//a storage room where your tickets are saved, found, and deleted.
public class TicketRepository {
    private List<Ticket> tickets = new ArrayList<>();  // list that stores all the Ticket objects.

    //Called from TicketService when booking a ticket.
    public void save(Ticket ticket) {
        tickets.add(ticket);  //adds a ticket to the list.
    }

    public List<Ticket> findAll() {    //Returns the whole list of tickets.
        return tickets;                //Used when we want to show all booked tickets.
    }

    public Ticket findById(int id) {     //Looks at each ticket.
        for (Ticket t : tickets) {        //If it finds one with the same id, it returns it.
            if (t.getId() == id) {         //If not, returns null.
                return t;
            }
        }
        return null;
    }

    public void deleteById(int id) {         //Deletes the ticket with the given id.
        tickets.removeIf(t -> t.getId() == id); //removeIf() is a simple way to remove something from a list based on a condition.


    }
}

// In Java (especially Spring), a repository is the part that talks to the database — like a helper that knows how to:
// Save things
// Find things
// Delete things
// We’re doing the same thing here — just using a List instead of a real database.

