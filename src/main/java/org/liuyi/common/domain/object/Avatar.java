package org.liuyi.common.domain.object;

import java.util.Arrays;
import java.util.Optional;

public final class Avatar {
    private final String fileId;
    private final Optional<byte[]> content;

    public Avatar(String fileId) {
        this(fileId, null);
    }

    public Avatar(String fileId, byte[] content) {
        this.fileId = fileId;
        this.content = Optional.ofNullable(content); // 如果content为null，表示头像没有值
    }

    public byte[] getContent() {
        return content.orElse(null);
    }

    public String getFileId() {
        return fileId;
    }
}

