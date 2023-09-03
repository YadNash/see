import java.util.Scanner;

public class VideoMain {
    public static void main(String[] args) {
        VideoMethod mm = new VideoMethod();
        Scanner sc = new Scanner(System.in);
        while(true){
            int n;
            System.out.println("%%%%%%%% VIDEO LIBRARY CENTER %%%%%%%%");
            System.out.println("1.ADD MOVIES");
            System.out.println("2.DISPLAY MOVIES");
            System.out.println("3.RENT OUT");
            System.out.println("4.COLLECT BACK ");

            System.out.println("PLEASE ENTER YOUR OPTION");
            n = sc.nextInt();
            
            switch(n){
                case 1: mm.addMovies();
                        break;
                case 2: mm.display();
                        break;
                case 3: System.out.println("Enter movie want to rent:");
                        sc.nextLine();
                        if(mm.rentOut(sc.nextLine())){
                            System.out.println("Successfull");
                        }
                        else{
                            System.out.println("Not Available");
                        }
                        break;
                case 4: System.out.println("Enter name and rating");
                        sc.nextLine();
                        mm.collect(sc.nextLine(), sc.nextDouble());
                        break;
            }
        }
    }
}
