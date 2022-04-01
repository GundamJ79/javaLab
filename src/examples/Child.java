package examples;

public class Child extends Person {

    private double weightBirth;
    private boolean premature;

    private Child() {
        super();
    }
    public Child(String name, String surname, double weightBirth, boolean premature){
        super(name, surname);
        this.weightBirth = weightBirth;
        this.premature = premature;
    }

    public double getWeightBirth() {
        return weightBirth;
    }

    public void setWeightBirth(double weightBirth) {
        this.weightBirth = weightBirth;
    }

    public boolean isPremature() {
        return premature;
    }

    public void setPremature(boolean premature) {
        this.premature = premature;
    }

    @Override
    public String toString() {
        return "Child{" +
                "weightBirth=" + weightBirth +
                ", premature=" + premature +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
