package org.liuyi.common.domain.exception;

public class ApplicationValidationException extends ApplicationException { // 对应DomainEvent的子类
    public ApplicationValidationException(String message) {
        super(message);
    }
}