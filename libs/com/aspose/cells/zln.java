package com.aspose.cells;

import com.aspose.cells.b.a.a.zd;

class zln
{
  private zd a = new zd();
  
  zln(zd paramzd, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      this.a.b(Integer.valueOf(i++), Integer.valueOf(255));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(65280));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16711680));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(65535));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16711935));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16776960));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(128));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(32768));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8388608));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(32896));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8388736));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8421376));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(12632256));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8421504));
    }
    if ((paramzd == null) || (paramzd.b() == 0))
    {
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16751001));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(6697881));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(13434879));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16777164));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(6684774));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8421631));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(13395456));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16764108));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8388608));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16711935));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(65535));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16776960));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8388736));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(128));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8421376));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16711680));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16763904));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16777164));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(13434828));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(10092543));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16764057));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(13408767));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16751052));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(10079487));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16737843));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(13421619));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(52377));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(52479));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(39423));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(26367));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(10053222));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(9868950));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(6697728));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(6723891));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(13056));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(13107));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(13209));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(6697881));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(10040115));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(3355443));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(0));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16777215));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(255));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(65280));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16711680));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(65535));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16711935));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(16776960));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(128));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(32768));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8388608));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(32896));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8388736));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8421376));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(12632256));
      this.a.b(Integer.valueOf(i++), Integer.valueOf(8421504));
    }
    else
    {
      for (int j = 0; j < paramzd.b(); j++) {
        this.a.b(Integer.valueOf(i++), paramzd.d(Integer.valueOf(j)));
      }
    }
  }
  
  Color a(int paramInt)
  {
    int i = ((Integer)this.a.d(Integer.valueOf(paramInt % this.a.b()))).intValue();
    int j = i & 0xFF;
    int k = (i & 0xFF00) >> 8;
    int m = (i & 0xFF0000) >> 16;
    return Color.fromArgb(j, k, m);
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    this.a.b(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
  }
  
  void a(Color[] paramArrayOfColor, boolean paramBoolean)
  {
    if ((paramArrayOfColor == null) || (paramArrayOfColor.length == 0)) {
      return;
    }
    int i = 0;
    if (paramBoolean) {
      i = 14;
    }
    for (int j = 0; j < paramArrayOfColor.length; j++)
    {
      int k = (paramArrayOfColor[j].getR() & 0xFF) + ((paramArrayOfColor[j].getG() & 0xFF) << 8) + ((paramArrayOfColor[j].getB() & 0xFF) << 16);
      a(k, i);
      i++;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */