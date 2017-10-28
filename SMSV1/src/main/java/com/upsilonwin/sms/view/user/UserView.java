package com.upsilonwin.sms.view.user;

import com.upsilonwin.sms.business.registration.boundary.UserService;
import com.upsilonwin.sms.business.registration.entity.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Vivek Pandey
 */
@Named
@RequestScoped
public class UserView {

    @Inject
    UserService userService;

    @Inject
    Logger logger;

    @NotNull
    @NotEmpty
    private String username;

    @NotNull
    @NotEmpty
    private String password;

    public void createUser() {
        User u = userService.create(User.of(username, password));
        logger.log(Level.INFO, "User Created {0}", u.getId());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
