package school.model;

public class Course
{
    //declaration of member variables
    private int id;
    private String title;
    private String description;

    public Course ()
    {
        this(0, "default", "default");
    }
    //constructor to initialize course with the specify parameter
    public Course(int id, String title, String description)
    {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    //create getters and setters to enhance interaction with objects of this class
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    //when to string method is called on this class, join each fields as string and return it
    @Override
    public String toString() {
        return "Course{" +
                "id: " + id +
                ", title: '" + title + '\'' +
                ", description: '" + description + '\'' +
                '}';
    }
}
