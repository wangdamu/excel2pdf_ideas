package com.aspose.cells;

import com.aspose.cells.b.a.zp;

class zbpk
  extends zn
{
  private char e;
  
  public zbpk(zig paramzig, String paramString)
  {
    super(paramzig);
    this.e = ((char)(paramString.charAt(0) | 0x20));
  }
  
  public zzz a(zzu paramzzu, DateTime paramDateTime, double paramDouble, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (paramDateTime.compareTo(c) > 0) {
        return a(paramzzu, paramDateTime);
      }
      paramDateTime = paramDateTime.addMilliseconds(500.0D);
    }
    zzz localzzz = super.a(paramzzu, paramDateTime, paramDouble, paramBoolean);
    if (localzzz.f() != 7) {
      return localzzz;
    }
    if (this.e == 'y') {
      localzzz.a(3, zp.a(paramDateTime.getYear() % 100));
    } else if (this.e == 'm') {
      localzzz.a(3, zp.a(paramDateTime.getMonth()));
    } else if (this.e == 'd') {
      localzzz.a(3, zp.a(paramDateTime.getDay()));
    } else if (this.e == 'h') {
      localzzz.a(3, zp.a(paramDateTime.getHour()));
    } else {
      localzzz.a(3, zp.a(paramDateTime.getSecond()));
    }
    return localzzz;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */