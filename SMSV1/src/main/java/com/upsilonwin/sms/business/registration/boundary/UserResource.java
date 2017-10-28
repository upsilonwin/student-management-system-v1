package com.upsilonwin.sms.business.registration.boundary;

import com.upsilonwin.sms.business.registration.entity.User;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Vivek Pandey
 */
@Path("user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    UserService userService;

    @GET
    public User get() {
        return userService.login();
    }

}
