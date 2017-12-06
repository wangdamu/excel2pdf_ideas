package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.zc;

class zbww
  extends zcd
{
  zbww()
  {
    c(4126);
    b(30);
    this.b = new byte[30];
    this.b[26] = 77;
    this.b[24] = 35;
    this.b[0] = 1;
    this.b[2] = 1;
    this.b[3] = 1;
  }
  
  void a(Axis paramAxis)
  {
    switch (paramAxis.getMajorTickMark())
    {
    case 2: 
      this.b[0] = 0;
      break;
    case 1: 
      this.b[0] = 1;
      break;
    case 3: 
      this.b[0] = 2;
      break;
    case 0: 
      this.b[0] = 3;
    }
    switch (paramAxis.getMinorTickMark())
    {
    case 2: 
      this.b[1] = 0;
      break;
    case 1: 
      this.b[1] = 1;
      break;
    case 3: 
      this.b[1] = 2;
      break;
    case 0: 
      this.b[1] = 3;
    }
    switch (paramAxis.getTickLabelPosition())
    {
    case 3: 
      this.b[2] = 0;
      break;
    case 1: 
      this.b[2] = 1;
      break;
    case 0: 
      this.b[2] = 2;
      break;
    case 2: 
      this.b[2] = 3;
    }
    TickLabels localTickLabels = paramAxis.k();
    if (localTickLabels != null)
    {
      Font localFont = localTickLabels.a();
      if (localFont != null)
      {
        int i = 0;
        boolean[] arrayOfBoolean = { i };
        int j = localFont.a(false, arrayOfBoolean);
        i = arrayOfBoolean[0];
        if ((j >= 0) && (j != 32767) && (j != 32759) && (!zh.a(localFont.getColor())))
        {
          System.arraycopy(zc.a(j), 0, this.b, 26, 2);
          this.b[3] = 1;
          this.b[4] = zh.b(localFont.getColor());
          this.b[5] = zh.c(localFont.getColor());
          this.b[6] = zh.d(localFont.getColor());
          byte[] tmp363_358 = this.b;
          tmp363_358[24] = ((byte)(tmp363_358[24] & 0xFE));
        }
      }
      if (((localTickLabels.getRotationAngle() >= -90) && (localTickLabels.getRotationAngle() <= 90)) || (localTickLabels.getRotationAngle() == 255)) {
        if (localTickLabels.e()) {
          this.b[28] = -1;
        } else if (localTickLabels.getRotationAngle() < 0) {
          this.b[28] = ((byte)(90 - localTickLabels.getRotationAngle()));
        } else {
          this.b[28] = ((byte)localTickLabels.getRotationAngle());
        }
      }
      if (localTickLabels.e())
      {
        byte[] tmp467_462 = this.b;
        tmp467_462[24] = ((byte)(tmp467_462[24] | 0x4));
        byte[] tmp479_474 = this.b;
        tmp479_474[24] = ((byte)(tmp479_474[24] & 0xDF));
      }
      else
      {
        switch (localTickLabels.getRotationAngle())
        {
        case 0: 
          byte[] tmp542_537 = this.b;
          tmp542_537[24] = ((byte)(tmp542_537[24] & 0xF3));
          if (!localTickLabels.c())
          {
            byte[] tmp563_558 = this.b;
            tmp563_558[24] = ((byte)(tmp563_558[24] & 0xDF));
          }
          break;
        case -90: 
          byte[] tmp580_575 = this.b;
          tmp580_575[24] = ((byte)(tmp580_575[24] | 0xC));
          byte[] tmp593_588 = this.b;
          tmp593_588[24] = ((byte)(tmp593_588[24] & 0xDF));
          break;
        case 90: 
          byte[] tmp610_605 = this.b;
          tmp610_605[24] = ((byte)(tmp610_605[24] | 0x8));
          byte[] tmp623_618 = this.b;
          tmp623_618[24] = ((byte)(tmp623_618[24] & 0xDF));
          break;
        case 255: 
          byte[] tmp640_635 = this.b;
          tmp640_635[24] = ((byte)(tmp640_635[24] | 0x4));
          byte[] tmp652_647 = this.b;
          tmp652_647[24] = ((byte)(tmp652_647[24] & 0xDF));
          break;
        default: 
          byte[] tmp669_664 = this.b;
          tmp669_664[24] = ((byte)(tmp669_664[24] & 0xF3));
          byte[] tmp683_678 = this.b;
          tmp683_678[24] = ((byte)(tmp683_678[24] & 0xDF));
        }
      }
      switch (localTickLabels.getTextDirection())
      {
      case 1: 
        byte[] tmp726_721 = this.b;
        tmp726_721[25] = ((byte)(tmp726_721[25] | 0x40));
        break;
      case 2: 
        byte[] tmp742_737 = this.b;
        tmp742_737[25] = ((byte)(tmp742_737[25] | 0xFFFFFF80));
      }
      switch (localTickLabels.getBackgroundMode())
      {
      case 2: 
        byte[] tmp786_781 = this.b;
        tmp786_781[24] = ((byte)(tmp786_781[24] & 0xFD));
        this.b[3] = 1;
        break;
      case 1: 
        byte[] tmp810_805 = this.b;
        tmp810_805[24] = ((byte)(tmp810_805[24] & 0xFD));
        this.b[3] = 2;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbww.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */