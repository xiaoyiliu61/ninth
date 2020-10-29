package cn.qianfeng.collection.demo;

public class Employee<T> implements Comparable<Employee>{
    private int id;
    private int age;
    public Employee(){

    }

    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T[] saveMoney(T[] arr){
        return arr;
    }
    @Override
    public int compareTo(Employee employee) {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
