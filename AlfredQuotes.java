import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return String.format("Good %s, %s. Lovely to see you", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("It is currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String phrase) {
        // YOUR CODE HERE
        if(phrase.indexOf("Andrew") > -1) {
            return "He's really useless. Can I help instead?";
        }
        if(phrase.indexOf("Jonathan") > -1) {
            return "I would be pleasured to serve you. What do you require?";
        }
        return "I'm done. Not just quiet quitting";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

