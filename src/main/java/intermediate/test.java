package intermediate;

public class test {

    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            for(int j=5-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
