package br.com.alura.model.entity;

public class Filme {

    private String id;
    private String rank;
    private String title;
    private String fullTitle;
    private String year;
    private String image;
    private String crew;
    private String imDbRating;
    private String imDbRatingCount;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFullTitle() {
        return fullTitle;
    }
    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getCrew() {
        return crew;
    }
    public void setCrew(String crew) {
        this.crew = crew;
    }
    public String getImDbRating() {
        return imDbRating;
    }
    public void setImDbRating(String imDbRating) {
        this.imDbRating = imDbRating;
    }
    public String getImDbRatingCount() {
        return imDbRatingCount;
    }
    public void setImDbRatingCount(String imDbRatingCount) {
        this.imDbRatingCount = imDbRatingCount;
    }

    public String getRatingAsStars(String rating) {
        String stars = "";
        Double ratingDouble = Double.parseDouble(rating);
        int ratingInt = ratingDouble.intValue();
        for (int i = 0; i < ratingInt; i++) {
            stars += "\u2B50";
        }

        return stars;

    }

}
    

