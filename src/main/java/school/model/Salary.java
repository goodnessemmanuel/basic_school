package school.model;

import java.util.List;
import java.util.Map;

/**
 * this class is responsible for the payment of staff salary
 */
public class Salary
{
    private final StaffLevel staffLevel;

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
            break;

            case LEVEL_9: amountDue = 80_000;
            break;

            case LEVEL_10: amountDue = 100_000;
            break;

            case LEVEL_11: amountDue = 120_000;
            break;

            case LEVEL_12: amountDue = 140_000;
            break;
        }

        return amountDue;
    }

}
