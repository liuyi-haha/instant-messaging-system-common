package org.liuyi.common.domain.exception;

public class DomainException extends RuntimeException { //只有参数校验错误定义专门的领域异常子类，其它的领域异常都抛出这个
    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
