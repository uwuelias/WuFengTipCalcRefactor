public class TipCalculator {
    private double totalBillBeforeTip;
    private int tipPercentage;
    private int numPeople;
    private double tipperperson;
    private double totalperperson;

    public TipCalculator(double bill, int tip, int people) {
        this.totalBillBeforeTip = bill;
        this.tipPercentage = tip;
        this.numPeople = people;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipPercentage() {
        return tipPercentage*0.01;
    }

    public double tipAmount() {
        double tipamount = getTipPercentage()*totalBillBeforeTip;
        return tipamount;
    }

    public double totalBill() {
        return tipAmount() + getTotalBillBeforeTip();
    }

    public double perPersonCostBeforeTip() {
            return totalBillBeforeTip/numPeople;
    }

    public double perPersonTipAmount() {
        return (totalBillBeforeTip * tipPercentage *0.01 / numPeople);
    }

    public double perPersonTotalCost() {
        return perPersonCostBeforeTip() + perPersonTipAmount();
    }
}
