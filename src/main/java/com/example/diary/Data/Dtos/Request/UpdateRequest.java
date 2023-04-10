package Data.Dtos.Request;

import lombok.Data;

@Data
public class UpdateRequest {
    private int id;
    private String passWord;
    private String email;
    private String firstName;
    private  String lastName;
    private String phoneNumber;
}

