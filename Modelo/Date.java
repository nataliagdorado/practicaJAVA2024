public class Date {
    private int day;
    private int month;
    private int year;

    public Date(String date) {
        String[] parts = date.split("/");
        this.day = Integer.parseInt(parts[0]);
        this.month = Integer.parseInt(parts[1]);
        this.year = Integer.parseInt(parts[2]);
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
    

