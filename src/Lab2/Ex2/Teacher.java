package Lab2.Ex2;

public class Teacher {

    private long id;
    private String name;
    private JobTitle jobTitle;
    private Faculty faculty;

    private String degree;
    private double salary;
    private Integer yearBirth;
    private Integer yearStartWorking;
    private Boolean isGraduate;

    public Teacher() {

    }

    public Teacher(long id,
                   String name,
                   JobTitle jobTitle,
                   Faculty faculty,
                   String degree,
                   double salary,
                   Integer yearBirth,
                   Boolean isGraduate)

    {
        this.id= id;
        this.name = name;
        this.jobTitle = jobTitle ;
        this.faculty = faculty ;
        this.degree = degree ;
        this.salary = salary;
        this.yearBirth = yearBirth;
        this.isGraduate = isGraduate;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String firstName) {
        this.name = name;
    }
    public JobTitle getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }
    public Faculty getFaculty() { return faculty; }
    public void setFaculty(Faculty faculty) { this.faculty = faculty; }
    public String degree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public Integer getYearBirth() { return yearBirth; }
    public void setYearBirth(Integer yearBirth) { this.yearBirth = yearBirth; }
    public Boolean getIsGraduate() { return isGraduate; }
    public void setIsGraduate(Boolean isGraduate) { this.isGraduate = isGraduate; }



    public String toString() {
        return "ID: " + id + "\n" +
                "имя: " + name + "\n" +
                "факультет: " + faculty + "\n" +
                "должность: " + jobTitle + "\n" +
                "ученая степень: " + degree + "\n" +
                "зарплата: " + salary + "\n" +
                "год рождения: " +yearBirth+ "\n" +
                "есть дипломники: " + (isGraduate? "Да" : "Нет")+"\n";
    }

    public String getInfoSalary(int percent) {
        double bonus = salary * (percent/ 100.0);
        return "Преподаватель: "+ jobTitle + " " + degree + " " +  name +  "\n" +
                "Зарплата: " + salary + " рублей," + "\n" +
                "Премия - " + bonus + " рублей" + "\n"+
                "Зарплата+премия - " + (salary+bonus) + " рублей" + "\n";
    }


}
