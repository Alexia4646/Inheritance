import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Party party = new Party();

        System.out.println("Enter the number of guests attending >> ");
        int GuestCount = sc.nextInt();

        party.setGuestCount(GuestCount);

        System.out.println("The party has " + party.getGuestCount() +" guests");

        party.displayInvitation();

        int dinnerChoice;
        DinnerParty aDinnerParty = new DinnerParty();
        System.out.println("Enter the number of guests for the dinner party >> ");
        GuestCount = sc.nextInt();
        aDinnerParty.setGuestCount(GuestCount);

        System.out.println("Pick a menu option: Option 1 for Fish -- Option 2 for Turkey");
        dinnerChoice = sc.nextInt();
        aDinnerParty.setDinnerChoice(dinnerChoice);

        System.out.println("The dinner party has " + aDinnerParty.getGuestCount() + " guests");
        System.out.println("You have chosen " + aDinnerParty.getDinnerChoice() + ". It will be served to you shortly");

        aDinnerParty.displayInvitation();

    }
}
