package com.example.languages_learning_app.Services;

import java.util.ArrayList;
import java.util.List;

import com.example.languages_learning_app.DTO.User;

public class UserService implements Subject {
    private User user;

    private List<UserObserver> observers;
    observers = new ArrayList<UserObserver>();

    public UserService(User user_param) {
        this.user = user_param;
    }

    public User getUser() {
        return this.user;
    }

    @Override
    public void attach(UserObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(UserObserver observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (UserObserver observer: observers) {
            observer.update(user);
        }
    }

    public void changeActiveStatus(boolean stt) {
        user.setActive(stt);
        // Notify active status changed
        this.notifyAllObserver();
    }
}
