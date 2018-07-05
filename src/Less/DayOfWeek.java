package Less;

public enum DayOfWeek {
    MONADAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"),
    THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    private int hours;
    private String rus;

    DayOfWeek( String rus) {
        this.rus = rus;
    }
    public String getRus() {
        return rus;
    }
}

class DayOfWeekMain {

    public static void main(final String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
        System.out.println(getWorkingHours(dayOfWeek));
    }

     static String getWorkingHours(DayOfWeek dayOfWeek){
         int restWorkHours = 5 - dayOfWeek.ordinal();

         if (restWorkHours > 0) {
             restWorkHours = restWorkHours * 8;
             return "День недели " +dayOfWeek.getRus()+ " и осталось "
                     + restWorkHours + " часа до конца рабочей недели";
         }
         else {
             return "Выходной";
         }


    }
}
