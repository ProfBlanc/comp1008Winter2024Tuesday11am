package wk11;

public interface InteractiveActivity {

    double MAX_DURATION = 15, MIN_DURATION = 5;

    int getParticipants();
    void rankParticipants();
    void scoreParticipant(String participant);

}
