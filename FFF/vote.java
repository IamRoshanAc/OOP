package FFF;

public class vote {
    public static void main(String[] args) {
        int age = 20;
        String eligible_to_vote;
        eligible_to_vote = (age >=18)?"You can  cast FFF.vote.":"You cannot cast FFF.vote.";
        System.out.println(eligible_to_vote);
    }
}
