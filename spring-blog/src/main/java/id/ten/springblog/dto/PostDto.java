package id.ten.springblog.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project Name     : spring-blog
 * Date Time        : 3/13/2020
 *
 * @author Teten Nugraha
 */

@Data
@NoArgsConstructor
public class PostDto {

    private Long id;
    private String content;
    private String title;
    private String username;

}
