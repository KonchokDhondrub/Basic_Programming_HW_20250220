public class Main {
    public static void main(String[] args) {
        Manager<Programmer> programmersList = new Manager<>("Klara Catkin", Programmer.class);
        programmersList.add(new BackEndProgrammer("John Wick"));
        programmersList.add(new FrontEndProgrammer("Jack Jones"));
        programmersList.printList();

        System.out.println("-----------------");
        Manager<QATeam> qaTeamList = new Manager<>("Sigfrid Freud", QATeam.class);
        qaTeamList.add(new QAEngineer("Just Karen"));
        qaTeamList.add(new QALead("Morgan Freeman"));
        qaTeamList.printList();
    }
}
