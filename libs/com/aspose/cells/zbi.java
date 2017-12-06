package com.aspose.cells;

class zbi
  extends zcd
{
  zbi()
  {
    c(4108);
    b(2);
    this.b = new byte[2];
  }
  
  void a(DataLabels paramDataLabels)
  {
    if (paramDataLabels.getShowValue())
    {
      int tmp12_11 = 0;
      byte[] tmp12_8 = this.b;
      tmp12_8[tmp12_11] = ((byte)(tmp12_8[tmp12_11] | 0x1));
    }
    if ((paramDataLabels.getShowPercentage()) && (ChartCollection.c(paramDataLabels.K())))
    {
      int tmp40_39 = 0;
      byte[] tmp40_36 = this.b;
      tmp40_36[tmp40_39] = ((byte)(tmp40_36[tmp40_39] | 0x2));
      if (paramDataLabels.getShowCategoryName())
      {
        int tmp58_57 = 0;
        byte[] tmp58_54 = this.b;
        tmp58_54[tmp58_57] = ((byte)(tmp58_54[tmp58_57] | 0x4));
      }
    }
    if (paramDataLabels.getShowCategoryName())
    {
      int tmp76_75 = 0;
      byte[] tmp76_72 = this.b;
      tmp76_72[tmp76_75] = ((byte)(tmp76_72[tmp76_75] | 0x10));
    }
    if ((paramDataLabels.getShowSeriesName()) && (ChartCollection.p(paramDataLabels.getChart().getType())))
    {
      int tmp108_107 = 0;
      byte[] tmp108_104 = this.b;
      tmp108_104[tmp108_107] = ((byte)(tmp108_104[tmp108_107] | 0x10));
    }
    if ((paramDataLabels.getShowBubbleSize()) && (ChartCollection.q(paramDataLabels.K())))
    {
      int tmp137_136 = 0;
      byte[] tmp137_133 = this.b;
      tmp137_133[tmp137_136] = ((byte)(tmp137_133[tmp137_136] | 0x20));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */