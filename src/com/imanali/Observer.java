package com.imanali;

public interface Observer {
    void update();

    void subscribeChannel(Channel ch);
}
