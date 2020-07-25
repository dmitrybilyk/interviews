package com.learn.interview_questions.collections.map;

//Map:
//        1. HashMap. There is a Entry interface in Map interface. Node from HashMap is an implementor of it.
//        Inside HashMap there is an array of type Node - Node[]. To determine to which node to put the value
//        hashing is used. This means index to where to put Node is calculated based on hash value (hashcode of key is used here)
//        and size of array.
//        If there is a collision (hash and key are different but index is the same) then Entries (Nodes) are persisted as a
//        linked list (every element has link to the next element of the bucket). If hash and key is the same then value is just
//        replaced. The better hashcode and equals are implemented the more evenly elements will be placed to nodes - less
//        collisions > better performance. If collision happens new elements are added to the beginning of the linked list.
//        Default size of Node[] is 16 and increase capacity is 0.75. If capacity is full then size is two times increased and indexes
//        of all elements are recalculated.
//        If we add a lot of elements to HashMap and at once remove them the size of map will not be decreased to initial value.
//        (ArrayList has method 'trimToSize()' for such cases). The only thing we can do is to created new map and send current as
//        a parameter.
//
//        2. Hashtable - obsolete. It's like HasmMap but with sinchronized methods.
//        3. TreeMap (implements SortedMap and Navi..Map) - keeps natural order of keys.
//        4. LinkedHashMap - keeps order (by keys) of insertion (or fetching) of elements
public class Main {
    public static void main(String[] args) {

    }
}
