package DBMS.user;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired private UserRepository repo;

    public List<User> listAll(){
        return (List<User>) repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }

    public User get(Integer id) throws UserNotFondException {
       Optional<User> result = repo.findById(id);
       if (result.isPresent()){
           return result.get();
       }
       throw new UserNotFondException("Cannot find any user with ID " + id);
    }

    public void delete(Integer id) throws UserNotFondException{
    Long count = repo.countById(id);
    if (count == null || count == 0){
        throw new UserNotFondException("Cannot find any user with ID " + id);
    }
    repo.deleteById(id);
    }
}
