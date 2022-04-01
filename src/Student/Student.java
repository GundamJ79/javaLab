package Student;

import examples.Person;

public class Student extends Person {

    public String writing;
    public String reading;
    public String speech;
    public Integer averageGrades;

    public Student() {
        super();
    }

    public Student(String name, String surname, String writing,
                   String reading,
                   String speech,
                   Integer averageGrades) {
        super(name, surname);
        this.writing = writing;
        this.reading = reading;
        this.speech = speech;
        this.averageGrades = averageGrades;
    }

    public String getWriting() {
        return writing;
    }

    public void setWriting(String writing) {
        this.writing = writing;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public Integer getAverageGrades() {
        return averageGrades;
    }

    public void setAverageGrades(Integer averageGrades) {
        this.averageGrades = averageGrades;
    }

    @Override
    public String toString() {
        return "Student{" + ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                "writing='" + writing + '\'' +
                ", reading='" + reading + '\'' +
                ", speech='" + speech + '\'' +
                ", averageGrades=" + averageGrades +

                '}';
    }
}
