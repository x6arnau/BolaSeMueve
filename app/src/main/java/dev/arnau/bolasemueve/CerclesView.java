package dev.arnau.bolasemueve;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class CerclesView extends View {

    Context context;
    int ampleView, altView;

    // Posició del cercle
    int posx, posy;

    public CerclesView(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public CerclesView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    public void init() {
        posx = 100;
        posx = 200;

    }

    protected void onSizeChanged(int ample, int alt, int ample_anter,
                                 int alt_anter) {
        super.onSizeChanged(ample, alt, ample_anter, alt_anter);

        // Obtenim l'ample i l'altçada de la vista amb la que anem a treballar
        this.ampleView = ample;
        this.altView = alt;
    }


    public void mou() {
        posx++;
        posy++;
        if (posx > this.ampleView) posx = 0;
        if (posy > this.altView) posy = 0;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint pincel = new Paint();
        pincel.setColor(Color.BLUE);
        pincel.setStrokeWidth(8);
        pincel.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(posx, posy, 50, pincel);
    }

    public void colisions() {
        // Aquí mirariem si hi ha col·lisions
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                posx = x;
                posy = y;
                break;
        }
        return true;
    }
}