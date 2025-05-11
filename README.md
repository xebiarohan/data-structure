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
    - Means we have to do operations equal to the number of items (n)
    - Drop constants: means if for each item we are running it 2 times then total operations become 2n but complexity remains O(n)

4. O(n^2)
    - One for loop inside another for loop

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