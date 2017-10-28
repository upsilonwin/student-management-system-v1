package com.upsilonwin.sms.common.producer;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author Vivek Pandey
 */
public class LoggerProducer {

    @Produces
    public Logger produce(InjectionPoint ip) {
        return Logger.getLogger(ip.getMember().getDeclaringClass().getName());
    }

}
