package src.loginNDsigin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LogIn {
    private ArrayList<User> users;
    private Scanner scanner;

    public LogIn(ArrayList<User> users) {
        this.users = users;
        this.scanner = new Scanner(System.in);
    }

    public void login() {
        System.out.print("Nombre de usuario: ");
        String username = scanner.nextLine();

        System.out.print("Contraseña: ");
        String password = scanner.nextLine();
        password = encryptPassword(password); // Encrypt the entered password

        User user = findUser(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Inicio de sesión exitoso!");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }
    }

    private User findUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    private String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void loadUsers() {
        File folder = new File("."); // replace with the path to the folder where user files are stored
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                try {
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        String[] parts = line.split(" ");
                        String username = parts[0];
                        String password = parts[1];
                        String name = parts[2];
                        String email = parts[3];
                        String phone = parts[4];
                        String lastName = parts[5];
                        User user = new User(username, password, name, email, phone, lastName);
                        users.add(user);
                    }
                    scanner.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Crear una lista de usuarios
        ArrayList<User> users = new ArrayList<>();

        // Crear una instancia de LogIn
        LogIn login = new LogIn(users);

        // Llamar al método login
        login.login();
    }
}