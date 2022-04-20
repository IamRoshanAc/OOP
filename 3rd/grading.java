public class grading {
    public static void main(String[] args) {
        double sub1 = 50;
        double sub2 = 50;
        double sub3 = 45;
        double sub4 = 40;
        double total_mark;
        double percentage;
        String rank;
        total_mark = sub1+sub2+sub3+sub4;
        System.out.println("Total Marks is :" + total_mark);
        percentage = total_mark/4;
        System.out.println("Total Percentage is :" + percentage);
        rank = (percentage>=70)?"First Class":(percentage>59)?"Upper Second Class":(percentage>49)?"Second Class":(percentage>39)?"Third Class":"Failed";
        System.out.println("Your Grade is :" + rank);
    }
}
