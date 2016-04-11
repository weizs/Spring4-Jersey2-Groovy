package me.itq.it.group.modules.user.service

import me.itq.it.group.common.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by William.Wei on 2015/8/30.
 */
@Service
class UserService implements IUserService {
    @Autowired
    def userDao;
    @Override
    def getUser() {
        return userDao.getUser()
    }
}
