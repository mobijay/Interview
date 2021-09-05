package RecursionNameServer;

import java.util.List;

public class Resolve {
    
    public String resolve(Node node, String webSite) {

        boolean ipFound = false;
        String ip = "";
        if(node.getMapOfWebsites().containsKey(webSite)) {
            ip = node.getMapOfWebsites().get(webSite);
            ipFound = true;
        }

        if(!ipFound) {
            List<Node> listOfNameServers = node.getListOfNameServers();
            for (Node nameServer : listOfNameServers) {
                ip = resolve(nameServer, webSite);
                if (!ip.equalsIgnoreCase("")) {
                    break;
                }
            }
        }
        return ip;
    }
}
