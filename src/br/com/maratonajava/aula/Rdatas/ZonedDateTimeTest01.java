package br.com.maratonajava.aula.Rdatas;

import java.time.*;
import java.util.Map;

/* All zones id
 * MST=-07:00, SST=Pacific/Guadalcanal, CTT=Asia/Shanghai, PRT=America/Puerto_Rico, ECT=Europe/Paris, EAT=Africa/Addis_Ababa,
 * EST=-05:00, PNT=America/Phoenix, PLT=Asia/Karachi, CNT=America/St_Johns, IET=America/Indiana/Indianapolis, VST=Asia/Ho_Chi_Minh,
 * JST=Asia/Tokyo, ART=Africa/Cairo, PST=America/Los_Angeles, BET=America/Sao_Paulo, MIT=Pacific/Apia, CAT=Africa/Harare, 
 *AGT=America/Argentina/Buenos_Aires, NET=Asia/Yerevan, CST=America/Chicago, IST=Asia/Kolkata, AET=Australia/Sydney, BST=Asia/Dhaka,
 ACT=Australia/Darwin, HST=-10:00, NST=Pacific/Auckland, AST=America/Anchorage
 */

public class ZonedDateTimeTest01 {
    public static void main(String[] args) {
        
        //extracting the SHORT_IDS (map of all supported zones) to local map
        Map <String, String> shortsIds = ZoneId.SHORT_IDS;

        //getting now date time
        LocalDateTime now = LocalDateTime.now();

        //extracting asia tokio zone to local ZoneId
        ZoneId asiaTokioZoneId = ZoneId.of("Asia/Tokyo");

        //instatiating a zonedDateTime by now at Africa/Harare ZoneId
        ZonedDateTime africaHarareZonedDateTime = now.atZone(ZoneId.of("Africa/Harare"));
        
        //instatiating a zonedDateTime by the local ZoneId of Asia/Tokyo
        ZonedDateTime asiaTokyoZonedDateTime = now.atZone(asiaTokioZoneId);

        //getting a LocalDateTime offseted by the America/Sao_Paulo zone in now
        LocalDateTime saoPauloZonedNow = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
        
        //the same but for shanghai
        LocalDateTime asiaShanghaiZonedNow = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));

        //instatiating a ZoneOffset (used for getting a zone by a offset int)
        ZoneOffset saoPetersburgoMoscouZoneOffset = ZoneOffset.of("-03:00");

        //USING OFFSET

        //instatiating a OffsetDateTime by a ZoneOffset
        OffsetDateTime spmZoneOffsetDateTime = LocalDateTime.now().atOffset(saoPetersburgoMoscouZoneOffset);


        System.out.println("spmZoneOffsetDateTime: "+spmZoneOffsetDateTime);
        System.out.println("africaHarareZonedDateTime: "+africaHarareZonedDateTime);
        System.out.println("asiaTokyoZonedDateTime: "+asiaTokyoZonedDateTime);
        System.out.println("saoPauloZonedNow: "+saoPauloZonedNow);
        System.out.println("saoPetersburgoMoscouZoneOffset: "+saoPetersburgoMoscouZoneOffset);
    }
}
