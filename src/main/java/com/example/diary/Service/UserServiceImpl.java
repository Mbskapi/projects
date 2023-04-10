package Service;

import Data.Dtos.LoginResponse;
import Data.Dtos.Request.CreateUserRequest;
import Data.Dtos.Request.LoginRequest;
import Data.Dtos.Request.UpdateRequest;
import Data.Dtos.Response.CreateUserResponse;
import Data.Dtos.Response.NormalResponse;
import Data.Repository.UserRepository;
import Data.model.User;
import com.example.diary.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {
        if(!UserValidator.isValidPassWord(createUserRequest.getPassWord()))
        throw new RuntimeException(String.format("%s password is invalid,createUserRequest.getPassWord"));

        if(!UserValidator.isValidEmail(createUserRequest.getEmail()))
            throw new RuntimeException(String.format("%s Email is invalid,createUserRequest.getEmail"));

        if(!UserValidator.isValidPhoneNumber(createUserRequest.getPhoneNumber()))
            throw new RuntimeException(String.format("%s PhoneNumber is invalid,createUserRequest.getPhoneNumber"));

        User user = registerUser(createUserRequest);
        User saveUser = userRepository.save(user);

        return saveUserResponse(saveUser);
    }

    private static CreateUserResponse saveUserResponse(User saveUser) {
        CreateUserResponse createUserResponse = new CreateUserResponse();
        createUserResponse.setMessage("successful");
        createUserResponse.setStatusCode(201);
        createUserResponse.setId(saveUser.getId());
        return createUserResponse;
    }

    private static User registerUser(CreateUserRequest createUserRequest) {
        User user = new User();
        user.setPassWord(createUserRequest.getPassWord());
        user.setPhoneNumber(createUserRequest.getPassWord());
        user.setFirstName(createUserRequest.getPassWord());
        user.setFirstName(createUserRequest.getFirstName());
        user.setLastName(createUserRequest.getLastName());
        return user;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public NormalResponse updateUser(UpdateRequest updateRequest) {
        return null;
    }

    @Override
    public NormalResponse delete(int id) {
        return null;
    }
}
