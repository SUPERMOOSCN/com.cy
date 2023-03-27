package com.example.store.mapper;

import com.example.store.entity.User;
import org.apache.ibatis.annotations.Mapper;

//@Mapper cost a lot, in one project maybe exist many mapper interface
public interface UserMapper {
    /**
     * insert user data
     * @param user
     * @return the col number of the search result
     */
    Integer insert(User user);

    /**
     * according to the username to find user
     * @param username
     * @return user data, if not return null
     */
    User findByUsername(String username);
}
