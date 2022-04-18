package cn.studybigdata.java.constructor;

public class Person {

    private String name;
    private String sex;

    public Person(){

    }

    public Person(String n) {
        this.name = n;
    }

    public Person(String n, String s){
        this.name = n;
        this.sex = s;
    }

    public void speciality(String spec){
        System.out.println("我的特长："+ spec);
    }



    public static void main(String[] args) {
        Person nobody = new Person();
        Person hh = new Person("hanhong");
        Person ym = new Person("yaoming", "male");

        System.out.println();

    }
}
