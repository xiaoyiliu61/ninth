package cn.qianfeng.collection.demo;

import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        //  ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();

        Stack stack = new Stack();
        PriorityQueue priorityQueue = new PriorityQueue();

     /*   arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add("4");
        arrayList.add(treeMap);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for (Object e : arrayList) {
            System.out.println(e);
        }
        //迭代器 集合的代言人
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object e = it.next();
        }
        int[] arr = {1, 1, 1, 1};
        for (int e :
                arr) {
            System.out.println(e);
        }
    }*/
      /*  System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());
    }*/

     /* arrayList.add("1");
      arrayList.add(2);
      arrayList.add("3");*/

       /* int[] arr ={1,2,3,4,5,8,11,13};
            for (Employee e : arrayList) {
            String[]arr ={};
            e.saveMoney(arr);
        }*/


        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(new Employee(1));
        arrayList.add(new Employee(2));
        arrayList.add(new Employee(3));
        arrayList.add(new Employee(4));
        arrayList.add(new Employee(5));
        arrayList.add(new Employee(8));
        arrayList.add(new Employee(11));
        arrayList.add(new Employee(13));

        int[] mixArr = {1,3,8,7,5,4,2,6};
        Employee[] employeeArr = {new Employee(1),new Employee(3),new Employee(2)};

        Arrays.sort(mixArr);

        for (int e:mixArr
        ){
            System.out.print(e);
        }
    }
}
