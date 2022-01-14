package DS_assignment3;

public class Marketing {

    private String employeeName;
    private String productName;
    private int salesAmount;

    public Marketing() {
    }

    public Marketing(String employeeName, String productName, int salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
