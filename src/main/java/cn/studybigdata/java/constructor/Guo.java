package cn.studybigdata.java.constructor;

public class Guo {

    private String body; //材料
    private String handle; // 手柄

    public Guo(){ }

    public Guo(String n) {
        this.body = n;
    }

    public Guo(String n, String s){
        this.body = n;
        this.handle = s;
    }

    public void makeFood(String spec){
        System.out.println("我的特长："+ spec);
    }


    public void setHandle(String handle){
        this.handle = handle;
    }
    public void setBody(String body){
        this.body = body;
    }

    public String getBody(){
        return this.body;
    }

    public String getHandle(){
        return this.handle;
    }


    public static void main(String[] args) {
        Guo 锅 = new Guo();
        Guo 铁锅 = new Guo("铁","木");
        铁锅.makeFood("炒辣子鸡");

        Guo 铝锅 = new Guo("铝");
        铝锅.setHandle("塑料");
        铝锅.makeFood("烧汤");


        String 我的材料是 = 铝锅.getBody();

        System.out.println(我的材料是);

    }
}
