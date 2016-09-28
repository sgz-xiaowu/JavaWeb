package com.sdw.web.server;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shendawei on 16/9/28.
 */
@WebService
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(int uid) {
        return UserCenter.getInstance().getUser(uid);
    }

    @Override
    public List<User> getUsers() {
        return UserCenter.getInstance().getUsers();
    }

    @Override
    public List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for (User user : UserCenter.getInstance().getUsers()) {
            names.add(user.getName());
        }
        return names;
    }
}
