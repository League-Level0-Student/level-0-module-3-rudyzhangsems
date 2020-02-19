
    void setup(){
       size(600, 600);
        background(255,0,255);
    }

    void draw(){
    for (int i = 8; i > 0; i--)  {
      if (i % 2==0)  {
         fill(#FF0000);
      }
      else if (i % 2==1)  {
         fill(#000000);
      }
      ellipse(300,300,i*40,i*40);
          for (int y = 8; y > 0; y--)  {
      if (y % 2==0)  {
         fill(#FF0000);
      }
      else if (y % 2==1)  {
         fill(#000000);
      }
      ellipse(310,310,i*40,i*40);
    }
    }
    }
