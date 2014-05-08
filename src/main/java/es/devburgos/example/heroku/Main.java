package es.devburgos.example.heroku;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * This class launches the web application in an embedded Jetty container.
 */
public class Main {

    public static final String WEB_APP_DIR_LOCATION = "src/main/webapp/";
    
    public static void main(String[] args) throws Exception{
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        WebAppContext root = new WebAppContext();

        root.setContextPath("/");
        root.setDescriptor(WEB_APP_DIR_LOCATION +"/WEB-INF/web.xml");
        root.setResourceBase(WEB_APP_DIR_LOCATION);
        
        root.setParentLoaderPriority(true);
        
        server.setHandler(root);
        
        server.start();
        server.join();   
    }

}
