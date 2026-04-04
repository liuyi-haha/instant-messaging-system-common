package org.liuyi.common.domain.object;

import org.liuyi.common.domain.exception.InvalidRemarkException;

public final class Remark {
    private final String remark;

    public Remark(String remark) {
        validate(remark);
        this.remark = remark;
    }

    public static void validate(String remark) {
        if (remark == null || remark.isEmpty() || remark.length() > 20) {
            throw new InvalidRemarkException();
        }
    }

    public String value() {
        return remark;
    }
}
