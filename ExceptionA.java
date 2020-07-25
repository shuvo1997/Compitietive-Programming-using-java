public abstract class ExceptionA {
    abstract void getExeption();
    public static void main(String[] args) {
        try {
            ExceptionB b = new ExceptionB();
            b.getExeption();
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }
}
class ExceptionB extends ExceptionA{
    @Override
    void getExeption() {
        System.out.println("In Class B");
        ExeptionC c = new ExeptionC();
        c.getExeption();
        int a = 1/0;
    }
}
class ExeptionC extends ExceptionB{
    @Override
    void getExeption() {
        System.out.println("In Class C");
        int a = 1/0;
    }
}