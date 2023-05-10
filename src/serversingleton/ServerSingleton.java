
package serversingleton;

public class ServerSingleton {

   
    public static void main(String[] args) {
       Server server = Server.getInstance();
       server.start();
    }
    
}
