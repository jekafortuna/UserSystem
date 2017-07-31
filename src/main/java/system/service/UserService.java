package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDAO;

import java.util.List;

/**
 * Created by Evgeniy on 28.07.2017.
 */

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    /**
     * Call so-called "db"
     * @return user with parameters
     */
    public List getAllUsers(){
        return userDAO.getAllUsers();
    }
}
