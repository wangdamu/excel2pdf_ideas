package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import java.util.Iterator;

public class TableStyle
{
  private String a;
  private TableStyleCollection b;
  private TableStyleElementCollection c;
  private boolean d = true;
  private boolean e = true;
  
  TableStyleCollection a()
  {
    return this.b;
  }
  
  boolean b()
  {
    if (zw.b(this.a)) {
      return false;
    }
    if (zw.b(a().a(), this.a)) {
      return true;
    }
    Iterator localIterator1 = a().a.iterator();
    while (localIterator1.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator1.next();
      Iterator localIterator2;
      Object localObject;
      if (localWorksheet.d != null)
      {
        localIterator2 = localWorksheet.d.iterator();
        while (localIterator2.hasNext())
        {
          localObject = (ListObject)localIterator2.next();
          if (zw.b(((ListObject)localObject).getTableStyleName(), this.a)) {
            return true;
          }
        }
      }
      if (localWorksheet.b != null)
      {
        localIterator2 = localWorksheet.b.iterator();
        while (localIterator2.hasNext())
        {
          localObject = (PivotTable)localIterator2.next();
          if (zw.b(((PivotTable)localObject).getPivotTableStyleName(), this.a)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  TableStyle(TableStyleCollection styles, String name)
  {
    this.a = name;
    this.b = styles;
    this.c = new TableStyleElementCollection(this);
  }
  
  void a(TableStyle paramTableStyle, CopyOptions paramCopyOptions)
  {
    this.a = paramTableStyle.a;
    this.d = paramTableStyle.d;
    this.e = paramTableStyle.e;
    this.c = new TableStyleElementCollection(this);
    this.c.a(paramTableStyle.c, paramCopyOptions);
  }
  
  public String getName()
  {
    return this.a;
  }
  
  public TableStyleElementCollection getTableStyleElements()
  {
    return this.c;
  }
  
  void a(TableStyleElementCollection paramTableStyleElementCollection)
  {
    this.c = paramTableStyleElementCollection;
  }
  
  boolean c()
  {
    return this.d;
  }
  
  void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  boolean d()
  {
    return this.e;
  }
  
  void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  void a(int paramInt1, int paramInt2, Style paramStyle)
  {
    if (this.c == null) {
      this.c = new TableStyleElementCollection(this);
    }
    TableStyleElement localTableStyleElement = new TableStyleElement(this.c, paramInt1);
    localTableStyleElement.setSize(paramInt2);
    localTableStyleElement.a(paramStyle);
    this.c.a(localTableStyleElement);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TableStyle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */