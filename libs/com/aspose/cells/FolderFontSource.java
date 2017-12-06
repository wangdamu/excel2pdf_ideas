package com.aspose.cells;

import com.aspose.cells.a.c.zz;
import com.aspose.cells.a.d.zau;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class FolderFontSource
  extends FontSourceBase
{
  private String a;
  private boolean b;
  
  public FolderFontSource(String folderPath, boolean scanSubfolders)
  {
    this.a = folderPath;
    this.b = scanSubfolders;
  }
  
  public String getFolderPath()
  {
    return this.a;
  }
  
  public boolean getScanSubFolders()
  {
    return this.b;
  }
  
  public int getType()
  {
    return 1;
  }
  
  FontSourceBase a()
  {
    return new FolderFontSource(this.a, getScanSubFolders());
  }
  
  ArrayList b()
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    zz.a(this.a, Boolean.valueOf(this.b), localArrayList2);
    Iterator localIterator = localArrayList2.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      zf.a(localArrayList1, new zau(str));
    }
    return localArrayList1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FolderFontSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */