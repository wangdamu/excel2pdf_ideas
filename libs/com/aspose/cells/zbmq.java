package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zff;
import com.aspose.cells.a.d.zfn;
import com.aspose.cells.a.d.zfq;
import com.aspose.cells.a.d.zn;
import com.aspose.cells.a.d.zo;
import com.aspose.cells.b.a.d.zm;

class zbmq
{
  private Shape a;
  
  zbmq(Shape paramShape)
  {
    this.a = paramShape;
  }
  
  void a(zm paramzm, PdfSaveOptions paramPdfSaveOptions)
    throws Exception
  {
    zff localzff = paramPdfSaveOptions.c;
    localzff.a(paramPdfSaveOptions.a);
    localzff.d(paramPdfSaveOptions.b);
    zavu localzavu = new zavu();
    ImageOrPrintOptions localImageOrPrintOptions = paramPdfSaveOptions.d;
    localImageOrPrintOptions.setWarningCallback(paramPdfSaveOptions.getWarningCallback());
    zis localzis = new zis();
    zfn localzfn = new zfn(localzis, localzavu, localzff, localImageOrPrintOptions.e());
    localzfn.e = paramPdfSaveOptions.getImageType();
    if (localzff.p() != null)
    {
      localzff.a(new zfq(localzfn.d(), localzff.p()));
      localzff.o().d();
    }
    double d = 0.0D;
    if ((this.a instanceof ChartShape))
    {
      localObject = ((ChartShape)this.a).getChart();
      if (((Chart)localObject).getChartArea().getBorder().isVisible())
      {
        d = ((Chart)localObject).getChartArea().getBorder().getWeightPt();
        if ((!((Chart)localObject).getChartArea().getBorder().k()) && (((Chart)localObject).getChartArea().getBorder().getFormattingType() == 0)) {
          d = 0.75D;
        } else if (d < 0.25D) {
          d = 0.25D;
        }
      }
    }
    Object localObject = new zo((float)(this.a.getWidthPt() + d), (float)(this.a.getHeightPt() + d));
    ((zo)localObject).a(a());
    localzfn.a((zn)localObject);
    localzavu.a(paramzm);
    localzavu.b_();
    localObject = null;
    localzfn.a();
    localzavu.a(paramzm);
    localzavu.a();
    localzavu = null;
    localzfn = null;
  }
  
  private zb a()
    throws Exception
  {
    zb localzb1 = new zb();
    if ((this.a instanceof ChartShape))
    {
      Chart localChart = ((ChartShape)this.a).a();
      zb localzb2 = localChart.F();
      if (localzb2 != null) {
        localzb1.a(localzb2);
      }
    }
    return localzb1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */