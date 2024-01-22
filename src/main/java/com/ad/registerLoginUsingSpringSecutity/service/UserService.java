package com.ad.registerLoginUsingSpringSecutity.service;

import com.ad.registerLoginUsingSpringSecutity.entity.User;

public interface UserService {

     User saveUser(User user);

     void removeSessionMessage();

}