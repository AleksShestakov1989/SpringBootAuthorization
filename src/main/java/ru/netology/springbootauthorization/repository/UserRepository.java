package ru.netology.springbootauthorization.repository;


import org.springframework.stereotype.Repository;
import ru.netology.springbootauthorization.authorities.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();

        if (user.equals("senior") && password.equals("111")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("middle") && password.equals("222")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("junior") && password.equals("333")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}
