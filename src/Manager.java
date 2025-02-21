import java.util.ArrayList;
import java.util.List;

class Manager<T extends Employee> {
    private final String name;
    private List<T> team;
    private Class<T> specialization;

    public Manager(String name, Class<T> specialization) {
        this.name = name;
        this.team = new ArrayList<>();
        this.specialization = specialization;
    }

    public void add(T member) {
            team.add(member);
            System.out.printf(" + %s \"%s\" добавлен в команду.\n", member.getRole(), member.getName());
    }

    public void printList() {
        System.out.printf("Команда: %s, Менеджер: %s\n", specialization.getSimpleName(), name);
        for (T member : team) {
            System.out.printf(" - %s \"%s\"\n", member.getRole(), member.getName());
        }
    }
}