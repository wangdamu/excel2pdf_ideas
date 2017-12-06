package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.zc;

class zbwe
  extends zcd
{
  zbwe()
  {
    c(4133);
    b(32);
    this.b = new byte[d()];
    this.b[0] = 2;
    this.b[1] = 2;
    this.b[2] = 1;
    this.b[8] = -42;
    this.b[9] = -1;
    this.b[10] = -1;
    this.b[11] = -1;
    this.b[12] = -70;
    this.b[13] = -1;
    this.b[14] = -1;
    this.b[15] = -1;
    this.b[24] = -79;
    this.b[26] = 77;
    this.b[28] = 80;
    this.b[29] = 26;
  }
  
  int[] a(DataLabels paramDataLabels)
  {
    b(paramDataLabels);
    int[] arrayOfInt = new int[5];
    if (this.b[2] == 1) {
      arrayOfInt[0] = 525;
    } else {
      arrayOfInt[0] = 269;
    }
    arrayOfInt[1] = (this.b[30] & 0xFF);
    arrayOfInt[2] = (this.b[0] & 0xFF);
    arrayOfInt[3] = (this.b[1] & 0xFF);
    arrayOfInt[4] = ((byte)((this.b[29] & 0xFF & 0xF0) >> 4) & 0xFF);
    return arrayOfInt;
  }
  
  void b(DataLabels paramDataLabels)
  {
    byte[] tmp6_1 = this.b;
    tmp6_1[28] = ((byte)(tmp6_1[28] | 0x80));
    byte[] tmp20_15 = this.b;
    tmp20_15[29] = ((byte)(tmp20_15[29] | 0x3A));
    c(paramDataLabels);
    Object localObject = paramDataLabels.R();
    if ((localObject instanceof Trendline))
    {
      this.b[25] = 64;
      return;
    }
    if ((localObject instanceof Series))
    {
      byte[] tmp67_62 = this.b;
      tmp67_62[24] = ((byte)(tmp67_62[24] | 0x10));
    }
    byte[] tmp80_75 = this.b;
    tmp80_75[25] = ((byte)(tmp80_75[25] & 0x7));
    if (paramDataLabels.getShowPercentage())
    {
      byte[] tmp100_95 = this.b;
      tmp100_95[25] = ((byte)(tmp100_95[25] | 0x10));
    }
    if (paramDataLabels.getShowValue())
    {
      byte[] tmp120_115 = this.b;
      tmp120_115[24] = ((byte)(tmp120_115[24] | 0x4));
    }
    if (ChartCollection.p(paramDataLabels.getChart().getType()))
    {
      if (paramDataLabels.getShowSeriesName())
      {
        byte[] tmp152_147 = this.b;
        tmp152_147[25] = ((byte)(tmp152_147[25] | 0x40));
      }
    }
    else if (paramDataLabels.getShowCategoryName())
    {
      byte[] tmp175_170 = this.b;
      tmp175_170[25] = ((byte)(tmp175_170[25] | 0x40));
    }
    if (paramDataLabels.getShowBubbleSize())
    {
      byte[] tmp195_190 = this.b;
      tmp195_190[25] = ((byte)(tmp195_190[25] | 0x20));
    }
    if ((paramDataLabels.getShowPercentage()) && (paramDataLabels.getShowCategoryName()))
    {
      byte[] tmp222_217 = this.b;
      tmp222_217[25] = ((byte)(tmp222_217[25] | 0x8));
    }
    if (paramDataLabels.T()) {
      if (paramDataLabels.getShowPercentage())
      {
        byte[] tmp249_244 = this.b;
        tmp249_244[25] = ((byte)(tmp249_244[25] & 0x13));
        byte[] tmp262_257 = this.b;
        tmp262_257[24] = ((byte)(tmp262_257[24] & 0xFB));
      }
      else if (paramDataLabels.getShowBubbleSize())
      {
        if (paramDataLabels.getShowValue())
        {
          byte[] tmp293_288 = this.b;
          tmp293_288[25] = ((byte)(tmp293_288[25] & 0xF));
        }
        else if (paramDataLabels.getShowCategoryName())
        {
          byte[] tmp316_311 = this.b;
          tmp316_311[25] = ((byte)(tmp316_311[25] & 0x4F));
        }
        else
        {
          byte[] tmp332_327 = this.b;
          tmp332_327[25] = ((byte)(tmp332_327[25] & 0x2F));
        }
      }
      else if (paramDataLabels.getShowValue())
      {
        byte[] tmp355_350 = this.b;
        tmp355_350[25] = ((byte)(tmp355_350[25] & 0xF));
      }
    }
    if (paramDataLabels.getShowLegendKey())
    {
      byte[] tmp375_370 = this.b;
      tmp375_370[24] = ((byte)(tmp375_370[24] | 0x2));
    }
    DataLabels localDataLabels = null;
    if ((localObject instanceof ChartPoint)) {
      localDataLabels = ((ChartPoint)localObject).a().getDataLabels();
    }
    if (!paramDataLabels.n) {
      d(paramDataLabels);
    } else if ((localDataLabels != null) && (!localDataLabels.n)) {
      d(localDataLabels);
    }
  }
  
  private void d(DataLabels paramDataLabels)
  {
    switch (paramDataLabels.getPosition())
    {
    case 3: 
      byte[] tmp66_61 = this.b;
      tmp66_61[28] = ((byte)(tmp66_61[28] | 0x1));
      break;
    case 2: 
      byte[] tmp81_76 = this.b;
      tmp81_76[28] = ((byte)(tmp81_76[28] | 0x2));
      break;
    case 1: 
      byte[] tmp96_91 = this.b;
      tmp96_91[28] = ((byte)(tmp96_91[28] | 0x4));
      break;
    case 0: 
      byte[] tmp111_106 = this.b;
      tmp111_106[28] = ((byte)(tmp111_106[28] | 0x3));
      break;
    case 4: 
      byte[] tmp126_121 = this.b;
      tmp126_121[28] = ((byte)(tmp126_121[28] | 0x5));
      break;
    case 5: 
      byte[] tmp141_136 = this.b;
      tmp141_136[28] = ((byte)(tmp141_136[28] | 0x6));
      break;
    case 6: 
      byte[] tmp157_152 = this.b;
      tmp157_152[28] = ((byte)(tmp157_152[28] | 0x7));
      break;
    case 7: 
      byte[] tmp173_168 = this.b;
      tmp173_168[28] = ((byte)(tmp173_168[28] | 0x8));
      break;
    case 8: 
      byte[] tmp189_184 = this.b;
      tmp189_184[28] = ((byte)(tmp189_184[28] | 0x9));
      break;
    case 9: 
      byte[] tmp205_200 = this.b;
      tmp205_200[28] = ((byte)(tmp205_200[28] | 0xA));
      break;
    }
  }
  
  void a(Font paramFont)
  {
    if ((paramFont != null) && (!zh.a(paramFont.getColor())))
    {
      int i = 0;
      boolean[] arrayOfBoolean = { i };
      int j = paramFont.a(false, arrayOfBoolean);
      i = arrayOfBoolean[0];
      if ((j >= 0) && (j != 32767) && (j != 32759))
      {
        byte[] tmp63_58 = this.b;
        tmp63_58[24] = ((byte)(tmp63_58[24] & 0xFE));
        int k = (zh.d(paramFont.getColor()) & 0xFF) * 65536 + (zh.c(paramFont.getColor()) & 0xFF) * 256 + (zh.b(paramFont.getColor()) & 0xFF);
        System.arraycopy(zc.a(k), 0, this.b, 4, 4);
        System.arraycopy(zc.a(j), 0, this.b, 26, 2);
      }
    }
  }
  
  void c(DataLabels paramDataLabels)
  {
    this.b[24] = -111;
    switch (paramDataLabels.getTextHorizontalAlignment())
    {
    case 7: 
      this.b[0] = 1;
      break;
    case 1: 
      this.b[0] = 2;
      break;
    case 8: 
      this.b[0] = 3;
      break;
    case 6: 
      this.b[0] = 4;
      break;
    case 3: 
      this.b[0] = 7;
      break;
    }
    switch (paramDataLabels.getTextVerticalAlignment())
    {
    case 9: 
      this.b[1] = 1;
      break;
    case 1: 
      this.b[1] = 2;
      break;
    case 0: 
      this.b[1] = 3;
      break;
    case 6: 
      this.b[1] = 4;
      break;
    case 3: 
      this.b[1] = 7;
      break;
    }
    if ((paramDataLabels.F() == null) || ("".equals(paramDataLabels.F())))
    {
      if (paramDataLabels.isDeleted())
      {
        byte[] tmp251_246 = this.b;
        tmp251_246[24] = ((byte)(tmp251_246[24] | 0x40));
      }
      else if (paramDataLabels.isAutoText())
      {
        byte[] tmp274_269 = this.b;
        tmp274_269[24] = ((byte)(tmp274_269[24] | 0x10));
      }
    }
    else
    {
      byte[] tmp290_285 = this.b;
      tmp290_285[24] = ((byte)(tmp290_285[24] & 0xEF));
    }
    a(paramDataLabels);
    if (paramDataLabels.H()) {
      this.b[30] = -1;
    } else if (paramDataLabels.getRotationAngle() >= 0) {
      this.b[30] = ((byte)paramDataLabels.getRotationAngle());
    } else {
      this.b[30] = ((byte)(90 - paramDataLabels.getRotationAngle()));
    }
    this.b[28] = 0;
    this.b[29] = 0;
    switch (paramDataLabels.getTextDirection())
    {
    case 0: 
      break;
    case 1: 
      byte[] tmp413_408 = this.b;
      tmp413_408[29] = ((byte)(tmp413_408[29] | 0x40));
      break;
    case 2: 
      byte[] tmp429_424 = this.b;
      tmp429_424[29] = ((byte)(tmp429_424[29] | 0x80));
      break;
    }
  }
  
  void a(Title paramTitle)
    throws Exception
  {
    this.b[24] = -111;
    if (paramTitle.v() != null)
    {
      zbwc localzbwc = paramTitle.v();
      System.arraycopy(zc.a(localzbwc.a), 0, this.b, 8, 4);
      System.arraycopy(zc.a(localzbwc.b), 0, this.b, 12, 4);
      System.arraycopy(zc.a(localzbwc.c), 0, this.b, 16, 4);
      System.arraycopy(zc.a(localzbwc.d), 0, this.b, 20, 4);
    }
    else
    {
      paramTitle.getChart().a(false, false);
      System.arraycopy(zc.a(paramTitle.getX()), 0, this.b, 8, 4);
      System.arraycopy(zc.a(paramTitle.getY()), 0, this.b, 12, 4);
      System.arraycopy(zc.a(paramTitle.getWidth()), 0, this.b, 16, 4);
      System.arraycopy(zc.a(paramTitle.getHeight()), 0, this.b, 20, 4);
    }
    switch (paramTitle.getTextHorizontalAlignment())
    {
    case 7: 
      this.b[0] = 1;
      break;
    case 1: 
      this.b[0] = 2;
      break;
    case 8: 
      this.b[0] = 3;
      break;
    case 6: 
      this.b[0] = 4;
      break;
    case 3: 
      this.b[0] = 7;
      break;
    }
    switch (paramTitle.getTextVerticalAlignment())
    {
    case 9: 
      this.b[1] = 1;
      break;
    case 1: 
      this.b[1] = 2;
      break;
    case 0: 
      this.b[1] = 3;
      break;
    case 6: 
      this.b[1] = 4;
      break;
    case 3: 
      this.b[1] = 7;
      break;
    }
    a(paramTitle);
    if ((paramTitle.getText() == null) || ("".equals(paramTitle.getText())))
    {
      if (paramTitle.isDeleted())
      {
        byte[] tmp425_420 = this.b;
        tmp425_420[24] = ((byte)(tmp425_420[24] | 0x40));
      }
      else if (paramTitle.isAutoText())
      {
        byte[] tmp448_443 = this.b;
        tmp448_443[24] = ((byte)(tmp448_443[24] | 0x10));
      }
    }
    else
    {
      byte[] tmp464_459 = this.b;
      tmp464_459[24] = ((byte)(tmp464_459[24] & 0xEF));
    }
    if (paramTitle.H()) {
      this.b[30] = -1;
    } else if (paramTitle.getRotationAngle() >= 0) {
      this.b[30] = ((byte)paramTitle.getRotationAngle());
    } else {
      this.b[30] = ((byte)(90 - paramTitle.getRotationAngle()));
    }
    this.b[28] = 48;
    if ((!paramTitle.m()) || (!paramTitle.p()))
    {
      byte[] tmp556_551 = this.b;
      tmp556_551[28] = ((byte)(tmp556_551[28] | 0xA));
    }
    this.b[29] = 16;
    switch (paramTitle.getTextDirection())
    {
    case 0: 
      break;
    case 1: 
      byte[] tmp613_608 = this.b;
      tmp613_608[29] = ((byte)(tmp613_608[29] | 0x40));
      break;
    case 2: 
      byte[] tmp629_624 = this.b;
      tmp629_624[29] = ((byte)(tmp629_624[29] | 0x80));
      break;
    }
  }
  
  void a(Axis paramAxis, DisplayUnitLabel paramDisplayUnitLabel)
  {
    this.b[24] = -111;
    switch (paramDisplayUnitLabel.getTextHorizontalAlignment())
    {
    case 7: 
      this.b[0] = 1;
      break;
    case 1: 
      this.b[0] = 2;
      break;
    case 8: 
      this.b[0] = 3;
      break;
    case 6: 
      this.b[0] = 4;
      break;
    case 3: 
      this.b[0] = 7;
      break;
    }
    switch (paramDisplayUnitLabel.getTextVerticalAlignment())
    {
    case 9: 
      this.b[1] = 1;
      break;
    case 1: 
      this.b[1] = 2;
      break;
    case 0: 
      this.b[1] = 3;
      break;
    case 6: 
      this.b[1] = 4;
      break;
    case 3: 
      this.b[1] = 7;
      break;
    }
    if (paramAxis.isDisplayUnitLabelShown())
    {
      if ((paramDisplayUnitLabel.getText() != null) && (!"".equals(paramDisplayUnitLabel.getText())))
      {
        byte[] tmp251_246 = this.b;
        tmp251_246[24] = ((byte)(tmp251_246[24] & 0xEF));
      }
    }
    else
    {
      byte[] tmp268_263 = this.b;
      tmp268_263[24] = ((byte)(tmp268_263[24] | 0x40));
    }
    a(paramDisplayUnitLabel);
    if (paramDisplayUnitLabel.H()) {
      this.b[30] = -1;
    } else if (paramDisplayUnitLabel.getRotationAngle() >= 0) {
      this.b[30] = ((byte)paramDisplayUnitLabel.getRotationAngle());
    } else {
      this.b[30] = ((byte)(90 - paramDisplayUnitLabel.getRotationAngle()));
    }
    this.b[28] = 48;
    if ((!paramDisplayUnitLabel.m()) || (!paramDisplayUnitLabel.p()))
    {
      byte[] tmp365_360 = this.b;
      tmp365_360[28] = ((byte)(tmp365_360[28] | 0xA));
    }
    this.b[29] = 16;
    switch (paramDisplayUnitLabel.getTextDirection())
    {
    case 0: 
      break;
    case 1: 
      byte[] tmp421_416 = this.b;
      tmp421_416[29] = ((byte)(tmp421_416[29] | 0x40));
      break;
    case 2: 
      byte[] tmp437_432 = this.b;
      tmp437_432[29] = ((byte)(tmp437_432[29] | 0x80));
      break;
    }
  }
  
  int[] a(ChartFrame paramChartFrame)
  {
    a(paramChartFrame.j());
    a(paramChartFrame.getBackgroundMode());
    int[] arrayOfInt = new int[5];
    if (this.b[2] == 1) {
      arrayOfInt[0] = 525;
    } else {
      arrayOfInt[0] = 269;
    }
    arrayOfInt[1] = (this.b[30] & 0xFF);
    arrayOfInt[2] = (this.b[0] & 0xFF);
    arrayOfInt[3] = (this.b[1] & 0xFF);
    arrayOfInt[4] = ((byte)((this.b[29] & 0xFF & 0xC0) >> 4) & 0xFF);
    return arrayOfInt;
  }
  
  void a(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      byte[] tmp34_29 = this.b;
      tmp34_29[24] = ((byte)(tmp34_29[24] & 0x7F));
      break;
    case 1: 
      byte[] tmp50_45 = this.b;
      tmp50_45[24] = ((byte)(tmp50_45[24] & 0x7F));
      this.b[2] = 2;
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */