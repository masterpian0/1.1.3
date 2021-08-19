package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        final UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Max","First", (byte) 40);
        userService.saveUser("Daniel","Second", (byte) 25);
        userService.saveUser("Alex","Third", (byte) 18);
        userService.saveUser("Shimon","Fourth", (byte) 4);

        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
