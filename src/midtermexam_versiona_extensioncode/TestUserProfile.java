package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 * This class +++ Insert class description here +++
 *
 * @author Ryan Zou
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserProfile userProfile = new UserProfile();
        System.out.print("Please enter your name: ");
        userProfile.setUserID(scanner.nextLine());
        for (int i = 1; i <= userProfile.getGenres().length; i++) {
            System.out.println(i + ". " + userProfile.getGenres()[i - 1]);
        }
        System.out.println("Please the number associated with your favourite genre out of the above: ");
        userProfile.setGenre(userProfile.getGenres()[scanner.nextInt() - 1]);
        System.out.printf("Hello %s, your user profile has been created. Your favourite genre is %s.", userProfile.getUserID(), userProfile.getGenre());
    }
}
