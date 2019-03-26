package ca.ualberta.cs.lonelytwitter;

public class ImportantTweet extends  Tweet{

    @Override
    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20) {
            return false;
        }
        return true;

    }
}
