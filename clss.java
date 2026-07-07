package New_folder.OOPS;

// public class abc {
//     class stat{ // this class is dependent on outer class   if we put static then it will run
//         int n;
//         stat(int n){
//             this.n = n;
//         }
//     }
//     public static void main(String[] args) {
//         stat ans = new stat(2); // call from non static class
//         System.out.println(ans.n);

//         abc2 a = new abc2(2);
//         System.out.println(a.n); // call from independent class
//     }
// }




class abc2{  // this is not a nested class that why its not depend on any class, its not an instnce of any class 
    static String name;
    public abc2(String name){
        abc2.name = name;
    }

}
public class clss {
    class abc{  // if we dont add static then we cant use this in psvm becoz then this class(abc) will depend on clss, abc is basically an instance of  clss
        String name;

        abc(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        abc anurag = new abc("Aurag");
        System.out.println(anurag.name);
        
        abc2 ans = new abc2("Anurag Singh");
        System.out.println(ans.name);
    }
}