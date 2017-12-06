package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import java.util.ArrayList;
import java.util.Iterator;

class zaeq
{
  private ArrayList d = new ArrayList();
  public float a = 0.0F;
  public float b = 0.0F;
  public float c = 0.0F;
  
  public void a(zaes paramzaes)
  {
    zf.a(this.d, paramzaes);
    this.b += paramzaes.b;
    if (this.a < paramzaes.a) {
      this.a = paramzaes.a;
    }
    if (this.c < paramzaes.c) {
      this.c = paramzaes.c;
    }
  }
  
  boolean a()
  {
    return this.d.size() > 0;
  }
  
  public void a(zb[] paramArrayOfzb, zo paramzo)
    throws Exception
  {
    float f1 = paramzo.d();
    float f2 = 0.0F;
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      zaes localzaes = (zaes)localIterator.next();
      f2 = paramzo.e() + this.c;
      localzaes.a(paramArrayOfzb, new zo(f1, f2));
      f1 += localzaes.b;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */