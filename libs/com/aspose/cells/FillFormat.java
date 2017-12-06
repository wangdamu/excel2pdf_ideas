package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zr;
import java.util.ArrayList;

public class FillFormat
{
  Fill a;
  ShapeFormat b;
  boolean c = false;
  
  Color a()
  {
    return Color.getEmpty();
  }
  
  Color b()
  {
    switch (getFillType())
    {
    case 2: 
      return getSolidFill().getColor();
    case 5: 
      return getPatternFill().getForegroundColor();
    case 3: 
      return getGradientFill().getGradientStops().get(0).getCellsColor().getColor();
    }
    return a();
  }
  
  void a(Color paramColor)
  {
    switch (getFillType())
    {
    case 2: 
      getSolidFill().setColor(paramColor);
      break;
    case 5: 
      getPatternFill().setForegroundColor(paramColor);
      break;
    case 3: 
      getGradientFill().getGradientStops().get(0).getCellsColor().setColor(paramColor);
      break;
    case 4: 
    default: 
      setFillType(2);
      getSolidFill().setColor(paramColor);
    }
  }
  
  Color c()
  {
    switch (getFillType())
    {
    case 2: 
      return getSolidFill().d();
    case 5: 
      return getPatternFill().getBackgroundColor();
    case 3: 
      if (getGradientFill().getGradientStops().getCount() > 1) {
        return getGradientFill().getGradientStops().get(1).getCellsColor().getColor();
      }
      return getGradientFill().getGradientStops().get(0).getCellsColor().getColor();
    }
    return Color.getBlack();
  }
  
  void b(Color paramColor)
  {
    switch (getFillType())
    {
    case 2: 
      getSolidFill().a(paramColor);
      break;
    case 5: 
      getPatternFill().setBackgroundColor(paramColor);
      break;
    case 3: 
      if (getGradientFill().getGradientStops().getCount() > 1) {
        getGradientFill().getGradientStops().get(1).getCellsColor().setColor(paramColor);
      } else {
        getGradientFill().getGradientStops().get(0).getCellsColor().setColor(paramColor);
      }
      break;
    case 4: 
    default: 
      setFillType(2);
      getSolidFill().a(paramColor);
    }
  }
  
  double d()
  {
    double d = 1.0D;
    if (getFillType() == 2) {
      d = 1.0D - getSolidFill().getTransparency();
    } else if (getFillType() == 4) {
      d = 1.0D - getTextureFill().getTransparency();
    } else if (getFillType() == 5) {
      d = 1.0D - getPatternFill().getForeTransparency();
    }
    return d;
  }
  
  void a(double paramDouble)
  {
    if (getFillType() == 2) {
      getSolidFill().setTransparency(1.0D - paramDouble);
    } else if (getFillType() == 4) {
      getTextureFill().setTransparency(1.0D - paramDouble);
    } else if (getFillType() == 5) {
      getPatternFill().setForeTransparency(1.0D - paramDouble);
    }
  }
  
  /**
   * @deprecated
   */
  public int getType()
  {
    return getFillType();
  }
  
  /**
   * @deprecated
   */
  public void setType(int value)
  {
    setFillType(value);
  }
  
  public int getFillType()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.a();
  }
  
  public void setFillType(int value)
  {
    if (getFillType() == value) {
      return;
    }
    if (this.b != null) {
      this.b.a(0, this);
    }
    switch (value)
    {
    case 1: 
      this.a = new NoneFill();
      break;
    case 0: 
      this.a = new AutomaticFill();
      break;
    case 2: 
      this.a = new SolidFill(this, f());
      break;
    case 3: 
      this.a = new GradientFill(this, f());
      break;
    case 5: 
      this.a = new PatternFill(this, f());
      break;
    case 4: 
      this.a = new TextureFill(f());
      break;
    case 6: 
      this.a = new GroupFill();
      break;
    }
  }
  
  int e()
  {
    int i = 100;
    if (getFillType() == 2) {
      i = getSolidFill().e();
    } else if (getFillType() == 4) {
      i = getTextureFill().f();
    } else if (getFillType() == 5) {
      i = getPatternFill().e();
    }
    return i;
  }
  
  void a(int paramInt)
  {
    if (getFillType() == 2) {
      getSolidFill().a(paramInt);
    } else if (getFillType() == 4) {
      getTextureFill().c(paramInt);
    } else if (getFillType() == 5) {
      getPatternFill().a(paramInt);
    }
  }
  
  public double getTransparency()
  {
    return zr.b((100 - e()) / 100.0D, 2);
  }
  
  public void setTransparency(double value)
  {
    if ((value < 0.0D) || (value > 1.0D)) {
      throw new CellsException(6, "Transparency must between 0.0 (opaque) and 1.0 (clear)");
    }
    int i = 100 - (int)(value * 100.0D);
    a(i);
    if (getFillType() == 3)
    {
      GradientFill localGradientFill = getGradientFill();
      if ((localGradientFill.getGradientStops() != null) && (localGradientFill.getGradientStops().getCount() > 0)) {
        for (int j = 0; j < localGradientFill.getGradientStops().getCount(); j++) {
          localGradientFill.getGradientStops().get(j).a(i);
        }
      }
    }
  }
  
  FillFormat(ShapeFormat parent)
  {
    this.b = parent;
  }
  
  /**
   * @deprecated
   */
  public int getSetType()
  {
    switch (getFillType())
    {
    case 1: 
      return 0;
    case 5: 
      return 3;
    case 3: 
      return 1;
    case 4: 
      return 2;
    }
    return 0;
  }
  
  /**
   * @deprecated
   */
  public void setSetType(int value)
  {
    switch (value)
    {
    case 1: 
      setFillType(3);
      break;
    case 3: 
      setFillType(5);
      break;
    case 2: 
      setFillType(4);
      break;
    case 0: 
      setFillType(1);
      break;
    }
  }
  
  public GradientFill getGradientFill()
  {
    if (getFillType() == 3) {
      return (GradientFill)this.a;
    }
    return null;
  }
  
  public TextureFill getTextureFill()
  {
    if (getFillType() == 4) {
      return (TextureFill)this.a;
    }
    return null;
  }
  
  public SolidFill getSolidFill()
  {
    if (getFillType() == 2) {
      return (SolidFill)this.a;
    }
    return null;
  }
  
  public PatternFill getPatternFill()
  {
    if (getFillType() == 5) {
      return (PatternFill)this.a;
    }
    return null;
  }
  
  public int getGradientColorType()
  {
    if (getFillType() != 3) {
      throw new CellsException(7, "Gradient option is not set.");
    }
    return getGradientFill().getGradientColorType();
  }
  
  public int getGradientStyle()
  {
    if (getFillType() != 3) {
      throw new CellsException(7, "Gradient option is not set.");
    }
    return getGradientFill().getGradientStyle();
  }
  
  public Color getGradientColor1()
  {
    if (getFillType() != 3) {
      throw new CellsException(7, "Gradient option is not set.");
    }
    int i = getGradientFill().getGradientColorType();
    if (i == 0) {
      throw new CellsException(7, "The gradient color 1 is not set.");
    }
    return getGradientFill().getGradientColor1();
  }
  
  public Color getGradientColor2()
  {
    if (getFillType() != 3) {
      throw new CellsException(7, "Gradient option is not set.");
    }
    int i = getGradientFill().getGradientColorType();
    switch (i)
    {
    case 0: 
    case 1: 
      throw new CellsException(7, "The gradient color 2 is not set.");
    }
    return getGradientFill().getGradientColor2();
  }
  
  public double getGradientDegree()
  {
    if (getFillType() != 3) {
      throw new CellsException(7, "Gradient option is not set.");
    }
    int i = getGradientFill().getGradientColorType();
    if (i != 1) {
      return 0.0D;
    }
    return getGradientFill().getGradientDegree();
  }
  
  public int getGradientVariant()
  {
    if (getFillType() != 3) {
      throw new CellsException(7, "Gradient option is not set.");
    }
    return getGradientFill().getVariant();
  }
  
  public int getPresetColor()
  {
    if (getFillType() != 3) {
      throw new CellsException(7, "Gradient option is not set.");
    }
    return getGradientFill().getPresetColor();
  }
  
  public void setOneColorGradient(Color color, double degree, int style, int variant)
  {
    if ((style == 6) || (variant < 0) || (variant > 4)) {
      return;
    }
    if (this.b != null) {
      this.b.a(0, this);
    }
    setFillType(3);
    getGradientFill().setOneColorGradient(color, degree, style, variant);
  }
  
  public void setTwoColorGradient(Color color1, Color color2, int style, int variant)
  {
    if (this.b != null) {
      this.b.a(0, this);
    }
    setFillType(3);
    getGradientFill().setTwoColorGradient(color1, color2, style, variant);
  }
  
  public void setTwoColorGradient(Color color1, double transparency1, Color color2, double transparency2, int style, int variant)
  {
    if (this.b != null) {
      this.b.a(0, this);
    }
    setFillType(3);
    getGradientFill().setTwoColorGradient(color1, transparency1, color2, transparency2, style, variant);
  }
  
  public void setPresetColorGradient(int presetColor, int style, int variant)
  {
    if (presetColor == 24) {
      return;
    }
    if (this.b != null) {
      this.b.a(0, this);
    }
    setFillType(3);
    getGradientFill().setPresetColorGradient(presetColor, style, variant);
  }
  
  public int getTexture()
  {
    if (getFillType() != 4) {
      return 24;
    }
    return getTextureFill().getType();
  }
  
  public void setTexture(int value)
  {
    if (value == 24) {
      return;
    }
    setFillType(4);
    getTextureFill().setType(value);
    if (this.b != null) {
      this.b.a(0, this);
    }
  }
  
  public int getPattern()
  {
    if (getFillType() != 5) {
      return 50;
    }
    return getPatternFill().getPattern();
  }
  
  public void setPattern(int value)
  {
    if (value == 50) {
      return;
    }
    setFillType(5);
    getPatternFill().setPattern(value);
    if (this.b != null) {
      this.b.a(0, this);
    }
  }
  
  void a(FillFormat paramFillFormat, CopyOptions paramCopyOptions)
  {
    setFillType(paramFillFormat.getFillType());
    if ((paramFillFormat.a != null) && (this.a != null)) {
      this.a.a(paramFillFormat.a, paramCopyOptions);
    }
  }
  
  boolean a(FillFormat paramFillFormat, zmz paramzmz)
  {
    if (getFillType() != paramFillFormat.getFillType()) {
      return false;
    }
    switch (getFillType())
    {
    case 3: 
      if (!getGradientFill().a(paramFillFormat.getGradientFill())) {
        return false;
      }
      break;
    case 5: 
      if (!getPatternFill().a(paramFillFormat.getPatternFill())) {
        return false;
      }
      break;
    case 4: 
      if (!getTextureFill().a(paramFillFormat.getTextureFill())) {
        return false;
      }
      break;
    case 2: 
      if (!getSolidFill().a(paramFillFormat.getSolidFill(), paramzmz)) {
        return false;
      }
      break;
    }
    return true;
  }
  
  public int getPictureFormatType()
  {
    if ((getFillType() == 4) && (getTextureFill().getPicFormatOption() != null)) {
      return getTextureFill().getPicFormatOption().getType();
    }
    return 0;
  }
  
  public void setPictureFormatType(int value)
  {
    if (getFillType() != 4) {
      return;
    }
    if (getTextureFill().getPicFormatOption() == null) {
      getTextureFill().setPicFormatOption(new PicFormatOption());
    }
    getTextureFill().getPicFormatOption().setType(value);
  }
  
  public double getScale()
  {
    if ((getFillType() == 4) && (getTextureFill().getPicFormatOption() != null)) {
      return getTextureFill().getPicFormatOption().getScale();
    }
    return 100.0D;
  }
  
  public void setScale(double value)
  {
    if (getFillType() != 4) {
      return;
    }
    if (getTextureFill().getPicFormatOption() == null) {
      getTextureFill().setPicFormatOption(new PicFormatOption());
    }
    getTextureFill().getPicFormatOption().setScale(value);
  }
  
  public byte[] getImageData()
  {
    if (getFillType() == 4) {
      return getTextureFill().getImageData();
    }
    return null;
  }
  
  public void setImageData(byte[] value)
  {
    setFillType(4);
    getTextureFill().setImageData(value);
    if (this.b != null) {
      this.b.a(0, this);
    }
  }
  
  void a(MsoFillFormatHelper paramMsoFillFormatHelper, boolean paramBoolean)
  {
    if ((paramMsoFillFormatHelper.a.h()) && (!paramBoolean)) {
      return;
    }
    if (paramMsoFillFormatHelper == null) {
      return;
    }
    int i = 6;
    int j = (int)paramMsoFillFormatHelper.g();
    int k = (int)(paramMsoFillFormatHelper.i() * 100.0F);
    if (!paramMsoFillFormatHelper.isVisible())
    {
      setFillType(1);
      return;
    }
    switch (paramMsoFillFormatHelper.b())
    {
    case 100: 
      if (!paramMsoFillFormatHelper.isVisible())
      {
        setFillType(1);
      }
      else if ((paramMsoFillFormatHelper.h()) || (paramMsoFillFormatHelper.getForeColorTransparency() != 0.0D))
      {
        setFillType(2);
        getSolidFill().setColor(paramMsoFillFormatHelper.getForeColor());
        getSolidFill().a(paramMsoFillFormatHelper.getBackColor());
        getSolidFill().setTransparency(paramMsoFillFormatHelper.getForeColorTransparency());
      }
      else
      {
        setFillType(0);
        this.c = true;
      }
      return;
    case 0: 
      if (!paramMsoFillFormatHelper.isVisible())
      {
        setFillType(1);
      }
      else
      {
        setFillType(2);
        getSolidFill().setColor(paramMsoFillFormatHelper.getForeColor());
        getSolidFill().a(paramMsoFillFormatHelper.getBackColor());
        getSolidFill().setTransparency(paramMsoFillFormatHelper.getForeColorTransparency());
      }
      return;
    case 2: 
    case 3: 
      int m = paramMsoFillFormatHelper.n();
      localObject1 = paramMsoFillFormatHelper.p();
      if (m != 0)
      {
        setFillType(4);
        getTextureFill().c = (m - 1);
      }
      else if (localObject1 != null)
      {
        setFillType(4);
        getTextureFill().a((byte[])localObject1);
      }
      else
      {
        setFillType(1);
      }
      if ((getFillType() == 4) && (paramMsoFillFormatHelper.b() == 2)) {
        getTextureFill().setTilePicOption(new TilePicOption());
      }
      return;
    case 1: 
      setPattern(paramMsoFillFormatHelper.q());
      if (getPatternFill() != null)
      {
        getPatternFill().setForegroundColor(paramMsoFillFormatHelper.getForeColor());
        getPatternFill().setBackgroundColor(paramMsoFillFormatHelper.getBackColor());
      }
      return;
    case 5: 
      i = 3;
      break;
    case 6: 
      i = 2;
      break;
    case 4: 
    case 7: 
      switch (j)
      {
      case 0: 
      case 180: 
        i = 4;
        break;
      case -90: 
      case 90: 
      case 270: 
        i = 5;
        break;
      case -135: 
      case 45: 
        i = 1;
        break;
      case -45: 
      case 135: 
        i = 0;
      }
      if (j < 0)
      {
        j = -90 - j;
        if (k != 100) {
          k = -k;
        }
      }
      else
      {
        j = 90 - j;
      }
      if (j < 0) {
        j += 360;
      }
      j %= 360;
      break;
    default: 
      return;
    }
    setFillType(3);
    GradientFill localGradientFill = getGradientFill();
    Object localObject1 = localGradientFill.getGradientStops();
    Color localColor1 = paramMsoFillFormatHelper.getForeColor();
    double d1 = paramMsoFillFormatHelper.getForeColorTransparency();
    double d2 = paramMsoFillFormatHelper.f();
    Color localColor2 = Color.getEmpty();
    int n = 1;
    double d3 = 0.5D;
    int i1 = 24;
    byte[] arrayOfByte = null;
    int i2;
    if ((paramMsoFillFormatHelper.aq() == 8) || ((paramMsoFillFormatHelper.aq() == 1073741835) && ((paramMsoFillFormatHelper.d() & 0x100000F0) == 268435696)))
    {
      d3 = 0.5D;
      i2 = paramMsoFillFormatHelper.d();
      if ((i2 & 0x100) != 0) {
        d3 = ((i2 & 0xFF0000) >> 16) / 512.0D;
      } else {
        d3 = 1.0D - ((i2 & 0xFF0000) >> 16) / 512.0D;
      }
      localColor2 = GradientFill.a(localColor1, d3);
    }
    else if (paramMsoFillFormatHelper.ap())
    {
      n = 2;
      i1 = paramMsoFillFormatHelper.an();
      arrayOfByte = paramMsoFillFormatHelper.ao();
      if (i1 != 24) {
        arrayOfByte = MsoFillFormatHelper.d(i1);
      }
    }
    else
    {
      n = 3;
      localColor2 = paramMsoFillFormatHelper.getBackColor();
    }
    if (arrayOfByte != null)
    {
      zxh.a((GradientStopCollection)localObject1, arrayOfByte, k <= 0);
      i2 = zc.b(arrayOfByte, 0);
      if ((n == 2) && (i1 == 24) && (i2 == 2)) {
        n = 3;
      }
    }
    else
    {
      localObject1 = localGradientFill.getGradientStops();
      zaml localzaml1 = new zaml(true);
      zaml localzaml2 = new zaml(true);
      localzaml1.a(2, localColor1.toArgb());
      localzaml2.a(2, localColor2.toArgb());
      GradientStop localGradientStop1 = new GradientStop((GradientStopCollection)localObject1);
      localGradientStop1.a = (k <= 0 ? localzaml2 : localzaml1);
      localGradientStop1.setTransparency(k <= 0 ? d2 : d1);
      localGradientStop1.setPosition(0.0D);
      ((GradientStopCollection)localObject1).a(localGradientStop1);
      localGradientStop1 = new GradientStop((GradientStopCollection)localObject1);
      localGradientStop1.a = (k <= 0 ? localzaml1 : localzaml2);
      localGradientStop1.setTransparency(k <= 0 ? d1 : d2);
      localGradientStop1.setPosition(100.0D);
      ((GradientStopCollection)localObject1).a(localGradientStop1);
    }
    int i3 = k <= 0 ? 2 : 1;
    if (k < 0) {
      k += 100;
    }
    int i4 = ((GradientStopCollection)localObject1).getCount();
    if ((k > 0) && (k < 100))
    {
      i3 += 2;
      for (int i5 = 0; i5 < i4; i5++)
      {
        GradientStop localGradientStop2 = ((GradientStopCollection)localObject1).get(i5);
        double d4 = localGradientStop2.getPosition();
        localGradientStop2.setPosition(localGradientStop2.getPosition() * k / 100.0D);
        if (i5 != i4 - 1)
        {
          GradientStop localGradientStop3 = new GradientStop((GradientStopCollection)localObject1);
          localGradientStop3.a(localGradientStop2, null);
          localGradientStop3.setPosition(100.0D - d4 * (100 - k) / 100.0D);
          ((GradientStopCollection)localObject1).a(i4, localGradientStop3);
        }
      }
    }
    if ((i == 3) || (i == 2))
    {
      if ((paramMsoFillFormatHelper.j() == 0.5D) && (paramMsoFillFormatHelper.k() == 0.5D) && (paramMsoFillFormatHelper.l() == 0.5D) && (paramMsoFillFormatHelper.m() == 0.5D)) {
        i = 2;
      }
      localObject2 = new zadq();
      ((zadq)localObject2).a = 1;
      localGradientFill.b = localObject2;
      ((zadq)localObject2).b = ((int)(paramMsoFillFormatHelper.j() * znq.l));
      ((zadq)localObject2).c = ((int)(paramMsoFillFormatHelper.k() * znq.l));
      ((zadq)localObject2).e = (znq.l - (int)(paramMsoFillFormatHelper.l() * znq.l));
      ((zadq)localObject2).d = (znq.l - (int)(paramMsoFillFormatHelper.m() * znq.l));
    }
    else
    {
      localObject2 = new zadp();
      localGradientFill.b = localObject2;
      ((zadp)localObject2).b = (paramMsoFillFormatHelper.b() == 7);
      localGradientFill.setAngle(j);
    }
    Object localObject2 = new zadn();
    localGradientFill.a = ((zadn)localObject2);
    ((zadn)localObject2).b = n;
    ((zadn)localObject2).d = d3;
    localGradientFill.d = i1;
    ((zadn)localObject2).a = i;
    ((zadn)localObject2).c = i3;
  }
  
  Workbook f()
  {
    return this.b == null ? null : this.b.f;
  }
  
  MsoFillFormatHelper a(ArrayList paramArrayList)
  {
    if ((paramArrayList == null) && (paramArrayList.size() == 0)) {
      return null;
    }
    zaum localzaum = new zaum(this);
    MsoFillFormatHelper localMsoFillFormatHelper = new MsoFillFormatHelper(null, localzaum, f());
    a(paramArrayList, localzaum);
    return localMsoFillFormatHelper;
  }
  
  static void a(ArrayList paramArrayList, zaum paramzaum)
  {
    byte[] arrayOfByte1 = (byte[])paramArrayList.get(0);
    int i = 0;
    int j = zc.e(arrayOfByte1, i + 2) & 0xFFFF;
    int k = zc.b(arrayOfByte1, i) >> 4;
    i += 8;
    int m = i + k * 6;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    for (int i3 = 0; i3 < k; i3++)
    {
      i1 = zc.e(arrayOfByte1, i);
      i2 = zc.a(arrayOfByte1, i + 2);
      if ((i1 & 0xFFFF & 0x8000) != 0)
      {
        if (i2 == 0)
        {
          i += 6;
          continue;
        }
        byte[] arrayOfByte2 = new byte[i2];
        int[] arrayOfInt = a(arrayOfByte2, m, paramArrayList, n);
        m = arrayOfInt[0];
        n = arrayOfInt[1];
        paramzaum.a(i1, 4, arrayOfByte2);
      }
      else
      {
        paramzaum.a(i1, 0, Integer.valueOf(i2));
      }
      i += 6;
    }
  }
  
  static int[] a(byte[] paramArrayOfByte, int paramInt1, ArrayList paramArrayList, int paramInt2)
  {
    int i = 0;
    int j = 0;
    while (paramInt2 < paramArrayList.size())
    {
      localObject = (byte[])paramArrayList.get(paramInt2);
      j = localObject.length - paramInt1;
      if (paramArrayOfByte.length - i > localObject.length - paramInt1)
      {
        System.arraycopy(localObject, paramInt1, paramArrayOfByte, i, j);
        paramInt1 = 0;
        i += j;
      }
      else
      {
        j = paramArrayOfByte.length - i;
        System.arraycopy(localObject, paramInt1, paramArrayOfByte, i, j);
        paramInt1 += j;
        break;
      }
      paramInt2++;
    }
    Object localObject = new int[2];
    localObject[0] = paramInt1;
    localObject[1] = paramInt2;
    return (int[])localObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FillFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */