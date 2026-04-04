package org.liuyi.common.domain.event;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class ApplicationEvent {
    protected final String eventId;
    protected final String occurredOn;
    protected final String version;

    public ApplicationEvent() {
        this("v1.0");
    }

    public ApplicationEvent(String version) {
        eventId = UUID.randomUUID().toString();
        occurredOn = LocalDateTime.now().toString();
        this.version = version;
    }

    public String eventId() {
        return eventId;
    }
}