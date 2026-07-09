package Encapsulation;

public class getter_setter {
    private int nums;
    String name;

    public int get(){ // getter method (we basically make a public method so we can use nums in diff class becos nums is private)
        return nums;
    }

    public void set(int nums){//setter (we can set the value in the main function that's why we take parameters)
        this.nums = nums;
    }

    getter_setter(int nums,String name){
        this.name = name;
        this.nums = nums;
    }
}
