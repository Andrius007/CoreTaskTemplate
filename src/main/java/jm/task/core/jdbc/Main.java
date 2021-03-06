package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable(); //Создание таблицы User(ов)
        userService.saveUser("Олег", "Соловец", (byte) 35); //Добавление 4 User(ов) в таблицу с данными на свой выбор.
        userService.saveUser("Анатолий", "Дукалис", (byte) 30);//После каждого добавления должен быть вывод в консоль
        userService.saveUser("Андрей", "Ларин", (byte) 31); //( User с именем – name добавлен в базу данных )
        userService.saveUser("Константин", "Хабенский", (byte) 29);
        List<User> userList = userService.getAllUsers(); // Получение всех User из базы и вывод в консоль
        userList.forEach(System.out::println); // ( должен быть переопределен toString в классе User)
        userService.cleanUsersTable(); //Очистка таблицы User(ов)
        userService.dropUsersTable(); // Удаление таблицы
    }
}
