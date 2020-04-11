package th.ac.utcc.computer.os.socketsample;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suparerk Manitpornsut
 * @version 1.0.0
 * @since April 10, 2020
 */
public class DateServer {
    public static void main(String [] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(60666);
            System.out.println("Server is ready on port 60666.");
            while(true) {
                Socket client = serverSocket.accept();
                PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                
                Date date = new Date();
                out.println(date.toString());
                
                client.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(DateServer.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}

