package practice1;


class MFC {
    public boolean window1Occupied;
    public boolean window2Occupied;
    public boolean window3Occupied;

    public MFC() {
        window1Occupied = false;
        window2Occupied = false;
        window3Occupied = false;
    }

    public synchronized boolean useWindow1() {
        if (!window1Occupied) {
            window1Occupied = true;
            return true;
        }
        return false;
    }

    public synchronized boolean useWindow2() {
        if (!window2Occupied) {
            window2Occupied = true;
            return true;
        }
        return false;
    }

    public synchronized boolean useWindow3() {
        if (!window3Occupied) {
            window3Occupied = true;
            return true;
        }
        return false;
    }

    public synchronized void releaseWindow1() {
        window1Occupied = false;
    }

    public synchronized void releaseWindow2() {
        window2Occupied = false;
    }

    public synchronized void releaseWindow3() {
        window3Occupied = false;
    }
}
