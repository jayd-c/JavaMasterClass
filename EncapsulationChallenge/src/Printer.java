public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int pagesPrinted) {
        this(100,true);
        this.pagesPrinted = 0;
    }


    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if(tonerLevel < 0) this.tonerLevel = 0;
        else this.tonerLevel = Math.min(tonerLevel, 100);
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public  int addToner (int tonerAmount) {
        tonerLevel += tonerAmount;
        if(tonerLevel < 0 || tonerLevel > 100) return  1;
        else return  tonerLevel;
    }

    public int printPages (int pagesToBePrinted) {
        //Assumption 1000 pages can be printed from a full 100% toner;
        int pages = 0;
        while (tonerLevel >0) {
            if(duplex){
                for (int i = 1; i<=pagesToBePrinted; i++) {
                    System.out.println("Printing on duplex mode, page number is " +i );
                    pages++;
                    tonerLevel-=2;
                }
                if(tonerLevel < 0) {
                    return pages/2;
                }
            }
            else {
                for(int j = 0; j<= pagesToBePrinted; j++) {
                    System.out.println("Printing page number " + j);
                    tonerLevel--;
                    pages++;
                }
                if(tonerLevel < 0) {
                    return pages;
                }
            }
        }
        return -1;
    }
}
