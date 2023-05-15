class Demo {
    public static void main(String[] args) {
        System.out.println("demo class main method");
        Sample.main(12);
        Sample.main("hello");
        Sample.main(new int[]{4,5,6,7,8});
        Sample.main(new String[]{"aaa", "bbb","ccc"});
    } }