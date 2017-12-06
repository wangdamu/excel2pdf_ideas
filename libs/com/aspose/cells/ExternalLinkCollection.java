package com.aspose.cells;

import com.aspose.cells.b.a.zw;

public class ExternalLinkCollection
{
  private WorksheetCollection a;
  
  WorksheetCollection a()
  {
    return this.a;
  }
  
  ExternalLinkCollection(WorksheetCollection sheets)
  {
    this.a = sheets;
  }
  
  public int getCount()
  {
    zbth localzbth = this.a.w();
    if (localzbth == null) {
      return 0;
    }
    int i = 0;
    for (int j = 0; j < localzbth.getCount(); j++)
    {
      zbti localzbti = localzbth.a(j);
      if (localzbti.h()) {
        i++;
      }
    }
    return i;
  }
  
  public int add(String fileName, String[] sheetNames)
  {
    return add(0, fileName, sheetNames);
  }
  
  public int add(int directoryType, String fileName, String[] sheetNames)
  {
    zbti localzbti1 = new zbti();
    switch (directoryType)
    {
    case 2: 
      localzbti1.a(fileName, sheetNames, 3);
      break;
    case 1: 
      localzbti1.a(fileName, sheetNames, 2);
      break;
    case 3: 
      localzbti1.a(fileName, sheetNames, 4);
      break;
    default: 
      localzbti1.a(fileName, sheetNames, 0);
    }
    int i = 0;
    for (int j = 0; j < getCount(); j++)
    {
      zbti localzbti2 = get(j).a();
      if (zw.a(localzbti2.l(), fileName, true) == 0) {
        return i;
      }
      if (localzbti2.h()) {
        i++;
      }
    }
    this.a.w().a(localzbti1);
    return i;
  }
  
  public ExternalLink get(int index)
  {
    zbth localzbth = this.a.w();
    if (localzbth == null) {
      return null;
    }
    int i = 0;
    for (int j = 0; j < localzbth.getCount(); j++)
    {
      zbti localzbti = localzbth.a(j);
      if (localzbti.h())
      {
        if (i == index)
        {
          ExternalLink localExternalLink = new ExternalLink(this);
          localExternalLink.a(localzbti);
          return localExternalLink;
        }
        i++;
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ExternalLinkCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */