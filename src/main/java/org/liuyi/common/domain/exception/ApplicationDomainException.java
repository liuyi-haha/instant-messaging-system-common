package org.liuyi.common.domain.exception;

public class ApplicationDomainException extends ApplicationException { //对应DomainEvent
    public ApplicationDomainException(String message, Exception ex) {
        super(message, ex);
    }
}