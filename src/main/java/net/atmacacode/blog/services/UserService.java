package net.atmacacode.blog.services;

import net.atmacacode.blog.dao.UserRepository;
import net.atmacacode.blog.dto.UserUpdate;
import net.atmacacode.blog.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public User findById(long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void delete(long id) {
        userRepository.deleteById(id);
    }

    public User update(long id, UserUpdate userUpdate){
        User inDb = findById(id);
        inDb.setEmail(userUpdate.getEmail());
        inDb.setUsername(userUpdate.getUsername());
        return userRepository.save(inDb);
    }


}
