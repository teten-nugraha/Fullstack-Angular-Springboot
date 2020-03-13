package id.ten.springblog.repository;

import id.ten.springblog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Project Name     : spring-blog
 * Date Time        : 3/13/2020
 *
 * @author Teten Nugraha
 */

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
