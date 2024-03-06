package com.Proyecto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> users;
    private static final String USERS_FILE = "users.dat";

    public UserManager() {
        users = new ArrayList<>();
        loadUsers();
    }
    
    public static List<User> leerUsuarios() {
        List<User> users = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(USERS_FILE))) {
            users = (List<User>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de usuarios no encontrado. Se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

    private void loadUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(USERS_FILE))) {
            users = (List<User>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de usuarios no encontrado. Se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveUsers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USERS_FILE))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean registerUser(String username, String password, String companyName, String email) {
        // Verificar si el usuario ya existe
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("El usuario ya existe.");
                return false;
            }
        }

        // Crear un nuevo usuario y guardarlo
        User newUser = new User(username, password, companyName, email);
        users.add(newUser);
        saveUsers();
        System.out.println("Usuario registrado correctamente.");
        return true;
    }

    public boolean loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Inicio de sesión exitoso.");
                return true;
            }
        }
        System.out.println("Usuario o contraseña incorrectos.");
        return false;
    }
}
