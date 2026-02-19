package ticket.booking.services;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ticket.booking.entities.User;

public class UserService {
    
    private User user;

    private List<User> userList;

    private static final String USERS_PATH = "../localDB/users.json";

    //serialize - java object to json 
    //deserialize - ulta
    private ObjectMapper objectMapper = new ObjectMapper();

    //constructor
    public UserService (User user) throws IOException {
        this.user = user;

        File users = new File(USERS_PATH);

        userList = objectMapper.readValue(users,new TypeReference<List<User>>() {});
    }

        
}
