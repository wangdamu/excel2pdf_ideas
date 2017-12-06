package com.aspose.cells;

import com.aspose.cells.a.c.zh;

public class GradientFill
  extends Fill
{
  zadn a;
  Object b;
  private zadq f;
  boolean c;
  private GradientStopCollection g;
  int d;
  private Object h;
  Workbook e;
  
  int a()
  {
    return 3;
  }
  
  GradientFill(Object parent, Workbook workbook)
  {
    this.h = parent;
    this.e = workbook;
    this.g = new GradientStopCollection(this);
    this.d = 24;
    this.c = true;
  }
  
  Object b()
  {
    if ((this.h instanceof FillFormat)) {
      return ((FillFormat)this.h).b.g;
    }
    return this.h;
  }
  
  Chart c()
  {
    Object localObject1 = b();
    if (localObject1 == null) {
      return null;
    }
    Object localObject2;
    if ((localObject1 instanceof Area))
    {
      localObject2 = (Area)localObject1;
      return ((Area)localObject2).a();
    }
    if ((localObject1 instanceof Shape))
    {
      localObject2 = (Shape)localObject1;
      if (((Shape)localObject2).T())
      {
        Chart localChart = (Chart)((Shape)localObject2).N().i();
        return localChart;
      }
    }
    return null;
  }
  
  void a(Fill paramFill, CopyOptions paramCopyOptions)
  {
    a((GradientFill)paramFill, paramCopyOptions);
  }
  
  void a(GradientFill paramGradientFill, CopyOptions paramCopyOptions)
  {
    this.d = paramGradientFill.d;
    this.c = paramGradientFill.c;
    if (paramGradientFill.b != null)
    {
      if ((paramGradientFill.b instanceof zadp))
      {
        this.b = new zadp();
        ((zadp)this.b).a((zadp)paramGradientFill.b);
      }
      else
      {
        this.b = new zadq();
        ((zadq)this.b).a((zadq)paramGradientFill.b);
      }
    }
    else {
      this.b = null;
    }
    if (paramGradientFill.a != null)
    {
      this.a = new zadn();
      this.a.b = paramGradientFill.a.b;
      this.a.d = paramGradientFill.a.d;
      this.a.a = paramGradientFill.a.a;
      this.a.c = paramGradientFill.a.c;
    }
    else
    {
      this.a = null;
    }
    if (paramGradientFill.f != null)
    {
      this.f = new zadq();
      this.f.a(paramGradientFill.f);
    }
    else
    {
      this.f = null;
    }
    if (paramGradientFill.g != null)
    {
      this.g = new GradientStopCollection(this);
      this.g.a(paramGradientFill.g, paramCopyOptions);
    }
    else
    {
      this.g = null;
    }
  }
  
  boolean a(GradientFill paramGradientFill)
  {
    if (this.d != paramGradientFill.d) {
      return false;
    }
    if (this.c != paramGradientFill.c) {
      return false;
    }
    if ((this.b != null) || (paramGradientFill.b != null)) {
      if ((this.b != null) && (paramGradientFill.b != null))
      {
        if ((paramGradientFill.b instanceof zadp))
        {
          if ((this.b instanceof zadp))
          {
            if (!((zadp)this.b).b((zadp)paramGradientFill.b)) {
              return false;
            }
          }
          else {
            return false;
          }
        }
        else if ((this.b instanceof zadq))
        {
          if (!((zadq)this.b).b((zadq)paramGradientFill.b)) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.a != null) || (paramGradientFill.a != null)) {
      if ((this.a != null) && (paramGradientFill.a != null))
      {
        if (this.a.b != paramGradientFill.a.b) {
          return false;
        }
        if (this.a.d != paramGradientFill.a.d) {
          return false;
        }
        if (this.a.a != paramGradientFill.a.a) {
          return false;
        }
        if (this.a.c != paramGradientFill.a.c) {
          return false;
        }
      }
      else
      {
        return false;
      }
    }
    if ((this.f != null) || (paramGradientFill.f != null)) {
      if ((this.f != null) && (paramGradientFill.f != null))
      {
        if (!this.f.b(paramGradientFill.f)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.g != null) || (paramGradientFill.g != null)) {
      if ((this.g != null) && (paramGradientFill.g != null))
      {
        if (!this.g.a(paramGradientFill.g)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    return true;
  }
  
  public GradientStopCollection getGradientStops()
  {
    return this.g;
  }
  
  boolean d()
  {
    if (this.b == null) {
      return true;
    }
    return this.b instanceof zadp;
  }
  
  zadp e()
  {
    if ((this.b != null) && ((this.b instanceof zadp))) {
      return (zadp)this.b;
    }
    return null;
  }
  
  zadq f()
  {
    if ((this.b != null) && ((this.b instanceof zadq))) {
      return (zadq)this.b;
    }
    return null;
  }
  
  zadq g()
  {
    if (this.f == null) {
      this.f = new zadq();
    }
    return this.f;
  }
  
  zadq h()
  {
    return this.f;
  }
  
  public void setGradient(int type, double angle, int direction)
  {
    this.a = null;
    switch (type)
    {
    case 0: 
      zadp localzadp = new zadp();
      localzadp.a = ((int)(angle * znq.k));
      this.b = localzadp;
      break;
    case 3: 
      zadq localzadq1 = new zadq();
      this.b = localzadq1;
      localzadq1.a = 2;
      localzadq1.b = (localzadq1.e = localzadq1.c = localzadq1.d = 50000);
      break;
    case 1: 
    case 2: 
      zadq localzadq2 = new zadq();
      this.b = localzadq2;
      if (type == 2) {
        localzadq2.a = 1;
      } else {
        localzadq2.a = 0;
      }
      switch (direction)
      {
      case 0: 
        localzadq2.b = (localzadq2.c = 50000);
        this.f = new zadq();
        this.f.e = (this.f.d = -100000);
        break;
      case 1: 
        localzadq2.c = (localzadq2.e = 50000);
        this.f = new zadq();
        this.f.b = (this.f.d = -100000);
        break;
      case 4: 
        localzadq2.b = (localzadq2.e = localzadq2.d = localzadq2.c = 50000);
        break;
      case 2: 
        localzadq2.b = (localzadq2.d = 50000);
        this.f = new zadq();
        this.f.c = (this.f.e = -100000);
        break;
      case 3: 
        localzadq2.e = (localzadq2.d = 50000);
        this.f = new zadq();
        this.f.b = (this.f.c = -100000);
      }
      break;
    }
  }
  
  public int getFillType()
  {
    if (this.b == null) {
      return 0;
    }
    if ((this.b instanceof zadq))
    {
      zadq localzadq = (zadq)this.b;
      switch (localzadq.a)
      {
      case 2: 
        return 3;
      case 0: 
        return 1;
      case 1: 
        return 2;
      }
    }
    return 0;
  }
  
  public int getDirectionType()
  {
    if (this.b == null) {
      return 5;
    }
    if ((this.b instanceof zadq))
    {
      int i = 100000;
      zadq localzadq = (zadq)this.b;
      switch (localzadq.a)
      {
      case 2: 
        return 5;
      case 0: 
      case 1: 
        if ((localzadq.c == i) && (localzadq.b == i)) {
          return 3;
        }
        if ((localzadq.c == i) && (localzadq.e == i)) {
          return 2;
        }
        if ((localzadq.b == i / 2) && (localzadq.e == i / 2) && (localzadq.c == i / 2) && (localzadq.d == i / 2)) {
          return 4;
        }
        if ((localzadq.d == i) && (localzadq.b == i)) {
          return 1;
        }
        if ((localzadq.d == i) && (localzadq.e == i)) {
          return 0;
        }
        break;
      }
    }
    return 5;
  }
  
  public float getAngle()
  {
    if ((this.b != null) && ((this.b instanceof zadp))) {
      return ((zadp)this.b).a / znq.k;
    }
    return 0.0F;
  }
  
  public void setAngle(float value)
  {
    if ((this.b != null) && ((this.b instanceof zadp))) {
      ((zadp)this.b).a = ((int)(value * znq.k));
    }
  }
  
  void a(Style paramStyle, Workbook paramWorkbook)
  {
    a(paramWorkbook);
    zaml localzaml1;
    zaml localzaml2;
    if (this.a.a != 3)
    {
      switch (this.a.c)
      {
      case 1: 
      case 3: 
        localzaml1 = this.g.get(0).a;
        localzaml2 = this.g.get(1).a;
        break;
      case 2: 
      case 4: 
        localzaml1 = this.g.get(1).a;
        localzaml2 = this.g.get(0).a;
        break;
      default: 
        localzaml1 = new zaml(false);
        localzaml2 = new zaml(false);
        break;
      }
    }
    else
    {
      localzaml1 = this.g.get(0).a;
      localzaml2 = this.g.get(1).a;
    }
    paramStyle.a(localzaml1, localzaml2, this.a.a, this.a.c);
  }
  
  public Color getGradientColor1()
  {
    if ((this.g == null) || (this.g.getCount() == 0)) {
      return Color.getEmpty();
    }
    a(this.e);
    if (this.a.a != 3)
    {
      switch (this.a.c)
      {
      case 1: 
      case 3: 
        return this.g.get(0).a.a(this.e, c());
      case 2: 
      case 4: 
        return this.g.get(1).a.a(this.e, c());
      }
      return Color.getEmpty();
    }
    return this.g.get(0).a.a(this.e, c());
  }
  
  public Color getGradientColor2()
  {
    if ((this.g == null) || (this.g.getCount() == 0)) {
      return Color.getEmpty();
    }
    a(this.e);
    if (this.a.a != 3)
    {
      switch (this.a.c)
      {
      case 1: 
      case 3: 
        return this.g.get(1).a.a(this.e, c());
      case 2: 
      case 4: 
        return this.g.get(0).a.a(this.e, c());
      }
      return Color.getEmpty();
    }
    return this.g.get(1).a.a(this.e, c());
  }
  
  public double getGradientDegree()
  {
    if (this.a != null) {
      return this.a.d;
    }
    return 0.0D;
  }
  
  public void setPresetColorGradient(int presetColor, int style, int variant)
  {
    this.d = presetColor;
    this.a = new zadn();
    this.a.b = 2;
    this.a.a = style;
    this.a.c = variant;
    switch (style)
    {
    case 0: 
    case 1: 
    case 4: 
    case 5: 
      zadp localzadp = new zadp();
      this.b = localzadp;
      switch (style)
      {
      case 4: 
        localzadp.a = 5400000;
        break;
      case 5: 
        localzadp.a = 0;
        break;
      case 1: 
        localzadp.a = (45 * znq.k);
        break;
      case 0: 
        localzadp.a = (315 * znq.k);
      }
      localzadp.b = true;
      switch (variant)
      {
      case 1: 
        this.g = zxh.a(this, presetColor, false, false);
        break;
      case 2: 
        this.g = zxh.a(this, presetColor, true, false);
        break;
      case 3: 
        this.g = zxh.a(this, presetColor, false, true);
        break;
      case 4: 
        this.g = zxh.a(this, presetColor, true, true);
      }
      break;
    case 3: 
      zadq localzadq1 = new zadq();
      localzadq1.a = 1;
      this.b = localzadq1;
      this.g = zxh.a(this, presetColor, false, false);
      switch (variant)
      {
      case 1: 
        localzadq1.e = (localzadq1.d = 100000);
        break;
      case 2: 
        localzadq1.b = (localzadq1.d = 100000);
        break;
      case 3: 
        localzadq1.c = (localzadq1.e = 100000);
        break;
      case 4: 
        localzadq1.b = (localzadq1.c = 100000);
      }
      break;
    case 2: 
      this.g = zxh.a(this, presetColor, variant == 1, false);
      zadq localzadq2 = new zadq();
      localzadq2.a = 1;
      this.b = localzadq2;
      localzadq2.b = (localzadq2.e = localzadq2.c = localzadq2.d = 50000);
      break;
    }
  }
  
  public void setOneColorGradient(Color color, double degree, int style, int variant)
  {
    a(1, color, degree, color, 0.0D, 0.0D, style, variant);
  }
  
  public void setTwoColorGradient(Color color1, Color color2, int style, int variant)
  {
    a(3, color1, 0.0D, color2, 0.0D, 0.0D, style, variant);
  }
  
  public void setTwoColorGradient(Color color1, double transparency1, Color color2, double transparency2, int style, int variant)
  {
    a(3, color1, 0.0D, color2, transparency1, transparency2, style, variant);
  }
  
  void a(int paramInt1, zaml paramzaml1, double paramDouble, zaml paramzaml2, int paramInt2, int paramInt3)
  {
    this.a = new zadn();
    this.a.a = paramInt2;
    this.a.c = paramInt3;
    this.a.d = paramDouble;
    this.a.b = paramInt1;
    GradientStop localGradientStop = null;
    switch (paramInt2)
    {
    case 0: 
    case 1: 
    case 4: 
    case 5: 
      zadp localzadp = new zadp();
      this.b = localzadp;
      switch (paramInt2)
      {
      case 4: 
        localzadp.a = 5400000;
        break;
      case 5: 
        localzadp.a = 0;
        break;
      case 1: 
        localzadp.a = (45 * znq.k);
        break;
      case 0: 
        localzadp.a = (315 * znq.k);
        break;
      }
      localzadp.b = true;
      switch (paramInt3)
      {
      case 1: 
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = paramzaml1;
        localGradientStop.setPosition(0.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = paramzaml2;
        localGradientStop.setPosition(100.0D);
        this.g.a(localGradientStop);
        break;
      case 2: 
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = paramzaml2;
        localGradientStop.setPosition(0.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = paramzaml1;
        localGradientStop.setPosition(100.0D);
        this.g.a(localGradientStop);
        break;
      case 3: 
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = paramzaml1;
        localGradientStop.setPosition(0.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = paramzaml2;
        localGradientStop.setPosition(50.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = paramzaml1;
        localGradientStop.setPosition(100.0D);
        this.g.a(localGradientStop);
        break;
      case 4: 
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = paramzaml2;
        localGradientStop.setPosition(0.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = paramzaml1;
        localGradientStop.setPosition(50.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = paramzaml2;
        localGradientStop.setPosition(100.0D);
        this.g.a(localGradientStop);
      }
      break;
    case 3: 
      localGradientStop = new GradientStop(this.g);
      localGradientStop.a = paramzaml1;
      localGradientStop.setPosition(0.0D);
      this.g.a(localGradientStop);
      localGradientStop = new GradientStop(this.g);
      localGradientStop.a = paramzaml2;
      localGradientStop.setPosition(100.0D);
      this.g.a(localGradientStop);
      zadq localzadq = new zadq();
      localzadq.a = 1;
      this.b = localzadq;
      switch (paramInt3)
      {
      case 1: 
        break;
      case 2: 
        localzadq.b = (localzadq.e = 100000);
        break;
      case 3: 
        localzadq.c = (localzadq.d = 100000);
        break;
      case 4: 
        localzadq.e = (localzadq.d = 100000);
        localzadq.b = (localzadq.c = 100000);
      }
      break;
    case 2: 
      if (paramInt3 != 1)
      {
        localObject = paramzaml1;
        paramzaml1 = paramzaml2;
        paramzaml2 = (zaml)localObject;
      }
      localGradientStop = new GradientStop(this.g);
      localGradientStop.a = paramzaml1;
      localGradientStop.setPosition(0.0D);
      this.g.a(localGradientStop);
      localGradientStop = new GradientStop(this.g);
      localGradientStop.a = paramzaml2;
      localGradientStop.setPosition(100.0D);
      this.g.a(localGradientStop);
      Object localObject = new zadq();
      ((zadq)localObject).a = 1;
      this.b = localObject;
      ((zadq)localObject).b = (((zadq)localObject).e = ((zadq)localObject).c = ((zadq)localObject).d = 50000);
      break;
    }
  }
  
  private void a(int paramInt1, Color paramColor1, double paramDouble1, Color paramColor2, double paramDouble2, double paramDouble3, int paramInt2, int paramInt3)
  {
    this.a = new zadn();
    this.a.a = paramInt2;
    this.a.c = paramInt3;
    this.a.d = paramDouble1;
    this.a.b = paramInt1;
    Object localObject1 = new zaml(true);
    Object localObject2 = new zaml(true);
    ((zaml)localObject1).a(2, paramColor1.toArgb());
    if (paramInt1 == 1) {
      ((zaml)localObject2).a(2, a(paramColor1, paramDouble1).toArgb());
    } else {
      ((zaml)localObject2).a(2, paramColor2.toArgb());
    }
    GradientStop localGradientStop = null;
    switch (paramInt2)
    {
    case 0: 
    case 1: 
    case 4: 
    case 5: 
      zadp localzadp = new zadp();
      this.b = localzadp;
      switch (paramInt2)
      {
      case 4: 
        localzadp.a = 5400000;
        break;
      case 5: 
        localzadp.a = 0;
        break;
      case 1: 
        localzadp.a = (45 * znq.k);
        break;
      case 0: 
        localzadp.a = (315 * znq.k);
        break;
      }
      localzadp.b = true;
      switch (paramInt3)
      {
      case 1: 
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = ((zaml)localObject1);
        localGradientStop.setPosition(0.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = ((zaml)localObject2);
        localGradientStop.setPosition(100.0D);
        this.g.a(localGradientStop);
        break;
      case 2: 
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = ((zaml)localObject2);
        localGradientStop.setPosition(0.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = ((zaml)localObject1);
        localGradientStop.setPosition(100.0D);
        this.g.a(localGradientStop);
        break;
      case 3: 
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = ((zaml)localObject1);
        localGradientStop.setPosition(0.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = ((zaml)localObject2);
        localGradientStop.setPosition(50.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = ((zaml)localObject1);
        localGradientStop.setPosition(100.0D);
        this.g.a(localGradientStop);
        break;
      case 4: 
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = ((zaml)localObject2);
        localGradientStop.setPosition(0.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = ((zaml)localObject1);
        localGradientStop.setPosition(50.0D);
        this.g.a(localGradientStop);
        localGradientStop = new GradientStop(this.g);
        localGradientStop.a = ((zaml)localObject2);
        localGradientStop.setPosition(100.0D);
        this.g.a(localGradientStop);
      }
      break;
    case 3: 
      localGradientStop = new GradientStop(this.g);
      localGradientStop.a = ((zaml)localObject1);
      localGradientStop.setPosition(0.0D);
      this.g.a(localGradientStop);
      localGradientStop = new GradientStop(this.g);
      localGradientStop.a = ((zaml)localObject2);
      localGradientStop.setPosition(100.0D);
      this.g.a(localGradientStop);
      zadq localzadq = new zadq();
      localzadq.a = 1;
      this.b = localzadq;
      switch (paramInt3)
      {
      case 1: 
        localzadq.e = (localzadq.d = 100000);
        break;
      case 2: 
        localzadq.b = (localzadq.d = 100000);
        break;
      case 3: 
        localzadq.c = (localzadq.e = 100000);
        break;
      case 4: 
        localzadq.b = (localzadq.c = 100000);
      }
      break;
    case 2: 
      if (paramInt3 != 1)
      {
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
      }
      localGradientStop = new GradientStop(this.g);
      localGradientStop.a = ((zaml)localObject1);
      localGradientStop.setPosition(0.0D);
      this.g.a(localGradientStop);
      localGradientStop = new GradientStop(this.g);
      localGradientStop.a = ((zaml)localObject2);
      localGradientStop.setPosition(100.0D);
      this.g.a(localGradientStop);
      Object localObject3 = new zadq();
      ((zadq)localObject3).a = 1;
      this.b = localObject3;
      ((zadq)localObject3).b = (((zadq)localObject3).e = ((zadq)localObject3).c = ((zadq)localObject3).d = 50000);
      break;
    }
    if (this.g.getCount() > 0)
    {
      this.g.get(0).setTransparency(paramDouble2);
      if (this.g.getCount() > 1) {
        this.g.get(1).setTransparency(paramDouble3);
      }
    }
  }
  
  public int getGradientColorType()
  {
    a(this.e);
    return this.a.b;
  }
  
  public int getPresetColor()
  {
    return this.d;
  }
  
  public void setPresetColor(int value)
  {
    this.d = value;
    if (this.a != null) {
      this.a.b = 2;
    }
    this.g = zxh.a(this, value, false, false);
  }
  
  public int getVariant()
  {
    a(this.e);
    return this.a.c;
  }
  
  public int getGradientStyle()
  {
    a(this.e);
    return this.a.a;
  }
  
  private void a(Workbook paramWorkbook)
  {
    if (this.a != null) {
      return;
    }
    this.a = new zadn();
    if (this.b == null) {
      return;
    }
    if ((this.b instanceof zadp))
    {
      zadp localzadp = (zadp)this.b;
      switch (localzadp.a)
      {
      case 5400000: 
        this.a.a = 4;
        break;
      case 0: 
        this.a.a = 5;
        break;
      case 2700000: 
        this.a.a = 1;
        break;
      case 18900000: 
        this.a.a = 0;
        break;
      default: 
        this.a.a = 4;
      }
      if (this.g != null)
      {
        switch (this.g.getCount())
        {
        case 0: 
        case 1: 
          break;
        case 2: 
          this.a.c = 1;
          this.a.b = 3;
          break;
        case 3: 
          if ((this.g.get(0).getPosition() == 0.0D) && (this.g.get(1).getPosition() == 50.0D) && (this.g.get(2).getPosition() == 100.0D) && (this.g.get(0).a.c(paramWorkbook) == this.g.get(2).a.c(paramWorkbook)))
          {
            this.a.b = 3;
            this.a.c = 3;
          }
          else if ((this.g.get(0).getPosition() == 50.0D) && (this.g.get(1).getPosition() == 0.0D) && (this.g.get(2).getPosition() == 100.0D) && (this.g.get(1).a.c(paramWorkbook) == this.g.get(2).a.c(paramWorkbook)))
          {
            this.a.b = 3;
            this.a.c = 4;
          }
          else
          {
            this.a.b = 2;
            this.d = 24;
          }
          break;
        default: 
          this.a.b = 2;
          this.d = 24;
          break;
        }
      }
      else
      {
        this.a.b = 2;
        this.d = 24;
      }
    }
    else if ((this.b instanceof zadq))
    {
      int i = (this.g != null) && (this.g.getCount() == 2) ? 1 : 0;
      zadq localzadq = (zadq)this.b;
      if ((localzadq.d == 50000) && (localzadq.b == 50000) && (localzadq.c == 50000) && (localzadq.d == 50000))
      {
        this.a.a = 2;
        this.a.c = 1;
        this.a.b = (i != 0 ? 3 : 2);
      }
      else
      {
        this.a.a = 3;
        this.a.b = (i != 0 ? 3 : 2);
        if (localzadq.b == 0)
        {
          if (localzadq.c == 0) {
            this.a.c = 1;
          } else {
            this.a.c = 3;
          }
        }
        else if (localzadq.b == 100000) {
          if (localzadq.c == 0) {
            this.a.c = 2;
          } else {
            this.a.c = 4;
          }
        }
      }
    }
  }
  
  static Color a(Color paramColor, double paramDouble)
  {
    int i = zh.b(paramColor) & 0xFF;
    int j = zh.c(paramColor) & 0xFF;
    int k = zh.d(paramColor) & 0xFF;
    double d1;
    if (paramDouble < 0.5D)
    {
      d1 = paramDouble * 2.0D;
      paramColor = Color.fromArgb((int)(i * d1), (int)(j * d1), (int)(k * d1));
    }
    else if (paramDouble > 0.5D)
    {
      d1 = (paramDouble - 0.5D) * 2.0D;
      paramColor = Color.fromArgb((int)(i + (255 - i) * d1), (int)(j + (255 - j) * d1), (int)(k + (255 - k) * d1));
    }
    return paramColor;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/GradientFill.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */