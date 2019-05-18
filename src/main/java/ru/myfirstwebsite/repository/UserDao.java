package ru.myfirstwebsite.repository;

import ru.myfirstwebsite.domain.to.User;

import java.util.List;

public interface UserDao extends GenericDao<User, Long> {
    User findByLogin(String login);

    List<Long> batchUpdate(List<User> users);

    List<User> search(String query, Integer limit, Integer offset);
}
