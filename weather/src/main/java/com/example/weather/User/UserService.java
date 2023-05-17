package com.example.weather.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> getUser(){
        return usersRepository.findAll();
    }

    public void addNewUser(User user){
        Optional<User>userOptional = usersRepository.findUserByEmail(user.getEmail());

        if(userOptional.isPresent()){
            throw new IllegalStateException("ten email zostal juz wykorzystany");
        }
        usersRepository.save(user);
    }

    public void deleteUser(Long userId){
        boolean exists = usersRepository.existsById(userId);

        if(!exists){
            throw new IllegalStateException("uzytkownik z id: " + userId + "nie istnieje");
        }
        usersRepository.deleteById(userId);
    }

    public void updateUser(Long userId, String name, String email){
        User user = usersRepository.findById(userId)
                .orElseThrow(() -> new IllegalStateException(
                        "uzytkownik z id " + userId +" nie istnieje"
                ));
        if(name != null && name.length() > 0 && !Objects.equals(user.getName(), name)){
            user.setName(name);
        }

        if(email != null && email.length() > 0 && Objects.equals(user.getEmail(), name)){
            Optional<User> userOptional = usersRepository
                    .findUserByEmail(email);
            if(userOptional.isPresent()){
                throw new IllegalStateException("email jest juz zajety");
            }
            user.setEmail(email);
        }
    }

}
