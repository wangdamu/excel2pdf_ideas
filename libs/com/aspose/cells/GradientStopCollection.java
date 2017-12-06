package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class GradientStopCollection
  extends CollectionBase
{
  private GradientFill a;
  
  GradientFill a()
  {
    return this.a;
  }
  
  GradientStopCollection(GradientFill fill)
  {
    this.a = fill;
  }
  
  public void add(double position, CellsColor color, int alpha)
  {
    GradientStop localGradientStop = new GradientStop(this);
    localGradientStop.setPosition(position);
    localGradientStop.a = color.a;
    localGradientStop.a(alpha);
    a(localGradientStop);
  }
  
  public void add(double position, Color color, int alpha)
  {
    GradientStop localGradientStop = new GradientStop(this);
    localGradientStop.setPosition(position);
    localGradientStop.a = new zaml(true);
    localGradientStop.a.a(2, color.toArgb());
    localGradientStop.a(alpha);
    a(localGradientStop);
  }
  
  void a(GradientStop paramGradientStop)
  {
    zf.a(this.InnerList, paramGradientStop);
  }
  
  public GradientStop get(int index)
  {
    return (GradientStop)this.InnerList.get(index);
  }
  
  public void set(int index, GradientStop value)
  {
    this.InnerList.set(index, value);
  }
  
  void a(int paramInt, GradientStop paramGradientStop)
  {
    this.InnerList.add(paramInt, paramGradientStop);
  }
  
  void a(GradientStopCollection paramGradientStopCollection, CopyOptions paramCopyOptions)
  {
    this.InnerList.clear();
    for (int i = 0; i < paramGradientStopCollection.getCount(); i++)
    {
      GradientStop localGradientStop = new GradientStop(this);
      localGradientStop.a(paramGradientStopCollection.get(i), paramCopyOptions);
      zf.a(this.InnerList, localGradientStop);
    }
  }
  
  boolean a(GradientStopCollection paramGradientStopCollection)
  {
    if (getCount() != paramGradientStopCollection.getCount()) {
      return false;
    }
    for (int i = 0; i < paramGradientStopCollection.getCount(); i++) {
      if (!get(i).a(paramGradientStopCollection.get(i))) {
        return false;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/GradientStopCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */