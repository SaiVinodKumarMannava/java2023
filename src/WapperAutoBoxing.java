public class WapperAutoBoxing {
     static public void main(String[] args){
         int i=10;//primitive type
         Integer j=Integer.valueOf(i);// converting primitive to wapper type
         System.out.print(i + " "+j);
     }
}
