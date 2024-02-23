public class Q07_PrintThePatternA {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int j=65; j<=(65+i); j++){
                char ch = (char)j;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
