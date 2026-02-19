package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String train_id;
    private String train_no;
    private List<List<Integer>> seats;
    private Map<String,Time> station_time;
    private List<String> stations; 
}
