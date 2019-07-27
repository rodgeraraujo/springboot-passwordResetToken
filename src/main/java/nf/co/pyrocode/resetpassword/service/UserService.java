package nf.co.pyrocode.resetpassword.service;

import nf.co.pyrocode.resetpassword.model.User;
import nf.co.pyrocode.resetpassword.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);

    void updatePassword(String password, Long userId);
}
