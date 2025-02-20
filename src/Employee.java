interface Employee {
    String getRole();
    String getName();
}


abstract class Programmer implements Employee {
    @Override
    public String getRole() {
        return "Programmer";
    }
}

class BackEndProgrammer extends Programmer {
    private final String name;
    public BackEndProgrammer(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getRole() {
        return "BackEnd Programmer";
    }
}

class FrontEndProgrammer extends Programmer {
    private final String name;
    public FrontEndProgrammer(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getRole() {
        return "FrontEnd Programmer";
    }
}


abstract class QATeam implements Employee {
    @Override
    public String getRole() {
        return "QA Team";
    }
}

class QALead extends QATeam {
    private final String name;
    public QALead(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getRole() {
        return "QA Lead";
    }
}

class QAEngineer extends QATeam {
    private final String name;
    public QAEngineer(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getRole() {
        return "QA Engineer";
    }
}
