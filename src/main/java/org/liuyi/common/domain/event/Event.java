package org.liuyi.common.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
@SuperBuilder
@NoArgsConstructor  // ⚠️ 必须！Jackson 反序列化需要
@AllArgsConstructor
public abstract class Event {
    @Builder.Default
    protected String eventId = UUID.randomUUID().toString();

    @Builder.Default
    protected String occurredOn = LocalDateTime.now().toString();

    @Builder.Default
    protected String version = "v1.0";

    public abstract String getTopic();
}