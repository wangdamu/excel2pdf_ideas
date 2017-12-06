package com.aspose.cells;

import com.aspose.cells.b.a.g.a.zc;
import com.aspose.cells.b.a.g.a.zd;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zs;

final class zgy
{
  static String a(zzx paramzzx, Object paramObject, String paramString)
  {
    String str = paramString;
    if (paramObject == null) {
      return "";
    }
    if ((str != null) && ("".equals(str))) {
      str = null;
    }
    if ((str != null) && ("standard".equals(str.toLowerCase()))) {
      str = "General";
    }
    zzz localzzz = paramzzx.a(str, paramObject, false);
    return localzzz.a(0, true);
  }
  
  static boolean a(zzx paramzzx, String paramString, Object paramObject)
  {
    if (paramString == null) {
      return false;
    }
    zahf localzahf = paramzzx.a(paramString, false);
    int i = paramzzx.a(localzahf, paramObject);
    return i == 3;
  }
  
  static String a(zzx paramzzx, DateTime paramDateTime, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return a(paramzzx, paramDateTime, paramString);
    }
    if (!a(paramDateTime)) {
      return a(paramzzx, paramDateTime, paramString);
    }
    boolean bool = a(paramzzx, paramString, paramDateTime);
    if (!bool) {
      return a(paramzzx, paramDateTime, paramString);
    }
    String str1 = a(paramzzx, paramDateTime.addDays(1.0D), paramString);
    ze localze = new ze("d+");
    zd localzd = localze.b(paramString);
    if ((localzd.a() > 0) && (localzd.a(localzd.a() - 1).d() <= str1.length()))
    {
      int i = 0;
      StringBuilder localStringBuilder = new StringBuilder();
      for (int j = 0; j < localzd.a(); j++)
      {
        if (localzd.a(j).d() > i)
        {
          String str2 = str1.substring(i, i + (localzd.a(j).d() - i));
          localStringBuilder.append(str2);
        }
        for (int k = 0; k < localzd.a(j).a().length(); k++) {
          localStringBuilder.append('0');
        }
        i = localzd.a(j).d() + localzd.a(j).a().length();
        if ((j == localzd.a() - 1) && (i <= str1.length() - 1))
        {
          String str3 = str1.substring(i, i + (str1.length() - i));
          localStringBuilder.append(str3);
        }
      }
      return zs.a(localStringBuilder);
    }
    return str1;
  }
  
  private static boolean a(DateTime paramDateTime)
  {
    return (paramDateTime.getYear() == 1899) && (paramDateTime.getMonth() == 12) && (paramDateTime.getDay() == 31);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */