package com.aspose.cells.b.b;

import com.aspose.cells.DateTime;
import java.util.Calendar;

public class za
{
  public static long a(DateTime paramDateTime)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(paramDateTime.getYear(), paramDateTime.getMonth() - 1, paramDateTime.getDay(), paramDateTime.getHour(), paramDateTime.getMinute(), paramDateTime.getSecond());
    return localCalendar.getTimeInMillis();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/b/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */