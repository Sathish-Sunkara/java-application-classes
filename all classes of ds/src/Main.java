import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        //arraylist creation
        ArrayList<Integer> nums=new ArrayList<>();

        //adding elements to list
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(0,5);//add at specified index

        //removing elements
        nums.remove(0);

        //getting element
        int a=nums.get(0);  //at specified index
        System.out.println("at index 0 : "+a);

        //addding
        nums.add(900);
        nums.add(400);
        nums.add(50);
        System.out.println("before sort : " + nums);

        //sorting
        Collections.sort(nums);
        System.out.println("after sort : " + nums);//sort() manipulates nums itself

        // replace by another element set()
        nums.set(0,100);
        System.out.println(nums); //sets 50 to 100

        //clear
        nums.clear(); //clears entire list then print empty
        System.out.println(nums);

        Stack<Integer> st = new Stack<>() ;
        int[] arr = {1,4,6,2,3,5,9,7,8,10 } ;
        System.out.println(arr) ;
        for(int i : arr)
        {
            System.out.println(i) ;
        }

        //list
        List<Integer> li1 = new ArrayList<>() ;
        for(int i : arr)
        {
            li1.add(i) ;
        }
        System.out.println(li1) ;

        // arraylist
        ArrayList<Integer> li2 = new ArrayList<>();
        for(int i : arr)
        {
            li2.add(i) ;
        }
        System.out.println(li2) ;
        System.out.println(li1 == li2) ;
        System.out.println(li2.equals(li1)) ;

        // priority queue
        PriorityQueue<Integer> que = new PriorityQueue<>() ;
        for(int i : arr)
        {
            que.add(i) ;
        }
        System.out.println(que) ;  //sorted

        //normal queue
        Queue<Integer> que1 = new PriorityQueue<>() ;
        for(int i : arr)
        {
            que1.add(i) ;
        }
        System.out.println(que1) ;

        // for hashmap
        HashMap<Integer , Integer> hashmap = new HashMap<>() ;
        for(int i = 0 ;i < arr.length ; i++)
        {
            hashmap.put(i,arr[i]) ;
        }
        System.out.println(hashmap);
        System.out.println(hashmap.remove(9,10));

        // hast table
        Hashtable<Integer , Integer> hashtable = new Hashtable<>() ;
        for(int j = 0 ;j < arr.length ; j++)
        {
            hashtable.put(j,arr[j]) ;
        }
        System.out.println(hashtable);
        System.out.println(hashtable.containsKey(9));

        // for hashset
        HashSet<Integer> hashset = new HashSet<>() ;
        for(int j = 0 ;j < arr.length ; j++)
        {
            hashset.add(arr[j]) ;
        }
        System.out.println(hashset);
        System.out.println(hashset.toArray()[1]);













    }
}