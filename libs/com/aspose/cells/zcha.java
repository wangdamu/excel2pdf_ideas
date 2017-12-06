package com.aspose.cells;

class zcha
  extends zche
{
  zcha(PageSetup paramPageSetup)
  {
    this.d = 477;
    this.c = new byte[2];
    if (paramPageSetup.getCenterHorizontally())
    {
      int tmp30_29 = 0;
      byte[] tmp30_26 = this.c;
      tmp30_26[tmp30_29] = ((byte)(tmp30_26[tmp30_29] | 0x1));
    }
    if (paramPageSetup.getCenterVertically())
    {
      int tmp48_47 = 0;
      byte[] tmp48_44 = this.c;
      tmp48_44[tmp48_47] = ((byte)(tmp48_44[tmp48_47] | 0x2));
    }
    if (paramPageSetup.getPrintHeadings())
    {
      int tmp66_65 = 0;
      byte[] tmp66_62 = this.c;
      tmp66_62[tmp66_65] = ((byte)(tmp66_62[tmp66_65] | 0x4));
    }
    if (paramPageSetup.getPrintGridlines())
    {
      int tmp84_83 = 0;
      byte[] tmp84_80 = this.c;
      tmp84_80[tmp84_83] = ((byte)(tmp84_80[tmp84_83] | 0x18));
    }
    else
    {
      int tmp99_98 = 0;
      byte[] tmp99_95 = this.c;
      tmp99_95[tmp99_98] = ((byte)(tmp99_95[tmp99_98] | 0x10));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */