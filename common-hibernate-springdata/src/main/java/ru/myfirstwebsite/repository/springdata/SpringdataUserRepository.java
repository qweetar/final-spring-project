package ru.myfirstwebsite.repository.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.myfirstwebsite.domain.HibernateUser;

public interface SpringdataUserRepository extends
        CrudRepository<HibernateUser, Long>,
        JpaRepository<HibernateUser, Long>,
        PagingAndSortingRepository<HibernateUser, Long> {

    HibernateUser findByLogin(String login);
    



    HibernateUser findByUserId(Long id);
}
