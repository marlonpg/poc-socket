import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private static final String HOST = "localhost";
    private static final int PORT = 8080;
    
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(HOST, PORT);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        
        // Thread to receive messages
        new Thread(() -> {
            try {
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Received: " + message);
                }
            } catch (IOException e) {
                System.out.println("Connection closed");
            }
        }).start();
        
        // Send messages
        Scanner scanner = new Scanner(System.in);
        System.out.println("Connected to server. Type messages:");
        while (true) {
            String message = scanner.nextLine();
            out.println(message);
        }
    }
}