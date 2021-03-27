public enum InvoiceStatus
{
    Ongoing("Ongoing"), 
    Finished("Finished"),
    Cancelled("Cancelled");
    
    private String status;
    
    InvoiceStatus(String status) 
    {
        this.status = status;
    }
    @Override
    public String toString() 
    {
        return status;
    }
}