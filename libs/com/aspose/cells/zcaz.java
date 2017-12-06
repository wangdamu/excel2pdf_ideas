package com.aspose.cells;

class zcaz
  extends zche
{
  zcaz(DataBar paramDataBar, boolean paramBoolean)
  {
    this.d = (paramBoolean ? 1051 : 467);
    this.c = new byte[paramBoolean ? 11 : 3];
    int i = paramBoolean ? 4 : 0;
    this.c[(i + 0)] = ((byte)paramDataBar.getMinLength());
    this.c[(i + 1)] = ((byte)paramDataBar.getMaxLength());
    if (paramDataBar.getShowValue()) {
      this.c[(i + 2)] = 1;
    }
    if (paramBoolean)
    {
      this.c[(i + 3)] = ((byte)zcij.j(paramDataBar.getDirection()));
      this.c[(i + 4)] = ((byte)zcij.l(paramDataBar.getAxisPosition()));
      if (paramDataBar.getBarBorder().getType() == 1)
      {
        int tmp143_142 = (i + 5);
        byte[] tmp143_137 = this.c;
        tmp143_137[tmp143_142] = ((byte)(tmp143_137[tmp143_142] | 0x1));
      }
      if (paramDataBar.getBarFillType() == 1)
      {
        int tmp164_163 = (i + 5);
        byte[] tmp164_158 = this.c;
        tmp164_158[tmp164_163] = ((byte)(tmp164_158[tmp164_163] | 0x2));
      }
      if (paramDataBar.getNegativeBarFormat().getColorType() == 0)
      {
        int tmp187_186 = (i + 5);
        byte[] tmp187_181 = this.c;
        tmp187_181[tmp187_186] = ((byte)(tmp187_181[tmp187_186] | 0x4));
      }
      if (paramDataBar.getNegativeBarFormat().getBorderColorType() == 0)
      {
        int tmp210_209 = (i + 5);
        byte[] tmp210_204 = this.c;
        tmp210_204[tmp210_209] = ((byte)(tmp210_204[tmp210_209] | 0x8));
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */