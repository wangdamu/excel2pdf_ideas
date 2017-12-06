package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zc;

class zbzj
  extends zcd
{
  zbzj()
  {
    c(224);
    b(20);
    this.b = new byte[20];
    a();
  }
  
  void a()
  {
    za.a(this.b, 0, this.b.length);
    this.b[4] = -11;
    this.b[5] = -1;
    this.b[6] = 32;
    this.b[9] = -8;
    this.b[18] = -64;
    this.b[19] = 32;
  }
  
  void a(int paramInt)
  {
    if ((paramInt & 0xFFFF) != 0) {
      System.arraycopy(zc.a(paramInt), 0, this.b, 0, 2);
    }
  }
  
  int a(Style paramStyle, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = true;
    if (paramStyle.getPattern() == 0) {
      return 64;
    }
    if (paramStyle.getPattern() == 1) {
      return paramStyle.b.a(paramStyle.e(), 65, true, paramArrayOfBoolean);
    }
    return paramStyle.b.a(paramStyle.e(), 64, true, paramArrayOfBoolean);
  }
  
  int b(Style paramStyle, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = true;
    switch (paramStyle.getPattern())
    {
    case 0: 
      return 65;
    case 1: 
      return 64;
    }
    return paramStyle.a.a(paramStyle.e(), 65, true, paramArrayOfBoolean);
  }
  
  int a(Style paramStyle, zaml paramzaml, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = true;
    return paramzaml.a(paramStyle.e(), 64, true, paramArrayOfBoolean);
  }
  
  zbzi a(Style paramStyle, int paramInt)
  {
    zbzi localzbzi = new zbzi();
    if (paramStyle.g()) {
      this.b[9] = paramStyle.i();
    } else {
      this.b[9] = ((byte)((paramStyle.i() & 0xFF ^ 0xFFFFFFFF) & 0xFC));
    }
    if (paramStyle.g())
    {
      this.b[4] = 1;
      this.b[5] = 0;
      if (paramStyle.h() != 0)
      {
        i = (paramStyle.h() << 4) + 1;
        if ((i & 0xFFFF) != 65521) {
          System.arraycopy(zc.a(i), 0, this.b, 4, 2);
        }
      }
    }
    else
    {
      this.b[4] = -11;
      this.b[5] = -1;
    }
    int i = 0;
    int n;
    if (paramStyle.isGradient())
    {
      int j = 1;
      j <<= 2;
      this.b[17] = ((byte)j);
      boolean[] arrayOfBoolean2 = { i };
      n = a(paramStyle, arrayOfBoolean2);
      i = arrayOfBoolean2[0];
      if (i == 0) {
        localzbzi.a(4, paramStyle.b);
      }
      byte[] tmp207_202 = this.b;
      tmp207_202[18] = ((byte)(tmp207_202[18] & 0x80));
      byte[] tmp221_216 = this.b;
      tmp221_216[18] = ((byte)(tmp221_216[18] | (byte)n));
      GradientFill localGradientFill = new GradientFill(null, null);
      localGradientFill.a(3, paramStyle.b, 0.0D, paramStyle.a, paramStyle.y(), paramStyle.z());
      localzbzi.a(6, localGradientFill);
    }
    else
    {
      if ((!zh.a(paramStyle.getBackgroundColor())) && (paramStyle.getPattern() != 0))
      {
        boolean[] arrayOfBoolean1 = { i };
        int m = b(paramStyle, arrayOfBoolean1);
        i = arrayOfBoolean1[0];
        if (i == 0) {
          localzbzi.a(5, paramStyle.a);
        }
        if (m != -1)
        {
          n = paramStyle.getPattern();
          n <<= 2;
          this.b[17] = ((byte)n);
          n = m & 0x1;
          if (n == 1)
          {
            byte[] tmp378_373 = this.b;
            tmp378_373[18] = ((byte)(tmp378_373[18] | 0x80));
          }
          else
          {
            byte[] tmp395_390 = this.b;
            tmp395_390[18] = ((byte)(tmp395_390[18] & 0x7F));
          }
          n = m >> 1;
          this.b[19] = ((byte)n);
        }
      }
      if (paramStyle.getPattern() != 0)
      {
        int k = paramStyle.getPattern();
        k <<= 2;
        this.b[17] = ((byte)k);
        boolean[] arrayOfBoolean3 = { i };
        n = a(paramStyle, arrayOfBoolean3);
        i = arrayOfBoolean3[0];
        if (i == 0) {
          localzbzi.a(4, paramStyle.b);
        }
        byte[] tmp493_488 = this.b;
        tmp493_488[18] = ((byte)(tmp493_488[18] & 0x80));
        byte[] tmp507_502 = this.b;
        tmp507_502[18] = ((byte)(tmp507_502[18] | (byte)n));
      }
    }
    if (paramStyle.x())
    {
      byte[] tmp528_523 = this.b;
      tmp528_523[19] = ((byte)(tmp528_523[19] | 0x40));
    }
    a(paramStyle, localzbzi);
    a(paramStyle);
    b(paramStyle);
    c(paramStyle);
    if (paramStyle.getTextDirection() != 0) {
      if (paramStyle.getTextDirection() == 1)
      {
        byte[] tmp577_572 = this.b;
        tmp577_572[8] = ((byte)(tmp577_572[8] | 0x40));
      }
      else
      {
        byte[] tmp593_588 = this.b;
        tmp593_588[8] = ((byte)(tmp593_588[8] | 0x80));
      }
    }
    if (paramStyle.r() != -1) {
      System.arraycopy(zc.a(paramStyle.r()), 0, this.b, 2, 2);
    }
    if (paramStyle.isTextWrapped())
    {
      byte[] tmp639_634 = this.b;
      tmp639_634[6] = ((byte)(tmp639_634[6] | 0x8));
    }
    if (paramStyle.getRotationAngle() >= 0) {
      this.b[7] = ((byte)paramStyle.getRotationAngle());
    } else {
      this.b[7] = ((byte)(90 - paramStyle.getRotationAngle()));
    }
    if (!paramStyle.isLocked())
    {
      int tmp695_694 = 4;
      byte[] tmp695_691 = this.b;
      tmp695_691[tmp695_694] = ((byte)(tmp695_691[tmp695_694] & 0xFE));
    }
    if (paramStyle.isFormulaHidden())
    {
      int tmp715_714 = 4;
      byte[] tmp715_711 = this.b;
      tmp715_711[tmp715_714] = ((byte)(tmp715_711[tmp715_714] | 0x2));
    }
    if (paramStyle.w())
    {
      int tmp733_732 = 4;
      byte[] tmp733_729 = this.b;
      tmp733_729[tmp733_732] = ((byte)(tmp733_729[tmp733_732] | 0x8));
    }
    if (paramStyle.getShrinkToFit())
    {
      byte[] tmp753_748 = this.b;
      tmp753_748[8] = ((byte)(tmp753_748[8] | 0x10));
    }
    if (paramStyle.getIndentLevel() != 0)
    {
      byte[] tmp773_768 = this.b;
      tmp773_768[8] = ((byte)(tmp773_768[8] & 0xF0));
      if (paramStyle.getIndentLevel() > 15)
      {
        byte[] tmp796_791 = this.b;
        tmp796_791[8] = ((byte)(tmp796_791[8] | 0xF));
        localzbzi.a(15, Short.valueOf((short)paramStyle.getIndentLevel()));
      }
      else
      {
        byte[] tmp827_822 = this.b;
        tmp827_822[8] = ((byte)(tmp827_822[8] | (byte)paramStyle.getIndentLevel()));
      }
    }
    byte[] tmp843_838 = this.b;
    tmp843_838[17] = ((byte)(tmp843_838[17] | 0x2));
    return localzbzi;
  }
  
  private void a(Style paramStyle, zbzi paramzbzi)
  {
    int j = -1;
    int k = 0;
    zaml localzaml = paramStyle.getBorders().getByBorderType(1).a;
    int m = paramStyle.getBorders().getByBorderType(1).getLineStyle();
    boolean[] arrayOfBoolean;
    if (m != 0)
    {
      arrayOfBoolean = new boolean[] { k };
      j = a(paramStyle, localzaml, arrayOfBoolean);
      k = arrayOfBoolean[0];
      if (k == 0) {
        paramzbzi.a(9, localzaml);
      }
      byte[] tmp84_79 = this.b;
      tmp84_79[12] = ((byte)(tmp84_79[12] | (byte)j));
    }
    localzaml = paramStyle.getBorders().getByBorderType(2).a;
    m = paramStyle.getBorders().getByBorderType(2).getLineStyle();
    int i;
    if (m != 0)
    {
      arrayOfBoolean = new boolean[] { k };
      j = a(paramStyle, localzaml, arrayOfBoolean);
      k = arrayOfBoolean[0];
      if (k == 0) {
        paramzbzi.a(10, localzaml);
      }
      i = j & 0x1;
      j >>= 1;
      if (i == 0)
      {
        byte[] tmp185_180 = this.b;
        tmp185_180[12] = ((byte)(tmp185_180[12] & 0x7F));
      }
      else
      {
        byte[] tmp201_196 = this.b;
        tmp201_196[12] = ((byte)(tmp201_196[12] | 0x80));
      }
      byte[] tmp215_210 = this.b;
      tmp215_210[13] = ((byte)(tmp215_210[13] | (byte)j));
    }
    localzaml = paramStyle.getBorders().getByBorderType(4).a;
    m = paramStyle.getBorders().getByBorderType(4).getLineStyle();
    if (m != 0)
    {
      arrayOfBoolean = new boolean[] { k };
      j = a(paramStyle, localzaml, arrayOfBoolean);
      k = arrayOfBoolean[0];
      if (k == 0) {
        paramzbzi.a(7, localzaml);
      }
      byte[] tmp301_296 = this.b;
      tmp301_296[14] = ((byte)(tmp301_296[14] | (byte)j));
    }
    localzaml = paramStyle.getBorders().getByBorderType(8).a;
    m = paramStyle.getBorders().getByBorderType(8).getLineStyle();
    if (m != 0)
    {
      arrayOfBoolean = new boolean[] { k };
      j = a(paramStyle, localzaml, arrayOfBoolean);
      k = arrayOfBoolean[0];
      if (k == 0) {
        paramzbzi.a(8, localzaml);
      }
      i = j & 0x1;
      if (i == 0)
      {
        byte[] tmp398_393 = this.b;
        tmp398_393[14] = ((byte)(tmp398_393[14] & 0x7F));
      }
      else
      {
        byte[] tmp414_409 = this.b;
        tmp414_409[14] = ((byte)(tmp414_409[14] | 0x80));
      }
      j >>= 1;
      byte[] tmp434_429 = this.b;
      tmp434_429[15] = ((byte)(tmp434_429[15] | (byte)j));
    }
    localzaml = paramStyle.getBorders().e();
    m = paramStyle.getBorders().getDiagonalStyle();
    if (m != 0)
    {
      arrayOfBoolean = new boolean[] { k };
      j = a(paramStyle, localzaml, arrayOfBoolean);
      k = arrayOfBoolean[0];
      if (k == 0) {
        paramzbzi.a(11, localzaml);
      }
      i = j & 0x3;
      if (i != 0)
      {
        byte[] tmp521_516 = this.b;
        tmp521_516[15] = ((byte)(tmp521_516[15] | (byte)(i << 6)));
      }
      i = j & 0xFFFC;
      byte[] tmp543_538 = this.b;
      tmp543_538[16] = ((byte)(tmp543_538[16] | (byte)(i >> 2)));
    }
  }
  
  private void a(Style paramStyle)
  {
    BorderCollection localBorderCollection = paramStyle.getBorders();
    int i = localBorderCollection.getByBorderType(1).getLineStyle();
    if (i != 0)
    {
      byte[] tmp24_19 = this.b;
      tmp24_19[10] = ((byte)(tmp24_19[10] | (byte)i));
    }
    i = localBorderCollection.getByBorderType(2).getLineStyle();
    if (i != 0)
    {
      byte[] tmp50_45 = this.b;
      tmp50_45[10] = ((byte)(tmp50_45[10] | (byte)((byte)i << 4)));
    }
    i = localBorderCollection.getByBorderType(4).getLineStyle();
    if (i != 0)
    {
      byte[] tmp79_74 = this.b;
      tmp79_74[11] = ((byte)(tmp79_74[11] | (byte)i));
    }
    i = localBorderCollection.getByBorderType(8).getLineStyle();
    int j;
    if (i != 0)
    {
      j = i;
      byte[] tmp109_104 = this.b;
      tmp109_104[11] = ((byte)(tmp109_104[11] | (byte)((byte)i << 4)));
    }
    i = paramStyle.getBorders().getDiagonalStyle();
    if (i != 0)
    {
      j = (byte)i << 5;
      byte[] tmp143_138 = this.b;
      tmp143_138[16] = ((byte)(tmp143_138[16] | (byte)j));
      j &= 0x100;
      if (j == 0)
      {
        byte[] tmp170_165 = this.b;
        tmp170_165[17] = ((byte)(tmp170_165[17] & 0xFE));
      }
      else
      {
        byte[] tmp187_182 = this.b;
        tmp187_182[17] = ((byte)(tmp187_182[17] | 0x1));
      }
      byte[] tmp199_194 = this.b;
      tmp199_194[13] = ((byte)(tmp199_194[13] | (byte)((paramStyle.getBorders().f() & 0xFF) << 6)));
    }
  }
  
  private void b(Style paramStyle)
  {
    switch (paramStyle.getHorizontalAlignment())
    {
    case 5: 
      byte[] tmp58_53 = this.b;
      tmp58_53[6] = ((byte)(tmp58_53[6] & 0xF8));
      break;
    case 7: 
      byte[] tmp75_70 = this.b;
      tmp75_70[6] = ((byte)(tmp75_70[6] & 0xF8));
      byte[] tmp89_84 = this.b;
      tmp89_84[6] = ((byte)(tmp89_84[6] | 0x1));
      break;
    case 1: 
      byte[] tmp104_99 = this.b;
      tmp104_99[6] = ((byte)(tmp104_99[6] & 0xF8));
      byte[] tmp118_113 = this.b;
      tmp118_113[6] = ((byte)(tmp118_113[6] | 0x2));
      break;
    case 8: 
      byte[] tmp133_128 = this.b;
      tmp133_128[6] = ((byte)(tmp133_128[6] & 0xF8));
      byte[] tmp147_142 = this.b;
      tmp147_142[6] = ((byte)(tmp147_142[6] | 0x3));
      break;
    case 4: 
      byte[] tmp162_157 = this.b;
      tmp162_157[6] = ((byte)(tmp162_157[6] & 0xF8));
      byte[] tmp176_171 = this.b;
      tmp176_171[6] = ((byte)(tmp176_171[6] | 0x4));
      break;
    case 6: 
      byte[] tmp191_186 = this.b;
      tmp191_186[6] = ((byte)(tmp191_186[6] & 0xF8));
      byte[] tmp205_200 = this.b;
      tmp205_200[6] = ((byte)(tmp205_200[6] | 0x5));
      break;
    case 2: 
      byte[] tmp220_215 = this.b;
      tmp220_215[6] = ((byte)(tmp220_215[6] & 0xF8));
      byte[] tmp234_229 = this.b;
      tmp234_229[6] = ((byte)(tmp234_229[6] | 0x6));
      break;
    case 3: 
      byte[] tmp250_245 = this.b;
      tmp250_245[6] = ((byte)(tmp250_245[6] & 0xF8));
      byte[] tmp264_259 = this.b;
      tmp264_259[6] = ((byte)(tmp264_259[6] | 0x7));
      break;
    }
  }
  
  private void c(Style paramStyle)
  {
    switch (paramStyle.getVerticalAlignment())
    {
    case 9: 
      byte[] tmp66_61 = this.b;
      tmp66_61[6] = ((byte)(tmp66_61[6] & 0x8F));
      break;
    case 1: 
      byte[] tmp83_78 = this.b;
      tmp83_78[6] = ((byte)(tmp83_78[6] & 0x8F));
      byte[] tmp97_92 = this.b;
      tmp97_92[6] = ((byte)(tmp97_92[6] | 0x10));
      break;
    case 0: 
      byte[] tmp113_108 = this.b;
      tmp113_108[6] = ((byte)(tmp113_108[6] & 0x8F));
      byte[] tmp127_122 = this.b;
      tmp127_122[6] = ((byte)(tmp127_122[6] | 0x20));
      break;
    case 6: 
      byte[] tmp143_138 = this.b;
      tmp143_138[6] = ((byte)(tmp143_138[6] & 0x8F));
      byte[] tmp157_152 = this.b;
      tmp157_152[6] = ((byte)(tmp157_152[6] | 0x30));
      break;
    case 3: 
      byte[] tmp173_168 = this.b;
      tmp173_168[6] = ((byte)(tmp173_168[6] & 0x8F));
      byte[] tmp187_182 = this.b;
      tmp187_182[6] = ((byte)(tmp187_182[6] | 0x40));
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */