public class Party {
    int GuestCount;

    public int setGuestCount(int GuestCount){
        this.GuestCount = GuestCount;
        return GuestCount;
    }

    public int getGuestCount(){
        return GuestCount;
    }

    public void displayInvitation(){
        System.out.println("Please come to my party!");
    }


}