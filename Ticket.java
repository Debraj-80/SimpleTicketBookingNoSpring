//POJO class (fields, constructor, getter, setter, toString)

//Create a new class called Ticket
public class Ticket {

    //private means only this class can directly access these variables.
    private int id; 
    private String customerName;
    private String movieName;


//Constructor
//When you create a new Ticket, this constructor is called to set up the ticket’s details right away.
    public Ticket(int id,String customerName, String movieName){
    
        this.id = id;  //this.id = id; means:“Put the value you gave me (id) into this ticket’s id field.”
        this.customerName = customerName;
        this.movieName = movieName;

    }

//Getters > These methods let other parts of the program see the ticket’s details.
//Since the variables are private, you can’t access them directly from outside
//so you use these getters to get the values.
public int getId() {
    return id;         
}
public String getCustomerName() {
    return customerName;
}
public String getMovieName() {
    return movieName;
}

//Setters:> let you change the ticket’s details after it’s created.
//if you want to change the movie name or the customer’s name.
public void setCustomerName(String customerName) {
    this.customerName = customerName;
}

public void setMovieName(String movieName) {
    this.movieName = movieName;
}


// toString() method:
//This is a special method that tells Java how to print the ticket as text.
//When you do System.out.println(ticket);, this text will show up.
//It makes reading ticket info easy
@Override //java alraedy has tostring but we use another tostring to get desired output and override lets us override previous one
public String toString() {
    return "Ticket ID: " + id + ", Name: " + customerName + ", Movie: " + movieName;
}

}
