package hashtables;

public class HashTableExecutor {
    public static void main(String[] args) {
        CustomHashTable hashTable = new CustomHashTable();

        hashTable.set("nails",80);
        hashTable.set("tile",50);
        hashTable.set("lumber",100);

        hashTable.printTable();
        System.out.println(hashTable.keys());
    }
}
