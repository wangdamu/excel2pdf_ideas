package com.aspose.cells;

class zbav
  extends zcd
{
  zbav()
  {
    c(2129);
  }
  
  void a(Font paramFont)
    throws Exception
  {
    zzr localzzr = new zzr();
    localzzr.a(paramFont);
    b(localzzr);
  }
  
  void a(zbm paramzbm)
  {
    zwu localzwu = new zwu();
    localzwu.a(paramzbm);
    b(localzwu);
  }
  
  void a(Axis paramAxis, DisplayUnitLabel paramDisplayUnitLabel)
  {
    zbwe localzbwe = new zbwe();
    localzbwe.a(paramAxis, paramDisplayUnitLabel);
    b(localzbwe);
  }
  
  void a()
  {
    b(12);
    this.b = new byte[] { 81, 8, 0, 0, 51, 16, 0, 0, 0, 0, 0, 0 };
  }
  
  void a(DisplayUnitLabel paramDisplayUnitLabel)
    throws Exception
  {
    zaxo localzaxo = new zaxo(false);
    localzaxo.a(paramDisplayUnitLabel);
    b(localzaxo);
  }
  
  boolean a(Font paramFont, int paramInt)
  {
    if ((paramFont == null) && (paramInt == -1)) {
      return false;
    }
    if (paramFont != null) {
      paramInt = paramFont.m();
    }
    if (paramInt != -1)
    {
      zzs localzzs = new zzs(paramInt);
      b(localzzs);
      return true;
    }
    return false;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    zc localzc = new zc();
    localzc.a(paramArrayOfByte);
    b(localzc);
  }
  
  void a(String paramString)
  {
    zbfk localzbfk = new zbfk(paramString);
    b(localzbfk);
  }
  
  void a(boolean paramBoolean, ChartFrame paramChartFrame)
  {
    zacl localzacl;
    if (paramBoolean) {
      localzacl = new zacl((byte)3);
    } else {
      localzacl = new zacl((byte)2);
    }
    localzacl.a(paramChartFrame);
    b(localzacl);
  }
  
  void a(Line paramLine, zava paramzava)
  {
    zans localzans = new zans(paramzava);
    localzans.a(paramLine, false);
    b(localzans);
  }
  
  void a(Area paramArea, zava paramzava)
  {
    zbc localzbc = new zbc(paramzava);
    localzbc.a(paramArea);
    b(localzbc);
  }
  
  void a(Area paramArea, zava paramzava, zrg paramzrg)
    throws Exception
  {
    if (paramArea == null) {
      return;
    }
    if ((paramArea.b()) && (paramArea.getFillFormat().getFillType() != 1))
    {
      zadb localzadb = new zadb();
      localzadb.a(paramArea.getFillFormat());
      b(localzadb);
      a(paramzrg);
    }
  }
  
  void b()
  {
    zaud localzaud = new zaud();
    localzaud.a((byte)12, 0, 0);
    b(localzaud);
  }
  
  void c()
  {
    b(12);
    this.b = new byte[] { 81, 8, 0, 0, 52, 16, 0, 0, 0, 0, 0, 0 };
  }
  
  private void b(zcd paramzcd)
  {
    if (paramzcd.d() < 4) {
      b(12);
    } else {
      a((short)(8 + paramzcd.d()));
    }
    this.b = new byte[d()];
    this.b[0] = 81;
    this.b[1] = 8;
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramzcd.f()), 0, this.b, 4, 2);
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramzcd.d()), 0, this.b, 6, 2);
    System.arraycopy(paramzcd.e(), 0, this.b, 8, paramzcd.d());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */