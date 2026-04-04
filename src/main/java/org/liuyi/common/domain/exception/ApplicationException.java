package org.liuyi.common.domain.exception;

public abstract class ApplicationException extends RuntimeException { // 只会抛出它的子类异常
    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Exception ex) {
        super(message, ex);
    }
}