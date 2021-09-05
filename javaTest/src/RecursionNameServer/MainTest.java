package RecursionNameServer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {

    public static void main(String[] args) {

        Map<String, String> mapOfWebsites5 = new HashMap<>();
        List<Node> listOfNameServers5 = new ArrayList<>();
        Node node5 = new Node(listOfNameServers5, mapOfWebsites5, "Node 5");

        Map<String, String> mapOfWebsites4 = new HashMap<>();
        mapOfWebsites4.put("google.com", "1.1.1.1");
        List<Node> listOfNameServers4 = new ArrayList<>();
        listOfNameServers4.add(node5);
        Node node4 = new Node(listOfNameServers4, mapOfWebsites4, "Node 4");

        List<Node> listOfNameServers3 = new ArrayList<>();
        listOfNameServers3.add(node4);
        Map<String, String> mapOfWebsites3 = new HashMap<>();
        Node node3 = new Node(listOfNameServers3, mapOfWebsites3, "Node 3");

        List<Node> listOfNameServers2 = new ArrayList<>();
        Map<String, String> mapOfWebSites2 = new HashMap<>();
        Node node2 = new Node(listOfNameServers2, mapOfWebSites2, "Node 2");

        List<Node> listOfNameServers1 = new ArrayList<>();
        listOfNameServers1.add(node2);
        listOfNameServers1.add(node3);
        Map<String, String> mapOfWebsites1 =new HashMap<>();
        Node node1 = new Node(listOfNameServers1, mapOfWebsites1, "Node 1");

        List<Node> listOfNameServersClient = new ArrayList<>();
        listOfNameServersClient.add(node1);
        Map<String, String> mapOfWebsitesClient = new HashMap<>();
        Node client = new Node(listOfNameServersClient, mapOfWebsitesClient, "Client Node");

        Resolve resolve = new Resolve();
        System.out.println(resolve.resolve(client, "google.com"));

    }
}
