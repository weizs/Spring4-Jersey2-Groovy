package me.itq.it.group.modules.user.dao

import me.itq.it.group.common.user.dao.IUserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by William.Wei on 2015/8/30.
 */
@Repository
class UserDao implements IUserDao{
    def getUser(){
        def user = "朴人博客"
        "user is ${user}".toString()
    }
}
