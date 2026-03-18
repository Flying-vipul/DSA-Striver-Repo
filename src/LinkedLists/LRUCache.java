package LinkedLists;

import java.util.HashMap;

public  class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> map;

    // Dummy head and tail to avoid annoying NullPointerExceptions at the edges
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);

        // Connect the dummy head and tail
        head.next = tail;
        tail.prev = head;
    }

    public void addNode(Node node){
        Node temp = head.next;
        head.next=node;
        node.prev=head;
        temp.prev=node;
        node.next=temp;
    }



    public int get(int key){

        if (map.containsKey(key)) {

            Node resNode = map.get(key);
            int ans = resNode.value;

            removeNode(resNode);
            addNode(resNode);
            return ans;
        }
        return -1;
    }

    public void removeNode(Node node){
        Node preNode = node.prev;
        Node nextNode = node.next;
        preNode.next=nextNode;
        nextNode.prev=preNode;
    }

    public void put(int key, int value){

        if (map.containsKey(key)){
            Node resNode = map.get(key);
            resNode.value=value;
        }
        if (map.size() == capacity){
            Node resNode = tail.prev;
            removeNode(resNode);

        }
        Node newNode = new Node(key,value);
        addNode(newNode);
        map.put(key,head.next);
    }

}
