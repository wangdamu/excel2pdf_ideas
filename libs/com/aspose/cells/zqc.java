package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

class zqc
{
  String a;
  String b;
  String c;
  String d;
  boolean e = true;
  boolean f = true;
  boolean g = false;
  boolean h = false;
  double i = -1.0D;
  double j = -1.0D;
  double k = -1.0D;
  double l = -1.0D;
  double m = -1.0D;
  double n = -1.0D;
  private static final za o = new za(new String[] { "width", "height" });
  
  void a(Picture paramPicture, int paramInt)
  {
    if (this.c != null) {
      a(this.c, paramPicture, paramInt);
    }
    if (this.j > 0.0D) {
      paramPicture.getFormatPicture().setBottomCrop(this.j);
    }
    if (this.k > 0.0D) {
      paramPicture.getFormatPicture().setLeftCrop(this.k);
    }
    if (this.l > 0.0D) {
      paramPicture.getFormatPicture().setRightCrop(this.l);
    }
    if (this.i > 0.0D) {
      paramPicture.getFormatPicture().setTopCrop(this.i);
    }
    paramPicture.a = this.m;
    paramPicture.b = this.n;
  }
  
  static void a(String paramString, Shape paramShape, int paramInt)
  {
    String[] arrayOfString1 = zw.d(paramString, ';');
    for (int i1 = 0; i1 < arrayOfString1.length; i1++)
    {
      String[] arrayOfString2 = zw.d(arrayOfString1[i1], ':');
      if (arrayOfString2.length == 2) {
        switch (o.a(arrayOfString2[0].trim()))
        {
        case 0: 
          paramShape.setWidthInch(zbxp.a(arrayOfString2[1], "in", paramInt));
          break;
        case 1: 
          paramShape.setHeightInch(zbxp.a(arrayOfString2[1], "in", paramInt));
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */