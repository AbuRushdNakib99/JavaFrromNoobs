public class Loops {
    public static void main(String[]args){
        int num[]={12,13,14,15,16};
//        For Loop

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        for(int i=1;i<=10;i+=2){
            System.out.println(i);
        }

//        While Loop
        int j=100;
        while(j<=110){
            System.out.println(j);
            j++;
        }

//        Do While

        do{
//            Statement
        }
        while (true);

//        For Each Loop



        for(int x:num){
            System.out.println(x);
        }
    }
}
