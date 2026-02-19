package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String hashed_password;
    private List<Ticket> tickets_booked;
    private String user_id;

    public User(String name, String hashed_password, List<Ticket> tickets_booked, String user_id) {
        this.name = name;
        this.hashed_password = hashed_password;
        this.tickets_booked = tickets_booked;
        this.user_id = user_id;
    }

    public User() {
    }

    // Getter Functions

    public String getName() {
        return name;
    }

    public String getHashedPassword() {
        return hashed_password;
    }

    public List<Ticket> getTicketsBooked() {
        return tickets_booked;
    }

    public String getUserId() {
        return user_id;
    }

    // Print Tickets

    public void printTickets() {
        for (int i = 0; i < tickets_booked.size(); i++) {
            System.out.println(tickets_booked.get(i).getTicketsInfo());
        }
    }

    // Setter functions

    public void setName(String name) {
        this.name = name;
    }

    public void setHashedPassword(String hashed_password) {
        this.hashed_password = hashed_password;
    }

    public void setTicketsBooked(List<Ticket> tickets_booked) {
        this.tickets_booked = tickets_booked;
    }

    public void setUserId(String user_id) {
        this.user_id = user_id;
    }
}

// private so that no one access this variables directly, access using getters / setters.
