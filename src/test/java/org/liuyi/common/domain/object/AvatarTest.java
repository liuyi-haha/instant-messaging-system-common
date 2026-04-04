package org.liuyi.common.domain.object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class AvatarTest {

    @Test
    void should_store_file_id_and_copy_content() {
        byte[] content = new byte[]{1, 2, 3};
        Avatar avatar = new Avatar("file-1", content);

        assertEquals("file-1", avatar.getFileId());
        assertNotNull(avatar.getContent());
        assertArrayEquals(new byte[]{1, 2, 3}, avatar.getContent());
    }

    @Test
    void should_allow_null_content() {
        Avatar avatar = new Avatar("file-2");
        assertEquals("file-2", avatar.getFileId());
        assertNull(avatar.getContent());
    }
}
