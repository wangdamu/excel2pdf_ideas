package com.aspose.cells;

class zbbf
  extends zcd
{
  zbbf()
  {
    c(2151);
  }
  
  void a(Protection paramProtection)
  {
    b(23);
    this.b = new byte[d()];
    this.b[0] = 103;
    this.b[1] = 8;
    this.b[12] = 2;
    this.b[14] = 1;
    this.b[15] = -1;
    this.b[16] = -1;
    this.b[17] = -1;
    this.b[18] = -1;
    if (paramProtection.getAllowSelectingLockedCell())
    {
      byte[] tmp93_88 = this.b;
      tmp93_88[20] = ((byte)(tmp93_88[20] | 0x4));
    }
    if (paramProtection.getAllowSelectingUnlockedCell())
    {
      byte[] tmp112_107 = this.b;
      tmp112_107[20] = ((byte)(tmp112_107[20] | 0x40));
    }
    if (paramProtection.getAllowEditingObject())
    {
      byte[] tmp132_127 = this.b;
      tmp132_127[19] = ((byte)(tmp132_127[19] | 0x1));
    }
    if (paramProtection.getAllowEditingScenario())
    {
      byte[] tmp151_146 = this.b;
      tmp151_146[19] = ((byte)(tmp151_146[19] | 0x2));
    }
    if (paramProtection.getAllowFormattingCell())
    {
      byte[] tmp170_165 = this.b;
      tmp170_165[19] = ((byte)(tmp170_165[19] | 0x4));
    }
    if (paramProtection.getAllowFormattingColumn())
    {
      byte[] tmp189_184 = this.b;
      tmp189_184[19] = ((byte)(tmp189_184[19] | 0x8));
    }
    if (paramProtection.getAllowFormattingRow())
    {
      byte[] tmp209_204 = this.b;
      tmp209_204[19] = ((byte)(tmp209_204[19] | 0x10));
    }
    if (paramProtection.getAllowInsertingColumn())
    {
      byte[] tmp229_224 = this.b;
      tmp229_224[19] = ((byte)(tmp229_224[19] | 0x20));
    }
    if (paramProtection.getAllowInsertingHyperlink())
    {
      byte[] tmp249_244 = this.b;
      tmp249_244[19] = ((byte)(tmp249_244[19] | 0x80));
    }
    if (paramProtection.getAllowInsertingRow())
    {
      byte[] tmp270_265 = this.b;
      tmp270_265[19] = ((byte)(tmp270_265[19] | 0x40));
    }
    if (paramProtection.getAllowDeletingColumn())
    {
      byte[] tmp290_285 = this.b;
      tmp290_285[20] = ((byte)(tmp290_285[20] | 0x1));
    }
    if (paramProtection.getAllowDeletingRow())
    {
      byte[] tmp309_304 = this.b;
      tmp309_304[20] = ((byte)(tmp309_304[20] | 0x2));
    }
    if (paramProtection.getAllowSorting())
    {
      byte[] tmp328_323 = this.b;
      tmp328_323[20] = ((byte)(tmp328_323[20] | 0x8));
    }
    if (paramProtection.getAllowFiltering())
    {
      byte[] tmp348_343 = this.b;
      tmp348_343[20] = ((byte)(tmp348_343[20] | 0x10));
    }
    if (paramProtection.getAllowUsingPivotTable())
    {
      byte[] tmp368_363 = this.b;
      tmp368_363[20] = ((byte)(tmp368_363[20] | 0x20));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */