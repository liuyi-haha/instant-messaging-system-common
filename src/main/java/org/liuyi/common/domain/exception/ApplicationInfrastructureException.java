package org.liuyi.common.domain.exception;

public class ApplicationInfrastructureException extends ApplicationException { // 兜底异常
    public ApplicationInfrastructureException(String message, Exception ex) {
        super(message, ex);
    }
}