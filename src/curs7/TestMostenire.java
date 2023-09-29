package curs7;

public class TestMostenire {

    // Angajat --> Tester --> TesterAutomat
    public static void main(String[] args) {
        TesterAutomat testerAutomat = new TesterAutomat();
        testerAutomat.setProgrammingLanguage("Java"); // clasa TesterAutmat()
        testerAutomat.setSeniority("Junior"); // clasa Tester
        testerAutomat.setDepartment("QA"); // clasa Tester
        testerAutomat.setEmail("boc@boc.ro"); // clasa Angajat
        testerAutomat.setNume("Boc"); // clasa Angajat
    }
}
