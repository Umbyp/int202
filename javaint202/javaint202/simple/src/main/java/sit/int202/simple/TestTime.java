package sit.int202.simple;

import java.util.Date;

public class TestTime {
    public static void main(String[] args) {
        Date d1 = new Date(1000*60);
        Date d2 =new Date( 1000*60*60*24);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(System.currentTimeMillis());
        Date toDay = new Date(1697205438073L);
        Date tomorrow = new Date(1697205438073L+1000*60*60*24);
        System.out.println(toDay);
        System.out.println(tomorrow);
    }
}
