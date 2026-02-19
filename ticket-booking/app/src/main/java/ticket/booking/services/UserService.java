package ticket.booking.services;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ticket.booking.entities.User;

public class UserService {

    private User user;

    private List<User> userList;

    private static final String USERS_PATH = "app/src/main/java/ticket/booking/localDB/users.json";

    // serialize - java object to json
    // deserialize - ulta
    private ObjectMapper objectMapper = new ObjectMapper();

    // constructor
    public UserService(User user1) throws IOException {
        this.user = user1;

        File users = new File(USERS_PATH);

        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
        });
    }

    public boolean loginUser() {

        //stream - stream api -> creates a new array after filtering it with a condition.
        //function are first class they can be as argument, parameters and can be used.
        //predicate is a boolean function that returns T/F based on condition in filter.
        //Predicate<? super T> - this means T if any predicate has User or its parent class.
        //stream() - Converts list into pipeline
        //map() - Transforms elements & creates a new list
        //filter() - Removes elements
        //collect() - Converts stream back to list

        // Optional<User> foundUser = userList.stream().filter(user1 => {
        //     return user1.getName().equals(user.getName()) 
        // })

        //return foundUser.isPresent();

        return true;
    }
}
