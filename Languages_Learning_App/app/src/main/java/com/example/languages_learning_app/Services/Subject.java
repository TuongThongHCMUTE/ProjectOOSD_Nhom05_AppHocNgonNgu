package com.example.languages_learning_app.Services;

public interface Subject {
    void attach(UserObserver observer);
    void detach(UserObserver observer);
    void notifyAllObserver();
}
