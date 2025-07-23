// File: LeetCodeMyHashSets/src/arrays_and_hashing/design_hashset/MyHashSet.java
package src.arrays_and_hashing.design_hashset;

// Helper class for the linked list nodes within each bucket
class ListNode {
    int key;
    ListNode next;
    ListNode(int key){this.key=key;}
    ListNode(int key, ListNode next){this.key=key; this.next = next;}
}
class MyHashSet {
    int size = 1000;
    ListNode[] buckets;
    public MyHashSet() {
        buckets = new ListNode[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new ListNode(-1);
        }
    }

    public int hash(int key) {
        return key % size;
    }
    
    public void add(int key) {
        ListNode curr = buckets[hash(key)];
        while(curr.next!=null){
            if(curr.next.key == key) return;

            curr = curr.next;
        }
        curr.next = new ListNode(key);
    }
    
    public void remove(int key) {
        ListNode curr = buckets[hash(key)];
        while(curr.next!=null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        } 
    }
    
    public boolean contains(int key) {
        ListNode curr = buckets[hash(key)];
        while(curr.next!=null){
            if(curr.next.key == key) return true;
            curr = curr.next;
        }
        return false;
    }
}
