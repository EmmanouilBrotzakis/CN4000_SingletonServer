
package serversingleton;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    
  
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
      public static Server getInstance() {
          if(instance == null)
              instance = new Server();
        return instance;
    }
      
      public void start(){
          System.out.println("Server Started. ");
          while(true){
        try {
            Socket clientSocket = ServerSocket.accept();
        } catch (IOException e) {
           e.printStackTrace();
        }
      }
      }
       public static void main(String[] args) {
       
    }
}
