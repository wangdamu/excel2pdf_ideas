package com.aspose.cells;

import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zs;

class zgx
{
  static String a = "MMM|DD|DDD|YYYY|M/|/M|D/|D\\\\|/D|Y/|/Y|-M|M-|-D|D-|-Y|Y-|MM|M/D|D/M|M-D|D-M|^D$|\\[H\\]|H:MM|MM:SS|年|月|日|时|分|秒|MD";
  
  static boolean a(String paramString)
  {
    int i = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i);
    for (int j = 0; j < i; j++)
    {
      switch (paramString.charAt(j))
      {
      case '"': 
        j++;
      }
      while ((j < i) && (paramString.charAt(j) != '"'))
      {
        j++;
        continue;
        j++;
        while ((j < i) && (paramString.charAt(j) != '\''))
        {
          j++;
          continue;
          j++;
          break;
          j++;
          break;
          j++;
          break;
          localStringBuilder.append(paramString.charAt(j));
        }
      }
    }
    String str = zs.a(localStringBuilder);
    return ze.b(str, a, 66);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */