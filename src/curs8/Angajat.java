package curs8;

public interface Angajat {

    public static final String SALARIU = "100";
    public void setName(String name);
    public String getName();

    public void setEmail(String email);
    public String getEmail();

    default void department(){
        System.out.println("QA");
    }
}
