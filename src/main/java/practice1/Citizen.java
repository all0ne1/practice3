package practice1;

class Citizen extends Thread {
    static public int youngAngryCount = 0;
    static public int elderlyAngryCount = 0;
    static public int businessmenAngryCount = 0;
    private MFC mfc;
    private int category;

    public Citizen(MFC mfc, int category) {
        this.mfc = mfc;
        this.category = category;
    }

    @Override
    public void run() {
        if (category == 1) {
            if (mfc.useWindow1() || mfc.useWindow2() || mfc.useWindow3()) {
                System.out.println("Young citizen served");
            } else {
                System.out.println("Young citizen left in anger");
                youngAngryCount++;
            }
        } else if (category == 2) {
            if (mfc.useWindow2()) {
                System.out.println("Elderly citizen served");
            } else {
                System.out.println("Elderly citizen left in anger");
                elderlyAngryCount++;
            }
        } else if (category == 3) {
            if (mfc.useWindow3()) {
                System.out.println("Businessman served");
            } else {
                System.out.println("Businessman left in anger");
                businessmenAngryCount++;
            }
        }
        
        if (category == 1) {
            mfc.releaseWindow1();
        } else if (category == 2) {
            mfc.releaseWindow2();
        } else if (category == 3) {
            mfc.releaseWindow3();
        }
    }
}