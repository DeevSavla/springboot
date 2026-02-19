package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashed_password;
    private List<Ticket> tickets_booked;
    private String user_id;
}

//private so that no one access this variables directly, access using getters / setters.