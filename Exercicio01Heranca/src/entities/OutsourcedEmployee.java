package entities;

public class OutsourcedEmployee extends Employee{
    private double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + 1.1 * additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }   
}