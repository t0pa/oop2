package org.example.week10;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class MessagingSystem {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface UserPermission {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface RequiresPermission {
        String value();
    }

    public static abstract class User {
        protected String username;

        public User(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }
    }

    @UserPermission("Regular")
    public static class RegularUser extends User {
        public RegularUser(String username) {
            super(username);
        }
    }

    @UserPermission("Admin")
    public static class AdminUser extends User {
        public AdminUser(String username) {
            super(username);
        }
    }

    public static class MessageService {
        @RequiresPermission("Admin")
        public void sendMessage(User user) {
            String permission = user.getClass().getAnnotation(UserPermission.class).value();
            if ("Admin".equals(permission)) {
                System.out.println(user.getUsername() + " sent a message.");
            } else {
                System.out.println(user.getUsername() + " is restricted.");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        User admin = new AdminUser("AdminUser1");
        User regular = new RegularUser("RegularUser1");
        MessageService service = new MessageService();

        service.sendMessage(admin);
        service.sendMessage(regular);
    }
}
