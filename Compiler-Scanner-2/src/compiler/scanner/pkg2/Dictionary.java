/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

/**
 *
 * @author Dell
 */
public class Dictionary<K, V> {
    private Node<K, V> [] table;
    private static final int INITIAL_CAPACITY = 100;
    private int size;
    private LinkedList<K> keys;
    public Dictionary(){
        this.table = new Node[INITIAL_CAPACITY];
        this.size = 0;
        keys = new LinkedList();
    }
    
    public Dictionary(int capacity){
        this.table = new Node[capacity];
        this.size = 0;
        keys = new LinkedList();
    }
    
    public void add(K key, V value){
        keys.insert(key);
        checkCapacity();
        Node<K, V> newNode = new Node(key, value, null);
        int index = key.hashCode() % table.length;
        Node<K, V> existingNode = table[index];
        if(existingNode == null){
            table[index] = newNode;
            size++;
        }else{
            while(existingNode.nextNode != null){
                if(existingNode.key.equals(key)){
                    existingNode.value = value;
                    return;
                }
                existingNode = existingNode.nextNode;
            }
            if(existingNode.key.equals(key)){
                existingNode.value = value;
            }else{
                existingNode.nextNode = newNode;
                size++;
            }
        }
        
    }
    
    public V get(K key){
        Node<K, V> node = table[key.hashCode() % table.length];
        while(node != null){
            if(node.key.equals(key)){
                return node.value;
            }
            node = node.nextNode;
        }
        return null;
    }
    
    public void remove(K key){
        Node<K, V> node = table[key.hashCode() % table.length];
        if(node != null){
            table[key.hashCode() % table.length] = null;
            keys.remove(key);
            size--;
        }
    }
    
    private void checkCapacity(){
        if(size == table.length){
            int newCapacity = table.length * 2;
            Node<K, V>[] tempTable = new Node[newCapacity];
            for(int i = 0; i < table.length; i++){
                tempTable[i] = table[i];
            }
            table = tempTable;
        }
    }
    
    public LinkedList<K> getKeys(){
        return keys;
    }
    
    private class Node<K, V>{
        private final K key;
        private V value;
        private Node<K, V> nextNode;
        private Node(K key, V value, Node<K, V> nextNode){
            this.key = key;
            this.value = value;
            this.nextNode = nextNode;
        }
    }
    public int getSize(){
    return size;
    }
}
