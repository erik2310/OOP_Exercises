package Exercise_1;

public class InvoiceItem {

    // Laver klassens attributes

    // Deklarer double , int, String datatyper
    private String id, desc;
    private int qty;
    private double unitPrice;

    // Laver klassens metoder

    // En constructor der tager imod id, desc, qty og unitPrice arguments
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // En metode der returner id
    public String getId() {
        return id;
    }

    // En metode der returner desc
    public String getDesc() {
        return desc;
    }

    // En metode der returner qty
    public int getQty() {
        return qty;
    }

    // En metode der sætter qty
    public void setQty(int qty) {
        this.qty = qty;
    }

    // En metode der returner unitPrice
    public double getUnitPrice() {
        return unitPrice;
    }

    // En metode der sætter unitPrice
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // En metode der returner total ved at gange unitPrice med qty
    public double getTotal() {
        return unitPrice * qty;
    }

    // Returnerer klassens datatyper som en String
    @Override
    public String toString() {
        return "Exercise_1.InvoiceItem[" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ']';
    }
}
