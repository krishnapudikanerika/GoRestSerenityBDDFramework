package testdata;

import models.User;

public class UserFactory {

    public static User createUser() {

        long timestamp =
                System.currentTimeMillis();

        User user = new User();

        user.setName(
                "User_" + timestamp);

        user.setEmail(
                "user"
                        + timestamp
                        + "@mail.com");

        user.setGender("male");

        user.setStatus("active");

        return user;
    }
}