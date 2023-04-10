package Data.Dtos.Response;

import lombok.Data;

@Data
public class CreateUserResponse {
    private int id;
    private  String message;
    private int statusCode;
}
