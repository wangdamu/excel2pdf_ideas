package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zboz
{
  private int a = 14;
  private ArrayList b;
  private ArrayList c;
  private byte[] d;
  private byte[] e;
  
  void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  ArrayList a()
  {
    return this.b;
  }
  
  void a(ArrayList paramArrayList)
  {
    this.b = paramArrayList;
  }
  
  ArrayList b()
  {
    if (this.c == null) {
      this.c = new ArrayList();
    }
    return this.c;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.d = paramArrayOfByte;
  }
  
  void b(byte[] paramArrayOfByte)
  {
    this.e = paramArrayOfByte;
  }
  
  void a(zboz paramzboz)
  {
    this.a = paramzboz.a;
    int i;
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    if ((paramzboz.b != null) && (paramzboz.b.size() != 0))
    {
      this.b = new ArrayList();
      for (i = 0; i < paramzboz.b.size(); i++)
      {
        arrayOfByte1 = (byte[])paramzboz.b.get(i);
        arrayOfByte2 = new byte[arrayOfByte1.length];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
        zf.a(this.b, arrayOfByte2);
      }
    }
    if (paramzboz.d != null)
    {
      this.d = new byte[paramzboz.d.length];
      System.arraycopy(paramzboz.d, 0, this.d, 0, paramzboz.d.length);
    }
    if ((paramzboz.c != null) && (paramzboz.c.size() > 0))
    {
      this.c = new ArrayList();
      for (i = 0; i < paramzboz.c.size(); i++)
      {
        arrayOfByte1 = (byte[])paramzboz.c.get(i);
        arrayOfByte2 = new byte[arrayOfByte1.length];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
        zf.a(this.c, arrayOfByte2);
      }
    }
    if ((paramzboz.e != null) && (paramzboz.e.length > 0))
    {
      this.e = new byte[paramzboz.e.length];
      System.arraycopy(paramzboz.e, 0, this.e, 0, this.e.length);
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    paramzrg.c(431);
    if (this.d == null)
    {
      paramzrg.c(2);
      paramzrg.c(0);
    }
    else
    {
      paramzrg.a((short)this.d.length);
      paramzrg.a(this.d);
    }
    paramzrg.c(444);
    if (this.e == null)
    {
      paramzrg.c(2);
      paramzrg.c(0);
    }
    else
    {
      paramzrg.a((short)this.e.length);
      paramzrg.a(this.e);
    }
  }
  
  void b(zrg paramzrg)
    throws Exception
  {
    if ((this.c != null) && (this.c.size() > 0)) {
      for (int i = 0; i < this.c.size(); i++)
      {
        paramzrg.c(2148);
        byte[] arrayOfByte = (byte[])this.c.get(i);
        paramzrg.a((short)arrayOfByte.length);
        paramzrg.a(arrayOfByte);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zboz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */