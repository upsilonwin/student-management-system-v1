package com.upsilonwin.sms.business.registration.control.respository;

import com.upsilonwin.sms.business.registration.entity.User;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

/**
 *
 * @author Vivek Pandey
 */
@Repository
public interface UserRepository extends EntityRepository<User, Long>{
    
   User findByUsernameAndPassword(String username,String password);
    
}
