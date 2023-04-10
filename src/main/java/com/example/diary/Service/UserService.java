package Service;

import Data.Dtos.LoginResponse;
import Data.Dtos.Request.CreateUserRequest;
import Data.Dtos.Request.LoginRequest;
import Data.Dtos.Response.NormalResponse;
import Data.Dtos.Response.CreateUserResponse;
import Data.Dtos.Request.UpdateRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    CreateUserResponse createUser(CreateUserRequest createUserRequest);

    LoginResponse login(LoginRequest loginRequest);
    NormalResponse updateUser(UpdateRequest updateRequest);
    NormalResponse delete(int id);

}
