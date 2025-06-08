package hashtables;

import java.util.ArrayList;
import java.util.List;

public class CustomHashTable {
    private int size = 7;
    private Node[] dataMap;

    class Node {
        public String key;
        public Integer value;
        public Node next;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

    public CustomHashTable() {
        dataMap = new Node[size];
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i=0;i<keyChars.length;i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, Integer value) {
        int index = hash(key);
        Node node = new Node(key, value);
        if(dataMap[index] == null) {
            dataMap[index] = node;
        } else {
            Node nodeChain = dataMap[index];
            while (nodeChain.next != null) {
                nodeChain = nodeChain.next;
            }
            nodeChain.next = node;
        }
    }

    public Integer get(String key) {
        int index = hash(key);
        Node node = dataMap[index];
        while(node != null && !node.key.equals(key)) {
            node = node.next;
        }
        return node != null ? node.value : 0;
    }

    public List<String> keys() {
        List<String> keys = new ArrayList<>();
        for(int i=0;i<size;i++) {
            Node node = dataMap[i];
            while (node != null) {
                keys.add(node.key);
                node = node.next;
            }
        }
        return keys;
    }

    public void printTable() {
        for(int i=0;i<dataMap.length;i++) {
            Node currentNode = dataMap[i];
            System.out.println(i+ ": ");
            while (currentNode != null) {
                System.out.println("{" +currentNode.key + ": " + currentNode.value+ "}");
                currentNode = currentNode.next;
            }
        }
    }


}
