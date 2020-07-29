package school.model;

import java.util.List;
import java.util.Map;

public class Salary
{
    private StaffLevel staffLevel;

    public Salary(StaffLevel staffLevel)
    {
        this.staffLevel = staffLevel;
    }

    /**
     * @return amount to pay a staff salary base on their level
     */
    public int payStaff()
    {
        int amountDue = 0;
        switch (staffLevel)
        {
            case LEVEL_6: amountDue = 30_000;
            break;
            case LEVEL_7: amountDue = 50_000;
            break;
            case LEVEL_8: amountDue = 60_000;
        }

        return amountDue;
    }

}
