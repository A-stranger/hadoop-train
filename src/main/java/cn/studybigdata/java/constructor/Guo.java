package cn.studybigdata.java.constructor;

public class Guo {

    private String material; //材料
    private String handle; // 手柄

    public void makeFood(String spec){
        System.out.println("我的特长："+ spec);
    }


    public Guo(){ }

    public Guo(String n) {
        this.material = n;
    }

    public Guo(String n, String s){
        this.material = n;
        this.handle = s;
    }


    public static void main(String[] args) {

        Guo 锅 = new Guo();
        Guo 铁锅 = new Guo("铁水");
        Guo 铝锅 = new Guo("铝水","木柄");

        铝锅.makeFood("炒辣子鸡");


        System.out.println();
    }
}
