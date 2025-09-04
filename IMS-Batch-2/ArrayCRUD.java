class B {
    public void hello() {
        Integer a = 10;

        System.out.println(a.toString());
    }
}

class Array extends B {
    int arr[];
    int size = 0;

    public Array(int capacity) {

        arr = new int[capacity];
    }

    public void insert(int ele) {
        if (size == arr.length) {
            System.out.println("Cannot insert Element");
            return;
        }
        arr[size++] = ele;
    }

    public int delete(int index) {
        if (index > size) {
            System.out.println("Cannot Delete Element");
            return -1;
        }
        int ele = arr[index];

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return ele;
    }

    public int get(int index) {
        if (index > size) {
            System.out.println("Cannot get Element");
            return -1;
        }

        return arr[index];
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void reverse() {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}

public class ArrayCRUD {

    public static void main(String[] args) {
        Array a = new Array(5);
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.printArray();
        a.reverse();
        a.printArray();
        // System.out.println();
        // System.out.println(a.size);
        // a.delete(2);
        // a.printArray();
        // System.out.println();
        // System.out.println(a.size);
        // System.out.println(a.get(3));

    }

}
