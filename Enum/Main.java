package Enum;

public class Main {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
        // these are enums constants
        // public, static, final
        // since its final you can create child enums
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for(Week day: Week.values()){
            System.out.println(day);
        }
    }
}
