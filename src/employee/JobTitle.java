package employee;

public enum JobTitle {


    LECTOR(250000),
    INSPECTOR(150000),
    GROUP_OWNER(80000),
    INTERN(0);

    private int defaultSalary;

    JobTitle(int defaultSalary) {
        this.defaultSalary = defaultSalary;
    }

    public int defaultSalary() {
        return defaultSalary;
    }

}
