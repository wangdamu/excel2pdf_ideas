package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

public class ChartTextFrame
  extends ChartFrame
{
  protected boolean m_IsAutoText = true;
  protected boolean m_deleted;
  protected int horizontal = 1;
  protected int vertical = 1;
  protected int rotation;
  private boolean k = true;
  protected ArrayList m_CharsList;
  protected String m_text;
  zjk i;
  private boolean l = false;
  private boolean m = false;
  private int n = 0;
  boolean j = true;
  private boolean o = false;
  
  ChartTextFrame(Chart chart)
  {
    super(chart);
  }
  
  public boolean isAutoText()
  {
    return this.m_IsAutoText;
  }
  
  public void setAutoText(boolean value)
  {
    if (value)
    {
      this.m_CharsList = null;
      this.m_text = null;
      this.i = null;
    }
    this.m_IsAutoText = value;
  }
  
  void j(boolean paramBoolean)
  {
    this.m_IsAutoText = paramBoolean;
  }
  
  public boolean isDeleted()
  {
    return this.m_deleted;
  }
  
  public void setDeleted(boolean value)
  {
    this.m_deleted = value;
  }
  
  public int getTextHorizontalAlignment()
  {
    return this.horizontal;
  }
  
  public void setTextHorizontalAlignment(int value)
  {
    switch (value)
    {
    case 1: 
    case 3: 
    case 6: 
    case 7: 
    case 8: 
      this.horizontal = value;
      break;
    }
  }
  
  public int getTextVerticalAlignment()
  {
    return this.vertical;
  }
  
  public void setTextVerticalAlignment(int value)
  {
    switch (value)
    {
    case 0: 
    case 1: 
    case 3: 
    case 6: 
    case 9: 
      this.vertical = value;
      break;
    }
  }
  
  public int getRotationAngle()
  {
    return this.rotation;
  }
  
  public void setRotationAngle(int value)
  {
    if (((value >= -90) && (value <= 90)) || (value == 255))
    {
      this.rotation = value;
      this.k = false;
    }
    else
    {
      throw new IllegalArgumentException("Invalid rotation : it must be between -90 and 90 or equal 255");
    }
  }
  
  boolean a()
  {
    return this.k;
  }
  
  ArrayList E()
  {
    return this.m_CharsList;
  }
  
  void a(ArrayList paramArrayList)
  {
    this.m_CharsList = paramArrayList;
  }
  
  public FontSetting characters(int startIndex, int length)
  {
    if (this.m_CharsList == null) {
      this.m_CharsList = new ArrayList();
    }
    for (int i1 = 0; i1 < this.m_CharsList.size(); i1++)
    {
      localFontSetting = (FontSetting)this.m_CharsList.get(i1);
      if ((localFontSetting.getLength() == length) && (localFontSetting.getStartIndex() == startIndex)) {
        return localFontSetting;
      }
    }
    FontSetting localFontSetting = new FontSetting(startIndex, length, getChart().n(), this);
    zf.a(this.m_CharsList, localFontSetting);
    return localFontSetting;
  }
  
  public String getText()
  {
    if (this.i != null) {
      this.m_text = this.i.r();
    }
    return this.m_text;
  }
  
  public void setText(String value)
  {
    if (value == null) {
      this.m_deleted = true;
    } else {
      this.m_deleted = false;
    }
    this.m_IsAutoText = false;
    this.m_text = value;
    this.i = null;
    this.m_CharsList = null;
  }
  
  String F()
  {
    return this.m_text;
  }
  
  void a(String paramString)
  {
    this.m_text = paramString;
  }
  
  void b(String paramString)
  {
    this.m_text = paramString;
    this.m_IsAutoText = false;
    if (paramString == null) {
      this.m_deleted = true;
    }
  }
  
  public String getLinkedSource()
  {
    if (this.i == null) {
      return null;
    }
    return this.i.q();
  }
  
  public void setLinkedSource(String value)
  {
    if (value == null)
    {
      this.i = null;
      this.m_text = null;
    }
    else
    {
      Chart localChart = getChart();
      this.i = new zjk(localChart, value, this.i);
      this.m_text = this.i.r();
    }
  }
  
  void c(String paramString)
  {
    Chart localChart = getChart();
    try
    {
      this.i = new zjk(localChart, paramString, this.i);
    }
    catch (Exception localException)
    {
      zl.b(localException);
    }
  }
  
  byte[] G()
  {
    return this.i == null ? null : this.i.c;
  }
  
  boolean H()
  {
    return this.l;
  }
  
  void k(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  boolean I()
  {
    return this.m;
  }
  
  void l(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public int getTextDirection()
  {
    return this.n;
  }
  
  public void setTextDirection(int value)
  {
    this.n = value;
  }
  
  public boolean isTextWrapped()
  {
    return this.j;
  }
  
  public void setTextWrapped(boolean value)
  {
    this.j = value;
  }
  
  public boolean isResizeShapeToFitText()
  {
    return this.o;
  }
  
  public void setResizeShapeToFitText(boolean value)
  {
    this.o = value;
  }
  
  void a(ChartTextFrame paramChartTextFrame, CopyOptions paramCopyOptions)
  {
    super.a(paramChartTextFrame, paramCopyOptions);
    this.rotation = paramChartTextFrame.rotation;
    this.horizontal = paramChartTextFrame.horizontal;
    this.vertical = paramChartTextFrame.vertical;
    this.l = paramChartTextFrame.l;
    this.n = paramChartTextFrame.n;
    this.m_IsAutoText = paramChartTextFrame.m_IsAutoText;
    this.m_deleted = paramChartTextFrame.m_deleted;
    this.j = paramChartTextFrame.j;
    if ((paramChartTextFrame.i != null) && (getChart() != null) && (getChart().getWorksheet() != null))
    {
      this.i = new zjk(getChart());
      this.i.a(paramChartTextFrame.i, getChart().getWorksheet().getIndex(), paramCopyOptions);
    }
    this.m_text = paramChartTextFrame.m_text;
    if ((paramChartTextFrame.E() != null) && (paramChartTextFrame.E().size() > 0))
    {
      this.m_CharsList = new ArrayList();
      for (int i1 = 0; i1 < paramChartTextFrame.m_CharsList.size(); i1++)
      {
        FontSetting localFontSetting1 = (FontSetting)paramChartTextFrame.m_CharsList.get(i1);
        FontSetting localFontSetting2 = new FontSetting(localFontSetting1.getStartIndex(), localFontSetting1.getLength(), getChart().n(), this);
        localFontSetting2.getFont().a(localFontSetting1.getFont(), null);
        zf.a(this.m_CharsList, localFontSetting2);
      }
    }
    this.o = paramChartTextFrame.o;
  }
  
  boolean a(ChartTextFrame paramChartTextFrame)
  {
    if (this.rotation != paramChartTextFrame.rotation) {
      return false;
    }
    if (this.horizontal != paramChartTextFrame.horizontal) {
      return false;
    }
    if (this.vertical != paramChartTextFrame.vertical) {
      return false;
    }
    if (this.n != paramChartTextFrame.n) {
      return false;
    }
    if (!zw.b(this.m_text, paramChartTextFrame.m_text)) {
      return false;
    }
    if (this.m_IsAutoText != paramChartTextFrame.m_IsAutoText) {
      return false;
    }
    if (this.m_deleted != paramChartTextFrame.m_deleted) {
      return false;
    }
    if (this.o != paramChartTextFrame.o) {
      return false;
    }
    return super.a(paramChartTextFrame);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ChartTextFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */