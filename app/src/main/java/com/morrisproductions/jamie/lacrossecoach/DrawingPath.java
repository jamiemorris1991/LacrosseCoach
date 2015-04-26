package com.morrisproductions.jamie.lacrossecoach;

/**
 * Created by Jamie on 26/04/2015.
 */

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public class DrawingPath {
    public Path path;
    public Paint paint;

    public void draw(Canvas canvas)
    {
        canvas.drawPath( path, paint );
    }

    public void undo(){}
}