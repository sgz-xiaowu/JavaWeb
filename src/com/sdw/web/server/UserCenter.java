package com.sdw.web.server;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shendawei on 16/9/28.
 */
public class UserCenter {

    private static UserCenter s_instance;

    private static final String[] NAMES = new String[]{"小红", "张三", "李四", "王刚", "李莉莉", "文章", "小强", "叶硕"};

    private List<User> users;

    private UserCenter() {
        if (users == null) {
            users = new ArrayList<>();
        }
        dumpUsers();
    }

    public static UserCenter getInstance() {
        if (s_instance == null) {
            s_instance = new UserCenter();
        }
        return s_instance;
    }

    public void dumpUsers() {
        User user = null;
        for (int i=0; i<NAMES.length; i++) {
            user = new User();
            user.setUid(i);
            user.setName(NAMES[i]);
            if (i%2 == 0) {
                user.setAge(i * 3 + 1);
                user.setSex("男");
            } else {
                user.setAge(i * 3 - 1);
                user.setSex("女");
            }

            users.add(user);
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUser(int uid) {
        return users.get(uid);
    }
}
