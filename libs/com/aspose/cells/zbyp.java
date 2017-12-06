package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.d.zo;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import java.util.Iterator;

class zbyp
{
  private zaoz a;
  private VbaProject b;
  private zaoz c;
  
  zbyp(VbaProject paramVbaProject, zaoz paramzaoz)
  {
    this.b = paramVbaProject;
    this.c = paramzaoz;
    this.a = paramzaoz.b("VBA");
    if (this.a == null)
    {
      this.a = new zaoz(com.aspose.cells.b.a.zh.a);
      paramzaoz.a("VBA", this.a);
    }
  }
  
  void a()
    throws Exception
  {
    d();
    e();
    f();
    b();
    c();
  }
  
  private void b()
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    a(localzh, 1, this.b.c);
    a(localzh, 2, 1033);
    a(localzh, 20, 1033);
    a(localzh, 3, (short)this.b.d.i());
    a(localzh, 4, this.b.f, true);
    a(localzh, 5, this.b.g, true);
    a(localzh, 64, this.b.g, false);
    a(localzh, 6, this.b.h, true);
    a(localzh, 61, this.b.i, true);
    a(localzh, 7, this.b.j);
    a(localzh, 8, this.b.k);
    Object localObject1 = new byte[12];
    localObject1[0] = 9;
    localObject1[2] = 4;
    System.arraycopy(zc.a(this.b.l), 0, localObject1, 6, 4);
    System.arraycopy(zc.a(this.b.m), 0, localObject1, 10, 2);
    localzh.b((byte[])localObject1, 0, localObject1.length);
    a(localzh, 12, this.b.n, true);
    a(localzh, 60, this.b.n, false);
    Object localObject2;
    if (this.b.o != null)
    {
      localObject1 = this.b.o.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (VbaProjectReference)((Iterator)localObject1).next();
        a(localzh, (VbaProjectReference)localObject2);
      }
    }
    a(localzh, 15, (short)this.b.getModules().getCount());
    a(localzh, 19, this.b.getModules().a);
    localObject1 = this.b.getModules().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (VbaModule)((Iterator)localObject1).next();
      a(localzh, 25, ((VbaModule)localObject2).a, true);
      a(localzh, 71, ((VbaModule)localObject2).a, false);
      a(localzh, 26, ((VbaModule)localObject2).c, true);
      a(localzh, 50, ((VbaModule)localObject2).c, false);
      a(localzh, 28, ((VbaModule)localObject2).d, true);
      a(localzh, 72, ((VbaModule)localObject2).d, false);
      a(localzh, 49, ((VbaModule)localObject2).e);
      a(localzh, 30, ((VbaModule)localObject2).f);
      a(localzh, 44, (short)((VbaModule)localObject2).g);
      a(localzh, ((VbaModule)localObject2).h == 0 ? 33 : 34);
      if (((VbaModule)localObject2).i) {
        a(localzh, 37);
      }
      if (((VbaModule)localObject2).j) {
        a(localzh, 40);
      }
      a(localzh, 43);
    }
    a(localzh, 16);
    localzh.b();
    localzh.a(0L, 0);
    localObject1 = zbyq.b(localzh, 0);
    this.a.a("dir", localObject1);
  }
  
  private void a(zm paramzm, VbaProjectReference paramVbaProjectReference)
    throws Exception
  {
    a(paramzm, 22, paramVbaProjectReference.getName(), true);
    a(paramzm, 62, paramVbaProjectReference.getName(), false);
    switch (paramVbaProjectReference.a)
    {
    case 0: 
      a(paramzm, paramVbaProjectReference, 13, paramVbaProjectReference.getLibid());
      break;
    case 2: 
      a(paramzm, paramVbaProjectReference, 14, paramVbaProjectReference.getLibid());
      break;
    case 1: 
      if (paramVbaProjectReference.getLibid() != null) {
        a(paramzm, paramVbaProjectReference, 51, paramVbaProjectReference.getLibid());
      }
      if (paramVbaProjectReference.getTwiddledlibid() != null) {
        a(paramzm, paramVbaProjectReference, 47, paramVbaProjectReference.getTwiddledlibid());
      }
      if (paramVbaProjectReference.getExtendedLibid() != null) {
        a(paramzm, paramVbaProjectReference, 48, paramVbaProjectReference.getExtendedLibid());
      }
      break;
    }
  }
  
  private void a(zm paramzm, VbaProjectReference paramVbaProjectReference, int paramInt, String paramString)
    throws Exception
  {
    int i = 6;
    byte[] arrayOfByte1 = this.b.d.a(paramString);
    i += 4 + arrayOfByte1.length;
    if (paramInt == 51) {
      i -= 4;
    } else {
      i += 6;
    }
    byte[] arrayOfByte2 = null;
    if (paramInt == 14)
    {
      arrayOfByte2 = this.b.d.a(paramVbaProjectReference.getRelativeLibid());
      i += 4 + arrayOfByte2.length;
    }
    if (paramInt == 48) {
      i += 20;
    }
    byte[] arrayOfByte3 = new byte[i];
    int j = 0;
    arrayOfByte3[0] = ((byte)paramInt);
    j += 2;
    System.arraycopy(zc.a(i - 6), 0, arrayOfByte3, j, 4);
    j += 4;
    if (paramInt != 51)
    {
      System.arraycopy(zc.a(arrayOfByte1.length), 0, arrayOfByte3, j, 4);
      j += 4;
    }
    System.arraycopy(arrayOfByte1, 0, arrayOfByte3, j, arrayOfByte1.length);
    j += arrayOfByte1.length;
    if (paramInt == 14)
    {
      System.arraycopy(zc.a(arrayOfByte2.length), 0, arrayOfByte3, j, 4);
      j += 4;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, j, 4);
      j += arrayOfByte2.length;
      System.arraycopy(zc.a(this.b.l), 0, arrayOfByte3, j, 4);
      j += 4;
      System.arraycopy(zc.a(this.b.m), 0, arrayOfByte3, j, 2);
      j += 2;
    }
    else
    {
      j += 6;
      if (paramInt == 48)
      {
        System.arraycopy(paramVbaProjectReference.f, 0, arrayOfByte3, j, 16);
        j += 16;
        System.arraycopy(zc.a(paramVbaProjectReference.g), 0, arrayOfByte3, j, 4);
        j += 4;
      }
    }
    paramzm.b(arrayOfByte3, 0, i);
  }
  
  private void a(zm paramzm, int paramInt)
    throws Exception
  {
    byte[] arrayOfByte = new byte[6];
    System.arraycopy(zc.a(paramInt), 0, arrayOfByte, 0, 2);
    paramzm.b(arrayOfByte, 0, 6);
  }
  
  private void a(zm paramzm, int paramInt, short paramShort)
    throws Exception
  {
    byte[] arrayOfByte = new byte[8];
    System.arraycopy(zc.a(paramInt), 0, arrayOfByte, 0, 2);
    arrayOfByte[2] = 2;
    System.arraycopy(zc.a(paramShort), 0, arrayOfByte, 6, 2);
    paramzm.b(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private void a(zm paramzm, int paramInt1, int paramInt2)
    throws Exception
  {
    byte[] arrayOfByte = new byte[10];
    System.arraycopy(zc.a(paramInt1), 0, arrayOfByte, 0, 2);
    arrayOfByte[2] = 4;
    System.arraycopy(zc.a(paramInt2), 0, arrayOfByte, 6, 4);
    paramzm.b(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private void a(zm paramzm, int paramInt, String paramString, boolean paramBoolean)
    throws Exception
  {
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = null;
    if ((paramString != null) && (!"".equals(paramString))) {
      if (paramBoolean) {
        arrayOfByte2 = this.b.d.a(paramString);
      } else {
        arrayOfByte2 = Encoding.getUnicode().a(paramString);
      }
    }
    arrayOfByte1 = new byte[arrayOfByte2 == null ? 6 : 6 + arrayOfByte2.length];
    System.arraycopy(zc.a(paramInt), 0, arrayOfByte1, 0, 2);
    if (arrayOfByte2 != null)
    {
      System.arraycopy(zc.a(arrayOfByte2.length), 0, arrayOfByte1, 2, 4);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 6, arrayOfByte2.length);
    }
    paramzm.b(arrayOfByte1, 0, arrayOfByte1.length);
  }
  
  private void c()
    throws Exception
  {
    Iterator localIterator = this.b.getModules().iterator();
    while (localIterator.hasNext())
    {
      VbaModule localVbaModule = (VbaModule)localIterator.next();
      Object localObject1 = null;
      Object localObject2;
      if (localVbaModule.k != null)
      {
        localObject1 = new com.aspose.cells.b.a.d.zh(localVbaModule.k);
      }
      else
      {
        localVbaModule.l = zbyq.a(localVbaModule);
        localObject1 = new com.aspose.cells.b.a.d.zh();
        localObject2 = new zo((zm)localObject1, this.b.d);
        ((zo)localObject2).a(localVbaModule.l);
        ((zo)localObject2).c();
        ((zm)localObject1).a(0L, 0);
        localObject1 = zbyq.b((zm)localObject1, 0);
      }
      this.a.a(localVbaModule.c, localObject1);
      if (localVbaModule.o != null)
      {
        localObject2 = new com.aspose.cells.b.a.d.zh(localVbaModule.o);
        try
        {
          zxf localzxf = new zxf((zm)localObject2);
          localzxf.a().a("\003VBFrame", new com.aspose.cells.b.a.d.zh(this.b.d.a(localVbaModule.r)));
          this.c.a(localVbaModule.c, localzxf.a());
        }
        finally
        {
          if (localObject2 != null) {
            ((com.aspose.cells.b.a.d.zh)localObject2).a();
          }
        }
      }
    }
  }
  
  private void d()
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    zo localzo = new zo(localzh, this.b.d);
    this.c.a("PROJECT", localzh);
    zn localzn = new zn(localzh);
    zbym localzbym = new zbym();
    localzbym.a("ID", "\"" + this.b.t + "\"");
    for (int i = 0; i < this.b.getModules().getCount(); i++)
    {
      VbaModule localVbaModule = this.b.getModules().get(i);
      switch (localVbaModule.h)
      {
      case 2: 
        localzbym.a("Class", localVbaModule.a);
        break;
      case 3: 
        localzbym.a("BaseClass", localVbaModule.a);
        break;
      case 0: 
        localzbym.a("Module", localVbaModule.a);
        break;
      case 1: 
      default: 
        localzbym.a("Document", localVbaModule.a + "/&H" + zp.d(localVbaModule.b));
      }
    }
    if (this.b.x != null) {
      localzbym.a(this.b.x);
    }
    if ((this.b.h != null) && (!"".equals(this.b.h))) {
      localzbym.a("HelpFile", "\"" + this.b.h + "\"");
    }
    if (this.b.e != null) {
      localzbym.a("ExeName32", this.b.e);
    }
    localzbym.a("Name", "\"" + this.b.getName() + "\"");
    localzbym.a("HelpContextID", "\"" + zp.a(this.b.j) + "\"");
    localzbym.a("VersionCompatible32", "\"" + this.b.u + "\"");
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[0] = ((byte)(this.b.v & 0xFF & 0x7));
    localzbym.a("CMG", "\"" + zbyq.a(arrayOfByte, this.b.t) + "\"");
    arrayOfByte = this.b.w == null ? new byte[1] : this.b.w.a();
    localzbym.a("DPB", "\"" + zbyq.a(arrayOfByte, this.b.t) + "\"");
    arrayOfByte = new byte[1];
    arrayOfByte[0] = ((byte)(this.b.d() ? 'ÿ' : 0));
    localzbym.a("GC", "\"" + zbyq.a(arrayOfByte, this.b.t) + "\"");
    Object localObject;
    for (int j = 0; j < localzbym.getCount(); j++)
    {
      localObject = localzbym.a(j);
      localzo.a(((zbyl)localObject).a);
      localzo.a('=');
      localzo.a(((zbyl)localObject).b);
      localzo.a("\r\n");
    }
    localzo.a("\r\n");
    localzbym = this.b.y;
    if ((localzbym != null) && (localzbym.getCount() > 0))
    {
      localzo.a("[Host Extender Info]");
      localzo.a("\r\n");
      for (j = 0; j < localzbym.getCount(); j++)
      {
        localObject = localzbym.a(j);
        localzo.a(((zbyl)localObject).a);
        localzo.a('=');
        localzo.a(((zbyl)localObject).b);
        localzo.a("\r\n");
      }
    }
    localzo.a("\r\n");
    if (this.b.getModules().a())
    {
      localzo.a("[Workspace]");
      localzo.a("\r\n");
      for (j = 0; j < this.b.getModules().getCount(); j++)
      {
        localObject = this.b.getModules().get(j).m;
        if (localObject != null)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(this.b.getModules().get(j).a);
          localStringBuilder.append('=');
          a(localStringBuilder, (zbyo)localObject);
          localObject = this.b.getModules().get(j).n;
          if (localObject != null)
          {
            localStringBuilder.append(", ");
            a(localStringBuilder, (zbyo)localObject);
          }
          localzo.a(zs.a(localStringBuilder));
          localzo.a("\r\n");
        }
      }
    }
    localzo.a("\r\n");
    localzo.c();
  }
  
  private void a(StringBuilder paramStringBuilder, zbyo paramzbyo)
  {
    paramStringBuilder.append(paramzbyo.a);
    paramStringBuilder.append(", ");
    paramStringBuilder.append(paramzbyo.b);
    paramStringBuilder.append(", ");
    paramStringBuilder.append(paramzbyo.c);
    paramStringBuilder.append(", ");
    paramStringBuilder.append(paramzbyo.d);
    paramStringBuilder.append(", ");
    switch (paramzbyo.e)
    {
    case 2: 
      paramStringBuilder.append("I");
      break;
    case 1: 
      paramStringBuilder.append("Z");
      break;
    default: 
      paramStringBuilder.append("C");
    }
  }
  
  private void e()
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    this.c.a("PROJECTwm", localzh);
    byte[] arrayOfByte1 = new byte[2];
    for (int i = 0; i < this.b.getModules().getCount(); i++)
    {
      VbaModule localVbaModule = this.b.getModules().get(i);
      byte[] arrayOfByte2 = this.b.d.a(localVbaModule.a);
      localzh.b(arrayOfByte2, 0, arrayOfByte2.length);
      localzh.b(arrayOfByte1, 0, 1);
      byte[] arrayOfByte3 = Encoding.getUnicode().a(localVbaModule.a);
      localzh.b(arrayOfByte3, 0, arrayOfByte3.length);
      localzh.b(arrayOfByte1, 0, 2);
    }
    localzh.b(arrayOfByte1, 0, 2);
  }
  
  private void f()
    throws Exception
  {
    if (!this.a.b("_VBA_PROJECT"))
    {
      com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh(new byte[] { -52, 97, -1, -1, 0, 1, 0 });
      this.a.a("_VBA_PROJECT", localzh);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */