package practice1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MFC mfc = new MFC();
        Random random = new Random();

        int totalYoung = 0;
        int totalElderly = 0;
        int totalBusinessmen = 0;

        for (int i = 0; i < 100; i++) {
            int category = random.nextInt(1,4);
            System.out.println(category);
            Citizen citizen = new Citizen(mfc, category);
            citizen.start();

            if (category == 1) {
                totalYoung++;
            } else if (category == 2) {
                totalElderly++;
            } else if (category == 3) {
                totalBusinessmen++;
            }
        }
        double resultYoung = (double) Citizen.youngAngryCount / totalYoung * 100;
        double resultElderly = (double) Citizen.elderlyAngryCount / totalElderly * 100;
        double resultBusinessmen = (double) Citizen.businessmenAngryCount / totalElderly * 100;;
        System.out.println("Percentage of Young citizens left in anger: " + resultYoung + "%");
        System.out.println("Percentage of Elderly citizens left in anger: " + resultElderly + "%");
        System.out.println("Percentage of Businessmen left in anger: " + resultBusinessmen + "%");
    }
}