public class DiamondPattern {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            //Print trailing spaces
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            //Print hollow pyramid
            for(int j=1;j<=(2*i-1);j++){
                if(j==1||j==(2*i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=5-1;i>=1;i--){
            //Print trailing spaces
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            //Print hollow pyramid
            for(int j=1;j<=(2*i-1);j++){
                if(j==1||j==(2*i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
