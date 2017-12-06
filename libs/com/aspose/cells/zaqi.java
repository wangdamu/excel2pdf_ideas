package com.aspose.cells;

import com.aspose.cells.b.a.a.zd;
import java.util.HashMap;

class zaqi
{
  static HashMap a(WorksheetCollection paramWorksheetCollection)
  {
    zd localzd = new zd();
    HashMap localHashMap = new HashMap();
    NameCollection localNameCollection = paramWorksheetCollection.getNames();
    Object localObject1;
    for (int i = 0; i < localNameCollection.getCount(); i++)
    {
      localObject1 = localNameCollection.get(i);
      String str;
      if (((Name)localObject1).getSheetIndex() == 0)
      {
        str = ((Name)localObject1).getText() + "~";
      }
      else
      {
        localObject2 = paramWorksheetCollection.get(((Name)localObject1).getSheetIndex() - 1).getName().toUpperCase();
        str = ((Name)localObject1).getText() + "!" + (String)localObject2;
      }
      Object localObject2 = new zaqj((Name)localObject1);
      ((zaqj)localObject2).b = i;
      localzd.b(str, localObject2);
    }
    localNameCollection.b();
    for (i = 0; i < localzd.b(); i++)
    {
      localObject1 = (zaqj)localzd.b(i);
      localNameCollection.a(((zaqj)localObject1).a, false);
      localHashMap.put(Integer.valueOf(((zaqj)localObject1).b), Integer.valueOf(i));
    }
    return localHashMap;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */