public class Comment {
    private String author;
    private String text;
    private int rating;
    private int votes;

    /**
     * Constructor for Comment.
     */
    public Comment(String author, String text, int rating) {
        this.author = author;
        this.text = text;
        this.rating = rating;
        this.votes = 0;
    }

    /**
     * Get the author of the comment.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Get the full details of the comment.
     */
    public String getFullDetails() {
        return "Author: " + author + "\n" +
                "Rating: " + rating + "\n" +
                "Votes: " + votes + "\n" +
                "Comment: " + text;
    }

    /**
     * Get the current vote count.
     */
    public int getVoteCount() {
        return votes;
    }

    /**
     * Upvote the comment.
     */
    public void upvote() {
        votes++;
    }

    /**
     * Downvote the comment.
     */
    public void downvote() {
        votes--;
    }
}
