package application;


public class UserSession {
    private static String userPosition;

    public static String getUserPosition() {
        return userPosition;
    }

    public static void setUserPosition(String userPosition) {
        UserSession.userPosition = userPosition;
    }
}
