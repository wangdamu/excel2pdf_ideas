package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class zcjo
  extends zcju
{
  private String b;
  private String c;
  private ArrayList d = new ArrayList();
  
  public zcjo(zcjs paramzcjs, String paramString)
  {
    super(paramzcjs);
    this.b = paramString;
    a(paramzcjs);
  }
  
  public zcjo(zcjs paramzcjs, String paramString1, String paramString2)
  {
    super(paramzcjs);
    this.b = paramString2;
    this.c = paramString1;
    a(paramzcjs);
  }
  
  public Iterator iterator()
  {
    return this.d.iterator();
  }
  
  public int a()
  {
    return this.d.size();
  }
  
  public zcjs a(String paramString)
  {
    for (int i = 0; i < this.d.size(); i++)
    {
      zcjs localzcjs = (zcjs)this.d.get(i);
      if (zw.b(localzcjs.k(), paramString)) {
        return localzcjs;
      }
    }
    return null;
  }
  
  public zcjs a(int paramInt)
  {
    return (zcjs)this.d.get(paramInt);
  }
  
  private void a(zcjs paramzcjs)
  {
    for (zcjs localzcjs = paramzcjs.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1)
      {
        if (zw.b(localzcjs.g, this.b)) {
          if (this.c != null)
          {
            if (zw.b(this.c, localzcjs.f))
            {
              zf.a(this.d, localzcjs);
              continue;
            }
          }
          else
          {
            zf.a(this.d, localzcjs);
            continue;
          }
        }
        a(localzcjs);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */