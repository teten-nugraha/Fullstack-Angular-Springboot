package id.ten.springblog.repository;

import id.ten.springblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project Name     : spring-blog
 * Date Time        : 3/13/2020
 *
 * @author Teten Nugraha
 */

public interface PostRepository extends JpaRepository<Post, Long> {
}
