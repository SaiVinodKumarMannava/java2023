public class Sta {
  static int x = 11;
  static int y = 22;
        void show() {
            System.out.println(x);
            System.out.println(y); }
        static void display() {
            System.out.println(x);
            System.out.println(y);
        }
        public static void main(String[] args) {
            Sta s = new Sta();
            s.show();
            Sta.display();
        } }

