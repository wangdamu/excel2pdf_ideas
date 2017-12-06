package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zi;

class zbku
{
  public float[][] a = new float[4][4];
  
  public zbku()
  {
    a(1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
  }
  
  public zbku(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12)
  {
    a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8, paramFloat9, paramFloat10, paramFloat11, paramFloat12);
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12)
  {
    this.a[0][0] = paramFloat1;
    this.a[0][1] = paramFloat2;
    this.a[0][2] = paramFloat3;
    this.a[0][3] = 0.0F;
    this.a[1][0] = paramFloat4;
    this.a[1][1] = paramFloat5;
    this.a[1][2] = paramFloat6;
    this.a[1][3] = 0.0F;
    this.a[2][0] = paramFloat7;
    this.a[2][1] = paramFloat8;
    this.a[2][2] = paramFloat9;
    this.a[2][3] = 0.0F;
    this.a[3][0] = paramFloat10;
    this.a[3][1] = paramFloat11;
    this.a[3][2] = paramFloat12;
    this.a[3][3] = 1.0F;
  }
  
  public void a(zbku paramzbku)
  {
    float[] arrayOfFloat = new float[4];
    for (int i = 0; i < 4; i++)
    {
      for (int j = 0; j < 4; j++)
      {
        arrayOfFloat[j] = 0.0F;
        for (int k = 0; k < 4; k++) {
          arrayOfFloat[j] += this.a[i][k] * paramzbku.a[k][j];
        }
      }
      for (j = 0; j < 4; j++) {
        this.a[i][j] = arrayOfFloat[j];
      }
    }
  }
  
  public void a(double paramDouble)
  {
    zbku localzbku = new zbku(1.0F, 0.0F, 0.0F, 0.0F, (float)Math.cos(paramDouble), (float)Math.sin(paramDouble), 0.0F, (float)-Math.sin(paramDouble), (float)Math.cos(paramDouble), 0.0F, 0.0F, 0.0F);
    a(localzbku);
  }
  
  public void b(double paramDouble)
  {
    zbku localzbku = new zbku((float)Math.cos(paramDouble), 0.0F, (float)-Math.sin(paramDouble), 0.0F, 1.0F, 0.0F, (float)Math.sin(paramDouble), 0.0F, (float)Math.cos(paramDouble), 0.0F, 0.0F, 0.0F);
    a(localzbku);
    localzbku.c(20.0D);
  }
  
  public void c(double paramDouble)
  {
    zbku localzbku = new zbku((float)Math.cos(paramDouble), (float)Math.sin(paramDouble), 0.0F, (float)-Math.sin(paramDouble), (float)Math.cos(paramDouble), 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
    a(localzbku);
  }
  
  public zi a()
  {
    zi localzi = new zi(this.a[0][0], this.a[0][1], this.a[1][0], this.a[1][1], this.a[3][0], this.a[3][1]);
    return localzi;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */