import java.util.*;

public class Book{
  private String title;
  private Date publishDate;
  private String Comment;
  public int hashCode(){
    int r = 1;
    r = 31 * r +publishDate.hashCode();
    r = 31 * r + title.hashCode();
    return r;
  }

  public boolean
}