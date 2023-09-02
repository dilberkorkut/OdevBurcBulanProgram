import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc = "";


        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ay: ");
        month = input.nextInt();

        System.out.print("Dogdugunuz gun: ");
        day = input.nextInt();

        if((month==12 && day>=22) || ( month==1 && day<=21)) {
            burc = " Oglak ";
        } else if ((month==1 && day>=22) || ( month==2 && day<=19)) {
            burc = " Kova ";

        } else if ((month==2 && day>=20) || ( month==3 && day<=20)) {
            burc = " Balik ";

        } else if ((month==3 && day>=21) || ( month==4 && day<=20)) {
            burc = " Koc ";

        } else if ((month==4 && day>=21) || ( month==5 && day<=20)) {
            burc = " Boga ";

        } else if ((month==5 && day>=22) || ( month==6 && day<=22)) {
            burc = " Ikizler ";

        } else if ((month==6 && day>=23) || ( month==7 && day<=22)) {
            burc = " Yengec ";

        } else if ((month==7 && day>=23) || ( month==8 && day<=22)) {
            burc = " Aslan ";

        } else if ((month==8 && day>=23) || ( month==9 && day<=22)) {
            burc = " Basak ";

        } else if ((month==9 && day>=23) || ( month==10 && day<=22)) {
            burc = " Terazi ";

        } else if ((month==10 && day>=23) || ( month==11 && day<=21)) {
            burc = " Akrep ";

        } else if ((month==11 && day>=22) || ( month==12 && day<=21)) {
            burc = " Yay ";

        } else {
            System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz..");
        }

        System.out.println("Burcunuz: " + burc);
    }
}