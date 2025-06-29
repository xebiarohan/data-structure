## COMPLEXITY-CALCULATION

1. Big O
    - Used to measure the complexity of any code
    - How good or bad it is
    - Measured in space-time complexity
  
2. 3 letters used in time-space complexity
    - Omega - Used for the best case
    - Theta - Used for the average case
    - Omecron or also known as Big O - used for the worst case
    - Example if we have to traverse a list of some items and find a value, 
      - best case is value at 1st place
      - Average case is value is in middle
      - Worst case is value is at last place

3. O(n)
    - we have to do operations equal to the number of items (n)
    - Drop constants: if for each item we are running it 2 times then total operations become 2n but complexity remains O(n)
    - it reamins O(n) as the complexity is not increasing with inccrease in the value on n

4. O(n^2)
    - Loop inside a loop

5. Drop non dominant
    - if complexity is O(n^2 + n)then it is equivalent to O(n^2)

6. O(1) means only 1 operation irrespective of the value of item like a method that add 2 to the value of n

7. O(log n)
   - when with every step the items remains half like in binary search
   - Used in divide and conquer algorithm

8. O(nlog n)
   - rarely used like in some sorting algorithm like merge sort and quick sort

9. Big O: Different terms for inputs
    - Here the complexity is not O(n), here the complexity is O(a + b)

```
    public void print(int a, int b) {
        for(int i=0;i<a;i++) {
            System.out.println(i);
        }

        for(int i=0;i<b;i++) {
            System.out.println(i);
        }

    }

```

10. Big O of Array List
    -  If we do operation(add or remove) at the end of the list : O(1)
    -  If we do operation(add or remove) at the starting of the list: O(n)
    -  If we do operation in the middle of the list: O(1/2 * n)  as we drops the constants it becomes O(n)
    -  Looking for an item by value: O(n)
    -  Looking for an item by index: O(1)

11. logN calculations
    -  what power of 2 is equal to n
    -  like if N is 100 then log100 is around 7 as 2^7 is 128

##  LINKED-LIST

1. Linked lists are dynamic in length where as the for array list we have to provide an initial value (default is 10)
   
2. Items of linkedlist can be anywhere in the memory, items of lists are present next to each other 

3. Big O
    - Adding item at the end of the list : O(1)
    - Removing item at the end of the list: O(n)
    - Adding/Removing item at the beginning of the list: O(1)
    - Adding/Removing item from the middle: O(n)
    - Searching for a value: O(n)

4. Adding/Removing an item from beginning is bettern in linked list, where as removing last and looking by an index is better in arrays

## BINARY-TREE

1. Binary tree
    - Each node can point to max of 2 nodes
    - A tree is a full tree if each node is either pointing to 2 nodes or 0 nodes
    - Every node can have max of 1 parent
    - A parent can have max of 2 child
    - A node that does not have a child is called as a leaf

2. Binary search tree 
    - It is little different from binary tree
    - Right child of the parent is greater than the parent
    - Left child of the parent is smaller than the parent
    - Complexity is O(logN) for searching, removing, inserting
    - Worst case is O(N) if all the nodes are in the same line and we want to search as it becomes a linked list
    - Insert is better in linked list O(1) as we know the value of tail
    - lookup and remove is better in binary search tree

##  HASH-TABLE

1. Introduction
    - Hash tables are used to store the key value pair
    - Hash function is applied on the key to get an index value of the array where the key-value is stored
    - Hash function is idempotant
    - Chaining and linear probing are 2 ways of dealing with collisions.
    - Linear probing means finding the next empty address
    - Chaining is implemented using the linked list

2. Big O
    - If there is no collision (best scenario): O(1)
    - Worst case (all elements on 1 index): O(n)

## Graphs

1. Introduction
   - Here we use the word Vertex instead of Node
   - Multiple vertex is called Vertices
   - Link between the verticles is called edges
   - Edges can be directional (in one direction) or Bi-directional (both side)
   - Edges can be weighted or non weighted
   - Tree is a form of graph so is linked list
   - We can represent Graphs using the adjacency matrix or adjacency list(map with key as the verted and list of connection as value)
   - Complexity of adjacency list is better than adjacency matrix
   - As in adjacency matrix we have to store all the 0's along wtih 1's where the connection is present
   - Adding a new vertex is also very expensive in adjacency matrix as compare to list

## Heaps

1. Introduction
    - Looks more like a Binary tree
    - A parent with higher or equal value to its children (known as Max Heap)
    - A parent with smaller or equal value to its children (known as Min Heap)
    - It is always a complete tree, means if fills from left to right without any gaps.
    - we can have duplicate values
    - We can implement it using the ArrayList, with value start adding from top, then left child and then right child
    - Left child will be 2*parent + 1 index
    - Right child will be 2*parent index + 2
    - Parent can be (children_index-1)/2
    - We can only remove the parent node, after removal we have to put the right most leave at the parent node position and bubble it down
    - Heaps are used for implementing Priority queues
    - Complexity of insertion or removal is O(logN)

## Recursion

1. Introduction
   - A method calls inself until a condition satisfies.

## Tree traversal

1. Breadth first search
   - we starts from root node, then traverse its children, then children's children.

2. Depth first search
   - first we traverse the left most leaf, then its parent,then its other child then goes up and so on.
   - There are 3 types of depth-first-search
     - Pre-order  -> parent-left-right
     - Post-order -> left-right-parent
     - In-order -> left-parent-right