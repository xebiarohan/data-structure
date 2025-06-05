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