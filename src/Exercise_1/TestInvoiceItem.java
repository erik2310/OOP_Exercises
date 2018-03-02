package Exercise_1;

public class TestInvoiceItem {

    public static void main(String[] args) {

        // Laver et InvoiceItem objekt ved at kalde på dens constructor.
        InvoiceItem invoiceItem = new InvoiceItem("123456", "Et invoice item.", 10, 12.50);

        // Henter dens id og udskriver den
        System.out.println(invoiceItem.getId());

        // Henter dens beskrivelse og udskriver den
        System.out.println(invoiceItem.getDesc());

        // Sætter dens qty
        invoiceItem.setQty(20);

        // Henter dens qty
        System.out.println(invoiceItem.getQty());

        // Sætter dens unitPrice
        invoiceItem.setUnitPrice(10.0);

        // Henter dens unitPrice
        System.out.println(invoiceItem.getUnitPrice());

        // Henter dens total ved at gange unitPrice med qty
        System.out.println(invoiceItem.getTotal());

        // Udskriver InvoiceItem toString
        System.out.println(invoiceItem.toString());

    }

}
