package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ExternalLink
{
  private ExternalLinkCollection a;
  private zbti b;
  
  ExternalLink(ExternalLinkCollection links)
  {
    this.a = links;
  }
  
  void a(zbti paramzbti)
  {
    this.b = paramzbti;
  }
  
  zbti a()
  {
    return this.b;
  }
  
  public String getOriginalDataSource()
  {
    return this.b.j();
  }
  
  public void setOriginalDataSource(String value)
  {
    this.b.a(value, this.b.c(), 0);
  }
  
  public String getDataSource()
  {
    return this.b.a(this.a.a().p());
  }
  
  public void setDataSource(String value)
  {
    this.b.a(value, this.b.c(), 0);
  }
  
  public void addExternalName(String text, String referTo)
  {
    int i = text.lastIndexOf('!');
    String str = null;
    int j = -1;
    if (i != -1)
    {
      str = text.substring(0, 0 + i);
      if (str.charAt(0) == '\'') {
        str = str.substring(1, 1 + (str.length() - 2));
      }
      j = this.b.b(str);
      text = text.substring(i + 1);
    }
    if ((referTo == null) || (referTo.length() == 0)) {
      return;
    }
    if (referTo.charAt(0) == '=') {
      referTo = referTo.substring(1);
    }
    zwh localzwh1 = new zwh(this.b);
    localzwh1.a(text);
    localzwh1.c(j + 1);
    localzwh1.a(this.a.a(), referTo);
    if (this.b.b() == null) {
      this.b.a(new ArrayList());
    }
    for (int k = 0; k < this.b.b().size(); k++)
    {
      zwh localzwh2 = (zwh)this.b.b().get(k);
      if ((localzwh2.d() == j + 1) && (zw.a(localzwh2.e(), text, true) == 0))
      {
        this.b.b().set(k, localzwh1);
        return;
      }
    }
    zf.a(this.b.b(), localzwh1);
  }
  
  public boolean isReferred()
  {
    int i = b();
    return i > 0;
  }
  
  public boolean isVisible()
  {
    int i = b();
    return i == 1;
  }
  
  int b()
  {
    HashMap localHashMap1 = new HashMap();
    WorksheetCollection localWorksheetCollection = this.a.a();
    zbth localzbth = localWorksheetCollection.w();
    int i = -1;
    for (int j = 0; j < localzbth.getCount(); j++) {
      if (localzbth.a(j) == this.b)
      {
        i = j;
        break;
      }
    }
    j = 0;
    if (i == -1) {
      return 0;
    }
    zwq localzwq = localWorksheetCollection.r();
    for (int k = 0; k < localzwq.getCount(); k++)
    {
      zwp localzwp = localzwq.b(k);
      if ((localzwp.a & 0xFFFF) == i) {
        localHashMap1.put(Integer.valueOf(k), Integer.valueOf(k));
      }
    }
    HashMap localHashMap2 = new HashMap();
    Object localObject;
    for (int m = 0; m < localWorksheetCollection.getNames().getCount(); m++)
    {
      localObject = localWorksheetCollection.getNames().get(m);
      if ((((Name)localObject).b() != null) && (zaaq.a(((Name)localObject).b(), -1, -1, localWorksheetCollection, localHashMap1, localHashMap2))) {
        if (((Name)localObject).n()) {
          j = 2;
        } else {
          return 1;
        }
      }
    }
    for (m = 0; m < localWorksheetCollection.getCount(); m++)
    {
      localObject = localWorksheetCollection.get(m).getCells();
      Iterator localIterator = ((Iterable)localObject).iterator();
      while (localIterator.hasNext())
      {
        Cell localCell = (Cell)localIterator.next();
        if (localCell.g()) {
          if (localCell.F() != null)
          {
            if (zaaq.a(localCell.F().c(), -1, -1, localWorksheetCollection, localHashMap1, localHashMap2)) {
              return 1;
            }
          }
          else if (zaaq.a(localCell.v(), -1, -1, localWorksheetCollection, localHashMap1, localHashMap2)) {
            return 1;
          }
        }
      }
    }
    return j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ExternalLink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */