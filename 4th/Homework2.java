public class Homework2 {
    //2. Write a JAVA program to find maximum between three numbers.
    class If_else_Q2{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the digit: ");
            int A=scanner.nextInt();
            System.out.println("enter the digit: ");
            int B=scanner.nextInt();
            System.out.println("enter the digit: ");
            int C=scanner.nextInt();
            if (A>B && B>C){
                System.out.println("A is greater.");
            }
            else if (B>A && A>B){
                System.out.println("B is greater. ");
            }
            else{
                System.out.println("c is greater.");
            }

        }
    }

    //3. Write a JAVA program to check whether a number is negative, positive or zero.
    class If_else_Q3{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the digit: ");
            int A=scanner.nextInt();
            if (A<0){
                System.out.println("Number is negative");
            }
            else if(A==0){
                System.out.println("Number is zero");
            }
            else{
                System.out.println("Number is positive");
            }
        }
    }

    //4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
    class If_else_Q4{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the digit: ");
            int A=scanner.nextInt();
            if ((A%5==0)&& (A%11==0)){
                System.out.println("The given number is divisible by both 5 and 11.");
            }
            else{
                System.out.println("The number is not divisible by 5 and 11.");
            }
        }
    }

    //5. Write a JAVA program to check whether a number is even or odd.
    class If_else_Q5{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the digit: ");
            int A = scanner.nextInt();
            if (A % 2 == 0) {
                System.out.println("The number is even.");
            }
            else {
                System.out.println("The number is odd.");
            }
        }
    }

    //6. Write a JAVA program to check whether a year is leap year or not.
    class If_else_Q6{
        public static void main(String[] args) {

        }
    }

    //7. Write a JAVA program to check whether a character is alphabet or not.
    class If_else_Q7{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a Character : ");
            char character = scanner.next().charAt(0);

            if((character>='a' && character<='z') || (character>='A' && character<='Z')){
                System.out.print(character + " is an alphabet.");
            }else{
                System.out.print(character + " is not an alphabet.");
            }

        }
    }
    //8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
    class If_else_Q8{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a Character : ");
            char character = scanner.next().charAt(0);

            if((character>='a' && character<='z') || (character>='A' && character<='Z')){
                if((character>='a' ||character<='A'||character>='E' && character<='e'
                        ||character>='I' ||character<='i'||character>='O' && character<='o'
                        ||character>='U' && character<='u')){
                    System.out.println(character+" is a vowel alphabet.");
                }
                else{
                    System.out.println(character+" is a consonant alphabet.");
                }
            }
            else{
                System.out.print(character + " is not an alphabet.");
            }
        }
    }

    //9. Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.
    class If_else_Q9{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a Character : ");
            char character = scanner.nextLine().charAt(0);

            if((character>='a' && character<='z') || (character>='A' && character<='Z')){
                System.out.print(character + " is an alphabet.");
            }
            else if (character>0 && character<0 && character==0){
                System.out.print(character + " is an digit.");
            }
            else{
                System.out.print(character + " is a special character.");
            }}}


    //10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
    class If_else_Q10{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a Character : ");
            char character = scanner.nextLine().charAt(0);

            if((character>='A' && character<='Z')){
                System.out.print(character + " is an upper case alphabet.");
            }
            else if(character>='a' && character<='z'){
                System.out.print(character + " is an lower case alphabet.");
            }
            else{
                System.out.print(character + " is not an alphabet.");
            }
        }
    }

    class If_else_Q11{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the digit: ");
            int day=scanner.nextInt();
            if (day==1){
                System.out.println("sunday");
            }
            else if (day==2){
                System.out.println("monday");
            }
            else if (day==3){
                System.out.println("tuesday");
            }
            else if (day==4){
                System.out.println("wednesday");
            }
            else if (day==5){
                System.out.println("Thursday");
            }
            else if (day==6){
                System.out.println("friday");
            }
            else if (day==7){
                System.out.println("saturday");
            }
            else{
                System.out.println("default");
            }
        }
    }

}
