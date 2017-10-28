package com.upsilonwin.sms.business.registration.boundary;

import com.upsilonwin.sms.business.registration.control.respository.UserRepository;
import com.upsilonwin.sms.business.registration.entity.User;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class UserService {

    @Inject
    UserRepository userRepository;

    @Inject
    Logger logger;

    public User login() {
        return User.of("vivek", "password");
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User login(String username, String password) {
        User user = null;
        try {
            user = userRepository.findByUsernameAndPassword(username, password);
        } catch (Exception e) {
            logger.log(Level.INFO, "User {0}  does not exits", username);
            logger.log(Level.SEVERE, e.getMessage());
            return null;
        }
        return user;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findBy(id);
    }

}
