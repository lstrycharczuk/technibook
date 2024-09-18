package org.technischools.technibook.users;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser(String id) {
        if("ca3bd1ba-4973-4de4-9525-6fa76672c0ce".equals(id)) {
            return new User("ca3bd1ba-4973-4de4-9525-6fa76672c0ce", "Laura", "haslo");
        }
        else {
            throw new RuntimeException();
        }
    }
}
