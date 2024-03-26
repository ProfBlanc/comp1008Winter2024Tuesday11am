package wk11;

public abstract class PublicSpeaker {

    double confidenceLevel, volume;
    enum Skills{TONE, LANGUAGE, VOCABULARY, PROJECTION}
    Skills speakingSkills;
    String title;

    public abstract String bodyLanguage(String upperBody, String lowerBody);
    public abstract String bodyLanguage(String upperBody);
    public abstract String bodyLanguage();

    public PublicSpeaker(){}

    public PublicSpeaker(double confidenceLevel, double volume, Skills speakingSkills, String title) {
        this.confidenceLevel = confidenceLevel;
        this.volume = volume;
        this.speakingSkills = speakingSkills;
        this.title = title;
    }
}
