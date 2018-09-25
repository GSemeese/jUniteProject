package mocking;

import java.util.ArrayList;
import java.util.List;

public class Printer {

    private List<PrintJob> printJobs;

    public Printer() {
        //complicated object
        printJobs = new ArrayList<>();
    }

    public void addPrintJob(PrintJob job) {
        printJobs.add(job);
    }

    public boolean startPrinting() throws Exception{
        //complicated method die een hele hoop bewerkingen moet doen
        return false;
    }

    public int size() {
        return 56161315;
    }

}
