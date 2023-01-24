package OOPS;

public class Oops1 {
    public static void main(String[] args) {
        BankAccount myACC = new BankAccount();
        myACC.Username = "Rakesh1121";
        myACC.setPassword("Rakesh1121");

        System.out.println("This is the username of your bank account: "+myACC.Username);
        //System.out.println(myACC.password);

        Pen p1 = new Pen();
        p1.setColor("white");
        System.out.println("the color of the pen is: "+ p1.color);

        p1.setTip(5);
        System.out.println("the tip of the pen is: " + p1.tip);

    }
}

class pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}

class BankAccount{
    public String Username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}
/*
 * Get: to return the value:getters
 * Set: to modify the value:setters 
 * 
 * this: this keyword is used to refer to the current object.
 */