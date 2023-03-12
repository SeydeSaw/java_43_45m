package homeWork.hw_24_02_23;
/*todo
    Описание занятия: Представьте, что Вы живете в Берлине и собираетесь поехать в Мюнхен.
    Вам необходимо создать enum, в котором будут такие варианты передвижения как:
    самолет, поезд, автомобиль, велосипед и пешком. Вам необходимо создать такой enum,
    в котором в качестве конструктора задавалась бы продолжительность поездки,
    в зависимости от способа передвижения. Значение будет задаваться в часах
    (дробное число, можно задать приближённое значение, либо попробовать
    найти лучший вариант на google maps).
    Помимо этого, в этом enum необходимо создать метод для получения информации о
    продолжительности поездки в днях, часах, минутах и секундах (разными методами)
 */
public enum TravelType {
    // Задается продолжительность поездки для каждого способа передвижения в часах
    PLANE (1.10),
    TRAIN (4.47),
    CAR (5.55),
    BIKE (37),
    FOOT (118);

    // Задается продолжительность поездки для каждого способа передвижения в часах
    private double duration;

    TravelType (double duration) {
        this.duration = duration;
    }

    // Метод для получения продолжительности поездки в днях
    public int getDurationInDays() {
        return (int) duration / 24;
    }

    // Метод для получения продолжительности поездки в часах
    public int getDurationInHours() {
        return (int) duration;
    }

    // Метод для получения продолжительности поездки в минутах
    public double getDurationInMinutes() {
        return (double) duration * 60;
    }

    // Метод для получения продолжительности поездки в секундах
    public double getDurationInSeconds() {
        return (double) duration * 3600;
    }

    public static void main(String[] args) {
        // Вывод на экран всех методов
        System.out.println("Air travel will take");
        System.out.println("Days: " + TravelType.PLANE.getDurationInDays());
        System.out.println("Hours: " + TravelType.PLANE.getDurationInHours());
        System.out.println("Minutes: " + TravelType.PLANE.getDurationInMinutes());
        System.out.println("Seconds: " + TravelType.PLANE.getDurationInSeconds());

        System.out.println("Traveling by train will take");
        System.out.println("Days: " + TravelType.TRAIN.getDurationInDays());
        System.out.println("Hours: " + TravelType.TRAIN.getDurationInHours());
        System.out.println("Minutes: " + TravelType.TRAIN.getDurationInMinutes());
        System.out.println("Seconds: " + TravelType.TRAIN.getDurationInSeconds());

        System.out.println("Traveling by car will take");
        System.out.println("Days: " + TravelType.CAR.getDurationInDays());
        System.out.println("Hours: " + TravelType.CAR.getDurationInHours());
        System.out.println("Minutes: " + TravelType.CAR.getDurationInMinutes());
        System.out.println("Seconds: " + TravelType.CAR.getDurationInSeconds());

        System.out.println("Traveling by bike will take");
        System.out.println("Days: " + TravelType.BIKE.getDurationInDays());
        System.out.println("Hours: " + TravelType.BIKE.getDurationInHours());
        System.out.println("Minutes: " + TravelType.BIKE.getDurationInMinutes());
        System.out.println("Seconds: " + TravelType.BIKE.getDurationInSeconds());

        System.out.println("Traveling on foot will take");
        System.out.println("Days: " + TravelType.FOOT.getDurationInDays());
        System.out.println("Hours: " + TravelType.FOOT.getDurationInHours());
        System.out.println("Minutes: " + TravelType.FOOT.getDurationInMinutes());
        System.out.println("Seconds: " + TravelType.FOOT.getDurationInSeconds());
    }
}

