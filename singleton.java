package New_folder.OOPS;


public class singleton {
        int asd;
        private singleton(int asd){
            this.asd = asd;}
        
        public static void main(String[] args) {
            singleton ans = new singleton(1);
            System.out.println(ans.asd);
        }
    }
class ex {
        public static void main(String[] args) {
            singleton ans = new singleton(23); // we cant access singleton constructor becox is private
            System.out.println(ans.asd);
        }
        
}
    


