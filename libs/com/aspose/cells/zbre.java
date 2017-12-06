package com.aspose.cells;

import com.aspose.cells.a.c.zk;

class zbre
  extends zy
{
  private zbpg e;
  private boolean f;
  
  public zbre(zig paramzig, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramzig, paramString1, paramString2);
    this.e = new zbpg(paramzig, paramBoolean ? zk.b() : zk.a(), false, 0);
    if (!paramBoolean) {
      if (zamr.a((short)2052, paramzig.e() == 0 ? paramzig.c().e() : paramzig.e()))
      {
        this.f = true;
        return;
      }
    }
    this.f = false;
  }
  
  protected void a(zzu paramzzu, DateTime paramDateTime, double paramDouble, StringBuilder paramStringBuilder)
  {
    if ((paramDouble > 1.0D) && (zk.d(paramDateTime, znq.m)))
    {
      paramDateTime = paramDateTime.addDays(-1.0D);
      paramDouble -= 1.0D;
    }
    zzz localzzz = this.e.a(paramzzu, paramDateTime, paramDouble, false);
    if (localzzz.c()) {
      return;
    }
    char[] arrayOfChar = localzzz.g();
    if (this.f) {
      paramStringBuilder.append(arrayOfChar[(arrayOfChar.length - 1)]);
    } else {
      paramStringBuilder.append(arrayOfChar);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbre.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */