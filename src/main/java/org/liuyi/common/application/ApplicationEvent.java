package org.liuyi.common.application;

import java.io.Serializable;

public interface ApplicationEvent extends Serializable {
    String eventId();
}