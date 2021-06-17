package com.example.languages_learning_app.Services;

import com.example.languages_learning_app.DTO.User;

public class UserClient {
    // Change active status of user and return this user
    public User changeActStt(boolean activeStt, User usr_param) {
        UserService usrsvc = createUserService(usr_param);
        usrsvc.changeActiveStatus(activeStt);
        return usrsvc.getUser();
    }

    // Create new UserService
    public static UserService createUserService(User user) {
        UserService usrsvc = new UserService(user);
        usrsvc.attach(new ScreenNotify());

        return usrsvc;
    }
}
