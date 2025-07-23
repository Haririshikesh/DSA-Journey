// File: LeetCodeSolutions/src/arrays_and_hashing/design_hashmap/MyHashMap.java
package src.arrays_and_hashing.design_hashmap;
// Helper class for the linked list nodes within each bucket (if using separate chaining)
class EntryNode {
    int key;
    int value;
    EntryNode next;

    EntryNode(int key, int value) {
        this.key = key;
        this.value = value;
    }

    EntryNode(int key, int value, EntryNode next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}

class MyHashMap {
    int size = 1000;
    EntryNode[] buckets;
    public MyHashMap() {
        buckets = new EntryNode[size];
            for (int i = 0; i < size; i++) {
            buckets[i] = new EntryNode(-1,-1);
        }
    }

    public void put(int key, int value) {
        EntryNode curr = buckets[hash(key)];
        while(curr.next!=null){
            if(curr.next.key == key){
                curr.next.value = value;
                return;
            }
            curr = curr.next;
        }   
        curr.next = new EntryNode(key, value);             
    }

    public int hash(int key) {
        return key % size;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
     */
    public int get(int key) {
        EntryNode curr = buckets[hash(key)];
        while(curr.next!=null){
            if(curr.next.key == key){
                return curr.next.value;
            }
            curr = curr.next;
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key.
     */
    public void remove(int key) {
        EntryNode curr = buckets[hash(key)];
        while(curr.next!=null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}
