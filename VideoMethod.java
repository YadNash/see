import java.util.*;

public class VideoMethod {
    List<Video> MovieList = new ArrayList<Video>();
    public void addMovies(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean status = sc.nextBoolean();
        double rat = sc.nextDouble();
       
        Video m = new Video(name, status, rat);
        MovieList.add(m);
        System.out.println("Initialized");
    }
    public void display(){
        if(MovieList.isEmpty()){
            System.out.println("No Movies");
        }
        for(Video m : MovieList){
            System.out.println("Movie : "+m.getName()+"  Status:"+m.getStatus()+"  Rating:"+m.getRating());
        }
    }
    public boolean rentOut(String name){
        for(Video m : MovieList){
            if(m.getName().equalsIgnoreCase(name)){
                if(m.getStatus()){
                    m.setStatus(false);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    public void collect(String name, double rat){
        boolean flag = false;
        for(Video m : MovieList){
            if(m.getName().equalsIgnoreCase(name)){
                m.setStatus(true);
                flag= true;
                Math.round(m.setRating((m.getRating()+rat)/2));
            }
        }
        if(!flag){
            System.out.println("Movie not rented out!");
        }
    }
}
