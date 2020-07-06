package tddbc;

public class ClosedRange {
    int start;
    int end;

    public ClosedRange(int start, int end) {
        if(start >= end)
            throw new IllegalArgumentException();

        this.start = start;
        this.end = end;


    }

    public String getRange() {
        return "[" + start + "," + end + "]";
    }

    public String say() {
        return "Hello TDD BootCamp!";
    }

}
