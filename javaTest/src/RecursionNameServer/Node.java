package RecursionNameServer;

import java.util.List;
import java.util.Map;

public class Node {

    private List<Node> listOfNameServers;
    private Map<String, String> mapOfWebsites;
    private String name;

    public Node(List<Node> listOfNameServers, Map<String, String> mapOfWebsites, String name) {
        this.listOfNameServers = listOfNameServers;
        this.mapOfWebsites = mapOfWebsites;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Node> getListOfNameServers() {
        return listOfNameServers;
    }

    public Map<String, String> getMapOfWebsites() {
        return mapOfWebsites;
    }
}
