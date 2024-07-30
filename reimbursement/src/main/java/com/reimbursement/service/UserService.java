package com.reimbursement.service;
import com.reimbursement.entities.User;
import com.reimbursement.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUserList(){
        List<User> list=new ArrayList<>();
        list=userRepository.findAll();
        return list;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }


    public User updateUser(User updatedUser,Long id){
        User user = userRepository.findById(id).orElse(null);
        if(user!=null){
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());

           return userRepository.save(user);
        }
        return null;
    }

    public boolean deleteUser(Long id){
        userRepository.deleteById(id);
        if(!userRepository.findById(id).isPresent())
            return true;
        return false;
    }
}
