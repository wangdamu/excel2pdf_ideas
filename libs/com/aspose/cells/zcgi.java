package com.aspose.cells;

class zcgi
  extends zche
{
  zcgi()
  {
    this.d = 479;
  }
  
  void a(PageSetup paramPageSetup)
    throws Exception
  {
    String str1 = paramPageSetup.a(true, 2);
    String str2 = paramPageSetup.a(false, 2);
    String str3 = paramPageSetup.a(true, 0);
    String str4 = paramPageSetup.a(false, 0);
    String str5 = paramPageSetup.a(true, 1);
    String str6 = paramPageSetup.a(false, 1);
    int i = 26 + 2 * str1.length() + 2 * str2.length() + 2 * str3.length() + 2 * str4.length() + 2 * str5.length() + 2 * str6.length();
    this.c = new byte[i];
    int j = 0;
    if ((str1.length() > 0) || (str2.length() > 0) || (str3.length() > 0) || (str4.length() > 0) || (str5.length() > 0) || (str6.length() > 0))
    {
      if (paramPageSetup.isHFDiffOddEven()) {
        j = (byte)(j | 0x1);
      }
      if (paramPageSetup.isHFDiffFirst()) {
        j = (byte)(j | 0x2);
      }
      if (paramPageSetup.isHFScaleWithDoc()) {
        j = (byte)(j | 0x4);
      }
      if (paramPageSetup.isHFAlignMargins()) {
        j = (byte)(j | 0x8);
      }
      this.c[0] = j;
      int k = 2;
      byte[] arrayOfByte = { -1, -1, -1, -1 };
      if (str5.length() > 0)
      {
        k = zcgj.a(this.c, k, str5);
      }
      else
      {
        System.arraycopy(arrayOfByte, 0, this.c, k, 4);
        k += 4;
      }
      if (str6.length() > 0)
      {
        k = zcgj.a(this.c, k, str6);
      }
      else
      {
        System.arraycopy(arrayOfByte, 0, this.c, k, 4);
        k += 4;
      }
      if (str3.length() > 0)
      {
        k = zcgj.a(this.c, k, str3);
      }
      else
      {
        System.arraycopy(arrayOfByte, 0, this.c, k, 4);
        k += 4;
      }
      if (str4.length() > 0)
      {
        k = zcgj.a(this.c, k, str4);
      }
      else
      {
        System.arraycopy(arrayOfByte, 0, this.c, k, 4);
        k += 4;
      }
      if (str1.length() > 0)
      {
        k = zcgj.a(this.c, k, str1);
      }
      else
      {
        System.arraycopy(arrayOfByte, 0, this.c, k, 4);
        k += 4;
      }
      if (str2.length() > 0)
      {
        k = zcgj.a(this.c, k, str2);
      }
      else
      {
        System.arraycopy(arrayOfByte, 0, this.c, k, 4);
        k += 4;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */