package Data.Dtos.Request;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String email;
    private String firstName;
    private String lastName;
    private String passWord;
    private String phoneNumber;

}
