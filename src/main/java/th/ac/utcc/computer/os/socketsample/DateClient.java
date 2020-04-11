package th.ac.utcc.computer.os.socketsample;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suparerk Manitpornsut
 * @version 1.0.0
 * @since April 10, 2020
 */
public class DateClient {
    public static void main(String [] args) {
        try {
            Socket socket = new Socket("localhost", 60666);
            Scanner input = new Scanner(socket.getInputStream());
            String date = input.nextLine();
            System.out.println("Date from Server: " + date);
        } catch (IOException ex) {
            Logger.getLogger(DateClient.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
}

