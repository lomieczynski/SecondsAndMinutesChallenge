package programmingcourse.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 16));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString (int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        } else {
            int finalHours = minutes/60;
            int finalMinutes = minutes%60;
            return finalHours + "h " + finalMinutes + "m " + seconds + "s";
        }
    }
    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        } else {
            int minutes = seconds/60;
            int remainingSeconds = seconds%60;
            return getDurationString(minutes, remainingSeconds);
        }

    }
}
