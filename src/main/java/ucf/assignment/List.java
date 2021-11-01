package ucf.assignment;

public class List
{
    String title;
    public Item newItem()
    {
        return new Item();
    }
    public String getTitle()
    {
        return this.title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
}
