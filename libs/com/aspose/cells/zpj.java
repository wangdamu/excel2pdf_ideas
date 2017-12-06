package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zpj
{
  ArrayList a = new ArrayList();
  HashMap b = new HashMap();
  
  static zpj a(Workbook paramWorkbook)
  {
    zpj localzpj = new zpj();
    ArrayList localArrayList = paramWorkbook.getWorksheets().A();
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      Font localFont1 = (Font)localIterator.next();
      int i = 0;
      for (int j = 0; j < localzpj.a.size(); j++)
      {
        Font localFont2 = (Font)localzpj.a.get(j);
        if ((localFont1.a(localFont2)) && (localFont1.n() == localFont2.n()))
        {
          i = 1;
          if (localzpj.b.containsKey(Integer.valueOf(localFont1.m()))) {
            break;
          }
          localzpj.b.put(Integer.valueOf(localFont1.m()), Integer.valueOf(j));
          break;
        }
      }
      if (i == 0)
      {
        j = zf.a(localzpj.a, localFont1);
        if (!localzpj.b.containsKey(Integer.valueOf(localFont1.m()))) {
          localzpj.b.put(Integer.valueOf(localFont1.m()), Integer.valueOf(j));
        }
      }
    }
    return localzpj;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */