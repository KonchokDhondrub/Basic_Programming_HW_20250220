public class Main {
    public static void main(String[] args) {
        Manager<Programmer> programmersList = new Manager<>(Programmer.class);
        programmersList.add(new BackEndProgrammer("John"));
        programmersList.add(new FrontEndProgrammer("Jack"));
        programmersList.printList();

        System.out.println("-----------------");
        Manager<QATeam> qaTeamList = new Manager<>(QATeam.class);
        qaTeamList.add(new QAEngineer("Karen"));
        qaTeamList.add(new QALead("Morgan"));
        qaTeamList.printList();
    }
}
