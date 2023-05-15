package chase.com;
public class Table {
    public static void main(String[] args) {
        int n = 10;
        int i,table = 0;
        for (i = 1; i <= n; i++) {
            //System.out.println(i);
            for (int j = 1; j <= i; j++) {
                 table =2*j;
                //System.out.println(table);
            }
            System.out.println(table);
        }
    }
}
