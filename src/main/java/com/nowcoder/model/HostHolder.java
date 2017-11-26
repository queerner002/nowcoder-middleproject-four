package com.nowcoder.model;

import org.springframework.stereotype.Component;

/**
 * Created by nowcoder on 2016/7/3.
 */
@Component
public class HostHolder {
    private static ThreadLocal<User> users = new ThreadLocal<User>(); //线程本地变量，每一个线程访问只能访问自己线程里的变量

    public User getUser() {
        return users.get();

    }

    public void setUser(User user) {
        users.set(user);
    }

    public void clear() {
        users.remove();;
    }
}
