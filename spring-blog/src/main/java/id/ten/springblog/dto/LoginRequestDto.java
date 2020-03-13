package id.ten.springblog.dto;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class LoginRequestDto {

    private String username;
    private String password;

}
