import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class typingTest {

    //region Correct Responses
    public static final String[] correctResponses = new String[]{
            "On July 16, 1969, the Apollo 11 spacecraft launched from the Kennedy Space Center in Florida. Its " +
                    "mission was to go where no human being had gone before—the moon! The crew consisted of Neil " +
                    "Armstrong, Michael Collins, and Buzz Aldrin. The spacecraft landed on the moon in the Sea of " +
                    "Tranquility, a basaltic flood plain, on July 20, 1969. The moonwalk took place the following day" +
                    ". On July 21, 1969, at precisely 10:56 EDT, Commander Neil Armstrong emerged from the Lunar " +
                    "Module and took his famous first step onto the moon’s surface. He declared, “That’s one small " +
                    "step for man, one giant leap for mankind.” It was a monumental moment in human history!",
            "It was July 21, 1969, and Neil Armstrong awoke with a start. It was the day he would become the first " +
                    "human being to ever walk on the moon. The journey had begun several days earlier, when on July " +
                    "16th, the Apollo 11 launched from Earth headed into outer space. On board with Neil Armstrong " +
                    "were Michael Collins and Buzz Aldrin. The crew landed on the moon in the Sea of Tranquility a " +
                    "day before the actual walk. Upon Neil’s first step onto the moon’s surface, he declared, “That’s" +
                    " one small step for man, one giant leap for mankind.” It sure was!",
            "Here is the perfect system for cleaning your room. First, move all of the items that do not have a " +
                    "proper place to the center of the room. Get rid of at least five things that you have not used " +
                    "within the last year. Take out all of the trash, and place all of the dirty dishes in the " +
                    "kitchen sink. Now find a location for each of the items you had placed in the center of the room" +
                    ". For any remaining items, see if you can squeeze them in under your bed or stuff them into the " +
                    "back of your closet. See, that was easy!",
            "Oceans and lakes have much in common, but they are also quite different. Both are bodies of water, but " +
                    "oceans are very large bodies of salt water, while lakes are much smaller bodies of fresh water. " +
                    "Lakes are usually surrounded by land, while oceans are what surround continents. Both have " +
                    "plants and animals living in them. The ocean is home to the largest animals on the planet, " +
                    "whereas lakes support much smaller forms of life. When it is time for a vacation, both will make" +
                    " a great place to visit and enjoy.",
            "The Blue Whales just played their first baseball game of the new season; I believe there is much to be " +
                    "excited about. Although they lost, it was against an excellent team that had won the " +
                    "championship last year. The Blue Whales fell behind early but showed excellent teamwork and came" +
                    " back to tie the game. The team had 15 hits and scored 8 runs. That’s excellent! Unfortunately, " +
                    "they had 5 fielding errors, which kept the other team in the lead the entire game. The game " +
                    "ended with the umpire making a bad call, and if the call had gone the other way, the Blue Whales" +
                    " might have actually won the game. It wasn’t a victory, but I say the Blue Whales look like they" +
                    " have a shot at the championship, especially if they continue to improve.",
            "The school fair is right around the corner, and tickets have just gone on sale. We are selling a limited" +
                    " number of tickets at a discount, so move fast and get yours while they are still available. " +
                    "This is going to be an event you will not want to miss! First off, the school fair is a great " +
                    "value when compared with other forms of entertainment. Also, your ticket purchase will help our " +
                    "school, and when you help the school, it helps the entire community. But that’s not all! Every " +
                    "ticket you purchase enters you in a drawing to win fabulous prizes. And don’t forget, you will " +
                    "have mountains of fun because there are acres and acres of great rides, fun games, and " +
                    "entertaining attractions! Spend time with your family and friends at our school fair. Buy your " +
                    "tickets now!",
            "The school fair is right around the corner, and tickets have just gone on sale. Even though you may be " +
                    "busy, you will still want to reserve just one day out of an entire year to relax and have fun " +
                    "with us. Even if you don’t have much money, you don’t have to worry. A school fair is a " +
                    "community event, and therefore prices are kept low. Perhaps, you are still not convinced. Maybe " +
                    "you feel you are too old for fairs, or you just don’t like them. Well, that’s what my " +
                    "grandfather thought, but he came to last year’s school fair and had this to say about it: “I had" +
                    " the best time of my life!” While it’s true that you may be able to think of a reason not to " +
                    "come, I’m also sure that you can think of several reasons why you must come.  We look forward to" +
                    " seeing you at the school fair!",
            "Last week we installed a kitty door so that our cat could come and go as she pleases. Unfortunately, we " +
                    "ran into a problem. Our cat was afraid to use the kitty door. We tried pushing her through, and " +
                    "that caused her to be even more afraid. The kitty door was dark, and she couldn’t see what was " +
                    "on the other side. The first step we took in solving this problem was taping the kitty door open" +
                    ". After a couple of days, she was confidently coming and going through the open door. However, " +
                    "when we removed the tape and closed the door, once again, she would not go through. They say you" +
                    " catch more bees with honey, so we decided to use food as bait. We would sit next to the kitty " +
                    "door with a can of wet food and click the top of the can. When kitty came through the closed " +
                    "door, we would open the can and feed her. It took five days of doing this to make her unafraid " +
                    "of using the kitty door. Now we have just one last problem: our kitty controls our lives!",
            "People often install a kitty door, only to discover that they have a problem. The problem is their cat " +
                    "will not use the kitty door. There are several common reasons why cats won’t use kitty doors. " +
                    "First, they may not understand how a kitty door works. They may not understand that it is a " +
                    "little doorway just for them. Second, many kitty doors are dark, and cats cannot see to the " +
                    "other side. As such, they can’t be sure of what is on the other side of the door, so they won’t " +
                    "take the risk. One last reason cats won’t use kitty doors is because some cats don’t like the " +
                    "feeling of pushing through the door and having the door drag across their back. But don’t " +
                    "worry—there is a solution for this kitty-door problem.",
            "I do well in school, and people think I am smart because of it. But it’s not true. In fact, three years " +
                    "ago I struggled in school. However, two years ago I decided to get serious about school and made" +
                    " a few changes. First, I decided I would become interested in whatever was being taught, " +
                    "regardless of what other people thought. I also decided I would work hard every day and never " +
                    "give up on any assignment. I decided to never, never fall behind. Finally, I decided to make " +
                    "school a priority over friends and fun. After implementing these changes, I became an active " +
                    "participant in classroom discussions. Then my test scores began to rise. I still remember the " +
                    "first time that someone made fun of me because “I was smart.” How exciting! It seems to me that " +
                    "being smart is simply a matter of working hard and being interested. After all, learning a new " +
                    "video game is hard work even when you are interested. Unfortunately, learning a new video game " +
                    "doesn’t help you get into college or get a good job.",
            "Last year was the first time I had ever been the new kid at school. For the first four days, I was " +
                    "completely alone. I don’t think I even spoke to a single person. Finally, at lunch on the fifth " +
                    "day, Karen Watson walked past her usual table and sat down right next to me. Even though I was " +
                    "new, I had already figured out who Karen Watson was. She was popular. Pretty soon, all of " +
                    "Karen’s friends were sitting there right next to me. I never became great friends with Karen, " +
                    "but after lunch that day, it seemed like all sorts of people were happy to be my friend. You " +
                    "cannot convince me that Karen did not know what she was doing. I have a great respect for her, " +
                    "and I learned a great deal about what it means to be a true leader."

    };
    //endregion

    public static final String correctResponse = correctResponses[(int) (Math.random() * correctResponses.length)];

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(correctResponse);
        Scanner input = new Scanner(System.in);
        String userResponse = input.nextLine();
        userResponse = makeSameLength(userResponse);
        try {
            System.out.println("Time duration: " + trackTime(start) + " second(s)");
            System.out.println("Words per Minute: " + wordPerMinute(trackTime(start), numberOfWords(userResponse)));
            System.out.println("Accuracy: " + calculateAccuracy(userResponse) + "%");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int numberOfWords(String userResponse) {
        String[] words = userResponse.split("\\s+");
        int num = 0;
        for (String word: words){
            if (correctResponse.contains(word)){
                num++;
            }
        }
        return num;
    }

    public static long trackTime(long start) throws InterruptedException {
        long end = System.nanoTime();
        long elapsed = end - start;
        return TimeUnit.SECONDS.convert(elapsed, TimeUnit.NANOSECONDS);
    }

    public static double calculateAccuracy(String userResponse) {
        double correct = 0.0;
        for (int i = 0; i < userResponse.length(); i++) {
            if (correctResponse.charAt(i) == userResponse.charAt(i)) {
                correct += 1.0;
            }
        }
        return (((int) (correct / correctResponse.length() * 10000)) / 100.0);
    }

    public static String makeSameLength(String userResponse) {
        if (userResponse.length() > correctResponse.length()){
            userResponse = userResponse.substring(0, correctResponse.length());
        } else if (userResponse.length() < correctResponse.length()){
            while (userResponse.length() < correctResponse.length()){
                userResponse += " ";
            }
        }
        return userResponse;
    }

    public static double wordPerMinute(long time, double words) {
        double x = words / time * 60.0;
        x = (int) (x*10) / 10.0;
        return x;
    }

}
