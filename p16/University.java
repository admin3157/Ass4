package p16;

public class University {

    protected String universityName;

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void showUniversity() {
        System.out.println("University: " + universityName);
    }
}