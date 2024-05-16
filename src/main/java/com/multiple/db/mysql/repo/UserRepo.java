package com.multiple.db.mysql.repo;

import com.multiple.db.mysql.entities.User;
import com.multiple.db.postgres.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByFirstName(String name);
}
