package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zboa
  extends zcp
{
  zboa(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = Math.min(f3, f4);
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f5 = f10 * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
        f6 = f10 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
        f7 = f10 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F;
        f8 = f10 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F;
        if (f4 > f3) {
          f9 = f10 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(4)) / (100000.0F * f3 / f4);
        } else {
          f9 = f10 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(4)) / 100000.0F;
        }
      }
      else
      {
        f5 = f10 * 0.25F;
        f6 = f10 * 0.25F;
        f7 = f10 * 0.25F;
        f8 = f10 * 0.42665F;
        if (f4 > f3) {
          f9 = f10 * (75000.0F / (100000.0F * (f3 / f4)));
        } else {
          f9 = f10 * 0.75F;
        }
      }
    }
    else
    {
      f5 = f10 * 0.25F;
      f6 = f10 * 0.25F;
      f7 = f10 * 0.25F;
      f8 = f10 * 0.42665F;
      if (f4 > f3) {
        f9 = f10 * (75000.0F / (100000.0F * (f3 / f4)));
      } else {
        f9 = f10 * 0.75F;
      }
    }
    if (f6 == 0.0F)
    {
      f5 = this.e.A().h() / 4.0F;
      f7 = 0.0F;
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f11 = f6 - f5 / 2.0F;
    float f12 = f1 + (f3 - f8 - f11);
    float f13 = f8 - f5;
    if (f9 == 0.0F) {
      f13 = 0.0F;
    }
    switch (this.e.c)
    {
    case 1: 
      if ((f8 > 0.0F) && (f13 > 0.0F))
      {
        localze.a(f1, f2, f8 * 2.0F, f8 * 2.0F, 180.0F, 90.0F);
        localze.b(f1 + f8, f2, f12, f2);
        localze.a(f12 - f8, f2, 2.0F * f8, 2.0F * f8, 270.0F, 90.0F);
        localze.b(f1 + (f3 - f11), f2 + f8, f1 + (f3 - f11), f2 + (f9 - f7));
        localze.b(f1 + (f3 - f11), f2 + (f9 - f7), f1 + f3, f2 + (f9 - f7));
        localze.b(f1 + f3, f2 + (f9 - f7), f1 + (f3 - f6), f2 + f9);
        localze.b(f1 + (f3 - f6), f2 + f9, f1 + f3 - 2.0F * f6, f2 + (f9 - f7));
        localze.b(f1 + f3 - 2.0F * f6, f2 + (f9 - f7), f1 + (f3 - 2.0F * f6) + f11, f2 + (f9 - f7));
        localze.b(f1 + (f3 - 2.0F * f6) + f11, f2 + (f9 - f7), f1 + (f3 - 2.0F * f6) + f11, f2 + (f5 + f13));
        localze.a(f12 - f13, f2 + f5, 2.0F * f13, 2.0F * f13, 0.0F, -90.0F);
        localze.a(f1 + f5, f2 + f5, 2.0F * f13, 2.0F * f13, 270.0F, -90.0F);
        localze.b(f1 + f5, f2 + f8, f1 + f5, f2 + f4);
        localze.b(f1 + f5, f2 + f4, f1, f2 + f4);
        localze.b(f1, f2 + f4, f1, f2 + f8);
      }
      else if (f8 == 0.0F)
      {
        localze.b(f1, f2, f1 + f3 - f11, f2);
        localze.b(f1 + f3 - f11, f2, f1 + f3 - f11, f2 + f9 - f7);
        localze.b(f1 + f3 - f11, f2 + f9 - f7, f1 + f3, f2 + f9 - f7);
        localze.b(f1 + f3, f2 + f9 - f7, f1 + f3 - (f5 / 2.0F + f11), f2 + f9);
        localze.b(f1 + f3 - (f5 / 2.0F + f11), f2 + f9, f1 + f3 - 2.0F * f6, f2 + f9 - f7);
        localze.b(f1 + f3 - 2.0F * f6, f2 + f9 - f7, f1 + f3 - 2.0F * f6 + f11, f2 + f9 - f7);
        localze.b(f1 + f3 - 2.0F * f6 + f11, f2 + f9 - f7, f1 + f3 - 2.0F * f6 + f11, f2 + f5);
        localze.b(f1 + f3 - 2.0F * f6 + f11, f2 + f5, f1 + f5, f2 + f5);
        localze.b(f1 + f5, f2 + f5, f1 + f5, f2 + f4);
        localze.b(f1 + f5, f2 + f4, f1, f2 + f4);
        localze.b(f1, f2 + f4, f1, f2);
      }
      else if ((f8 > 0.0F) && (f13 <= 0.0F))
      {
        localze.a(f1, f2, f8 * 2.0F, f8 * 2.0F, 180.0F, 90.0F);
        localze.b(f1 + f8, f2, f12, f2);
        localze.a(f12 - f8, f2, 2.0F * f8, 2.0F * f8, 270.0F, 90.0F);
        localze.b(f1 + (f3 - f11), f2 + f8, f1 + (f3 - f11), f2 + (f9 - f7));
        localze.b(f1 + (f3 - f11), f2 + (f9 - f7), f1 + f3, f2 + (f9 - f7));
        localze.b(f1 + f3, f2 + (f9 - f7), f1 + (f3 - f6), f2 + f9);
        localze.b(f1 + (f3 - f6), f2 + f9, f1 + f3 - 2.0F * f6, f2 + (f9 - f7));
        localze.b(f1 + f3 - 2.0F * f6, f2 + (f9 - f7), f1 + (f3 - 2.0F * f6) + f11, f2 + (f9 - f7));
        localze.b(f1 + f3 - 2.0F * f6 + f11, f2 + (f9 - f7), f1 + f3 - 2.0F * f6 + f11, f2 + f5);
        localze.b(f1 + f3 - 2.0F * f6 + f11, f2 + f5, f1 + f5, f2 + f5);
        localze.b(f1 + f5, f2 + f5, f1 + f5, f2 + f4);
        localze.b(f1 + f5, f2 + f4, f1, f2 + f4);
        localze.b(f1, f2 + f4, f1, f2 + f8);
      }
      break;
    case 2: 
      if ((f8 > 0.0F) && (f13 > 0.0F))
      {
        localze.a(f1, f2 + f4 - 2.0F * f8, f8 * 2.0F, f8 * 2.0F, 180.0F, -90.0F);
        localze.b(f1 + f8, f2 + f4, f12, f2 + f4);
        localze.a(f12 - f8, f2 + f4 - 2.0F * f8, 2.0F * f8, 2.0F * f8, 90.0F, -90.0F);
        localze.b(f1 + (f3 - f11), f2 + f4 - f8, f1 + (f3 - f11), f2 + f4 - (f9 - f7));
        localze.b(f1 + (f3 - f11), f2 + f4 - (f9 - f7), f1 + f3, f2 + f4 - (f9 - f7));
        localze.b(f1 + f3, f2 + f4 - (f9 - f7), f1 + (f3 - f6), f2 + f4 - f9);
        localze.b(f1 + (f3 - f6), f2 + f4 - f9, f1 + f3 - 2.0F * f6, f2 + f4 - (f9 - f7));
        localze.b(f1 + f3 - 2.0F * f6, f2 + f4 - (f9 - f7), f1 + (f3 - 2.0F * f6) + f11, f2 + f4 - (f9 - f7));
        localze.b(f1 + (f3 - 2.0F * f6) + f11, f2 + f4 - (f9 - f7), f1 + (f3 - 2.0F * f6) + f11, f2 + f4 - (f5 + f13));
        localze.a(f12 - f13, f2 + f4 - f5 - 2.0F * f13, 2.0F * f13, 2.0F * f13, 0.0F, 90.0F);
        localze.a(f1 + f5, f2 + f4 - f5 - 2.0F * f13, 2.0F * f13, 2.0F * f13, 90.0F, 90.0F);
        localze.b(f1 + f5, f2 + f4 - f8, f1 + f5, f2);
        localze.b(f1 + f5, f2, f1, f2);
        localze.b(f1, f2, f1, f2 + f4 - f8);
      }
      else if (f8 == 0.0F)
      {
        localze.b(f1, f2 + f4, f1 + f3 - f11, f2 + f4);
        localze.b(f1 + f3 - f11, f2 + f4, f1 + f3 - f11, f2 + f4 - f9 + f7);
        localze.b(f1 + f3 - f11, f2 + f4 - f9 + f7, f1 + f3, f2 + f4 - f9 + f7);
        localze.b(f1 + f3, f2 + f4 - f9 + f7, f1 + f3 - (f5 / 2.0F + f11), f2 + f4 - f9);
        localze.b(f1 + f3 - (f5 / 2.0F + f11), f2 + f4 - f9, f1 + f3 - 2.0F * f6, f2 + f4 - f9 + f7);
        localze.b(f1 + f3 - 2.0F * f6, f2 + f4 - f9 + f7, f1 + f3 - 2.0F * f6 + f11, f2 + f4 - f9 + f7);
        localze.b(f1 + f3 - 2.0F * f6 + f11, f2 + f4 - f9 + f7, f1 + f3 - 2.0F * f6 + f11, f2 + f4 - f5);
        localze.b(f1 + f3 - 2.0F * f6 + f11, f2 + f4 - f5, f1 + f5, f2 + f4 - f5);
        localze.b(f1 + f5, f2 + f4 - f5, f1 + f5, f2);
        localze.b(f1 + f5, f2, f1, f2);
        localze.b(f1, f2, f1, f2 + f4);
      }
      else if ((f8 > 0.0F) && (f13 <= 0.0F))
      {
        localze.a(f1, f2 + f4 - 2.0F * f8, f8 * 2.0F, f8 * 2.0F, 180.0F, -90.0F);
        localze.b(f1 + f8, f2 + f4, f12, f2 + f4);
        localze.a(f12 - f8, f2 + f4 - 2.0F * f8, 2.0F * f8, 2.0F * f8, 90.0F, -90.0F);
        localze.b(f1 + (f3 - f11), f2 + f4 - f8, f1 + (f3 - f11), f2 + f4 - (f9 - f7));
        localze.b(f1 + (f3 - f11), f2 + f4 - (f9 - f7), f1 + f3, f2 + f4 - (f9 - f7));
        localze.b(f1 + f3, f2 + f4 - (f9 - f7), f1 + (f3 - f6), f2 + f4 - f9);
        localze.b(f1 + (f3 - f6), f2 + f4 - f9, f1 + f3 - 2.0F * f6, f2 + f4 - (f9 - f7));
        localze.b(f1 + f3 - 2.0F * f6, f2 + f4 - (f9 - f7), f1 + (f3 - 2.0F * f6) + f11, f2 + f4 - (f9 - f7));
        localze.b(f1 + f3 - 2.0F * f6 + f11, f2 + f4 - (f9 - f7), f1 + f3 - 2.0F * f6 + f11, f2 + f4 - f5);
        localze.b(f1 + f3 - 2.0F * f6 + f11, f2 + f4 - f5, f1 + f5, f2 + f4 - f5);
        localze.b(f1 + f5, f2 + f4 - f5, f1 + f5, f2);
        localze.b(f1 + f5, f2, f1, f2);
        localze.b(f1, f2, f1, f2 + f4 - f8);
      }
      break;
    case 3: 
      if ((f8 > 0.0F) && (f13 > 0.0F))
      {
        localze.a(f1 + f3 - 2.0F * f8, f2 + f4 - 2.0F * f8, f8 * 2.0F, f8 * 2.0F, 0.0F, 90.0F);
        localze.b(f1 + f3 - f8, f2 + f4, f1 + f3 - f12, f2 + f4);
        localze.a(f1 + f11, f2 + f4 - 2.0F * f8, 2.0F * f8, 2.0F * f8, 90.0F, 90.0F);
        localze.b(f1 + f3 - (f3 - f11), f2 + f4 - f8, f1 + f3 - (f3 - f11), f2 + f4 - (f9 - f7));
        localze.b(f1 + f3 - (f3 - f11), f2 + f4 - (f9 - f7), f1, f2 + f4 - (f9 - f7));
        localze.b(f1, f2 + f4 - (f9 - f7), f1 + f3 - (f3 - f6), f2 + f4 - f9);
        localze.b(f1 + f3 - (f3 - f6), f2 + f4 - f9, f1 + f3 - (f3 - 2.0F * f6), f2 + f4 - (f9 - f7));
        localze.b(f1 + f3 - (f3 - 2.0F * f6), f2 + f4 - (f9 - f7), f1 + f3 - (f3 - 2.0F * f6 + f11), f2 + f4 - (f9 - f7));
        localze.b(f1 + f3 - (f3 - 2.0F * f6 + f11), f2 + f4 - (f9 - f7), f1 + f3 - (f3 - 2.0F * f6 + f11), f2 + f4 - (f5 + f13));
        localze.a(f1 + f5 + f11, f2 + f4 - f5 - 2.0F * f13, 2.0F * f13, 2.0F * f13, 180.0F, -90.0F);
        localze.a(f1 + f3 - f5 - 2.0F * (f8 - f5), f2 + f4 - f5 - 2.0F * f13, 2.0F * f13, 2.0F * f13, 90.0F, -90.0F);
        localze.b(f1 + f3 - f5, f2 + f4 - f8, f1 + f3 - f5, f2);
        localze.b(f1 + f3 - f5, f2, f1 + f3, f2);
        localze.b(f1 + f3, f2, f1 + f3, f2 + f4 - f8);
      }
      else if (f8 == 0.0F)
      {
        localze.b(f1 + f3, f2 + f4, f1 + f11, f2 + f4);
        localze.b(f1 + f11, f2 + f4, f1 + f11, f2 + f4 - f9 + f7);
        localze.b(f1 + f11, f2 + f4 - f9 + f7, f1, f2 + f4 - f9 + f7);
        localze.b(f1, f2 + f4 - f9 + f7, f1 + (f5 / 2.0F + f11), f2 + f4 - f9);
        localze.b(f1 + (f5 / 2.0F + f11), f2 + f4 - f9, f1 + 2.0F * f6, f2 + f4 - f9 + f7);
        localze.b(f1 + 2.0F * f6, f2 + f4 - f9 + f7, f1 + 2.0F * f6 - f11, f2 + f4 - f9 + f7);
        localze.b(f1 + 2.0F * f6 - f11, f2 + f4 - f9 + f7, f1 + 2.0F * f6 - f11, f2 + f4 - f5);
        localze.b(f1 + 2.0F * f6 - f11, f2 + f4 - f5, f1 + f3 - f5, f2 + f4 - f5);
        localze.b(f1 + f3 - f5, f2 + f4 - f5, f1 + f3 - f5, f2);
        localze.b(f1 + f3 - f5, f2, f1 + f3, f2);
        localze.b(f1 + f3, f2, f1 + f3, f2 + f4);
      }
      else if ((f8 > 0.0F) && (f13 <= 0.0F))
      {
        localze.a(f1 + f3 - 2.0F * f8, f2 + f4 - 2.0F * f8, f8 * 2.0F, f8 * 2.0F, 0.0F, 90.0F);
        localze.b(f1 + f3 - f8, f2 + f4, f1 + f11 + f8, f2 + f4);
        localze.a(f1 + f11, f2 + f4 - 2.0F * f8, 2.0F * f8, 2.0F * f8, 90.0F, 90.0F);
        localze.b(f1 + f11, f2 + f4 - f8, f1 + f11, f2 + f4 - (f9 - f7));
        localze.b(f1 + f11, f2 + f4 - (f9 - f7), f1, f2 + f4 - (f9 - f7));
        localze.b(f1, f2 + f4 - (f9 - f7), f1 + f6, f2 + f4 - f9);
        localze.b(f1 + f6, f2 + f4 - f9, f1 + 2.0F * f6, f2 + f4 - (f9 - f7));
        localze.b(f1 + 2.0F * f6, f2 + f4 - (f9 - f7), f1 + 2.0F * f6 - f11, f2 + f4 - (f9 - f7));
        localze.b(f1 + 2.0F * f6 - f11, f2 + f4 - (f9 - f7), f1 + 2.0F * f6 - f11, f2 + f4 - f5);
        localze.b(f1 + 2.0F * f6 - f11, f2 + f4 - f5, f1 + f3 - f5, f2 + f4 - f5);
        localze.b(f1 + f3 - f5, f2 + f4 - f5, f1 + f3 - f5, f2);
        localze.b(f1 + f3 - f5, f2, f1 + f3, f2);
        localze.b(f1 + f3, f2, f1 + f3, f2 + f4 - f8);
      }
      break;
    case 4: 
      if ((f8 > 0.0F) && (f13 > 0.0F))
      {
        localze.a(f1 + f3 - 2.0F * f8, f2, f8 * 2.0F, f8 * 2.0F, 0.0F, -90.0F);
        localze.b(f1 + f3 - f8, f2, f1 + f3 - f12, f2);
        localze.a(f1 + f11, f2, 2.0F * f8, 2.0F * f8, 270.0F, -90.0F);
        localze.b(f1 + f3 - (f3 - f11), f2 + f8, f1 + f3 - (f3 - f11), f2 + (f9 - f7));
        localze.b(f1 + f3 - (f3 - f11), f2 + (f9 - f7), f1, f2 + (f9 - f7));
        localze.b(f1, f2 + (f9 - f7), f1 + f3 - (f3 - f6), f2 + f9);
        localze.b(f1 + f3 - (f3 - f6), f2 + f9, f1 + f3 - (f3 - 2.0F * f6), f2 + (f9 - f7));
        localze.b(f1 + f3 - (f3 - 2.0F * f6), f2 + (f9 - f7), f1 + f3 - (f3 - 2.0F * f6 + f11), f2 + (f9 - f7));
        localze.b(f1 + f3 - (f3 - 2.0F * f6 + f11), f2 + (f9 - f7), f1 + f3 - (f3 - 2.0F * f6 + f11), f2 + (f5 + f13));
        localze.a(f1 + f5 + f11, f2 + f5, 2.0F * f13, 2.0F * f13, 180.0F, 90.0F);
        localze.a(f1 + f3 - f5 - 2.0F * f13, f2 + f5, 2.0F * f13, 2.0F * f13, 270.0F, 90.0F);
        localze.b(f1 + f3 - f5, f2 + f8, f1 + f3 - f5, f2 + f4);
        localze.b(f1 + f3 - f5, f2 + f4, f1 + f3, f2 + f4);
        localze.b(f1 + f3, f2 + f4, f1 + f3, f2 + f8);
      }
      else if (f8 == 0.0F)
      {
        localze.b(f1 + f3, f2, f1 + f11, f2);
        localze.b(f1 + f11, f2, f1 + f11, f2 + f9 - f7);
        localze.b(f1 + f11, f2 + f9 - f7, f1, f2 + f9 - f7);
        localze.b(f1, f2 + f9 - f7, f1 + (f5 / 2.0F + f11), f2 + f9);
        localze.b(f1 + (f5 / 2.0F + f11), f2 + f9, f1 + 2.0F * f6, f2 + f9 - f7);
        localze.b(f1 + 2.0F * f6, f2 + f9 - f7, f1 + 2.0F * f6 - f11, f2 + f9 - f7);
        localze.b(f1 + 2.0F * f6 - f11, f2 + f9 - f7, f1 + 2.0F * f6 - f11, f2 + f5);
        localze.b(f1 + 2.0F * f6 - f11, f2 + f5, f1 + f3 - f5, f2 + f5);
        localze.b(f1 + f3 - f5, f2 + f5, f1 + f3 - f5, f2 + f4);
        localze.b(f1 + f3 - f5, f2 + f4, f1 + f3, f2 + f4);
        localze.b(f1 + f3, f2 + f4, f1 + f3, f2);
      }
      else if ((f8 > 0.0F) && (f13 <= 0.0F))
      {
        localze.a(f1 + f3 - 2.0F * f8, f2, f8 * 2.0F, f8 * 2.0F, 0.0F, -90.0F);
        localze.b(f1 + f3 - f8, f2, f1 + f11 + f8, f2);
        localze.a(f1 + f11, f2, 2.0F * f8, 2.0F * f8, 270.0F, -90.0F);
        localze.b(f1 + f11, f2 + f8, f1 + f11, f2 + (f9 - f7));
        localze.b(f1 + f11, f2 + (f9 - f7), f1, f2 + (f9 - f7));
        localze.b(f1, f2 + (f9 - f7), f1 + f6, f2 + f9);
        localze.b(f1 + f6, f2 + f9, f1 + 2.0F * f6, f2 + (f9 - f7));
        localze.b(f1 + 2.0F * f6, f2 + (f9 - f7), f1 + 2.0F * f6 - f11, f2 + (f9 - f7));
        localze.b(f1 + 2.0F * f6 - f11, f2 + (f9 - f7), f1 + 2.0F * f6 - f11, f2 + f5);
        localze.b(f1 + 2.0F * f6 - f11, f2 + f5, f1 + f3 - f5, f2 + f5);
        localze.b(f1 + f3 - f5, f2 + f5, f1 + f3 - f5, f2 + f4);
        localze.b(f1 + f3 - f5, f2 + f4, f1 + f3, f2 + f4);
        localze.b(f1 + f3, f2 + f4, f1 + f3, f2 + f8);
      }
      break;
    }
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zboa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */