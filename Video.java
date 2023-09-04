public class Video {
    String name;
    boolean status;
    double rating;
    public Video(String name, boolean status, double rating){
        this.name = name;
        this.status = status;
        this.rating = rating;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }
    public double setRating(double rating){
        return this.rating = rating;
    }
    public double getRating(){
        return rating;
    }
}


// import java.util.Scanner;

// public class VideoMain {
//     public static void main(String[] args) {
//         VideoMethod mm = new VideoMethod();
//         Scanner sc = new Scanner(System.in);
//         while(true){
//             int n;
//             System.out.println("%%%%%%%% VIDEO LIBRARY CENTER %%%%%%%%");
//             System.out.println("1.ADD MOVIES");
//             System.out.println("2.DISPLAY MOVIES");
//             System.out.println("3.RENT OUT");
//             System.out.println("4.COLLECT BACK ");

//             System.out.println("PLEASE ENTER YOUR OPTION");
//             n = sc.nextInt();
            
//             switch(n){
//                 case 1: mm.addMovies();
//                         break;
//                 case 2: mm.display();
//                         break;
//                 case 3: System.out.println("Enter movie want to rent:");
//                         sc.nextLine();
//                         if(mm.rentOut(sc.nextLine())){
//                             System.out.println("Successfull");
//                         }
//                         else{
//                             System.out.println("Not Available");
//                         }
//                         break;
//                 case 4: System.out.println("Enter name and rating");
//                         sc.nextLine();
//                         mm.collect(sc.nextLine(), sc.nextDouble());
//                         break;
//             }
//         }
//     }
// }


// import java.util.List;
// import java.util.Scanner;
// import java.util.ArrayList;
// public class VideoMethod {
//         List<Video> MovieList = new ArrayList<Video>();
//         public void addMovies()
//         {
//             Scanner in =new Scanner(System.in);
//             System.out.print("Enter the name of the movie:");
//             String mName=in.nextLine();
//             System.out.print("Enter the status of the movie(True/False):");
//             boolean status=in.nextBoolean();
//             System.out.print("Enter the ratings for the movie(0-5):");
//             double rating=in.nextDouble();
//             Video v=new Video(mName, status, rating);
//             MovieList.add(v);
//             System.out.println("Library Initialized");
//         }
//         public void display()
//         {
//             if(MovieList.isEmpty())
//             {
//                 System.out.println("No movies in the library");
//             }
//             for(Video m : MovieList)
//             {
//                 System.out.println("Movie : " +m.getName()+"  "+"Status : "+m.getStatus()+"  "+"Rating "+m.getRating());
//             }
//         }

//         boolean rentOut(String name)
//         {
//             for(Video m :MovieList)
//             {
//                 if(m.getName().equalsIgnoreCase(name))
//                 {
//                     if(m.getStatus())
//                     {
//                         m.setStatus(false);
//                         return true;
//                     }
//                 }
                
//             }
//             return false;
//         }

//         public void collect(String name,double rat)
//         {
//             boolean flag=false;
//             for(Video m :MovieList)
//             {
//                 if(m.getName().equalsIgnoreCase(name))
//                 {
//                     m.setStatus(true);
//                     flag=true;
//                     Math.round(m.setRating((m.getRating() + rat)/2));
//                 }
//             }
//             if(!flag)
//             {
//                 System.out.println("Requested Movie not rented out");
//             }
//         }
//     }

