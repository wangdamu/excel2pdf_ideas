package com.aspose.cells.a.d;

import com.aspose.cells.Encoding;
import com.aspose.cells.PdfSecurityOptions;
import com.aspose.cells.a.c.zs;
import com.aspose.cells.b.a.d.zh;

public class zfq
  extends zey
{
  private PdfSecurityOptions f;
  public zec a = null;
  static byte[] b = { 40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, 46, 46, 0, -74, -48, 104, 62, Byte.MIN_VALUE, 47, 12, -87, -2, 100, 83, 105, 122 };
  private byte[] g;
  private zs h = new zs();
  private byte[] i = new byte['Ā'];
  private byte[] j = new byte[32];
  private byte[] k = new byte[32];
  private byte[] l;
  private int m;
  public int c;
  
  public zfq(zec paramzec, PdfSecurityOptions paramPdfSecurityOptions)
  {
    super(paramzec.m());
    this.a = paramzec;
    paramzec.a(this);
    this.f = paramPdfSecurityOptions;
  }
  
  public String b()
  {
    return this.f.getUserPassword();
  }
  
  public void a(String paramString)
  {
    this.f.setUserPassword(paramString);
  }
  
  public String c()
  {
    return this.f.getOwnerPassword();
  }
  
  public void b(String paramString)
  {
    this.f.setOwnerPassword(paramString);
  }
  
  private int e()
  {
    int n = 0;
    if (this.f.getAnnotationsPermission() == true) {
      n |= 0x20;
    }
    if (this.f.getAssembleDocumentPermission() == true) {
      n |= 0x400;
    }
    if (this.f.getExtractContentPermission() == true) {
      n |= 0x10;
    }
    if (this.f.getExtractContentPermissionObsolete() == true) {
      n |= 0x10;
    }
    if (this.f.getFillFormsPermission() == true) {
      n |= 0x100;
    }
    if (this.f.getFullQualityPrintPermission() == true) {
      n |= 0x800;
    }
    if (this.f.getModifyDocumentPermission() == true) {
      n |= 0x8;
    }
    if (this.f.getPrintPermission() == true) {
      n |= 0x4;
    }
    return n;
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/Filter", "/Standard");
    paramzez.a("/Length", "128");
    paramzez.a("/O <");
    paramzez.a(this.j);
    paramzez.a(">");
    paramzez.a("/U <");
    paramzez.a(this.k);
    paramzez.a(">");
    paramzez.a("/P", this.c);
    paramzez.a("/V", "2");
    paramzez.a("/R", "3");
    paramzez.h();
    paramzez.b();
  }
  
  public void a(zh paramzh)
    throws Exception
  {
    if ((paramzh != null) && (paramzh.h() != 0L))
    {
      f();
      byte[] arrayOfByte = paramzh.m();
      b(arrayOfByte, 0, (int)paramzh.h());
    }
  }
  
  public byte[] c(String paramString)
    throws Exception
  {
    byte[] arrayOfByte1 = Encoding.getBigEndianUnicode().a(paramString);
    byte[] arrayOfByte2 = arrayOfByte1;
    byte[] arrayOfByte3 = new byte[2 + arrayOfByte2.length];
    System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 2, arrayOfByte2.length);
    arrayOfByte3[0] = -2;
    arrayOfByte3[1] = -1;
    if ((arrayOfByte2 != null) && (arrayOfByte2.length != 0))
    {
      f();
      b(arrayOfByte3, 0, arrayOfByte3.length);
    }
    return arrayOfByte3;
  }
  
  public byte[] d(String paramString)
    throws Exception
  {
    byte[] arrayOfByte = Encoding.getASCII().a(paramString);
    if ((arrayOfByte != null) && (arrayOfByte.length != 0))
    {
      f();
      b(arrayOfByte, 0, arrayOfByte.length);
    }
    return arrayOfByte;
  }
  
  public void d()
    throws Exception
  {
    this.c = e();
    boolean bool = true;
    if ((b() == null) || (b().length() == 0)) {
      a("");
    }
    if ((c() == null) || (c().length() == 0)) {
      b(b());
    }
    this.c |= (int)(bool ? 4294963392L : 4294967232L);
    this.c &= 0xFFFFFFFC;
    if ((!d) && (c().length() <= 0)) {
      throw new AssertionError("Empty owner password.");
    }
    byte[] arrayOfByte1 = e(b());
    byte[] arrayOfByte2 = e(c());
    this.h.a();
    this.j = a(arrayOfByte1, arrayOfByte2, bool);
    byte[] arrayOfByte3 = this.a.n();
    a(arrayOfByte3, b(), this.j, this.c, bool);
  }
  
  private byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, boolean paramBoolean)
  {
    byte[] arrayOfByte1 = new byte[32];
    byte[] arrayOfByte2 = this.h.a(paramArrayOfByte2);
    if (paramBoolean)
    {
      byte[] arrayOfByte3 = new byte[16];
      for (int n = 0; n < 50; n++) {
        arrayOfByte2 = this.h.a(arrayOfByte2);
      }
      System.arraycopy(paramArrayOfByte1, 0, arrayOfByte1, 0, 32);
      for (n = 0; n < 20; n++)
      {
        for (int i1 = 0; i1 < arrayOfByte3.length; i1++) {
          arrayOfByte3[i1] = ((byte)(arrayOfByte2[i1] & 0xFF ^ n));
        }
        b(arrayOfByte3);
        c(arrayOfByte1);
      }
    }
    else
    {
      a(arrayOfByte2, 0, 5);
      a(paramArrayOfByte1, arrayOfByte1);
    }
    return arrayOfByte1;
  }
  
  public void a(zey paramzey)
  {
    byte[] arrayOfByte = new byte[5];
    this.h.a();
    arrayOfByte[0] = ((byte)paramzey.n());
    arrayOfByte[1] = ((byte)(paramzey.n() >> 8));
    arrayOfByte[2] = ((byte)(paramzey.n() >> 16));
    arrayOfByte[3] = 0;
    arrayOfByte[4] = 0;
    this.h.a(this.g, 0, this.g.length, this.g, 0);
    this.h.a(arrayOfByte, 0, arrayOfByte.length);
    this.l = this.h.b();
    this.h.a();
    this.m = (this.g.length + 5);
    if (this.m > 16) {
      this.m = 16;
    }
  }
  
  private void a(byte[] paramArrayOfByte1, String paramString, byte[] paramArrayOfByte2, int paramInt, boolean paramBoolean)
    throws Exception
  {
    a(paramArrayOfByte1, e(paramString), paramArrayOfByte2, paramInt, paramBoolean);
    a(paramArrayOfByte1);
  }
  
  private void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt, boolean paramBoolean)
  {
    this.j = paramArrayOfByte3;
    this.g = new byte[paramBoolean ? 16 : 5];
    this.h.a();
    this.h.a(paramArrayOfByte2, 0, paramArrayOfByte2.length, paramArrayOfByte2, 0);
    this.h.a(paramArrayOfByte3, 0, paramArrayOfByte3.length, paramArrayOfByte3, 0);
    byte[] arrayOfByte1 = new byte[4];
    arrayOfByte1[0] = ((byte)paramInt);
    arrayOfByte1[1] = ((byte)(paramInt >> 8));
    arrayOfByte1[2] = ((byte)(paramInt >> 16));
    arrayOfByte1[3] = ((byte)(paramInt >> 24));
    this.h.a(arrayOfByte1, 0, 4, arrayOfByte1, 0);
    this.h.a(paramArrayOfByte1, 0, paramArrayOfByte1.length, paramArrayOfByte1, 0);
    this.h.a(arrayOfByte1, 0, 0);
    byte[] arrayOfByte2 = this.h.b();
    this.h.a();
    if (this.g.length == 16) {
      for (int n = 0; n < 50; n++)
      {
        arrayOfByte2 = this.h.a(arrayOfByte2);
        this.h.a();
      }
    }
    System.arraycopy(arrayOfByte2, 0, this.g, 0, this.g.length);
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    if (this.g.length == 16)
    {
      this.h.a(b, 0, b.length, b, 0);
      this.h.a(paramArrayOfByte, 0, paramArrayOfByte.length);
      byte[] arrayOfByte = this.h.b();
      this.h.a();
      System.arraycopy(arrayOfByte, 0, this.k, 0, 16);
      for (int n = 16; n < 32; n++) {
        this.k[n] = 0;
      }
      for (n = 0; n < 20; n++)
      {
        for (int i1 = 0; i1 < this.g.length; i1++) {
          arrayOfByte[i1] = ((byte)(this.g[i1] & 0xFF ^ n));
        }
        a(arrayOfByte, 0, this.g.length);
        b(this.k, 0, 16);
      }
    }
    else
    {
      b(this.g);
      a(b, this.k);
    }
  }
  
  private byte[] e(String paramString)
    throws Exception
  {
    byte[] arrayOfByte = new byte[32];
    if (paramString == null)
    {
      System.arraycopy(b, 0, arrayOfByte, 0, 32);
    }
    else
    {
      int n = paramString.length();
      System.arraycopy(Encoding.getASCII().a(paramString), 0, arrayOfByte, 0, Math.min(n, 32));
      if (n < 32) {
        System.arraycopy(b, 0, arrayOfByte, n, 32 - n);
      }
    }
    return arrayOfByte;
  }
  
  private void f()
  {
    a(this.l, 0, this.m);
  }
  
  private void b(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int n = 0;
    int i1 = 0;
    for (int i2 = 0; i2 < 256; i2++) {
      this.i[i2] = ((byte)i2);
    }
    for (int i3 = 0; i3 < 256; i3++)
    {
      i1 = (paramArrayOfByte[(n + paramInt1)] & 0xFF) + (this.i[i3] & 0xFF) + i1 & 0xFF;
      i2 = this.i[i3];
      this.i[i3] = this.i[i1];
      this.i[i1] = i2;
      n = (n + 1) % paramInt2;
    }
  }
  
  private void c(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte, 0, paramArrayOfByte.length, paramArrayOfByte);
  }
  
  private void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a(paramArrayOfByte, paramInt1, paramInt2, paramArrayOfByte);
  }
  
  private void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    a(paramArrayOfByte1, 0, paramArrayOfByte1.length, paramArrayOfByte2);
  }
  
  private void a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    paramInt2 += paramInt1;
    int n = 0;
    int i1 = 0;
    for (int i3 = paramInt1; i3 < paramInt2; i3++)
    {
      n = n + 1 & 0xFF;
      i1 = (this.i[n] & 0xFF) + i1 & 0xFF;
      int i2 = this.i[n];
      this.i[n] = this.i[i1];
      this.i[i1] = i2;
      paramArrayOfByte2[i3] = ((byte)(paramArrayOfByte1[i3] & 0xFF ^ this.i[((this.i[n] & 0xFF) + (this.i[i1] & 0xFF) & 0xFF)] & 0xFF));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */