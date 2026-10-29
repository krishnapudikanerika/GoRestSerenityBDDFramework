package testdata;

import models.User;

public class UserFactory {

    public static User createUser() {

        User user = new User();

        user.setName("Krishna");
        user.setEmail("krishna" + System.currentTimeMillis() + "@gmail.com");
        user.setGender("male");
        user.setStatus("active");

        return user;
    }
}