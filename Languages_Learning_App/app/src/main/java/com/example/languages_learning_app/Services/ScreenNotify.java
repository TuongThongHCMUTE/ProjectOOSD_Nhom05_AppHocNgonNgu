package com.example.languages_learning_app.Services;

import com.example.languages_learning_app.DTO.User;

public class ScreenNotify implements UserObserver {

    @Override
    public void update(User user) {
        if(user.isActive() == true) {
            // Notify user is active
            // Create notification here instead of following code
            int k = 1;
        } else {
            // notify user is block
            // Create notification here instead of following code
            int k = 0;
        }
    }
}
