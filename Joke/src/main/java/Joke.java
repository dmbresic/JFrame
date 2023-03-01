public class Joke extends JokeDTO{
    String delivery;
    String punchline;
    String category;

    public Joke(String delivery, String punchline, String category){
        this.category = category;
        this.delivery = delivery;
        this.punchline = punchline;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString(){
        return "Category: " + category + "\n" +
        "Delivery: " + delivery +  "\n" +
        "Punchline: " + punchline + "\n";
    }
}
