public class BankAccount {
    private float balance;
    private float rate;


    public BankAccount(float rate){
        this.balance = 0;
        this.rate = rate;
    }

    public BankAccount(float balance, float rate){
        this.balance = balance;
        this.rate = rate;
    }

    public float processYear(){
        float interest = this.balance * this.rate;
        return this.balance = this.balance + interest;
    }

    public float processNYears(int year){
        int i = 0;
        float total = 0;
        while (i < year) {
         total = processYear();
            i = i + 1;
        }
        return total;
    }

    public static void main(String [] args) {

       // BankAccount account = new BankAccount();
       // account.balance=1000;
        //account.rate=.1f;

        BankAccount account1 = new BankAccount(1000, .2f);

        System.out.println(account1.processNYears(2));
        System.out.println(account1.processYear());

    }


}
