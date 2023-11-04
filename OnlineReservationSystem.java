import java.util.Random;
import java.util.*;

public class OnlineReservationSystem{
    Random pnr;
    Scanner s=new Scanner(System.in);
    String username , password , gender , passengername,
    train_name , boarding_station ,destination
    ,date_of_journey , class_type, next,exit;

    int passenger_age ,PNR , pnr_num;


    public static void main(String args[]){
        System.out.println();
        System.out.println();
      
        System.out.println("            Welcome To Online Reservation System          ");
        System.out.println();

        OnlineReservationSystem obj=new OnlineReservationSystem();
        obj.getUserDetails();


    }

    void getUserDetails(){
        System.out.println("Enter The Username :-");
        username=s.next();
        System.out.println("Enter the Password :-");

        password =s.next();
        getPassword();
    }

    void getPassword(){
        if(password.equals("12345")){
            System.out.println("-----------------------------------");
            System.out.println("Logged in Successfully !!!!");
            Login();
        }else{
            System.out.println("------------------------------------");
            System.out.println("Please Enter Valid Username and Password");
            System.out.println("                              ");
 
            getUserDetails();
        }
    }
    void Login(){
        System.out.println("Please Choose The Option 1From Below :-");
        System.out.println();
        System.out.println("1. For Seat Booking");
        System.out.println("2. For Cancel Ticket");
        System.out.println("3. Exit");
        System.out.println("------------------------------------------");
        int option=s.nextInt();

        switch(option){
            case 1: seatBooking();
            break;

            case 2: CancelTicket();
            break;

            case 3: exit();
            break;

            default : System.out.println(" Please Choose Valid Option ");
                      System.out.println("-------------------------------");

                      Login();
                      break;

        }
    }
    void seatBooking(){
        PNR =getPnr(100000,999999);

        System.out.println("--------Please Enter Journey Details------------");System.out.println();
        System.out.println("Enter the Train Name   :-");
        train_name =s.next();

        System.out.println("Enter Boarding Station :-");
        boarding_station=s.next();

        System.out.println("Enter Destination  :-");
        destination=s.next();

        System.out.println("Enter date of Journey :-");
        date_of_journey=s.next();

        System.out.println("Enter Class Type :-");
        class_type=s.next();
        System.out.println();

        System.out.println("       NOW  ENTER  PASSENGERS  DETAILS ");
        System.out.println("Enter Passenger Name :-");
        passengername=s.next();

        System.out.println("Enter Passengers gender :-");
        gender=s.next();

        System.out.println("Enter Age :- ");
        passenger_age=s.nextInt();

        System.out.println("Your Seat is reserved Successfully !!!!");
        System.out.println("============================================");
        System.out.println("To Review Your Ticket Please Enter '1' ");
        int ticket_review=s.nextInt();

        if(ticket_review==1){
            showTicketDetails();
        }
    }

    void showTicketDetails(){
        System.out.println("         T I C K E T    D E T A I L S       ");
        System.out.println("--------------------------------------------------");
        System.out.println("Train Name        :- "+train_name);
        System.out.println("PNR Number        :- "+PNR);
        System.out.println("Boarding Station  :- "+boarding_station);
        System.out.println("Destination       :- "+destination);
        System.out.println("Date of Journey   :- "+date_of_journey);
        System.out.println("Class Type        :- "+passengername);
        System.out.println("Passenger Gender  :- "+gender);
        System.out.println("Passengers Age    :- "+passenger_age);
        System.out.println("===============================================");
        System.out.println("Do you want to exit ,If yes then Enter 'Y' ");
        exit=s.next();

        if(exit.equals("Y")){
            exit();

        }else{
            System.out.println("================ ADITYA ============");
            System.out.println("You are Directed to Login Page");
            Login();

        }
    }

    void CancelTicket(){
        System.out.println("For Cancel the Ticket Please Enter PNR number :- ");
        pnr_num=s.nextInt();
        if(pnr_num==PNR){
            System.out.println("=======================================");
            System.out.println("For Cancel Your Ticket Please Enter '2' ");
            int n=s.nextInt();
            if(n==2){
                System.out.println("Your Ticket Has been Successfully Canceled");
            }
        }else{
            System.out.println("Please Enter Valid PNR Number");
            CancelTicket();
        }
    }
    public static int getPnr(int min,int max){
        Random pnr=new Random();
        return (int)pnr.doubles(min,max).findFirst().getAsDouble();

    }

    void exit(){

        System.out.println("Thank You for Visiting");
        System.exit(0);

    }



}