package com.aspose.cells;

import java.util.ArrayList;

class zjl
{
  String a;
  String b;
  String c;
  ArrayList d;
  
  zjk a(Chart paramChart)
  {
    zjk localzjk = new zjk(paramChart);
    if (this.b != null)
    {
      if ((this.b.charAt(0) != '(') && (this.b.indexOf('!') == -1) && (this.b.indexOf(',') != -1) && (this.b.charAt(0) != '{')) {
        this.b = ("{" + this.b + "}");
      }
      String str = this.b;
      if (str.indexOf("[0]!") != -1) {
        str = str.substring(4);
      }
      try
      {
        localzjk.b(str);
      }
      catch (Exception localException) {}
    }
    localzjk.b = this.d;
    return localzjk;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */