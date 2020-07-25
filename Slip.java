import java.util.Random;

public class Slip {
    int salesPerson;
    int productNumber;
    int totalSold;
    Slip(int salesPerson, int productNumber, int totalSold) {
        this.salesPerson = salesPerson;
        this.productNumber = productNumber;
        this.totalSold = totalSold;
    }

    public static void main(String[] args) {
        Random r = new Random();
        Slip[] slip = new Slip[600];
        int[][] sales = new int[5][4];
        for(int i=0; i<slip.length; i++){
            slip[i] = new Slip(r.nextInt(4)+1,r.nextInt(5)+1,Math.abs(r.nextInt(1000)+1));
          //  System.out.println(slip[i].salesPerson+" "+slip[i].productNumber+" "+slip[i].totalSold);
            sales[slip[i].productNumber-1][slip[i].salesPerson-1] += slip[i].totalSold;
        }
        System.out.println("Sales:Product by SalesMan");
        for (int i = 0; i < 5; i++) {
            for (int j=0; j<4; j++){
                System.out.print(sales[i][j]+" ");
            }
            System.out.println();
        }

        int[] productTotals = new int[5];
        int[] salesTotals = new int[4];

        System.out.println("Cross Totals of salesmans:");
        for(int i=0; i<salesTotals.length; i++){
            for (int j = 0; j < 4; j++) {
                salesTotals[i] += sales[i][j];

            }
            System.out.print("Salesman"+(i+1)+"="+salesTotals[i]+" ");
        }
        System.out.println();
        System.out.println("Cross Totals of products:");
        for(int i=0; i<productTotals.length; i++){
            for (int j = 0; j < 4; j++) {
                productTotals[i] += sales[i][j];

            }
            System.out.print("Product"+(i+1)+"="+productTotals[i]+" ");
        }
        System.out.println();
    }
}
