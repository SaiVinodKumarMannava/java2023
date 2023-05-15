public class FirstConstructor {
    int eno;
    String ename;

    public FirstConstructor(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }


    public void dis()
    {
        System.out.println(eno+" - "+ename);
    }
}
