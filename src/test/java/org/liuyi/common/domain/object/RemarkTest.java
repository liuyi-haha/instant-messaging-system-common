package org.liuyi.common.domain.object;

import org.junit.jupiter.api.Test;
import org.liuyi.common.domain.exception.InvalidRemarkException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RemarkTest {

    @Test
    void should_accept_length_between_1_and_20() {
        assertDoesNotThrow(() -> new Remark("a"));
        assertDoesNotThrow(() -> new Remark("12345678901234567890"));
    }

    @Test
    void should_throw_invalid_remark_exception_when_null_or_out_of_range() {
        assertThrows(InvalidRemarkException.class, () -> new Remark(null));
        assertThrows(InvalidRemarkException.class, () -> new Remark(""));
        assertThrows(InvalidRemarkException.class, () -> new Remark("123456789012345678901"));
    }

    @Test
    void validate_should_throw_invalid_remark_exception_when_invalid() {
        assertThrows(InvalidRemarkException.class, () -> Remark.validate(null));
    }

    @Test
    void value_should_return_original_remark() {
        Remark remark = new Remark("hello");
        assertEquals("hello", remark.value());
    }
}

