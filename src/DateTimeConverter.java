import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateTimeConverter {
//    retesting
    public static String convertToReadableTime(String datetimeStr){
        //defining date format for parsing the input datetime string
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        try {
            // Parse the input datetime string
            Date inputDateTime = dateFormat.parse(datetimeStr);
            Date currentDateTime = new Date(); //getting current date and time

            //Calculate the time difference in milliseconds
            long timeDifferenceMillis = currentDateTime.getTime() - inputDateTime.getTime();


            //calculate time components: seconds, minutes, hours, days and years
            long seconds = timeDifferenceMillis / 1000;
            long minutes = seconds / 60;
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;

            //generating human readalbe format
            if (years >= 1) {
                return years + " " + (years == 1 ? "year" : "years") + " ago";
            } else if (days >= 1) {
                return days + " " + (days == 1 ? "day" : "days") +  " ago";
            } else if (hours >= 1) {
                return hours + " " + (hours == 1 ? "hour" : "hours") +  " ago";
            } else if (minutes >= 1) {
                return minutes + " " + (minutes == 1 ? "minute" : "minutes") +  " ago";
            } else {
                return seconds + " " + (seconds == 1 ? "second" : "seconds") + " ago";
            }

        } catch (ParseException e) {
            e.printStackTrace();
            return "Invalid date time format"; // return error message
        }
    }

    public static void main(String[] args) {
        String datetimeStr = "1992-02-19T10:30:00";
        String readableTime = convertToReadableTime(datetimeStr);
        System.out.println(readableTime);
    }

}
