import java.util.Arrays;
public class ArrayListImplementationEx {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.add(60);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.contains(80));
        System.out.println(list.isEmpty());
        list.set(0,100);
        System.out.println(list);
        System.out.println(list.remove(5));
        System.out.println(list);
    }
}
class  myArrayList {
    int count;
    int arr[];
    int size;
    myArrayList(int size) {
        this.size = size;
        arr = new int[size];
    }
    myArrayList() {
        arr = new int[10];
    }

    void add(int val) {
        if(count==size) {
            int arr1[] = new int[size+(size/2)];
            for(int i=0; i<arr.length;i++)
                arr1[i] = arr[i];
            arr = arr1;
            size = arr1.length;
        }
        arr[count++] = val;
    }

    @Override
    public String toString() {
        return "myArrayList{" +
                "count=" + count +
                ", arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    int get(int ind) {
        if(ind>arr.length-1)
            throw new IndexOutOfBoundsException();
        return arr[ind];
    }

    boolean contains(int val) {
        for(int i=0;i<size;i++) {
            if(arr[i]==val)
                return true;
        }
        return  false;
    }

    boolean isEmpty() {
        if(count==0)
            return true;
        return false;
    }

    void set(int ind, int val) {
        if(ind>arr.length-1)
            throw new IndexOutOfBoundsException();
        arr[ind] = val;
    }
    int remove(int ind) {
        int temp1 =arr[ind];
        arr[ind] = 0;
        for(int i=0;i<count;i++) {
            if(arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        count -= 1;
        return temp1;
    }

}
