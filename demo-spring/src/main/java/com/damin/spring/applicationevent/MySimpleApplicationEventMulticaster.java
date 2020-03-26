package com.damin.spring.applicationevent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.event.EventPublishingRunListener;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.ErrorHandler;

@Component(AbstractApplicationContext.APPLICATION_EVENT_MULTICASTER_BEAN_NAME)
public class MySimpleApplicationEventMulticaster extends SimpleApplicationEventMulticaster {

    public MySimpleApplicationEventMulticaster() {
        super.setErrorHandler(new LoggingErrorHandler());
    }

    @Override
    public void setErrorHandler(ErrorHandler errorHandler) {
        super.setErrorHandler(errorHandler);
    }


    private static class LoggingErrorHandler implements ErrorHandler {

        private static Log logger = LogFactory.getLog(EventPublishingRunListener.class);

        @Override
        public void handleError(Throwable throwable) {
            logger.warn("Error calling ApplicationEventListener", throwable);
        }

    }


}
