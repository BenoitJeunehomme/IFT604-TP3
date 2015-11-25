package Services;

import Server.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Michaël on 11/25/2015.
 */
public class ServerService {
    private static final Logger logger = LoggerFactory.getLogger(ServerService.class);

    private static ServerService instance;

    private Server server;

    private ServerService(Server server){
        this.server = server;
    }

    public static ServerService getInstance(){
        return instance;
    }

    public static void initialize(Server server){
        instance = new ServerService(server);
    }

    public void start(){
        logger.info("Starting server");
        server.start();
    }

    public void stop(){
        logger.info("Stopping server");
        server.stop();
    }


}
