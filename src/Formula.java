public class Formula {
    int n;

    public Formula(int n) {
        this.n = n;
    }

    public void displayFormula() {
        double s1 = Math.pow (-1 , n);
        double s2 = Math.pow( 2 , n);
        double s3 = s1*1/s2;
        System.out.println(s3);
    }

    public static void main(String[] args) {
        Formula formm=new Formula(2);
        formm.displayFormula();
        formm.n=2;
    }
}
