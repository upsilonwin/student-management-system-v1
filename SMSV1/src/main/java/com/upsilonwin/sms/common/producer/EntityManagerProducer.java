package com.upsilonwin.sms.common.producer;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Vivek Pandey
 */
public class EntityManagerProducer {
    
    @PersistenceUnit
    EntityManagerFactory entityManagerFactory;
    
    
    @Produces
    public EntityManager produce() {
        return  entityManagerFactory.createEntityManager();         
    }
    
    public void close(@Disposes EntityManager em) {
        if (em.isOpen()) {
            em.close();
        }
    }
    
}
