import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
//@JsonSubTypes({
//        @JsonSubTypes.Type(Joke.class)}
//)

public class JokeDTO {

    @com.fasterxml.jackson.annotation.JsonProperty("lang")
    private String lang;
    @com.fasterxml.jackson.annotation.JsonProperty("safe")
    private boolean safe;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private int id;
    @com.fasterxml.jackson.annotation.JsonProperty("flags")
    private Flags flags;
    @com.fasterxml.jackson.annotation.JsonProperty("delivery")
    private String delivery;
    @com.fasterxml.jackson.annotation.JsonProperty("setup")
    private String setup;
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private String type;
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private String category;
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private boolean error;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public boolean getSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public static class Flags {
        @com.fasterxml.jackson.annotation.JsonProperty("explicit")
        private boolean explicit;
        @com.fasterxml.jackson.annotation.JsonProperty("sexist")
        private boolean sexist;
        @com.fasterxml.jackson.annotation.JsonProperty("racist")
        private boolean racist;
        @com.fasterxml.jackson.annotation.JsonProperty("political")
        private boolean political;
        @com.fasterxml.jackson.annotation.JsonProperty("religious")
        private boolean religious;
        @com.fasterxml.jackson.annotation.JsonProperty("nsfw")
        private boolean nsfw;

        public boolean getExplicit() {
            return explicit;
        }

        public void setExplicit(boolean explicit) {
            this.explicit = explicit;
        }

        public boolean getSexist() {
            return sexist;
        }

        public void setSexist(boolean sexist) {
            this.sexist = sexist;
        }

        public boolean getRacist() {
            return racist;
        }

        public void setRacist(boolean racist) {
            this.racist = racist;
        }

        public boolean getPolitical() {
            return political;
        }

        public void setPolitical(boolean political) {
            this.political = political;
        }

        public boolean getReligious() {
            return religious;
        }

        public void setReligious(boolean religious) {
            this.religious = religious;
        }

        public boolean getNsfw() {
            return nsfw;
        }

        public void setNsfw(boolean nsfw) {
            this.nsfw = nsfw;
        }
    }

}
