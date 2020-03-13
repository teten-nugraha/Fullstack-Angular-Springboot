package id.ten.springblog.dto;

import lombok.Data;

/**
 * Project Name     : spring-blog
 * Date Time        : 3/13/2020
 *
 * @author Teten Nugraha
 */

@Data
public class RegisterRequestDto {

    private String username;
    private String password;
    private String email;

}
