package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.zc;

class zaot
  extends zcd
{
  private zava a;
  
  zaot(zava paramzava)
  {
    c(4105);
    this.a = paramzava;
    b(20);
    this.b = new byte[20];
    this.b[10] = 1;
    this.b[12] = 77;
    this.b[14] = 77;
    this.b[16] = 60;
  }
  
  void a(Marker paramMarker, int paramInt)
  {
    if (paramMarker.getMarkerStyle() == 0) {
      return;
    }
    byte[] tmp14_9 = this.b;
    tmp14_9[10] = ((byte)(tmp14_9[10] & 0xFE));
    int i;
    switch (paramMarker.e())
    {
    case 0: 
      this.b[12] = ((byte)((32 + paramInt) % 56));
      break;
    case 2: 
      if (!zh.a(paramMarker.d()))
      {
        i = this.a.a(paramMarker.d());
        a(paramMarker.d(), i);
      }
      break;
    case 1: 
      byte[] tmp110_105 = this.b;
      tmp110_105[10] = ((byte)(tmp110_105[10] | 0x20));
    }
    switch (paramMarker.g())
    {
    case 0: 
      this.b[14] = ((byte)((32 + paramInt) % 56));
      break;
    case 2: 
      if (!zh.a(paramMarker.f()))
      {
        i = this.a.a(paramMarker.f());
        b(paramMarker.f(), i);
      }
      break;
    case 1: 
      byte[] tmp206_201 = this.b;
      tmp206_201[10] = ((byte)(tmp206_201[10] | 0x10));
    }
    d(paramMarker.getMarkerStyle());
    a(paramMarker.getMarkerSize());
  }
  
  private void a(Color paramColor, int paramInt)
  {
    if (paramInt == -1) {
      paramInt = this.a.a(zh.b(paramColor) & 0xFF, zh.c(paramColor) & 0xFF, zh.d(paramColor) & 0xFF);
    }
    this.b[0] = zh.b(paramColor);
    this.b[1] = zh.c(paramColor);
    this.b[2] = zh.d(paramColor);
    this.b[12] = ((byte)paramInt);
  }
  
  private void b(Color paramColor, int paramInt)
  {
    if (paramInt == -1) {
      paramInt = this.a.a(zh.b(paramColor) & 0xFF, zh.c(paramColor) & 0xFF, zh.d(paramColor) & 0xFF);
    }
    this.b[4] = zh.b(paramColor);
    this.b[5] = zh.c(paramColor);
    this.b[6] = zh.d(paramColor);
    this.b[14] = ((byte)paramInt);
  }
  
  private void a(int paramInt)
  {
    System.arraycopy(zc.a(paramInt * 20), 0, this.b, 16, 2);
  }
  
  private void d(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    case 3: 
      this.b[8] = 2;
      break;
    case 1: 
      this.b[8] = 8;
      break;
    case 2: 
      this.b[8] = 7;
      break;
    case 4: 
      this.b[8] = 6;
      break;
    case 5: 
      this.b[8] = 0;
      break;
    case 7: 
      this.b[8] = 1;
      break;
    case 6: 
      this.b[8] = 9;
      break;
    case 8: 
      this.b[8] = 5;
      break;
    case 10: 
      this.b[8] = 4;
      break;
    case 9: 
      this.b[8] = 3;
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */