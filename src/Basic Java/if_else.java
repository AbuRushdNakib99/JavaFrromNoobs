public class if_else {
    public static void main(String[] args) {
//        simple if
        int n=0;
        if(n>0){
            System.out.println("Yes it is");
        }

//        if else

        if(n>0){
            System.out.println("Yes it is");
        }
        else{
            System.out.println("Sorry it's not");
        }

//        Ladder if else

        if(n>0){
            System.out.println("This is Positive");
        }
        else if(n<0){
            System.out.println("This is Negative");
        }
        else{
            System.out.println("This is Zero");
        }
    }
}
