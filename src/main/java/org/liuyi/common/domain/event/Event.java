package org.liuyi.common.domain.event;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Event {
    protected final String eventId;
    protected final String occurredOn;
    protected final String version;

    public Event() {
        this("v1.0");
    }

    public Event(String version) {
        eventId = UUID.randomUUID().toString();
        occurredOn = LocalDateTime.now().toString();
        this.version = version;
    }

    public String eventId() {
        return eventId;
    }

    public abstract String getTopic();
}