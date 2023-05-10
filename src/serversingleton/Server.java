
package serversingleton;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    /**
     * @return the instance
     */
    public static Server getInstance() {
        return instance;
    }
    private ServerSocket ServerSocket;
    private int port = 5678;
    private static Server instance;
    private Server(){
        try {
            ServerSocket = new ServerSocket(port);
        } catch (IOException e) {
           e.printStackTrace();
        }
        
    }
}
