import java.util.ArrayList;
import java.util.List;

class Manager<T extends Employee> {
    private List<T> team;
    private Class<T> specialization;

    public Manager(Class<T> specialization) {
        this.team = new ArrayList<>();
        this.specialization = specialization;
    }

    public void add(T member) {
        if (specialization.isInstance(member)) {
            team.add(member);
            System.out.println(" + " + member.getRole() + " \"" + member.getName() + "\" добавлен в команду.");
        }
    }

    public void printList() {
        System.out.println("Команда: " + specialization.getName());
        for (T member : team) {
            System.out.println(" - " + member.getRole() + " \"" + member.getName() + "\"");
        }
    }
}