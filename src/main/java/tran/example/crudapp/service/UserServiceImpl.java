package tran.example.crudapp.service;

import java.util.List;

import tran.example.crudapp.model.User;
import tran.example.crudapp.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user){
        saveUser(user);
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

    public void deleteAllUsers(){
        userRepository.deleteAll();
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public boolean isUserExist(User user) {
        return findByName(user.getName()) != null;
    }

}
