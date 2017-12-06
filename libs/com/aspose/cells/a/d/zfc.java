package com.aspose.cells.a.d;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class zfc
  extends zey
{
  private ArrayList a = new ArrayList();
  private zgm b = new zgm();
  
  public zfc(zdz paramzdz)
  {
    super(paramzdz);
  }
  
  public void a(String paramString, zey paramzey)
  {
    if (zw.b(paramString)) {
      throw new IllegalArgumentException("Name is null or empty");
    }
    if (this.b.b(paramString)) {
      throw new IllegalArgumentException("Name[" + paramString + "] is already exist.");
    }
    this.b.a(paramString, paramzey);
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    if ((this.a.size() > 0) && (this.b.b() > 0)) {
      throw new IllegalArgumentException("Invalid pdf name tree.");
    }
    paramzez.a(this);
    paramzez.g();
    Object localObject2;
    Object localObject3;
    if (this.a.size() > 0)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("[ ");
      localObject2 = this.a.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (zfc)((Iterator)localObject2).next();
        ((StringBuilder)localObject1).append(((zfc)localObject3).o());
        ((StringBuilder)localObject1).append(" ");
      }
      ((StringBuilder)localObject1).append("]");
      paramzez.a("/Kids", zs.a(localObject1));
    }
    if (this.b.b() > 0)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("[ ");
      localObject2 = this.b.c().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (String)((Iterator)localObject2).next();
        ((StringBuilder)localObject1).append("(" + (String)localObject3 + ")");
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append(((zey)this.b.d(localObject3)).o());
        ((StringBuilder)localObject1).append(" ");
      }
      ((StringBuilder)localObject1).append("]");
      paramzez.a("/Names", zs.a(localObject1));
    }
    paramzez.h();
    paramzez.b();
    Object localObject1 = this.a.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zfc)((Iterator)localObject1).next();
      ((zfc)localObject2).a(paramzez);
    }
    localObject1 = this.b.f().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zey)((Iterator)localObject1).next();
      ((zey)localObject2).a(paramzez);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */