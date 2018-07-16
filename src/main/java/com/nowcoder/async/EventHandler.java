package com.nowcoder.async;

import java.util.List;

/**
 * Created by nowcoder on 2016/7/30.
 */
public interface EventHandler {
    void doHandle(EventModel model);//处理

    List<EventType> getSupportEventTypes();//关注哪些event
}
