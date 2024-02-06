package br.com.maratonajava.aula.Rdatas;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.util.Locale;

/*
    creating a Temporal Adjuster that return the next bussines day by a temporal
    implementing the TemporalAdjuster interface and subcribing the adjustInto method
    using the polimorfism
*/
class NextBussinesDay implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {

        //get the week day of the temporal entered, and put it in local
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        //days to add in return
        int addDays;

        //here's the logic to get the next bussines day by this week day
        switch (dayOfWeek) {
            case FRIDAY:
                addDays = 3;
                break;
                
                case SATURDAY:
                addDays = 2;
                break;
                
                default:
                addDays = 1;
                break;
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

//Using the new Temporal Adjuster in the temporals
public class TemporalAdjusterTest02 {
    public static void main(String[] args) {
        
        LocalDateTime date = LocalDateTime.now();
        for (int i = 0; i < 7; i++) {
            LocalDate now = LocalDate.now().plusDays(i);
            LocalDate nextBussinesDay = now.with(new NextBussinesDay());
            System.out.println(String.format("--- NEXT BUSSINES DAY ---\nDate: %s\nNext bussines day: %s\n", temporalInfo(now), temporalInfo(nextBussinesDay)));
        }
        
    }

    private static String temporalInfo (Temporal temporal){
        return temporal + " " + DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
    } 
}
