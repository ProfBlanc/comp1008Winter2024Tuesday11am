package wk11;

public class Professor extends PublicSpeaker implements Powerpoint, InteractiveActivity{
    @Override
    public int getParticipants() {
        return 0;
    }

    @Override
    public void rankParticipants() {

       // Math m = new Math();
        System.out.println(Math.abs(-123));
    }

    @Override
    public void scoreParticipant(String participant) {

    }

    @Override
    public void startSlides() {

    }

    @Override
    public void endSlides() {

    }

    @Override
    public VideoAndAudio animations(int slideNumber) {
        return null;
    }

    @Override
    public String bodyLanguage(String upperBody, String lowerBody) {
        return null;
    }

    @Override
    public String bodyLanguage(String upperBody) {
        return null;
    }

    @Override
    public String bodyLanguage() {
        return null;
    }
}
