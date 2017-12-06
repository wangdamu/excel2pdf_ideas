package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.HashMap;

class zasz
{
  String a;
  ArrayList b;
  
  zasz(String paramString, ArrayList paramArrayList)
  {
    this.a = paramString;
    this.b = paramArrayList;
  }
  
  String a(HashMap paramHashMap)
  {
    if ((this.b == null) || (this.b.size() == 0)) {
      return this.a;
    }
    String str1 = null;
    String str2 = null;
    String str3 = null;
    int i = 0;
    for (int j = 0; j < this.b.size(); j++)
    {
      zatl localzatl = (zatl)this.b.get(j);
      if (localzatl.a.equals("value()>0"))
      {
        str1 = ((zasz)paramHashMap.get(localzatl.b)).a(paramHashMap);
        i++;
      }
      if (localzatl.a.equals("value()>=0"))
      {
        str1 = ((zasz)paramHashMap.get(localzatl.b)).a(paramHashMap);
        i += 2;
      }
      else if (localzatl.a.equals("value()<0"))
      {
        str2 = ((zasz)paramHashMap.get(localzatl.b)).a(paramHashMap);
        i++;
      }
      else if (localzatl.a.equals("value()=0"))
      {
        str3 = ((zasz)paramHashMap.get(localzatl.b)).a(paramHashMap);
        i++;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int k = 0;
    if (str1 != null)
    {
      localStringBuilder.append(str1);
      k = 1;
    }
    if (str2 != null)
    {
      if (k != 0) {
        localStringBuilder.append(';');
      } else {
        k = 1;
      }
      localStringBuilder.append(str2);
    }
    if (str3 != null)
    {
      if (k != 0) {
        localStringBuilder.append(';');
      } else {
        k = 1;
      }
      localStringBuilder.append(str3);
    }
    if (k != 0) {
      localStringBuilder.append(';');
    }
    if (i < 3) {
      localStringBuilder.append(this.a);
    } else {
      localStringBuilder.append('@');
    }
    this.a = zs.a(localStringBuilder);
    this.b = null;
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */