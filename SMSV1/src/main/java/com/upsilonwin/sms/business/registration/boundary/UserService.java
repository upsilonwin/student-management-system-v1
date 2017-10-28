package com.upsilonwin.sms.business.registration.boundary;

import com.upsilonwin.sms.business.registration.control.respository.UserRepository;
import com.upsilonwin.sms.business.registration.entity.User;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class UserService {

    @Inject
    UserRepository userRepository;

    public User login() {
        return User.of("vivek", "password");
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
    
    public User getUserById(Long id) {
        return  userRepository.findBy(id);
    }
    
    
}
