package by.kirikovich;

import by.kirikovich.models.Auto;
import by.kirikovich.models.User;
import by.kirikovich.services.UserService;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        User userPetia = new User("Petia", 26);
        userService.saveUser(userPetia);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(userPetia);
        userPetia.addAuto(ferrari);

        Auto ford = new Auto("Ford", "black");
        ferrari.setUser(userPetia);
        userPetia.addAuto(ford);
        userService.updateUser(userPetia);

    }
}
