package com.aspose.cells;

class zamb
  implements zaik
{
  private Color[] a;
  
  public Color a(int paramInt)
  {
    if ((paramInt < 1) || (paramInt > 56)) {
      return Color.getEmpty();
    }
    return this.a[(paramInt - 1)];
  }
  
  public static Color b(int paramInt)
  {
    if ((paramInt < 1) || (paramInt > 56)) {
      return Color.getEmpty();
    }
    switch (paramInt + 7)
    {
    case 0: 
      return c(0);
    case 1: 
      return c(16777215);
    case 2: 
      return c(255);
    case 3: 
      return c(65280);
    case 4: 
      return c(16711680);
    case 5: 
      return c(65535);
    case 6: 
      return c(16711935);
    case 7: 
      return c(16776960);
    case 8: 
      return c(0);
    case 9: 
      return c(16777215);
    case 10: 
      return c(255);
    case 11: 
      return c(65280);
    case 12: 
      return c(16711680);
    case 13: 
      return c(65535);
    case 14: 
      return c(16711935);
    case 15: 
      return c(16776960);
    case 16: 
      return c(128);
    case 17: 
      return c(32768);
    case 18: 
      return c(8388608);
    case 19: 
      return c(32896);
    case 20: 
      return c(8388736);
    case 21: 
      return c(8421376);
    case 22: 
      return c(12632256);
    case 23: 
      return c(8421504);
    case 24: 
      return c(16751001);
    case 25: 
      return c(6697881);
    case 26: 
      return c(13434879);
    case 27: 
      return c(16777164);
    case 28: 
      return c(6684774);
    case 29: 
      return c(8421631);
    case 30: 
      return c(13395456);
    case 31: 
      return c(16764108);
    case 32: 
      return c(8388608);
    case 33: 
      return c(16711935);
    case 34: 
      return c(65535);
    case 35: 
      return c(16776960);
    case 36: 
      return c(8388736);
    case 37: 
      return c(128);
    case 38: 
      return c(8421376);
    case 39: 
      return c(16711680);
    case 40: 
      return c(16763904);
    case 41: 
      return c(16777164);
    case 42: 
      return c(13434828);
    case 43: 
      return c(10092543);
    case 44: 
      return c(16764057);
    case 45: 
      return c(13408767);
    case 46: 
      return c(16751052);
    case 47: 
      return c(10079487);
    case 48: 
      return c(16737843);
    case 49: 
      return c(13421619);
    case 50: 
      return c(52377);
    case 51: 
      return c(52479);
    case 52: 
      return c(39423);
    case 53: 
      return c(26367);
    case 54: 
      return c(10053222);
    case 55: 
      return c(9868950);
    case 56: 
      return c(6697728);
    case 57: 
      return c(6723891);
    case 58: 
      return c(13056);
    case 59: 
      return c(13107);
    case 60: 
      return c(13209);
    case 61: 
      return c(6697881);
    case 62: 
      return c(10040115);
    case 63: 
      return c(3355443);
    }
    return Color.getEmpty();
  }
  
  private static Color c(int paramInt)
  {
    int i = paramInt & 0xFF;
    int j = (paramInt & 0xFF00) >> 8;
    int k = (paramInt & 0xFF0000) >> 16;
    return Color.fromArgb(i, j, k);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */