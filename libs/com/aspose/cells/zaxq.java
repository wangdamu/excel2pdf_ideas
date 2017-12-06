package com.aspose.cells;

class zaxq
  extends zcd
{
  zaxq()
  {
    c(2155);
  }
  
  void a(DataLabels paramDataLabels)
  {
    String str = paramDataLabels.getSeparatorValue();
    if (str == null) {
      str = "";
    }
    if ((str != null) && (str.length() > 255)) {
      str = str.substring(0, 255);
    }
    switch (paramDataLabels.getSeparator())
    {
    case 0: 
      b(16);
      break;
    case 2: 
    case 3: 
    case 4: 
      b(21);
      break;
    case 1: 
    case 5: 
      b(19);
      break;
    case 6: 
      if (str.length() == 0) {
        b(16);
      } else {
        a((short)(17 + str.length() * 2));
      }
      break;
    }
    this.b = new byte[d()];
    this.b[0] = 107;
    this.b[1] = 8;
    this.b[12] = 0;
    if (paramDataLabels.getShowSeriesName())
    {
      byte[] tmp184_179 = this.b;
      tmp184_179[12] = ((byte)(tmp184_179[12] | 0x1));
    }
    if (paramDataLabels.getShowCategoryName())
    {
      byte[] tmp203_198 = this.b;
      tmp203_198[12] = ((byte)(tmp203_198[12] | 0x2));
    }
    if (paramDataLabels.getShowValue())
    {
      byte[] tmp222_217 = this.b;
      tmp222_217[12] = ((byte)(tmp222_217[12] | 0x4));
    }
    if (paramDataLabels.getShowPercentage())
    {
      byte[] tmp241_236 = this.b;
      tmp241_236[12] = ((byte)(tmp241_236[12] | 0x8));
    }
    if (paramDataLabels.getShowBubbleSize())
    {
      byte[] tmp261_256 = this.b;
      tmp261_256[12] = ((byte)(tmp261_256[12] | 0x10));
    }
    if ((paramDataLabels.getSeparator() == 0) && (str.length() == 0)) {
      return;
    }
    this.b[16] = 1;
    switch (paramDataLabels.getSeparator())
    {
    case 2: 
      this.b[14] = 2;
      this.b[17] = 44;
      this.b[19] = 32;
      break;
    case 4: 
      this.b[14] = 2;
      this.b[17] = 46;
      this.b[19] = 32;
      break;
    case 3: 
      this.b[14] = 2;
      this.b[17] = 59;
      this.b[19] = 32;
      break;
    case 5: 
      this.b[14] = 1;
      this.b[17] = 10;
      break;
    case 1: 
      this.b[14] = 1;
      this.b[17] = 32;
      break;
    case 6: 
      this.b[14] = ((byte)str.length());
      int i = 17;
      for (int j = 0; j < str.length(); j++)
      {
        this.b[i] = ((byte)str.charAt(j));
        i += 2;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */