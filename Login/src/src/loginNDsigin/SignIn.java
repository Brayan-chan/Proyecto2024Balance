package src.loginNDsigin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SignIn {
    private ArrayList<User> users;
    private Scanner scanner;

    public SignIn() {
        users = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void createUser() {
        System.out.println("Ingrese los detalles del usuario:");

        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Apellido: ");
        String lastName = scanner.nextLine();

        System.out.print("Correo electrónico: ");
        String email = scanner.nextLine();
        // Add email validation here

        System.out.print("Teléfono: ");
        String phone = scanner.nextLine();

        System.out.print("Nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Contraseña: ");
        String password = scanner.nextLine();
        // Encrypt the password before storing
        password = encryptPassword(password);

        User user = new User(username, password, name, email, phone, lastName);
        users.add(user);

        createUserFile(user);
    }

    public void createUserFile(User user) {
        try  {
            File file = new File(user.getUsername() + ".txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
                writeUsersToFile(user, user.getUsername());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public void writeUsersToFile(User user, String fileName) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName + ".txt", true);
            writer.write(user.getUsername() + " " + user.getPassword() + " " + user.getName() + " " + user.getEmail() + " " + user.getPhone() + " " + user.getLastName() + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
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

    public static void main(String[] args) {
        SignIn signIn = new SignIn();
        signIn.createUser();
    }
}