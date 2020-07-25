public class Bank {
    int getBalance(){
        return 0;
    }
}
class BankA extends Bank{
    @Override
    int getBalance() {
        return 3000;
    }
}
class BankB extends Bank{
    @Override
    int getBalance() {
        return 3500;
    }
}
class BankC extends Bank{
    @Override
    int getBalance() {
        return 4000;
    }

    public static void main(String[] args) {
        Bank a = new BankA();
        Bank b = new BankB();
        Bank c = new BankC();
        System.out.println(a.getBalance());
        System.out.println(b.getBalance());
        System.out.println(c.getBalance());
    }
}