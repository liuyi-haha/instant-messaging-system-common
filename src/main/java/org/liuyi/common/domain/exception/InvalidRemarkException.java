package org.liuyi.common.domain.exception;

public class InvalidRemarkException extends DomainException {
    public InvalidRemarkException() {
        super("对方备注长度限制为[1, 20]");
    }
}
