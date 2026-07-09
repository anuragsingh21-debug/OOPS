package Encapsulation;

public class calling{

    public static void main(String[] args) {
        getter_setter obj = new getter_setter(12, "Anurag");
        // System.out.println(obj.nums);
        obj.set(34);//setter
        System.out.println(obj.get());//getter
        
    }
}
