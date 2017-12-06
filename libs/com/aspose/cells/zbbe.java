package com.aspose.cells;

import java.util.ArrayList;

class zbbe
  extends zcd
{
  private short a;
  private zaom c;
  private zaon d;
  
  public zbbe()
  {
    c(2150);
    this.a = 14;
  }
  
  void a(WorksheetCollection paramWorksheetCollection, zse paramzse)
  {
    this.c = new zaom(paramWorksheetCollection, this.a);
    this.c.a(paramzse);
  }
  
  void b(zrg paramzrg)
    throws Exception
  {
    int i = this.c.a == null ? this.c.d() : ((Integer)this.c.a.get(0)).intValue();
    paramzrg.a(f());
    paramzrg.a((short)(i + this.a));
    byte[] arrayOfByte1 = new byte[this.a];
    arrayOfByte1[0] = 102;
    arrayOfByte1[1] = 8;
    arrayOfByte1[12] = 2;
    paramzrg.a(arrayOfByte1);
    paramzrg.a(this.c.e(), i);
    ArrayList localArrayList = this.c.a();
    if (localArrayList != null)
    {
      arrayOfByte1[12] = 6;
      for (int j = 0; j < localArrayList.size(); j++)
      {
        byte[] arrayOfByte2 = (byte[])localArrayList.get(j);
        if (j + 1 < this.c.a.size()) {
          i = ((Integer)this.c.a.get(j + 1)).intValue();
        } else {
          i = arrayOfByte2.length;
        }
        paramzrg.a(f());
        paramzrg.a((short)(i + this.a));
        paramzrg.a(arrayOfByte1);
        paramzrg.a(arrayOfByte2);
      }
    }
  }
  
  void a(ShapeCollection paramShapeCollection)
  {
    this.d = new zaon(null);
    this.d.a(paramShapeCollection);
  }
  
  void c(zrg paramzrg)
    throws Exception
  {
    paramzrg.a(f());
    paramzrg.a((short)(this.d.c + this.a));
    byte[] arrayOfByte = new byte[this.a];
    arrayOfByte[0] = 102;
    arrayOfByte[1] = 8;
    arrayOfByte[12] = 1;
    paramzrg.a(arrayOfByte);
    paramzrg.a(this.d.e());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */